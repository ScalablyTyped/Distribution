package typings
package reactourLib.reactourMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactourStepContentArgs extends js.Object {
  var inDOM: scala.Boolean
  var step: scala.Double
  def close(): scala.Unit
  def goTo(step: scala.Double): scala.Unit
}

object ReactourStepContentArgs {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    goTo: scala.Double => scala.Unit,
    inDOM: scala.Boolean,
    step: scala.Double
  ): ReactourStepContentArgs = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), goTo = js.Any.fromFunction1(goTo), inDOM = inDOM, step = step)
  
    __obj.asInstanceOf[ReactourStepContentArgs]
  }
}

