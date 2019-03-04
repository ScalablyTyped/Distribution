package typings
package atPulumiAwsLib.directoryserviceDirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryArgs extends js.Object {
  /**
    * The alias for the directory (must be unique amongst all aliases in AWS). Required for `enable_sso`.
    */
  val alias: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Connector related information about the directory. Fields documented below.
    */
  val connectSettings: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CustomerDnsIpsCustomerUsername]
  ] = js.undefined
  /**
    * A textual description for the directory.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise` (applies to MicrosoftAD type only).
    */
  val edition: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
    */
  val enableSso: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The fully qualified name for the directory, such as `corp.example.com`
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The password for the directory administrator or connector user.
    */
  val password: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The short name of the directory, such as `CORP`.
    */
  val shortName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The size of the directory (`Small` or `Large` are accepted values).
    */
  val size: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
    */
  val `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * VPC related information about the directory. Fields documented below.
    */
  val vpcSettings: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_SubnetIdsVpcId]] = js.undefined
}

object DirectoryArgs {
  @scala.inline
  def apply(
    password: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    alias: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    connectSettings: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CustomerDnsIpsCustomerUsername] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    edition: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    enableSso: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    shortName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    size: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpcSettings: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_SubnetIdsVpcId] = null
  ): DirectoryArgs = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (connectSettings != null) __obj.updateDynamic("connectSettings")(connectSettings.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (edition != null) __obj.updateDynamic("edition")(edition.asInstanceOf[js.Any])
    if (enableSso != null) __obj.updateDynamic("enableSso")(enableSso.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (vpcSettings != null) __obj.updateDynamic("vpcSettings")(vpcSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryArgs]
  }
}

