package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.inflationNotTime
import typings.stellarBase.stellarBaseStrings.inflationSuccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InflationResultCode extends StObject {
  
  val name: inflationSuccess | inflationNotTime = js.native
  
  val value: `0` | `-1` = js.native
}
object InflationResultCode {
  
  @scala.inline
  def apply(name: inflationSuccess | inflationNotTime, value: `0` | `-1`): InflationResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InflationResultCode]
  }
  
  @scala.inline
  implicit class InflationResultCodeMutableBuilder[Self <: InflationResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: inflationSuccess | inflationNotTime): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
