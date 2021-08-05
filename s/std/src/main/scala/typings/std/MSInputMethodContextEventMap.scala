package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSInputMethodContextEventMap extends StObject {
  
  var MSCandidateWindowHide: Event
  
  var MSCandidateWindowShow: Event
  
  var MSCandidateWindowUpdate: Event
}
object MSInputMethodContextEventMap {
  
  inline def apply(MSCandidateWindowHide: Event, MSCandidateWindowShow: Event, MSCandidateWindowUpdate: Event): MSInputMethodContextEventMap = {
    val __obj = js.Dynamic.literal(MSCandidateWindowHide = MSCandidateWindowHide.asInstanceOf[js.Any], MSCandidateWindowShow = MSCandidateWindowShow.asInstanceOf[js.Any], MSCandidateWindowUpdate = MSCandidateWindowUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSInputMethodContextEventMap]
  }
  
  extension [Self <: MSInputMethodContextEventMap](x: Self) {
    
    inline def setMSCandidateWindowHide(value: Event): Self = StObject.set(x, "MSCandidateWindowHide", value.asInstanceOf[js.Any])
    
    inline def setMSCandidateWindowShow(value: Event): Self = StObject.set(x, "MSCandidateWindowShow", value.asInstanceOf[js.Any])
    
    inline def setMSCandidateWindowUpdate(value: Event): Self = StObject.set(x, "MSCandidateWindowUpdate", value.asInstanceOf[js.Any])
  }
}
