package typings.reactour.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactourStepContentArgs extends js.Object {
  var inDOM: Boolean
  var step: Double
  def close(): Unit
  def goTo(step: Double): Unit
}

object ReactourStepContentArgs {
  @scala.inline
  def apply(close: () => Unit, goTo: Double => Unit, inDOM: Boolean, step: Double): ReactourStepContentArgs = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), goTo = js.Any.fromFunction1(goTo), inDOM = inDOM.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReactourStepContentArgs]
  }
}

