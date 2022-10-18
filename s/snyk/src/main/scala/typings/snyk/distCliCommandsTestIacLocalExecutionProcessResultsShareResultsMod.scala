package typings.snyk

import typings.snyk.anon.Meta
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.ShareResultsOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionProcessResultsShareResultsMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/process-results/share-results", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatAndShareResults(hasResultsOptionsOrgPublicIdPolicyTagsAttributesProjectRootMeta: Meta): js.Promise[ShareResultsOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("formatAndShareResults")(hasResultsOptionsOrgPublicIdPolicyTagsAttributesProjectRootMeta.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ShareResultsOutput]]
}
