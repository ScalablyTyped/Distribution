package typings.reactDashBootstrap.reactDashBootstrapMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.EventHandler
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectCallback
  extends EventHandler[js.Any] {
  /**
    * @deprecated
    * This signature is a hack so can still derive from HTMLProps.
    * It does not reflect the underlying event and should not be used.
    */
  def apply(e: MouseEvent[js.Object, NativeMouseEvent]): Unit = js.native
  def apply(eventKey: js.Any, e: SyntheticEvent[js.Object, Event]): Unit = js.native
}

