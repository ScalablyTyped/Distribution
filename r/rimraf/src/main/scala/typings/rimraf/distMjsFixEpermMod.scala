package typings.rimraf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsFixEpermMod {
  
  @JSImport("rimraf/dist/mjs/fix-eperm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixEPERM(fn: js.Function1[/* path */ String, js.Promise[Any]]): js.Function1[/* path */ String, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fixEPERM")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* path */ String, js.Promise[Any]]]
  
  inline def fixEPERMSync(fn: js.Function1[/* path */ String, Any]): js.Function1[/* path */ String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fixEPERMSync")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* path */ String, Any]]
}
