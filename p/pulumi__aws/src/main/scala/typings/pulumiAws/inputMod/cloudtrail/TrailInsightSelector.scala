package typings.pulumiAws.inputMod.cloudtrail

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrailInsightSelector extends js.Object {
  
  /**
    * The type of insights to log on a trail. In this release, only `ApiCallRateInsight` is supported as an insight type.
    */
  var insightType: Input[String] = js.native
}
object TrailInsightSelector {
  
  @scala.inline
  def apply(insightType: Input[String]): TrailInsightSelector = {
    val __obj = js.Dynamic.literal(insightType = insightType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrailInsightSelector]
  }
  
  @scala.inline
  implicit class TrailInsightSelectorOps[Self <: TrailInsightSelector] (val x: Self) extends AnyVal {
    
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
    def setInsightType(value: Input[String]): Self = this.set("insightType", value.asInstanceOf[js.Any])
  }
}
