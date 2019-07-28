package typings.reDashReselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dependencies[C, D] extends js.Object {
  var dependencies: D
  var resultFunc: C
  def recomputations(): Double
  def resetRecomputations(): Double
}

object Anon_Dependencies {
  @scala.inline
  def apply[C, D](dependencies: D, recomputations: () => Double, resetRecomputations: () => Double, resultFunc: C): Anon_Dependencies[C, D] = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], recomputations = js.Any.fromFunction0(recomputations), resetRecomputations = js.Any.fromFunction0(resetRecomputations), resultFunc = resultFunc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dependencies[C, D]]
  }
}

