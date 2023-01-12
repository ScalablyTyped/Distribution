package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityComponent extends StObject {
  
  var asn1type: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[IndentityOidName] = js.undefined
  
  var oid: js.UndefOr[IdentityOidValue] = js.undefined
  
  var value: Buffer | String
}
object IdentityComponent {
  
  inline def apply(value: Buffer | String): IdentityComponent = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityComponent] (val x: Self) extends AnyVal {
    
    inline def setAsn1type(value: Double): Self = StObject.set(x, "asn1type", value.asInstanceOf[js.Any])
    
    inline def setAsn1typeUndefined: Self = StObject.set(x, "asn1type", js.undefined)
    
    inline def setName(value: IndentityOidName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOid(value: IdentityOidValue): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
    
    inline def setOidUndefined: Self = StObject.set(x, "oid", js.undefined)
    
    inline def setValue(value: Buffer | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
