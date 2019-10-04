package typings.atPulumiAws.datasyncNfsLocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.datasyncNs.NfsLocationOnPremConfig
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync/nfsLocation", "NfsLocation")
@js.native
class NfsLocation protected () extends CustomResource {
  /**
    * Create a NfsLocation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NfsLocationArgs) = this()
  def this(name: String, args: NfsLocationArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: Output[String] = js.native
  /**
    * Configuration block containing information for connecting to the NFS File System.
    */
  val onPremConfig: Output[NfsLocationOnPremConfig] = js.native
  /**
    * Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
    */
  val serverHostname: Output[String] = js.native
  /**
    * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
    */
  val subdirectory: Output[String] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: Output[js.UndefOr[StringDictionary[String]]] = js.native
  val uri: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/datasync/nfsLocation", "NfsLocation")
@js.native
object NfsLocation extends js.Object {
  /**
    * Get an existing NfsLocation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): NfsLocation = js.native
  def get(name: String, id: Input[ID], state: NfsLocationState): NfsLocation = js.native
  def get(name: String, id: Input[ID], state: NfsLocationState, opts: CustomResourceOptions): NfsLocation = js.native
  /**
    * Returns true if the given object is an instance of NfsLocation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/nfsLocation.NfsLocation */ Boolean = js.native
}

