package typings.pulumiAws.getInstanceProfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceProfileResult extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) specifying the instance profile.
    */
  val arn: String = js.native
  
  /**
    * The string representation of the date the instance profile
    * was created.
    */
  val createDate: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val name: String = js.native
  
  /**
    * The path to the instance profile.
    */
  val path: String = js.native
  
  /**
    * The role arn associated with this instance profile.
    */
  val roleArn: String = js.native
  
  /**
    * The role id associated with this instance profile.
    */
  val roleId: String = js.native
  
  /**
    * The role name associated with this instance profile.
    */
  val roleName: String = js.native
}
object GetInstanceProfileResult {
  
  @scala.inline
  def apply(
    arn: String,
    createDate: String,
    id: String,
    name: String,
    path: String,
    roleArn: String,
    roleId: String,
    roleName: String
  ): GetInstanceProfileResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], roleId = roleId.asInstanceOf[js.Any], roleName = roleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceProfileResult]
  }
  
  @scala.inline
  implicit class GetInstanceProfileResultOps[Self <: GetInstanceProfileResult] (val x: Self) extends AnyVal {
    
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
    def setCreateDate(value: String): Self = this.set("createDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleId(value: String): Self = this.set("roleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleName(value: String): Self = this.set("roleName", value.asInstanceOf[js.Any])
  }
}
