package typings.pulumiAws.getAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAliasResult extends js.Object {
  
  /**
    * The Amazon Resource Name(ARN) of the key alias.
    */
  val arn: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val name: String = js.native
  
  /**
    * ARN pointed to by the alias.
    */
  val targetKeyArn: String = js.native
  
  /**
    * Key identifier pointed to by the alias.
    */
  val targetKeyId: String = js.native
}
object GetAliasResult {
  
  @scala.inline
  def apply(arn: String, id: String, name: String, targetKeyArn: String, targetKeyId: String): GetAliasResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], targetKeyArn = targetKeyArn.asInstanceOf[js.Any], targetKeyId = targetKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAliasResult]
  }
  
  @scala.inline
  implicit class GetAliasResultOps[Self <: GetAliasResult] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetKeyArn(value: String): Self = this.set("targetKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetKeyId(value: String): Self = this.set("targetKeyId", value.asInstanceOf[js.Any])
  }
}
