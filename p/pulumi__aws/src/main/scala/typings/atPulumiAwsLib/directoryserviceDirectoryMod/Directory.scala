package typings
package atPulumiAwsLib.directoryserviceDirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directoryservice/directory", "Directory")
@js.native
class Directory protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Directory resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: DirectoryArgs) = this()
  def this(name: java.lang.String, args: DirectoryArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The access URL for the directory, such as `http://alias.awsapps.com`.
    */
  val accessUrl: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The alias for the directory (must be unique amongst all aliases in AWS). Required for `enable_sso`.
    */
  val alias: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Connector related information about the directory. Fields documented below.
    */
  val connectSettings: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_CustomerDnsIps]] = js.native
  /**
    * A textual description for the directory.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A list of IP addresses of the DNS servers for the directory or connector.
    */
  val dnsIpAddresses: atPulumiPulumiLib.outputMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise` (applies to MicrosoftAD type only).
    */
  val edition: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
    */
  val enableSso: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The fully qualified name for the directory, such as `corp.example.com`
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The password for the directory administrator or connector user.
    */
  val password: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the security group created by the directory.
    */
  val securityGroupId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The short name of the directory, such as `CORP`.
    */
  val shortName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The size of the directory (`Small` or `Large` are accepted values).
    */
  val size: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
    */
  val `type`: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * VPC related information about the directory. Fields documented below.
    */
  val vpcSettings: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_SubnetIds]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directoryservice/directory", "Directory")
@js.native
object Directory extends js.Object {
  /**
    * Get an existing Directory resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directoryserviceDirectoryMod.Directory = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directoryserviceDirectoryMod.DirectoryState
  ): atPulumiAwsLib.directoryserviceDirectoryMod.Directory = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directoryserviceDirectoryMod.DirectoryState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.directoryserviceDirectoryMod.Directory = js.native
}

