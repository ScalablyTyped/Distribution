package typings.atPulumiAws.directoryserviceGetDirectoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.directoryservice.GetDirectoryConnectSetting
import typings.atPulumiAws.typesOutputMod.directoryservice.GetDirectoryVpcSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectoryResult extends js.Object {
  /**
    * The access URL for the directory/connector, such as http://alias.awsapps.com.
    */
  val accessUrl: String = js.native
  /**
    * The alias for the directory/connector, such as `d-991708b282.awsapps.com`.
    */
  val alias: String = js.native
  val connectSettings: js.Array[GetDirectoryConnectSetting] = js.native
  /**
    * A textual description for the directory/connector.
    */
  val description: String = js.native
  val directoryId: String = js.native
  /**
    * A list of IP addresses of the DNS servers for the directory/connector.
    */
  val dnsIpAddresses: js.Array[String] = js.native
  /**
    * (for `MicrosoftAD`) The Microsoft AD edition (`Standard` or `Enterprise`).
    */
  val edition: String = js.native
  /**
    * The directory/connector single-sign on status.
    */
  val enableSso: Boolean = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The fully qualified name for the directory/connector.
    */
  val name: String = js.native
  /**
    * The ID of the security group created by the directory/connector.
    */
  val securityGroupId: String = js.native
  /**
    * The short name of the directory/connector, such as `CORP`.
    */
  val shortName: String = js.native
  /**
    * (for `SimpleAD` and `ADConnector`) The size of the directory/connector (`Small` or `Large`).
    */
  val size: String = js.native
  /**
    * A mapping of tags assigned to the directory/connector.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD`).
    */
  val `type`: String = js.native
  val vpcSettings: js.Array[GetDirectoryVpcSetting] = js.native
}

object GetDirectoryResult {
  @scala.inline
  def apply(
    accessUrl: String,
    alias: String,
    connectSettings: js.Array[GetDirectoryConnectSetting],
    description: String,
    directoryId: String,
    dnsIpAddresses: js.Array[String],
    edition: String,
    enableSso: Boolean,
    id: String,
    name: String,
    securityGroupId: String,
    shortName: String,
    size: String,
    `type`: String,
    vpcSettings: js.Array[GetDirectoryVpcSetting],
    tags: StringDictionary[js.Any] = null
  ): GetDirectoryResult = {
    val __obj = js.Dynamic.literal(accessUrl = accessUrl.asInstanceOf[js.Any], alias = alias.asInstanceOf[js.Any], connectSettings = connectSettings.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], directoryId = directoryId.asInstanceOf[js.Any], dnsIpAddresses = dnsIpAddresses.asInstanceOf[js.Any], edition = edition.asInstanceOf[js.Any], enableSso = enableSso.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vpcSettings = vpcSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryResult]
  }
}

