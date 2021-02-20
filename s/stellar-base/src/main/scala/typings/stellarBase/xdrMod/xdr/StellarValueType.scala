package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseStrings.stellarValueBasic
import typings.stellarBase.stellarBaseStrings.stellarValueSigned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StellarValueType extends StObject {
  
  val name: stellarValueBasic | stellarValueSigned = js.native
  
  val value: `0` | `1` = js.native
}
object StellarValueType {
  
  @scala.inline
  def apply(name: stellarValueBasic | stellarValueSigned, value: `0` | `1`): StellarValueType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarValueType]
  }
  
  @scala.inline
  implicit class StellarValueTypeMutableBuilder[Self <: StellarValueType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: stellarValueBasic | stellarValueSigned): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
