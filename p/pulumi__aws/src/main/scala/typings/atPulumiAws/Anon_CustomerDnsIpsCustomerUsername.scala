package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomerDnsIpsCustomerUsername extends js.Object {
  var customerDnsIps: Input[js.Array[Input[String]]]
  var customerUsername: Input[String]
  var subnetIds: Input[js.Array[Input[String]]]
  var vpcId: Input[String]
}

object Anon_CustomerDnsIpsCustomerUsername {
  @scala.inline
  def apply(
    customerDnsIps: Input[js.Array[Input[String]]],
    customerUsername: Input[String],
    subnetIds: Input[js.Array[Input[String]]],
    vpcId: Input[String]
  ): Anon_CustomerDnsIpsCustomerUsername = {
    val __obj = js.Dynamic.literal(customerDnsIps = customerDnsIps.asInstanceOf[js.Any], customerUsername = customerUsername.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CustomerDnsIpsCustomerUsername]
  }
}

