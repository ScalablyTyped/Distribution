package typings.reactBootstrap.mod

import typings.react.mod.EventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SyntheticEvent
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
