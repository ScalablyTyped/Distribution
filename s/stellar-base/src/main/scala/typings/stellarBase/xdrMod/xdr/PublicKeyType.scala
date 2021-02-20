package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.publicKeyTypeEd25519
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyType extends StObject {
  
  val name: publicKeyTypeEd25519 = js.native
  
  val value: `0` = js.native
}
object PublicKeyType {
  
  @scala.inline
  def apply(name: publicKeyTypeEd25519, value: `0`): PublicKeyType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyType]
  }
  
  @scala.inline
  implicit class PublicKeyTypeMutableBuilder[Self <: PublicKeyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: publicKeyTypeEd25519): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
