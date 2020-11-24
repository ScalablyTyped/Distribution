package typings.pulumiAws.sagemakerEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) assigned by AWS to this endpoint.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the endpoint configuration to use.
    */
  val endpointConfigName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the endpoint. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object EndpointState {
  
  @scala.inline
  def apply(): EndpointState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointState]
  }
  
  @scala.inline
  implicit class EndpointStateOps[Self <: EndpointState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setEndpointConfigName(value: Input[String]): Self = this.set("endpointConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointConfigName: Self = this.set("endpointConfigName", js.undefined)
    
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
