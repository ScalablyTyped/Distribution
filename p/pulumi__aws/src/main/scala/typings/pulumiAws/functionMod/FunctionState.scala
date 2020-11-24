package typings.pulumiAws.functionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionState extends js.Object {
  
  /**
    * The ID of the associated AppSync API.
    */
  val apiId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the Function object.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Function DataSource name.
    */
  val dataSource: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Function description.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * A unique ID representing the Function object.
    */
  val functionId: js.UndefOr[Input[String]] = js.native
  
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
  val requestMappingTemplate: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Function response mapping template.
    */
  val responseMappingTemplate: js.UndefOr[Input[String]] = js.native
}
object FunctionState {
  
  @scala.inline
  def apply(): FunctionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionState]
  }
  
  @scala.inline
  implicit class FunctionStateOps[Self <: FunctionState] (val x: Self) extends AnyVal {
    
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
    def deleteApiId: Self = this.set("apiId", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDataSource(value: Input[String]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFunctionId(value: Input[String]): Self = this.set("functionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionId: Self = this.set("functionId", js.undefined)
    
    @scala.inline
    def setFunctionVersion(value: Input[String]): Self = this.set("functionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionVersion: Self = this.set("functionVersion", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRequestMappingTemplate(value: Input[String]): Self = this.set("requestMappingTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestMappingTemplate: Self = this.set("requestMappingTemplate", js.undefined)
    
    @scala.inline
    def setResponseMappingTemplate(value: Input[String]): Self = this.set("responseMappingTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseMappingTemplate: Self = this.set("responseMappingTemplate", js.undefined)
  }
}
