package typings.snyk

import typings.snyk.anon.Attributes
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.ShareResultsOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionProcessResultsCliShareResultsMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/process-results/cli-share-results", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shareResults(hasResultsPolicyTagsAttributesOptionsMeta: Attributes): js.Promise[ShareResultsOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareResults")(hasResultsPolicyTagsAttributesOptionsMeta.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ShareResultsOutput]]
}
