package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupArns extends js.Object {
  var securityGroupArns: js.Array[String]
  var subnetArn: String
}

object Anon_SecurityGroupArns {
  @scala.inline
  def apply(securityGroupArns: js.Array[String], subnetArn: String): Anon_SecurityGroupArns = {
    val __obj = js.Dynamic.literal(securityGroupArns = securityGroupArns, subnetArn = subnetArn)
  
    __obj.asInstanceOf[Anon_SecurityGroupArns]
  }
}

