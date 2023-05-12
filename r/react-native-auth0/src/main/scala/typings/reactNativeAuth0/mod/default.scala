package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-auth0", JSImport.Default)
@js.native
open class default protected ()
  extends StObject
     with Auth0 {
  def this(options: Options) = this()
  
  /* CompleteClass */
  var auth: Auth = js.native
  
  /* CompleteClass */
  var credentialsManager: CredentialsManager = js.native
  
  /* CompleteClass */
  override def users(token: String): Users_ = js.native
  
  /* CompleteClass */
  var webAuth: WebAuth = js.native
}
