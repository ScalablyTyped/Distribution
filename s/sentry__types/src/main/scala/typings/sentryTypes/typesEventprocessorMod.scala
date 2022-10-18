package typings.sentryTypes

import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEventprocessorMod {
  
  @js.native
  trait EventProcessor extends StObject {
    
    def apply(event: Event, hint: EventHint): (PromiseLike[Event | Null]) | Event | Null = js.native
    
    var id: js.UndefOr[String] = js.native
  }
}
