package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityNameComponent extends StObject {
  
  var name: IndentityOidName
  
  var value: Buffer | String
}
object IdentityNameComponent {
  
  inline def apply(name: IndentityOidName, value: Buffer | String): IdentityNameComponent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityNameComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityNameComponent] (val x: Self) extends AnyVal {
    
    inline def setName(value: IndentityOidName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Buffer | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
