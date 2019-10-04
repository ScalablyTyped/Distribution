package typings.atPulumiAws.typesOutputMod.storagegatewayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewaySmbActiveDirectorySettings extends js.Object {
  /**
    * The name of the domain that you want the gateway to join.
    */
  var domainName: String
  /**
    * The password of the user who has permission to add the gateway to the Active Directory domain.
    */
  var password: String
  /**
    * The user name of user who has permission to add the gateway to the Active Directory domain.
    */
  var username: String
}

object GatewaySmbActiveDirectorySettings {
  @scala.inline
  def apply(domainName: String, password: String, username: String): GatewaySmbActiveDirectorySettings = {
    val __obj = js.Dynamic.literal(domainName = domainName, password = password, username = username)
  
    __obj.asInstanceOf[GatewaySmbActiveDirectorySettings]
  }
}

