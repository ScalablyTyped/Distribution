package typings.reselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecomputations[C] extends js.Object {
  var resultFunc: C
  def recomputations(): Double
  def resetRecomputations(): Double
}

object AnonRecomputations {
  @scala.inline
  def apply[C](recomputations: () => Double, resetRecomputations: () => Double, resultFunc: C): AnonRecomputations[C] = {
    val __obj = js.Dynamic.literal(recomputations = js.Any.fromFunction0(recomputations), resetRecomputations = js.Any.fromFunction0(resetRecomputations), resultFunc = resultFunc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRecomputations[C]]
  }
}

