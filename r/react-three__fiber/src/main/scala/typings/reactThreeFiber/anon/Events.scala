package typings.reactThreeFiber.anon

import typings.reactThreeFiber.distDeclarationsSrcCoreStoreMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var events: js.UndefOr[Compute] = js.undefined
  
  var size: js.UndefOr[Size] = js.undefined
}
object Events {
  
  inline def apply(): Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Events]
  }
  
  extension [Self <: Events](x: Self) {
    
    inline def setEvents(value: Compute): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
