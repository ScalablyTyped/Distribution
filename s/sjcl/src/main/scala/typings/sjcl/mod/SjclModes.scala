package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
trait SjclModes extends StObject {
  
  var cbc: SjclCBCMode
  
  var ccm: SjclCCMMode
  
  var ctr: SjclCTRMode
  
  var gcm: SjclGCMMode
  
  var ocb2: SjclOCB2Mode
  
  var ocb2progressive: SjclOCB2ProgressiveMode
}
object SjclModes {
  
  inline def apply(
    cbc: SjclCBCMode,
    ccm: SjclCCMMode,
    ctr: SjclCTRMode,
    gcm: SjclGCMMode,
    ocb2: SjclOCB2Mode,
    ocb2progressive: SjclOCB2ProgressiveMode
  ): SjclModes = {
    val __obj = js.Dynamic.literal(cbc = cbc.asInstanceOf[js.Any], ccm = ccm.asInstanceOf[js.Any], ctr = ctr.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any], ocb2 = ocb2.asInstanceOf[js.Any], ocb2progressive = ocb2progressive.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclModes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SjclModes] (val x: Self) extends AnyVal {
    
    inline def setCbc(value: SjclCBCMode): Self = StObject.set(x, "cbc", value.asInstanceOf[js.Any])
    
    inline def setCcm(value: SjclCCMMode): Self = StObject.set(x, "ccm", value.asInstanceOf[js.Any])
    
    inline def setCtr(value: SjclCTRMode): Self = StObject.set(x, "ctr", value.asInstanceOf[js.Any])
    
    inline def setGcm(value: SjclGCMMode): Self = StObject.set(x, "gcm", value.asInstanceOf[js.Any])
    
    inline def setOcb2(value: SjclOCB2Mode): Self = StObject.set(x, "ocb2", value.asInstanceOf[js.Any])
    
    inline def setOcb2progressive(value: SjclOCB2ProgressiveMode): Self = StObject.set(x, "ocb2progressive", value.asInstanceOf[js.Any])
  }
}
