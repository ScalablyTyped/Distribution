package typings.reReselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDependencies[C, D] extends js.Object {
  var dependencies: D
  var resultFunc: C
  def recomputations(): Double
  def resetRecomputations(): Double
}

object AnonDependencies {
  @scala.inline
  def apply[C, D](dependencies: D, recomputations: () => Double, resetRecomputations: () => Double, resultFunc: C): AnonDependencies[C, D] = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], recomputations = js.Any.fromFunction0(recomputations), resetRecomputations = js.Any.fromFunction0(resetRecomputations), resultFunc = resultFunc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDependencies[C, D]]
  }
}

