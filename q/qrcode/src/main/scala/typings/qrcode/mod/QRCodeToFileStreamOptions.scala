package typings.qrcode.mod

import typings.qrcode.anon.DeflateLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeToFileStreamOptions
  extends StObject
     with QRCodeRenderersOptions {
  
  var rendererOpts: js.UndefOr[DeflateLevel] = js.undefined
  
  /**
    * Output format. Only png supported for file stream.
    */
  var `type`: js.UndefOr[QRCodeFileStreamType] = js.undefined
}
object QRCodeToFileStreamOptions {
  
  inline def apply(): QRCodeToFileStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeToFileStreamOptions]
  }
  
  extension [Self <: QRCodeToFileStreamOptions](x: Self) {
    
    inline def setRendererOpts(value: DeflateLevel): Self = StObject.set(x, "rendererOpts", value.asInstanceOf[js.Any])
    
    inline def setRendererOptsUndefined: Self = StObject.set(x, "rendererOpts", js.undefined)
    
    inline def setType(value: QRCodeFileStreamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
