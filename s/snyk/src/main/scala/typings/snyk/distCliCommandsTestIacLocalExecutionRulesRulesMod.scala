package typings.snyk

import typings.snyk.distCliCommandsTestIacLocalExecutionRulesOciRegistryMod.OciRegistry
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCTestFlags
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacOrgSettings
import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.RulesOrigin
import typings.snyk.distLibErrorsMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionRulesRulesMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/rules/rules", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/rules/rules", "FailedToExecuteCustomRulesError")
  @js.native
  open class FailedToExecuteCustomRulesError () extends CustomError {
    def this(message: String) = this()
  }
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/rules/rules", "FailedToPullCustomBundleError")
  @js.native
  open class FailedToPullCustomBundleError () extends CustomError {
    def this(message: String) = this()
  }
  
  inline def buildDefaultOciRegistry(settings: IacOrgSettings): OciRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDefaultOciRegistry")(settings.asInstanceOf[js.Any]).asInstanceOf[OciRegistry]
  
  inline def initRules(
    buildOciRegistry: js.Function0[OciRegistry],
    iacOrgSettings: IacOrgSettings,
    options: IaCTestFlags,
    orgPublicId: String
  ): js.Promise[RulesOrigin] = (^.asInstanceOf[js.Dynamic].applyDynamic("initRules")(buildOciRegistry.asInstanceOf[js.Any], iacOrgSettings.asInstanceOf[js.Any], options.asInstanceOf[js.Any], orgPublicId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RulesOrigin]]
  
  inline def pullIaCCustomRules(buildOciRegistry: js.Function0[OciRegistry], iacOrgSettings: IacOrgSettings): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("pullIaCCustomRules")(buildOciRegistry.asInstanceOf[js.Any], iacOrgSettings.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
