package typings.pulumiAws.slotTypeMod

import typings.pulumiAws.outputMod.lex.SlotTypeEnumerationValue
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/lex/slotType", "SlotType")
@js.native
class SlotType protected () extends CustomResource {
  /**
    * Create a SlotType resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SlotTypeArgs) = this()
  def this(name: String, args: SlotTypeArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Checksum identifying the version of the slot type that was created. The checksum is
    * not included as an argument because the resource will add it automatically when updating the slot type.
    */
  val checksum: Output_[String] = js.native
  
  /**
    * Determines if a new slot type version is created when the initial resource is created and on each
    * update. Defaults to `false`.
    */
  val createVersion: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The date when the slot type version was created.
    */
  val createdDate: Output_[String] = js.native
  
  /**
    * A description of the slot type. Must be less than or equal to 200 characters in length.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A list of EnumerationValue objects that defines the values that
    * the slot type can take. Each value can have a list of synonyms, which are additional values that help
    * train the machine learning model about the values that it resolves for a slot. Attributes are
    * documented under enumeration_value.
    */
  val enumerationValues: Output_[js.Array[SlotTypeEnumerationValue]] = js.native
  
  /**
    * The date when the `$LATEST` version of this slot type was updated.
    */
  val lastUpdatedDate: Output_[String] = js.native
  
  /**
    * The name of the slot type. The name is not case sensitive. Must be less than or equal to 100 characters in length.
    */
  val name: Output_[String] = js.native
  
  /**
    * Determines the slot resolution strategy that Amazon Lex
    * uses to return slot type values. `ORIGINAL_VALUE` returns the value entered by the user if the user
    * value is similar to the slot value. `TOP_RESOLUTION` returns the first value in the resolution list
    * if there is a resolution list for the slot, otherwise null is returned. Defaults to `ORIGINAL_VALUE`.
    */
  val valueSelectionStrategy: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The version of the slot type.
    */
  val version: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/lex/slotType", "SlotType")
@js.native
object SlotType extends js.Object {
  
  /**
    * Get an existing SlotType resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SlotType = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SlotType = js.native
  def get(name: String, id: Input[ID], state: SlotTypeState): SlotType = js.native
  def get(name: String, id: Input[ID], state: SlotTypeState, opts: CustomResourceOptions): SlotType = js.native
  
  /**
    * Returns true if the given object is an instance of SlotType.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lex/slotType.SlotType */ Boolean = js.native
}
