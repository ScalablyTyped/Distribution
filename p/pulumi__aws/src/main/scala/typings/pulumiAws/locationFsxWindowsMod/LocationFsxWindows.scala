package typings.pulumiAws.locationFsxWindowsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/datasync/locationFsxWindows", "LocationFsxWindows")
@js.native
class LocationFsxWindows protected () extends CustomResource {
  /**
    * Create a LocationFsxWindows resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: LocationFsxWindowsArgs) = this()
  def this(name: String, args: LocationFsxWindowsArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The time that the FSx for Windows location was created.
    */
  val creationTime: Output_[String] = js.native
  
  /**
    * The name of the Windows domain that the FSx for Windows server belongs to.
    */
  val domain: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the FSx for Windows file system.
    */
  val fsxFilesystemArn: Output_[String] = js.native
  
  /**
    * The password of the user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  val password: Output_[String] = js.native
  
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are to use to configure the FSx for Windows file system.
    */
  val securityGroupArns: Output_[js.Array[String]] = js.native
  
  /**
    * Subdirectory to perform actions as source or destination.
    */
  val subdirectory: Output_[String] = js.native
  
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The URL of the FSx for Windows location that was described.
    */
  val uri: Output_[String] = js.native
  
  /**
    * The user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  val user: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/datasync/locationFsxWindows", "LocationFsxWindows")
@js.native
object LocationFsxWindows extends js.Object {
  
  /**
    * Get an existing LocationFsxWindows resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): LocationFsxWindows = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LocationFsxWindows = js.native
  def get(name: String, id: Input[ID], state: LocationFsxWindowsState): LocationFsxWindows = js.native
  def get(name: String, id: Input[ID], state: LocationFsxWindowsState, opts: CustomResourceOptions): LocationFsxWindows = js.native
  
  /**
    * Returns true if the given object is an instance of LocationFsxWindows.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/locationFsxWindows.LocationFsxWindows */ Boolean = js.native
}
