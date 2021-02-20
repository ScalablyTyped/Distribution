package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyCredentialRpEntity extends PublicKeyCredentialEntity {
  
  var id: js.UndefOr[java.lang.String] = js.native
}
object PublicKeyCredentialRpEntity {
  
  @scala.inline
  def apply(name: java.lang.String): PublicKeyCredentialRpEntity = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRpEntity]
  }
  
  @scala.inline
  implicit class PublicKeyCredentialRpEntityMutableBuilder[Self <: PublicKeyCredentialRpEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
