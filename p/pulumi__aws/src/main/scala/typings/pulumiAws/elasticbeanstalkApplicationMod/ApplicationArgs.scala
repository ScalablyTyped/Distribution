package typings.pulumiAws.elasticbeanstalkApplicationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.elasticbeanstalk.ApplicationAppversionLifecycle
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationArgs extends js.Object {
  
  val appversionLifecycle: js.UndefOr[Input[ApplicationAppversionLifecycle]] = js.native
  
  /**
    * Short description of the application
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the application, must be unique within your account
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value map of tags for the Elastic Beanstalk Application.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object ApplicationArgs {
  
  @scala.inline
  def apply(): ApplicationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationArgs]
  }
  
  @scala.inline
  implicit class ApplicationArgsOps[Self <: ApplicationArgs] (val x: Self) extends AnyVal {
    
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
    def setAppversionLifecycle(value: Input[ApplicationAppversionLifecycle]): Self = this.set("appversionLifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppversionLifecycle: Self = this.set("appversionLifecycle", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
