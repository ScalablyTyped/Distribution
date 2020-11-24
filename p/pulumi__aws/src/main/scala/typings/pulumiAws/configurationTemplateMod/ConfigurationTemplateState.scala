package typings.pulumiAws.configurationTemplateMod

import typings.pulumiAws.inputMod.elasticbeanstalk.ConfigurationTemplateSetting
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationTemplateState extends js.Object {
  
  /**
    * name of the application to associate with this configuration template
    */
  val application: js.UndefOr[Input[String]] = js.native
  
  /**
    * Short description of the Template
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the environment used with this configuration template
    */
  val environmentId: js.UndefOr[Input[String]] = js.native
  
  /**
    * A unique name for this Template.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Option settings to configure the new Environment. These
    * override specific values that are set as defaults. The format is detailed
    * below in Option Settings
    */
  val settings: js.UndefOr[Input[js.Array[Input[ConfigurationTemplateSetting]]]] = js.native
  
  /**
    * A solution stack to base your Template
    * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
    */
  val solutionStackName: js.UndefOr[Input[String]] = js.native
}
object ConfigurationTemplateState {
  
  @scala.inline
  def apply(): ConfigurationTemplateState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationTemplateState]
  }
  
  @scala.inline
  implicit class ConfigurationTemplateStateOps[Self <: ConfigurationTemplateState] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Input[String]): Self = this.set("application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplication: Self = this.set("application", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnvironmentId(value: Input[String]): Self = this.set("environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentId: Self = this.set("environmentId", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSettingsVarargs(value: Input[ConfigurationTemplateSetting]*): Self = this.set("settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: Input[js.Array[Input[ConfigurationTemplateSetting]]]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setSolutionStackName(value: Input[String]): Self = this.set("solutionStackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionStackName: Self = this.set("solutionStackName", js.undefined)
  }
}
