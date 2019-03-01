package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIdsSubnetsArray extends js.Object {
  var securityGroupIds: js.Array[java.lang.String]
  var subnets: js.Array[java.lang.String]
}

object Anon_SecurityGroupIdsSubnetsArray {
  @scala.inline
  def apply(securityGroupIds: js.Array[java.lang.String], subnets: js.Array[java.lang.String]): Anon_SecurityGroupIdsSubnetsArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("securityGroupIds")(securityGroupIds)
    __obj.updateDynamic("subnets")(subnets)
    __obj.asInstanceOf[Anon_SecurityGroupIdsSubnetsArray]
  }
}

