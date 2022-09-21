package typings.qrcode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.qrcode.mod.QRCodeToStringOptionsTerminal
  - typings.qrcode.mod.QRCodeToStringOptionsOther
*/
trait QRCodeToStringOptions extends StObject
object QRCodeToStringOptions {
  
  inline def QRCodeToStringOptionsOther(): typings.qrcode.mod.QRCodeToStringOptionsOther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.qrcode.mod.QRCodeToStringOptionsOther]
  }
  
  inline def QRCodeToStringOptionsTerminal(): typings.qrcode.mod.QRCodeToStringOptionsTerminal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("terminal")
    __obj.asInstanceOf[typings.qrcode.mod.QRCodeToStringOptionsTerminal]
  }
}
