package typings.atSemanticDashUiDashReactEventDashStack.libTypesEventStackMod

import typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.InputEventListener
import typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.InputTargetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventStackProps extends js.Object {
  /** An event name on which we will subscribe. */
  var name: String
  /** An event handler or array of event handlers. */
  var on: InputEventListener
  /** A name of pool. */
  var pool: js.UndefOr[String] = js.undefined
  /** A DOM element on which we will subscribe. */
  var target: js.UndefOr[InputTargetElement] = js.undefined
}

object EventStackProps {
  @scala.inline
  def apply(name: String, on: InputEventListener, pool: String = null, target: InputTargetElement = null): EventStackProps = {
    val __obj = js.Dynamic.literal(name = name, on = on.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventStackProps]
  }
}

