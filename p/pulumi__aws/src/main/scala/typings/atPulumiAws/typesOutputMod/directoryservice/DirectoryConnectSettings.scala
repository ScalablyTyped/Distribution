package typings.atPulumiAws.typesOutputMod.directoryservice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryConnectSettings extends js.Object {
  /**
    * The DNS IP addresses of the domain to connect to.
    */
  var customerDnsIps: js.Array[String]
  /**
    * The username corresponding to the password provided.
    */
  var customerUsername: String
  /**
    * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
    */
  var subnetIds: js.Array[String]
  /**
    * The identifier of the VPC that the directory is in.
    */
  var vpcId: String
}

object DirectoryConnectSettings {
  @scala.inline
  def apply(
    customerDnsIps: js.Array[String],
    customerUsername: String,
    subnetIds: js.Array[String],
    vpcId: String
  ): DirectoryConnectSettings = {
    val __obj = js.Dynamic.literal(customerDnsIps = customerDnsIps, customerUsername = customerUsername, subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[DirectoryConnectSettings]
  }
}

