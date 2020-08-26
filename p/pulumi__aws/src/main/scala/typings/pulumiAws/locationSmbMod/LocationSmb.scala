package typings.pulumiAws.locationSmbMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.datasync.LocationSmbMountOptions
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync/locationSmb", "LocationSmb")
@js.native
class LocationSmb protected () extends CustomResource {
  /**
    * Create a LocationSmb resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LocationSmbArgs) = this()
  def this(name: String, args: LocationSmbArgs, opts: CustomResourceOptions) = this()
  /**
    * A list of DataSync Agent ARNs with which this location will be associated.
    */
  val agentArns: Output_[js.Array[String]] = js.native
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: Output_[String] = js.native
  /**
    * The name of the Windows domain the SMB server belongs to.
    */
  val domain: Output_[String] = js.native
  /**
    * Configuration block containing mount options used by DataSync to access the SMB Server. Can be `AUTOMATIC`, `SMB2`, or `SMB3`.
    */
  val mountOptions: Output_[js.UndefOr[LocationSmbMountOptions]] = js.native
  /**
    * The password of the user who can mount the share and has file permissions in the SMB.
    */
  val password: Output_[String] = js.native
  /**
    * Specifies the IP address or DNS name of the SMB server. The DataSync Agent(s) use this to mount the SMB share.
    */
  val serverHostname: Output_[String] = js.native
  /**
    * Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
    */
  val subdirectory: Output_[String] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  val uri: Output_[String] = js.native
  /**
    * The user who can mount the share and has file and folder permissions in the SMB share.
    */
  val user: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/datasync/locationSmb", "LocationSmb")
@js.native
object LocationSmb extends js.Object {
  /**
    * Get an existing LocationSmb resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LocationSmb = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LocationSmb = js.native
  def get(name: String, id: Input[ID], state: LocationSmbState): LocationSmb = js.native
  def get(name: String, id: Input[ID], state: LocationSmbState, opts: CustomResourceOptions): LocationSmb = js.native
  /**
    * Returns true if the given object is an instance of LocationSmb.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/locationSmb.LocationSmb */ Boolean = js.native
}

