package typings.qrcode.mod

import typings.qrcode.qrcodeStrings.png
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRCodeToFileOptionsOther
  extends StObject
     with QRCodeRenderersOptions
     with QRCodeToFileOptions {
  
  /**
    * Output format.
    * @default 'png'
    */
  var `type`: js.UndefOr[Exclude[QRCodeFileType, png]] = js.undefined
}
object QRCodeToFileOptionsOther {
  
  inline def apply(): QRCodeToFileOptionsOther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeToFileOptionsOther]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QRCodeToFileOptionsOther] (val x: Self) extends AnyVal {
    
    inline def setType(value: Exclude[QRCodeFileType, png]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
