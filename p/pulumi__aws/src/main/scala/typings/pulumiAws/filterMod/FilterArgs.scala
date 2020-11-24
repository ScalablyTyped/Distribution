package typings.pulumiAws.filterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.guardduty.FilterFindingCriteria
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterArgs extends js.Object {
  
  /**
    * Specifies the action that is to be applied to the findings that match the filter. Can be one of `ARCHIVE` or `NOOP`.
    */
  val action: Input[String] = js.native
  
  /**
    * Description of the filter.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * ID of a GuardDuty detector, attached to your account.
    */
  val detectorId: Input[String] = js.native
  
  /**
    * Represents the criteria to be used in the filter for querying findings. Contains one or more `criterion` blocks, documented below.
    */
  val findingCriteria: Input[FilterFindingCriteria] = js.native
  
  /**
    * The name of your filter.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
    */
  val rank: Input[Double] = js.native
  
  /**
    * The tags that you want to add to the Filter resource. A tag consists of a key and a value.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object FilterArgs {
  
  @scala.inline
  def apply(
    action: Input[String],
    detectorId: Input[String],
    findingCriteria: Input[FilterFindingCriteria],
    rank: Input[Double]
  ): FilterArgs = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], detectorId = detectorId.asInstanceOf[js.Any], findingCriteria = findingCriteria.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterArgs]
  }
  
  @scala.inline
  implicit class FilterArgsOps[Self <: FilterArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: Input[String]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorId(value: Input[String]): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingCriteria(value: Input[FilterFindingCriteria]): Self = this.set("findingCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Input[Double]): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
