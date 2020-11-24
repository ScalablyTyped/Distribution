package typings.pulumiAws.functionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionArgs extends js.Object {
  
  /**
    * The ID of the associated AppSync API.
    */
  val apiId: Input[String] = js.native
  
  /**
    * The Function DataSource name.
    */
  val dataSource: Input[String] = js.native
  
  /**
    * The Function description.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The version of the request mapping template. Currently the supported value is `2018-05-29`.
    */
  val functionVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Function name. The function name does not have to be unique.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
    */
  val requestMappingTemplate: Input[String] = js.native
  
  /**
    * The Function response mapping template.
    */
  val responseMappingTemplate: Input[String] = js.native
}
object FunctionArgs {
  
  @scala.inline
  def apply(
    apiId: Input[String],
    dataSource: Input[String],
    requestMappingTemplate: Input[String],
    responseMappingTemplate: Input[String]
  ): FunctionArgs = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], requestMappingTemplate = requestMappingTemplate.asInstanceOf[js.Any], responseMappingTemplate = responseMappingTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionArgs]
  }
  
  @scala.inline
  implicit class FunctionArgsOps[Self <: FunctionArgs] (val x: Self) extends AnyVal {
    
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
    def setApiId(value: Input[String]): Self = this.set("apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSource(value: Input[String]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestMappingTemplate(value: Input[String]): Self = this.set("requestMappingTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseMappingTemplate(value: Input[String]): Self = this.set("responseMappingTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFunctionVersion(value: Input[String]): Self = this.set("functionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionVersion: Self = this.set("functionVersion", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
