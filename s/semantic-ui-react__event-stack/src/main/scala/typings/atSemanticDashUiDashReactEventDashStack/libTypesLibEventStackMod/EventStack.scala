package typings.atSemanticDashUiDashReactEventDashStack.libTypesLibEventStackMod

import typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.InputEventListener
import typings.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventStack extends js.Object {
  var getTarget: js.Any = js.native
  var removeTarget: js.Any = js.native
  val targets: js.Any = js.native
  def sub(eventName: String, eventHandlers: InputEventListener): Unit = js.native
  def sub(eventName: String, eventHandlers: InputEventListener, options: Options): Unit = js.native
  def unsub(eventName: String, eventHandlers: InputEventListener): Unit = js.native
  def unsub(eventName: String, eventHandlers: InputEventListener, options: Options): Unit = js.native
}

