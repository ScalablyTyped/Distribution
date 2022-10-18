package typings.snyk

import typings.snyk.distLibSnykTestIacTestResultMod.IacTestResponse
import typings.snyk.distLibSnykTestLegacyMod.TestResult
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersFormatTestMetaMod {
  
  @JSImport("snyk/dist/lib/formatters/format-test-meta", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatTestMeta(res: IacTestResponse, options: Options & TestOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestMeta")(res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatTestMeta(res: TestResult, options: Options & TestOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTestMeta")(res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
