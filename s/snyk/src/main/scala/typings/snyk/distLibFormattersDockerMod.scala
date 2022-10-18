package typings.snyk

import typings.snyk.distLibSnykTestLegacyMod.TestResult
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFormattersDockerMod {
  
  @JSImport("snyk/dist/lib/formatters/docker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDockerBinaryHeading(pkgInfo: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createDockerBinaryHeading")(pkgInfo.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dockerRemediationForDisplay(res: TestResult): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dockerRemediationForDisplay")(res.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatDockerBinariesIssues(dockerBinariesSortedGroupedVulns: Any, binariesVulns: Any, options: Options & TestOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDockerBinariesIssues")(dockerBinariesSortedGroupedVulns.asInstanceOf[js.Any], binariesVulns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
