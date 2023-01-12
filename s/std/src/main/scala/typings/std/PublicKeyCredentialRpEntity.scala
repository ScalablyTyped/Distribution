package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyCredentialRpEntity
  extends StObject
     with PublicKeyCredentialEntity {
  
  /* standard dom */
  var id: js.UndefOr[java.lang.String] = js.undefined
}
object PublicKeyCredentialRpEntity {
  
  inline def apply(name: java.lang.String): PublicKeyCredentialRpEntity = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRpEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyCredentialRpEntity] (val x: Self) extends AnyVal {
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
