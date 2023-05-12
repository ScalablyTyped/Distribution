package typings.rimraf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsDefaultTmpMod {
  
  @JSImport("rimraf/dist/mjs/default-tmp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultTmp(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultTmp")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def defaultTmpSync(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultTmpSync")(path.asInstanceOf[js.Any]).asInstanceOf[String]
}
