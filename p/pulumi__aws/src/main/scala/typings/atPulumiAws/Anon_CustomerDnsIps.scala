package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomerDnsIps extends js.Object {
  var customerDnsIps: js.Array[String]
  var customerUsername: String
  var subnetIds: js.Array[String]
  var vpcId: String
}

object Anon_CustomerDnsIps {
  @scala.inline
  def apply(
    customerDnsIps: js.Array[String],
    customerUsername: String,
    subnetIds: js.Array[String],
    vpcId: String
  ): Anon_CustomerDnsIps = {
    val __obj = js.Dynamic.literal(customerDnsIps = customerDnsIps, customerUsername = customerUsername, subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[Anon_CustomerDnsIps]
  }
}

