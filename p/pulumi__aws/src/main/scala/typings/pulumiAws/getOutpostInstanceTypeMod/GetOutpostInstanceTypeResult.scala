package typings.pulumiAws.getOutpostInstanceTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOutpostInstanceTypeResult extends js.Object {
  
  val arn: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val instanceType: String = js.native
  
  val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.native
}
object GetOutpostInstanceTypeResult {
  
  @scala.inline
  def apply(arn: String, id: String, instanceType: String): GetOutpostInstanceTypeResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutpostInstanceTypeResult]
  }
  
  @scala.inline
  implicit class GetOutpostInstanceTypeResultOps[Self <: GetOutpostInstanceTypeResult] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredInstanceTypesVarargs(value: String*): Self = this.set("preferredInstanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setPreferredInstanceTypes(value: js.Array[String]): Self = this.set("preferredInstanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredInstanceTypes: Self = this.set("preferredInstanceTypes", js.undefined)
  }
}
