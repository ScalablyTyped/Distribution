package typings.sentryTypes

import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventprocessorMod {
  
  @js.native
  trait EventProcessor extends StObject {
    
    def apply(event: Event, hint: EventHint): (js.Thenable[Event | Null]) | Event | Null = js.native
    
    var id: js.UndefOr[String] = js.native
  }
}
