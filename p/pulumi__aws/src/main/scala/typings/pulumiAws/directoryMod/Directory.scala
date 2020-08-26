package typings.pulumiAws.directoryMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.directoryservice.DirectoryConnectSettings
import typings.pulumiAws.outputMod.directoryservice.DirectoryVpcSettings
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
  val accessUrl: Output_[String] = js.native
  /**
    * The alias for the directory (must be unique amongst all aliases in AWS). Required for `enableSso`.
    */
  val alias: Output_[String] = js.native
  /**
    * Connector related information about the directory. Fields documented below.
    */
  val connectSettings: Output_[js.UndefOr[DirectoryConnectSettings]] = js.native
  /**
    * A textual description for the directory.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * A list of IP addresses of the DNS servers for the directory or connector.
    */
  val dnsIpAddresses: Output_[js.Array[String]] = js.native
  /**
    * The MicrosoftAD edition (`Standard` or `Enterprise`). Defaults to `Enterprise` (applies to MicrosoftAD type only).
    */
  val edition: Output_[String] = js.native
  /**
    * Whether to enable single-sign on for the directory. Requires `alias`. Defaults to `false`.
    */
  val enableSso: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The fully qualified name for the directory, such as `corp.example.com`
    */
  val name: Output_[String] = js.native
  /**
    * The password for the directory administrator or connector user.
    */
  val password: Output_[String] = js.native
  /**
    * The ID of the security group created by the directory.
    */
  val securityGroupId: Output_[String] = js.native
  /**
    * The short name of the directory, such as `CORP`.
    */
  val shortName: Output_[String] = js.native
  /**
    * The size of the directory (`Small` or `Large` are accepted values).
    */
  val size: Output_[String] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The directory type (`SimpleAD`, `ADConnector` or `MicrosoftAD` are accepted values). Defaults to `SimpleAD`.
    */
  val `type`: Output_[js.UndefOr[String]] = js.native
  /**
    * VPC related information about the directory. Fields documented below.
    */
  val vpcSettings: Output_[js.UndefOr[DirectoryVpcSettings]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Directory = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Directory = js.native
  def get(name: String, id: Input[ID], state: DirectoryState): Directory = js.native
  def get(name: String, id: Input[ID], state: DirectoryState, opts: CustomResourceOptions): Directory = js.native
  /**
    * Returns true if the given object is an instance of Directory.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/directory.Directory */ Boolean = js.native
}

