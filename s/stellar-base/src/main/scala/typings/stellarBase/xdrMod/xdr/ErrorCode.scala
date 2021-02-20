package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseNumbers.`3`
import typings.stellarBase.stellarBaseNumbers.`4`
import typings.stellarBase.stellarBaseStrings.errAuth
import typings.stellarBase.stellarBaseStrings.errConf
import typings.stellarBase.stellarBaseStrings.errData
import typings.stellarBase.stellarBaseStrings.errLoad
import typings.stellarBase.stellarBaseStrings.errMisc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorCode extends StObject {
  
  val name: errMisc | errData | errConf | errAuth | errLoad = js.native
  
  val value: `0` | `1` | `2` | `3` | `4` = js.native
}
object ErrorCode {
  
  @scala.inline
  def apply(name: errMisc | errData | errConf | errAuth | errLoad, value: `0` | `1` | `2` | `3` | `4`): ErrorCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCode]
  }
  
  @scala.inline
  implicit class ErrorCodeMutableBuilder[Self <: ErrorCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: errMisc | errData | errConf | errAuth | errLoad): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3` | `4`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
