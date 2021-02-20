package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseStrings.authorizedFlag
import typings.stellarBase.stellarBaseStrings.authorizedToMaintainLiabilitiesFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustLineFlags extends StObject {
  
  val name: authorizedFlag | authorizedToMaintainLiabilitiesFlag = js.native
  
  val value: `1` | `2` = js.native
}
object TrustLineFlags {
  
  @scala.inline
  def apply(name: authorizedFlag | authorizedToMaintainLiabilitiesFlag, value: `1` | `2`): TrustLineFlags = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustLineFlags]
  }
  
  @scala.inline
  implicit class TrustLineFlagsMutableBuilder[Self <: TrustLineFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: authorizedFlag | authorizedToMaintainLiabilitiesFlag): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `1` | `2`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
