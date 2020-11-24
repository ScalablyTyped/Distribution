package typings.pulumiAws.nfsLocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.datasync.NfsLocationOnPremConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  val arn: Output_[String] = js.native
  
  /**
    * Configuration block containing information for connecting to the NFS File System.
    */
  val onPremConfig: Output_[NfsLocationOnPremConfig] = js.native
  
  /**
    * Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): NfsLocation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NfsLocation = js.native
  def get(name: String, id: Input[ID], state: NfsLocationState): NfsLocation = js.native
  def get(name: String, id: Input[ID], state: NfsLocationState, opts: CustomResourceOptions): NfsLocation = js.native
  
  /**
    * Returns true if the given object is an instance of NfsLocation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/nfsLocation.NfsLocation */ Boolean = js.native
}
