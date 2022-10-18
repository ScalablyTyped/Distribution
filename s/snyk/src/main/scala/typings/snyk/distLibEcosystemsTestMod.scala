package typings.snyk

import org.scalablytyped.runtime.StringDictionary
import typings.snyk.distCliCommandsTypesMod.TestCommandResult
import typings.snyk.distLibEcosystemsTypesMod.Ecosystem
import typings.snyk.distLibEcosystemsTypesMod.ScanResult
import typings.snyk.distLibEcosystemsTypesMod.TestResult
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.PolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEcosystemsTestMod {
  
  @JSImport("snyk/dist/lib/ecosystems/test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def selectAndExecuteTestStrategy(
    ecosystem: Ecosystem,
    scanResultsByPath: StringDictionary[js.Array[ScanResult]],
    options: Options & PolicyOptions
  ): js.Promise[js.Tuple2[js.Array[TestResult], js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAndExecuteTestStrategy")(ecosystem.asInstanceOf[js.Any], scanResultsByPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[TestResult], js.Array[String]]]]
  
  inline def testEcosystem(ecosystem: Ecosystem, paths: js.Array[String], options: Options & PolicyOptions): js.Promise[TestCommandResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("testEcosystem")(ecosystem.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestCommandResult]]
}
