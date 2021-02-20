package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryCredentials extends StObject {
  
  var credentialsParameter: String = js.native
}
object RepositoryCredentials {
  
  @scala.inline
  def apply(credentialsParameter: String): RepositoryCredentials = {
    val __obj = js.Dynamic.literal(credentialsParameter = credentialsParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryCredentials]
  }
  
  @scala.inline
  implicit class RepositoryCredentialsMutableBuilder[Self <: RepositoryCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentialsParameter(value: String): Self = StObject.set(x, "credentialsParameter", value.asInstanceOf[js.Any])
  }
}
