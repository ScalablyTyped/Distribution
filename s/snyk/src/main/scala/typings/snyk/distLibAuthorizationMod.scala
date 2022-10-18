package typings.snyk

import typings.snyk.anon.Allowed
import typings.snyk.anon.Org
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAuthorizationMod {
  
  @JSImport("snyk/dist/lib/authorization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def actionAllowed(action: String, options: Org): js.Promise[Allowed] = (^.asInstanceOf[js.Dynamic].applyDynamic("actionAllowed")(action.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Allowed]]
}
