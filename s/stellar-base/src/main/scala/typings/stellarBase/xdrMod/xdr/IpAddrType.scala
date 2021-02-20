package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseStrings.iPv4
import typings.stellarBase.stellarBaseStrings.iPv6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpAddrType extends StObject {
  
  val name: iPv4 | iPv6 = js.native
  
  val value: `0` | `1` = js.native
}
object IpAddrType {
  
  @scala.inline
  def apply(name: iPv4 | iPv6, value: `0` | `1`): IpAddrType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpAddrType]
  }
  
  @scala.inline
  implicit class IpAddrTypeMutableBuilder[Self <: IpAddrType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: iPv4 | iPv6): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
