package typings.snyk

import typings.snyk.distLibSnykTestLegacyMod.TestResult
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.SupportedProjectTypes
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSnykTestRunTestMod {
  
  @JSImport("snyk/dist/lib/snyk-test/run-test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runTest(projectType: Unit, root: String, options: Options & TestOptions): js.Promise[js.Array[TestResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTest")(projectType.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[TestResult]]]
  inline def runTest(projectType: SupportedProjectTypes, root: String, options: Options & TestOptions): js.Promise[js.Array[TestResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTest")(projectType.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[TestResult]]]
}
