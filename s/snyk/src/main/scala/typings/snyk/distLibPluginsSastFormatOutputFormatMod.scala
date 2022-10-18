package typings.snyk

import typings.sarif.mod.Log
import typings.snyk.distLibTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPluginsSastFormatOutputFormatMod {
  
  @JSImport("snyk/dist/lib/plugins/sast/format/output-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCodeDisplayedOutput(codeTest: Log, meta: String, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCodeDisplayedOutput")(codeTest.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getMeta(options: Options, path: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getMeta")(options.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getPrefix(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrefix")(path.asInstanceOf[js.Any]).asInstanceOf[String]
}
