package typings.rollup

import typings.rollup.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object loadConfigFileMod {
  
  @JSImport("rollup/loadConfigFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadConfigFile(fileName: String, commandOptions: Any): js.Promise[Options] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigFile")(fileName.asInstanceOf[js.Any], commandOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Options]]
}
