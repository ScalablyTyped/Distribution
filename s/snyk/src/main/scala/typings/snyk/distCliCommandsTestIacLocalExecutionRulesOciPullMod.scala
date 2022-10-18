package typings.snyk

import typings.snyk.distCliCommandsTestIacLocalExecutionRulesOciRegistryMod.OciRegistry
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.OCIRegistryURLComponents
import typings.snyk.distLibErrorsMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionRulesOciPullMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/rules/oci-pull", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/rules/oci-pull", "CUSTOM_RULES_TARBALL")
  @js.native
  val CUSTOM_RULES_TARBALL: /* "custom-bundle.tar.gz" */ String = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/rules/oci-pull", "FailedToBuildOCIArtifactError")
  @js.native
  open class FailedToBuildOCIArtifactError () extends CustomError {
    def this(message: String) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/rules/oci-pull", "InvalidManifestSchemaVersionError")
  @js.native
  open class InvalidManifestSchemaVersionError () extends CustomError {
    def this(message: String) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/rules/oci-pull", "InvalidRemoteRegistryURLError")
  @js.native
  open class InvalidRemoteRegistryURLError () extends CustomError {
    def this(url: String) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/rules/oci-pull", "UnsupportedEntitlementPullError")
  @js.native
  open class UnsupportedEntitlementPullError protected () extends CustomError {
    def this(entitlement: String) = this()
  }
  
  inline def extractOCIRegistryURLComponents(OCIRegistryURL: String): OCIRegistryURLComponents = ^.asInstanceOf[js.Dynamic].applyDynamic("extractOCIRegistryURLComponents")(OCIRegistryURL.asInstanceOf[js.Any]).asInstanceOf[OCIRegistryURLComponents]
  
  inline def pull(registry: OciRegistry, repository: String, tag: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("pull")(registry.asInstanceOf[js.Any], repository.asInstanceOf[js.Any], tag.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
