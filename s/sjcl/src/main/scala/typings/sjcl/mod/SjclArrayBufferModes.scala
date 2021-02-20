package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclArrayBufferModes extends StObject {
  
  var ccm: SjclArrayBufferCCMMode = js.native
}
object SjclArrayBufferModes {
  
  @scala.inline
  def apply(ccm: SjclArrayBufferCCMMode): SjclArrayBufferModes = {
    val __obj = js.Dynamic.literal(ccm = ccm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclArrayBufferModes]
  }
  
  @scala.inline
  implicit class SjclArrayBufferModesMutableBuilder[Self <: SjclArrayBufferModes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCcm(value: SjclArrayBufferCCMMode): Self = StObject.set(x, "ccm", value.asInstanceOf[js.Any])
  }
}
