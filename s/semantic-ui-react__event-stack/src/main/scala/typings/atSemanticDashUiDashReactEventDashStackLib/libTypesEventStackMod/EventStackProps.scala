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

