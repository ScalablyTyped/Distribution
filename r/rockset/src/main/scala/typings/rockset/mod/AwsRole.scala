package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRole extends js.Object {
  
  // ARN of rockset-role created in your account
  var aws_role_arn: String = js.native
}
object AwsRole {
  
  @scala.inline
  def apply(aws_role_arn: String): AwsRole = {
    val __obj = js.Dynamic.literal(aws_role_arn = aws_role_arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsRole]
  }
  
  @scala.inline
  implicit class AwsRoleOps[Self <: AwsRole] (val x: Self) extends AnyVal {
    
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
    def setAws_role_arn(value: String): Self = this.set("aws_role_arn", value.asInstanceOf[js.Any])
  }
}
