package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vpc extends js.Object {
  var securityGroupIds: js.Array[String] = js.native
  var subnetIds: js.Array[String] = js.native
}

object Vpc {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnetIds: js.Array[String]): Vpc = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vpc]
  }
  @scala.inline
  implicit class VpcOps[Self <: Vpc] (val x: Self) extends AnyVal {
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
    def setSecurityGroupIdsVarargs(value: String*): Self = this.set("securityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: js.Array[String]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("subnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: js.Array[String]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
  }
  
}

