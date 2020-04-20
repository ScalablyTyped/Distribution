package typings.pulumiAws.outputMod.directoryservice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryConnectSettings extends js.Object {
  /**
    * The DNS IP addresses of the domain to connect to.
    */
  var customerDnsIps: js.Array[String] = js.native
  /**
    * The username corresponding to the password provided.
    */
  var customerUsername: String = js.native
  /**
    * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
    */
  var subnetIds: js.Array[String] = js.native
  /**
    * The identifier of the VPC that the directory is in.
    */
  var vpcId: String = js.native
}

object DirectoryConnectSettings {
  @scala.inline
  def apply(
    customerDnsIps: js.Array[String],
    customerUsername: String,
    subnetIds: js.Array[String],
    vpcId: String
  ): DirectoryConnectSettings = {
    val __obj = js.Dynamic.literal(customerDnsIps = customerDnsIps.asInstanceOf[js.Any], customerUsername = customerUsername.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryConnectSettings]
  }
}

