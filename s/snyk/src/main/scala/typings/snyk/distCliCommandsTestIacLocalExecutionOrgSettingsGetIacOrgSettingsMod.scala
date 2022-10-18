package typings.snyk

import typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IacOrgSettings
import typings.snyk.distLibErrorsMod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsTestIacLocalExecutionOrgSettingsGetIacOrgSettingsMod {
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/org-settings/get-iac-org-settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/cli/commands/test/iac/local-execution/org-settings/get-iac-org-settings", "FailedToGetIacOrgSettingsError")
  @js.native
  open class FailedToGetIacOrgSettingsError () extends CustomError {
    def this(message: String) = this()
  }
  
  inline def getIacOrgSettings(): js.Promise[IacOrgSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIacOrgSettings")().asInstanceOf[js.Promise[IacOrgSettings]]
  inline def getIacOrgSettings(publicOrgId: String): js.Promise[IacOrgSettings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIacOrgSettings")(publicOrgId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IacOrgSettings]]
}
