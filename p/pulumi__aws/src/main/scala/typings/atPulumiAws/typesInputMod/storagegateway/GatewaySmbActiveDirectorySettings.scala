package typings.atPulumiAws.typesInputMod.storagegateway

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewaySmbActiveDirectorySettings extends js.Object {
  /**
    * The name of the domain that you want the gateway to join.
    */
  var domainName: Input[String] = js.native
  /**
    * The password of the user who has permission to add the gateway to the Active Directory domain.
    */
  var password: Input[String] = js.native
  /**
    * The user name of user who has permission to add the gateway to the Active Directory domain.
    */
  var username: Input[String] = js.native
}

object GatewaySmbActiveDirectorySettings {
  @scala.inline
  def apply(domainName: Input[String], password: Input[String], username: Input[String]): GatewaySmbActiveDirectorySettings = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GatewaySmbActiveDirectorySettings]
  }
}

