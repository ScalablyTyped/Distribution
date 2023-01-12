package typings.qrcode.mod

import typings.qrcode.qrcodeInts.`0`
import typings.qrcode.qrcodeInts.`1`
import typings.qrcode.qrcodeInts.`2`
import typings.qrcode.qrcodeInts.`3`
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorCorrectionLevel] (val x: Self) extends AnyVal {
    
    inline def setBit(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "bit", value.asInstanceOf[js.Any])
  }
}
