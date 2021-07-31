package typings.seen.mod

import typings.seen.mod.Events.Dispatcher
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WindowEvents {
  
  @JSImport("seen", "WindowEvents")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def on(`type`: String, listener: EventListener): Dispatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Dispatcher]
}
