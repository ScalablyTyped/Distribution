package typings.snyk

import typings.snyk.distLibSnykTestLegacyMod.TestResult
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersTestDisplayResultMod {
  
  @JSImport("snyk/dist/lib/formatters/test/display-result", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def displayResult(res: TestResult, options: Options & TestOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("displayResult")(res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def displayResult(res: TestResult, options: Options & TestOptions, foundProjectCount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("displayResult")(res.asInstanceOf[js.Any], options.asInstanceOf[js.Any], foundProjectCount.asInstanceOf[js.Any])).asInstanceOf[String]
}
