package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.claimantTypeV0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimantType extends StObject {
  
  val name: claimantTypeV0 = js.native
  
  val value: `0` = js.native
}
object ClaimantType {
  
  @scala.inline
  def apply(name: claimantTypeV0, value: `0`): ClaimantType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimantType]
  }
  
  @scala.inline
  implicit class ClaimantTypeMutableBuilder[Self <: ClaimantType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: claimantTypeV0): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
