package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNodeMod {
  
  @JSImport("@sentry/utils/types/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dynamicRequire(mod: Any, request: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dynamicRequire")(mod.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isNodeEnv(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeEnv")().asInstanceOf[Boolean]
  
  inline def loadModule[T](moduleName: String): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
}
