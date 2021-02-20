package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseStrings.manageOfferCreated
import typings.stellarBase.stellarBaseStrings.manageOfferDeleted
import typings.stellarBase.stellarBaseStrings.manageOfferUpdated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManageOfferEffect extends StObject {
  
  val name: manageOfferCreated | manageOfferUpdated | manageOfferDeleted = js.native
  
  val value: `0` | `1` | `2` = js.native
}
object ManageOfferEffect {
  
  @scala.inline
  def apply(name: manageOfferCreated | manageOfferUpdated | manageOfferDeleted, value: `0` | `1` | `2`): ManageOfferEffect = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageOfferEffect]
  }
  
  @scala.inline
  implicit class ManageOfferEffectMutableBuilder[Self <: ManageOfferEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: manageOfferCreated | manageOfferUpdated | manageOfferDeleted): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
