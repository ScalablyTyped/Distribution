package typings.pulumiPulumi.localWorkspaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.projectSettingsMod.ProjectSettings
import typings.pulumiPulumi.stackSettingsMod.StackSettings
import typings.pulumiPulumi.workspaceMod.PulumiFn
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalWorkspaceOptions extends js.Object {
  
  /**
    * Environment values scoped to the current workspace. These will be supplied to every Pulumi command.
    */
  var envVars: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    *  The inline program `PulumiFn` to be used for Preview/Update operations if any.
    *  If none is specified, the stack will refer to ProjectSettings for this information.
    */
  var program: js.UndefOr[PulumiFn] = js.native
  
  /**
    * The settings object for the current project.
    */
  var projectSettings: js.UndefOr[ProjectSettings] = js.native
  
  /**
    * The directory to override for CLI metadata
    */
  var pulumiHome: js.UndefOr[String] = js.native
  
  /**
    * The secrets provider to use for encryption and decryption of stack secrets.
    * See: https://www.pulumi.com/docs/intro/concepts/config/#available-encryption-providers
    */
  var secretsProvider: js.UndefOr[String] = js.native
  
  /**
    * A map of Stack names and corresponding settings objects.
    */
  var stackSettings: js.UndefOr[StringDictionary[StackSettings]] = js.native
  
  /**
    * The directory to run Pulumi commands and read settings (Pulumi.yaml and Pulumi.<stack>.yaml)l.
    */
  var workDir: js.UndefOr[String] = js.native
}
object LocalWorkspaceOptions {
  
  @scala.inline
  def apply(): LocalWorkspaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalWorkspaceOptions]
  }
  
  @scala.inline
  implicit class LocalWorkspaceOptionsOps[Self <: LocalWorkspaceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnvVars(value: StringDictionary[String]): Self = this.set("envVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvVars: Self = this.set("envVars", js.undefined)
    
    @scala.inline
    def setProgram(value: () => js.Promise[(Record[String, js.Any]) | Unit]): Self = this.set("program", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    
    @scala.inline
    def setProjectSettings(value: ProjectSettings): Self = this.set("projectSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectSettings: Self = this.set("projectSettings", js.undefined)
    
    @scala.inline
    def setPulumiHome(value: String): Self = this.set("pulumiHome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePulumiHome: Self = this.set("pulumiHome", js.undefined)
    
    @scala.inline
    def setSecretsProvider(value: String): Self = this.set("secretsProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretsProvider: Self = this.set("secretsProvider", js.undefined)
    
    @scala.inline
    def setStackSettings(value: StringDictionary[StackSettings]): Self = this.set("stackSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackSettings: Self = this.set("stackSettings", js.undefined)
    
    @scala.inline
    def setWorkDir(value: String): Self = this.set("workDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkDir: Self = this.set("workDir", js.undefined)
  }
}
