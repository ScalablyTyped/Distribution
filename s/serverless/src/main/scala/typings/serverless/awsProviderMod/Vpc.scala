package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vpc extends js.Object {
  var securityGroupIds: js.Array[String]
  var subnetIds: js.Array[String]
}

object Vpc {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnetIds: js.Array[String]): Vpc = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vpc]
  }
}

