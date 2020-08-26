package typings.pulumiAws.directoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.directoryservice.DirectoryConnectSettings
import typings.pulumiAws.inputMod.directoryservice.DirectoryVpcSettings
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryState extends js.Object {
  /**
    * The access URL for the directory, such as `http://alias.awsapps.com`.
    */
  val accessUrl: js.UndefOr[Input[String]] = js.native
  /**
    * The alias for the directory (must be unique amongst all aliases in AWS). Required for `enableSso`.
    */
  val alias: js.UndefOr[Input[String]] = js.native
  /**
    * Connector related information about the directory. Fields documented below.
    */
  val connectSettings: js.UndefOr[Input[DirectoryConnectSettings]] = js.native
  /**
    * A textual description for the directory.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A list of IP addresses of the DNS servers for the directory or connector.
    */
  val dnsIpAddresses: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise` (applies to MicrosoftAD type only).
    */
  val edition: js.UndefOr[Input[String]] = js.native
  /**
    * Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
    */
  val enableSso: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The fully qualified name for the directory, such as `corp.example.com`
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The password for the directory administrator or connector user.
    */
  val password: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the security group created by the directory.
    */
  val securityGroupId: js.UndefOr[Input[String]] = js.native
  /**
    * The short name of the directory, such as `CORP`.
    */
  val shortName: js.UndefOr[Input[String]] = js.native
  /**
    * The size of the directory (`Small` or `Large` are accepted values).
    */
  val size: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
    */
  val `type`: js.UndefOr[Input[String]] = js.native
  /**
    * VPC related information about the directory. Fields documented below.
    */
  val vpcSettings: js.UndefOr[Input[DirectoryVpcSettings]] = js.native
}

object DirectoryState {
  @scala.inline
  def apply(): DirectoryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryState]
  }
  @scala.inline
  implicit class DirectoryStateOps[Self <: DirectoryState] (val x: Self) extends AnyVal {
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
    def setAccessUrl(value: Input[String]): Self = this.set("accessUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessUrl: Self = this.set("accessUrl", js.undefined)
    @scala.inline
    def setAlias(value: Input[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setConnectSettings(value: Input[DirectoryConnectSettings]): Self = this.set("connectSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectSettings: Self = this.set("connectSettings", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDnsIpAddressesVarargs(value: Input[String]*): Self = this.set("dnsIpAddresses", js.Array(value :_*))
    @scala.inline
    def setDnsIpAddresses(value: Input[js.Array[Input[String]]]): Self = this.set("dnsIpAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsIpAddresses: Self = this.set("dnsIpAddresses", js.undefined)
    @scala.inline
    def setEdition(value: Input[String]): Self = this.set("edition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdition: Self = this.set("edition", js.undefined)
    @scala.inline
    def setEnableSso(value: Input[Boolean]): Self = this.set("enableSso", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSso: Self = this.set("enableSso", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPassword(value: Input[String]): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setSecurityGroupId(value: Input[String]): Self = this.set("securityGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupId: Self = this.set("securityGroupId", js.undefined)
    @scala.inline
    def setShortName(value: Input[String]): Self = this.set("shortName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortName: Self = this.set("shortName", js.undefined)
    @scala.inline
    def setSize(value: Input[String]): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVpcSettings(value: Input[DirectoryVpcSettings]): Self = this.set("vpcSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcSettings: Self = this.set("vpcSettings", js.undefined)
  }
  
}

