package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomerDnsIps extends js.Object {
  var customerDnsIps: js.Array[java.lang.String]
  var customerUsername: java.lang.String
  var subnetIds: js.Array[java.lang.String]
  var vpcId: java.lang.String
}

object Anon_CustomerDnsIps {
  @scala.inline
  def apply(
    customerDnsIps: js.Array[java.lang.String],
    customerUsername: java.lang.String,
    subnetIds: js.Array[java.lang.String],
    vpcId: java.lang.String
  ): Anon_CustomerDnsIps = {
    val __obj = js.Dynamic.literal(customerDnsIps = customerDnsIps, customerUsername = customerUsername, subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[Anon_CustomerDnsIps]
  }
}

