package typings
package atSemanticDashUiDashReactEventDashStackLib.libTypesEventStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventStackProps extends js.Object {
  /** An event name on which we will subscribe. */
  var name: java.lang.String
  /** An event handler or array of event handlers. */
  var on: atSemanticDashUiDashReactEventDashStackLib.libTypesTypesMod.InputEventListener
  /** A name of pool. */
  var pool: js.UndefOr[java.lang.String] = js.undefined
  /** A DOM element on which we will subscribe. */
  var target: js.UndefOr[atSemanticDashUiDashReactEventDashStackLib.libTypesTypesMod.InputTargetElement] = js.undefined
}

object EventStackProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    on: atSemanticDashUiDashReactEventDashStackLib.libTypesTypesMod.InputEventListener,
    pool: java.lang.String = null,
    target: atSemanticDashUiDashReactEventDashStackLib.libTypesTypesMod.InputTargetElement = null
  ): EventStackProps = {
    val __obj = js.Dynamic.literal(name = name, on = on.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventStackProps]
  }
}

