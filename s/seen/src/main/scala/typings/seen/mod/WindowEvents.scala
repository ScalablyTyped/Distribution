package typings.seen.mod

import typings.seen.mod.Events.Dispatcher
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("seen", "WindowEvents")
@js.native
object WindowEvents extends js.Object {
  
  def on(`type`: String, listener: EventListener): Dispatcher = js.native
}
