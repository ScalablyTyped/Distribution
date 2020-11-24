package typings.pulumiAws.buildMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.gamelift.BuildStorageLocation
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/gamelift/build", "Build")
@js.native
class Build protected () extends CustomResource {
  /**
    * Create a Build resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BuildArgs) = this()
  def this(name: String, args: BuildArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Gamelift Build ARN.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Name of the build
    */
  val name: Output_[String] = js.native
  
  /**
    * Operating system that the game server binaries are built to run on. e.g. `WINDOWS_2012` or `AMAZON_LINUX`.
    */
  val operatingSystem: Output_[String] = js.native
  
  /**
    * Information indicating where your game build files are stored. See below.
    */
  val storageLocation: Output_[BuildStorageLocation] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * Version that is associated with this build.
    */
  val version: Output_[js.UndefOr[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/gamelift/build", "Build")
@js.native
object Build extends js.Object {
  
  /**
    * Get an existing Build resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Build = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Build = js.native
  def get(name: String, id: Input[ID], state: BuildState): Build = js.native
  def get(name: String, id: Input[ID], state: BuildState, opts: CustomResourceOptions): Build = js.native
  
  /**
    * Returns true if the given object is an instance of Build.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/gamelift/build.Build */ Boolean = js.native
}
