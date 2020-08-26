package typings.pulumiAws.getDirectoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.directoryservice.GetDirectoryConnectSetting
import typings.pulumiAws.outputMod.directoryservice.GetDirectoryVpcSetting
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
    * The provider-assigned unique ID for this managed resource.
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
    * A map of tags assigned to the directory/connector.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
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
    vpcSettings: js.Array[GetDirectoryVpcSetting]
  ): GetDirectoryResult = {
    val __obj = js.Dynamic.literal(accessUrl = accessUrl.asInstanceOf[js.Any], alias = alias.asInstanceOf[js.Any], connectSettings = connectSettings.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], directoryId = directoryId.asInstanceOf[js.Any], dnsIpAddresses = dnsIpAddresses.asInstanceOf[js.Any], edition = edition.asInstanceOf[js.Any], enableSso = enableSso.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], securityGroupId = securityGroupId.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vpcSettings = vpcSettings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryResult]
  }
  @scala.inline
  implicit class GetDirectoryResultOps[Self <: GetDirectoryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessUrl(value: String): Self = this.set("accessUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectSettingsVarargs(value: GetDirectoryConnectSetting*): Self = this.set("connectSettings", js.Array(value :_*))
    @scala.inline
    def setConnectSettings(value: js.Array[GetDirectoryConnectSetting]): Self = this.set("connectSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryId(value: String): Self = this.set("directoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDnsIpAddressesVarargs(value: String*): Self = this.set("dnsIpAddresses", js.Array(value :_*))
    @scala.inline
    def setDnsIpAddresses(value: js.Array[String]): Self = this.set("dnsIpAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdition(value: String): Self = this.set("edition", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableSso(value: Boolean): Self = this.set("enableSso", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupId(value: String): Self = this.set("securityGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortName(value: String): Self = this.set("shortName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcSettingsVarargs(value: GetDirectoryVpcSetting*): Self = this.set("vpcSettings", js.Array(value :_*))
    @scala.inline
    def setVpcSettings(value: js.Array[GetDirectoryVpcSetting]): Self = this.set("vpcSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

