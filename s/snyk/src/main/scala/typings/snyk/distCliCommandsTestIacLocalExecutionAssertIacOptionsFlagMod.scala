package typings.snyk

import typings.snyk.distLibErrorsMod.CustomError
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionAssertIacOptionsFlagMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/assert-iac-options-flag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/assert-iac-options-flag", "FeatureFlagError")
  @js.native
  open class FeatureFlagError protected () extends CustomError {
    def this(key: String, featureFlag: String) = this()
    def this(key: String, featureFlag: String, hasSnykPreview: Boolean) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/assert-iac-options-flag", "FlagError")
  @js.native
  open class FlagError protected () extends CustomError {
    def this(key: String) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/assert-iac-options-flag", "FlagValueError")
  @js.native
  open class FlagValueError protected () extends CustomError {
    def this(key: String, value: String, supportedValues: String) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/assert-iac-options-flag", "InvalidArgumentError")
  @js.native
  open class InvalidArgumentError protected () extends CustomError {
    def this(key: String) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/assert-iac-options-flag", "UnsupportedEntitlementCommandError")
  @js.native
  open class UnsupportedEntitlementCommandError protected () extends CustomError {
    def this(key: String, entitlementName: String) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/assert-iac-options-flag", "UnsupportedEntitlementFlagError")
  @js.native
  open class UnsupportedEntitlementFlagError protected () extends CustomError {
    def this(key: String, entitlementName: String) = this()
  }
  
  inline def assertIaCOptionsFlags(argv: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertIaCOptionsFlags")(argv.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def assertTerraformPlanModes(scanModeArgValue: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertTerraformPlanModes")(scanModeArgValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isIacShareResultsOptions(options: Options & TestOptions): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isIacShareResultsOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
}
