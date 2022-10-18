package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsAuthIsAuthedMod {
  
  @JSImport("snyk/dist/cli/commands/auth/is-authed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAuthed(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAuthed")().asInstanceOf[js.Promise[Any]]
  
  inline def verifyAPI(api: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyAPI")(api.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
