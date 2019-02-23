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

