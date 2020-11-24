package typings.pulumiAws.filterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.guardduty.FilterFindingCriteria
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/guardduty/filter", "Filter")
@js.native
class Filter protected () extends CustomResource {
  /**
    * Create a Filter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FilterArgs) = this()
  def this(name: String, args: FilterArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Specifies the action that is to be applied to the findings that match the filter. Can be one of `ARCHIVE` or `NOOP`.
    */
  val action: Output_[String] = js.native
  
  /**
    * The ARN of the GuardDuty filter.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Description of the filter.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * ID of a GuardDuty detector, attached to your account.
    */
  val detectorId: Output_[String] = js.native
  
  /**
    * Represents the criteria to be used in the filter for querying findings. Contains one or more `criterion` blocks, documented below.
    */
  val findingCriteria: Output_[FilterFindingCriteria] = js.native
  
  /**
    * The name of your filter.
    */
  val name: Output_[String] = js.native
  
  /**
    * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
    */
  val rank: Output_[Double] = js.native
  
  /**
    * The tags that you want to add to the Filter resource. A tag consists of a key and a value.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/guardduty/filter", "Filter")
@js.native
object Filter extends js.Object {
  
  /**
    * Get an existing Filter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Filter = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Filter = js.native
  def get(name: String, id: Input[ID], state: FilterState): Filter = js.native
  def get(name: String, id: Input[ID], state: FilterState, opts: CustomResourceOptions): Filter = js.native
  
  /**
    * Returns true if the given object is an instance of Filter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/filter.Filter */ Boolean = js.native
}
