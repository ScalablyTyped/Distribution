package typings.qrcode.mod

import typings.qrcode.anon.DeflateLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeToBufferOptions
  extends StObject
     with QRCodeRenderersOptions {
  
  var rendererOpts: js.UndefOr[DeflateLevel] = js.undefined
  
  /**
    * Output format. Only png supported for Buffer.
    */
  var `type`: js.UndefOr[QRCodeBufferType] = js.undefined
}
object QRCodeToBufferOptions {
  
  inline def apply(): QRCodeToBufferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeToBufferOptions]
  }
  
  extension [Self <: QRCodeToBufferOptions](x: Self) {
    
    inline def setRendererOpts(value: DeflateLevel): Self = StObject.set(x, "rendererOpts", value.asInstanceOf[js.Any])
    
    inline def setRendererOptsUndefined: Self = StObject.set(x, "rendererOpts", js.undefined)
    
    inline def setType(value: QRCodeBufferType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
