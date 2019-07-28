package typings.atPulumiAws.iotThingMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def this(name: String, args: ThingArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the thing.
    */
  val arn: Output[String] = js.native
  /**
    * Map of attributes of the thing.
    */
  val attributes: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The default client ID.
    */
  val defaultClientId: Output[String] = js.native
  /**
    * The name of the thing.
    */
  val name: Output[String] = js.native
  /**
    * The thing type name.
    */
  val thingTypeName: Output[js.UndefOr[String]] = js.native
  /**
    * The current version of the thing record in the registry.
    */
  val version: Output[Double] = js.native
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
    */
  def get(name: String, id: Input[ID]): Thing = js.native
  def get(name: String, id: Input[ID], state: ThingState): Thing = js.native
  def get(name: String, id: Input[ID], state: ThingState, opts: CustomResourceOptions): Thing = js.native
  /**
    * Returns true if the given object is an instance of Thing.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/thing.Thing */ Boolean = js.native
}

