package typings
package reselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Recomputations[C] extends js.Object {
  var resultFunc: C
  def recomputations(): scala.Double
  def resetRecomputations(): scala.Double
}

object Anon_Recomputations {
  @scala.inline
  def apply[C](recomputations: () => scala.Double, resetRecomputations: () => scala.Double, resultFunc: C): Anon_Recomputations[C] = {
    val __obj = js.Dynamic.literal(recomputations = js.Any.fromFunction0(recomputations), resetRecomputations = js.Any.fromFunction0(resetRecomputations), resultFunc = resultFunc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Recomputations[C]]
  }
}

