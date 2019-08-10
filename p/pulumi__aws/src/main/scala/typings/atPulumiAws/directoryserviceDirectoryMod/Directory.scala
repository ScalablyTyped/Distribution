package typings.atPulumiAws.directoryserviceDirectoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_CustomerDnsIps
import typings.atPulumiAws.Anon_SubnetIds
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directoryservice/directory", "Directory")
@js.native
class Directory protected () extends CustomResource {
  /**
    * Create a Directory resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DirectoryArgs) = this()
  def this(name: String, args: DirectoryArgs, opts: CustomResourceOptions) = this()
  /**
    * The access URL for the directory, such as `http://alias.awsapps.com`.
    */
  val accessUrl: Output[String] = js.native
  /**
    * The alias for the directory (must be unique amongst all aliases in AWS). Required for `enableSso`.
    */
  val alias: Output[String] = js.native
  /**
    * Connector related information about the directory. Fields documented below.
    */
  val connectSettings: Output[js.UndefOr[Anon_CustomerDnsIps]] = js.native
  /**
    * A textual description for the directory.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * A list of IP addresses of the DNS servers for the directory or connector.
    */
  val dnsIpAddresses: Output[js.Array[String]] = js.native
  /**
    * The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise` (applies to MicrosoftAD type only).
    */
  val edition: Output[String] = js.native
  /**
    * Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
    */
  val enableSso: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The fully qualified name for the directory, such as `corp.example.com`
    */
  val name: Output[String] = js.native
  /**
    * The password for the directory administrator or connector user.
    */
  val password: Output[String] = js.native
  /**
    * The ID of the security group created by the directory.
    */
  val securityGroupId: Output[String] = js.native
  /**
    * The short name of the directory, such as `CORP`.
    */
  val shortName: Output[String] = js.native
  /**
    * The size of the directory (`Small` or `Large` are accepted values).
    */
  val size: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
    */
  val `type`: Output[js.UndefOr[String]] = js.native
  /**
    * VPC related information about the directory. Fields documented below.
    */
  val vpcSettings: Output[js.UndefOr[Anon_SubnetIds]] = js.native
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
  def get(name: String, id: Input[ID]): Directory = js.native
  def get(name: String, id: Input[ID], state: DirectoryState): Directory = js.native
  def get(name: String, id: Input[ID], state: DirectoryState, opts: CustomResourceOptions): Directory = js.native
  /**
    * Returns true if the given object is an instance of Directory.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/directory.Directory */ Boolean = js.native
}

