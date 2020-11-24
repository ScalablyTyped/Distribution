package typings.pulumiAws.thingMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/iot/thing", "Thing")
@js.native
class Thing protected () extends CustomResource {
  /**
    * Create a Thing resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ThingArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ThingArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the thing.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Map of attributes of the thing.
    */
  val attributes: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * The default client ID.
    */
  val defaultClientId: Output_[String] = js.native
  
  /**
    * The name of the thing.
    */
  val name: Output_[String] = js.native
  
  /**
    * The thing type name.
    */
  val thingTypeName: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The current version of the thing record in the registry.
    */
  val version: Output_[Double] = js.native
}
/* static members */
@JSImport("@pulumi/aws/iot/thing", "Thing")
@js.native
object Thing extends js.Object {
  
  /**
    * Get an existing Thing resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Thing = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Thing = js.native
  def get(name: String, id: Input[ID], state: ThingState): Thing = js.native
  def get(name: String, id: Input[ID], state: ThingState, opts: CustomResourceOptions): Thing = js.native
  
  /**
    * Returns true if the given object is an instance of Thing.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thing.Thing */ Boolean = js.native
}
