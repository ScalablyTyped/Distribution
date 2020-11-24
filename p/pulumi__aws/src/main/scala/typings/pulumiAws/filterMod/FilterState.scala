package typings.pulumiAws.filterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.guardduty.FilterFindingCriteria
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterState extends js.Object {
  
  /**
    * Specifies the action that is to be applied to the findings that match the filter. Can be one of `ARCHIVE` or `NOOP`.
    */
  val action: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the GuardDuty filter.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Description of the filter.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * ID of a GuardDuty detector, attached to your account.
    */
  val detectorId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Represents the criteria to be used in the filter for querying findings. Contains one or more `criterion` blocks, documented below.
    */
  val findingCriteria: js.UndefOr[Input[FilterFindingCriteria]] = js.native
  
  /**
    * The name of your filter.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
    */
  val rank: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The tags that you want to add to the Filter resource. A tag consists of a key and a value.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object FilterState {
  
  @scala.inline
  def apply(): FilterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterState]
  }
  
  @scala.inline
  implicit class FilterStateOps[Self <: FilterState] (val x: Self) extends AnyVal {
    
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
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDetectorId(value: Input[String]): Self = this.set("detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectorId: Self = this.set("detectorId", js.undefined)
    
    @scala.inline
    def setFindingCriteria(value: Input[FilterFindingCriteria]): Self = this.set("findingCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindingCriteria: Self = this.set("findingCriteria", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRank(value: Input[Double]): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
