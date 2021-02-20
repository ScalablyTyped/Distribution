package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSInputMethodContextEventMap extends StObject {
  
  var MSCandidateWindowHide: Event = js.native
  
  var MSCandidateWindowShow: Event = js.native
  
  var MSCandidateWindowUpdate: Event = js.native
}
object MSInputMethodContextEventMap {
  
  @scala.inline
  def apply(MSCandidateWindowHide: Event, MSCandidateWindowShow: Event, MSCandidateWindowUpdate: Event): MSInputMethodContextEventMap = {
    val __obj = js.Dynamic.literal(MSCandidateWindowHide = MSCandidateWindowHide.asInstanceOf[js.Any], MSCandidateWindowShow = MSCandidateWindowShow.asInstanceOf[js.Any], MSCandidateWindowUpdate = MSCandidateWindowUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSInputMethodContextEventMap]
  }
  
  @scala.inline
  implicit class MSInputMethodContextEventMapMutableBuilder[Self <: MSInputMethodContextEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSCandidateWindowHide(value: Event): Self = StObject.set(x, "MSCandidateWindowHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSCandidateWindowShow(value: Event): Self = StObject.set(x, "MSCandidateWindowShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSCandidateWindowUpdate(value: Event): Self = StObject.set(x, "MSCandidateWindowUpdate", value.asInstanceOf[js.Any])
  }
}
