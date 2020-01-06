package typings.atPulumiAws.typesInputMod.directoryservice

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryConnectSettings extends js.Object {
  /**
    * The DNS IP addresses of the domain to connect to.
    */
  var customerDnsIps: Input[js.Array[Input[String]]] = js.native
  /**
    * The username corresponding to the password provided.
    */
  var customerUsername: Input[String] = js.native
  /**
    * The identifiers of the subnets for the directory servers (2 subnets in 2 different AZs).
    */
  var subnetIds: Input[js.Array[Input[String]]] = js.native
  /**
    * The identifier of the VPC that the directory is in.
    */
  var vpcId: Input[String] = js.native
}

object DirectoryConnectSettings {
  @scala.inline
  def apply(
    customerDnsIps: Input[js.Array[Input[String]]],
    customerUsername: Input[String],
    subnetIds: Input[js.Array[Input[String]]],
    vpcId: Input[String]
  ): DirectoryConnectSettings = {
    val __obj = js.Dynamic.literal(customerDnsIps = customerDnsIps.asInstanceOf[js.Any], customerUsername = customerUsername.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectoryConnectSettings]
  }
}

