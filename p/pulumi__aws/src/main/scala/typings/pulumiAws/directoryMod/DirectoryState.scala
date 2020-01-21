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
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
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
  def apply(
    accessUrl: Input[String] = null,
    alias: Input[String] = null,
    connectSettings: Input[DirectoryConnectSettings] = null,
    description: Input[String] = null,
    dnsIpAddresses: Input[js.Array[Input[String]]] = null,
    edition: Input[String] = null,
    enableSso: Input[Boolean] = null,
    name: Input[String] = null,
    password: Input[String] = null,
    securityGroupId: Input[String] = null,
    shortName: Input[String] = null,
    size: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    `type`: Input[String] = null,
    vpcSettings: Input[DirectoryVpcSettings] = null
  ): DirectoryState = {
    val __obj = js.Dynamic.literal()
    if (accessUrl != null) __obj.updateDynamic("accessUrl")(accessUrl.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (connectSettings != null) __obj.updateDynamic("connectSettings")(connectSettings.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dnsIpAddresses != null) __obj.updateDynamic("dnsIpAddresses")(dnsIpAddresses.asInstanceOf[js.Any])
    if (edition != null) __obj.updateDynamic("edition")(edition.asInstanceOf[js.Any])
    if (enableSso != null) __obj.updateDynamic("enableSso")(enableSso.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (securityGroupId != null) __obj.updateDynamic("securityGroupId")(securityGroupId.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (vpcSettings != null) __obj.updateDynamic("vpcSettings")(vpcSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryState]
  }
}

