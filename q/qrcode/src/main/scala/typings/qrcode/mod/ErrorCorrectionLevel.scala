package typings.qrcode.mod

import typings.qrcode.qrcodeNumbers.`0`
import typings.qrcode.qrcodeNumbers.`1`
import typings.qrcode.qrcodeNumbers.`2`
import typings.qrcode.qrcodeNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorCorrectionLevel extends StObject {
  
  var bit: `0` | `1` | `2` | `3`
}
object ErrorCorrectionLevel {
  
  inline def apply(bit: `0` | `1` | `2` | `3`): ErrorCorrectionLevel = {
    val __obj = js.Dynamic.literal(bit = bit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCorrectionLevel]
  }
  
  extension [Self <: ErrorCorrectionLevel](x: Self) {
    
    inline def setBit(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "bit", value.asInstanceOf[js.Any])
  }
}
