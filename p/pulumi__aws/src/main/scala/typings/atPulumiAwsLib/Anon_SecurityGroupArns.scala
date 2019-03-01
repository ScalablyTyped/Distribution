package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupArns extends js.Object {
  var securityGroupArns: js.Array[java.lang.String]
  var subnetArn: java.lang.String
}

object Anon_SecurityGroupArns {
  @scala.inline
  def apply(securityGroupArns: js.Array[java.lang.String], subnetArn: java.lang.String): Anon_SecurityGroupArns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("securityGroupArns")(securityGroupArns)
    __obj.updateDynamic("subnetArn")(subnetArn)
    __obj.asInstanceOf[Anon_SecurityGroupArns]
  }
}

