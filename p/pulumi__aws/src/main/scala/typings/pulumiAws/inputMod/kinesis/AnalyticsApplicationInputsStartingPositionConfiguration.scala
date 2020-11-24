package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationInputsStartingPositionConfiguration extends js.Object {
  
  var startingPosition: js.UndefOr[Input[String]] = js.native
}
object AnalyticsApplicationInputsStartingPositionConfiguration {
  
  @scala.inline
  def apply(): AnalyticsApplicationInputsStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsApplicationInputsStartingPositionConfiguration]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsStartingPositionConfigurationOps[Self <: AnalyticsApplicationInputsStartingPositionConfiguration] (val x: Self) extends AnyVal {
    
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
    def setStartingPosition(value: Input[String]): Self = this.set("startingPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartingPosition: Self = this.set("startingPosition", js.undefined)
  }
}
