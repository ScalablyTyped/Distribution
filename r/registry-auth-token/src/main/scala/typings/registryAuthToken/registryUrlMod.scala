package typings.registryAuthToken

import typings.registryAuthToken.anon.PickAuthOptionsnpmrc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryUrlMod {
  
  /**
    * Get the registry URL for a given npm scope
    *
    * @param scope - npm scope to resolve URL for
    * @param [npmrc] - Optional object of npmrc properties to use instead of looking up the users local npmrc file
    * @returns The resolved registry URL, falling back to the global npm registry
    */
  inline def apply(scope: String): String = ^.asInstanceOf[js.Dynamic].apply(scope.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(scope: String, npmrc: PickAuthOptionsnpmrc): String = (^.asInstanceOf[js.Dynamic].apply(scope.asInstanceOf[js.Any], npmrc.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("registry-auth-token/registry-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
