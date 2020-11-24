package typings.pulumiAws.resourceShareMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ram/resourceShare", "ResourceShare")
@js.native
class ResourceShare protected () extends CustomResource {
  /**
    * Create a ResourceShare resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ResourceShareArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ResourceShareArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Indicates whether principals outside your organization can be associated with a resource share.
    */
  val allowExternalPrincipals: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The name of the resource share.
    */
  val name: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource share.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ram/resourceShare", "ResourceShare")
@js.native
object ResourceShare extends js.Object {
  
  /**
    * Get an existing ResourceShare resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ResourceShare = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ResourceShare = js.native
  def get(name: String, id: Input[ID], state: ResourceShareState): ResourceShare = js.native
  def get(name: String, id: Input[ID], state: ResourceShareState, opts: CustomResourceOptions): ResourceShare = js.native
  
  /**
    * Returns true if the given object is an instance of ResourceShare.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ram/resourceShare.ResourceShare */ Boolean = js.native
}
