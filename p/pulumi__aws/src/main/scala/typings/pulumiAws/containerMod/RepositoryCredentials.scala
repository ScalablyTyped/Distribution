package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryCredentials extends StObject {
  
  var credentialsParameter: String
}
object RepositoryCredentials {
  
  inline def apply(credentialsParameter: String): RepositoryCredentials = {
    val __obj = js.Dynamic.literal(credentialsParameter = credentialsParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryCredentials]
  }
  
  extension [Self <: RepositoryCredentials](x: Self) {
    
    inline def setCredentialsParameter(value: String): Self = StObject.set(x, "credentialsParameter", value.asInstanceOf[js.Any])
  }
}
