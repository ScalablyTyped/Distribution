package typings
package atSemanticDashUiDashReactEventDashStackLib.libTypesLibEventStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventStack extends js.Object {
  var getTarget: js.Any = js.native
  var removeTarget: js.Any = js.native
  val targets: js.Any = js.native
  def sub(
    eventName: java.lang.String,
    eventHandlers: atSemanticDashUiDashReactEventDashStackLib.libTypesTypesMod.InputEventListener
  ): scala.Unit = js.native
  def sub(
    eventName: java.lang.String,
    eventHandlers: atSemanticDashUiDashReactEventDashStackLib.libTypesTypesMod.InputEventListener,
    options: atSemanticDashUiDashReactEventDashStackLib.libTypesTypesMod.Options
  ): scala.Unit = js.native
  def unsub(
    eventName: java.lang.String,
    eventHandlers: atSemanticDashUiDashReactEventDashStackLib.libTypesTypesMod.InputEventListener
  ): scala.Unit = js.native
  def unsub(
    eventName: java.lang.String,
    eventHandlers: atSemanticDashUiDashReactEventDashStackLib.libTypesTypesMod.InputEventListener,
    options: atSemanticDashUiDashReactEventDashStackLib.libTypesTypesMod.Options
  ): scala.Unit = js.native
}

