package typings.pulumiAws.inputMod.cloudtrail

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrailEventSelector extends js.Object {
  
  /**
    * Specifies logging data events. Fields documented below.
    */
  var dataResources: js.UndefOr[Input[js.Array[Input[TrailEventSelectorDataResource]]]] = js.native
  
  /**
    * Specify if you want your event selector to include management events for your trail.
    */
  var includeManagementEvents: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Specify if you want your trail to log read-only events, write-only events, or all. By default, the value is All. You can specify only the following value: "ReadOnly", "WriteOnly", "All". Defaults to `All`.
    */
  var readWriteType: js.UndefOr[Input[String]] = js.native
}
object TrailEventSelector {
  
  @scala.inline
  def apply(): TrailEventSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrailEventSelector]
  }
  
  @scala.inline
  implicit class TrailEventSelectorOps[Self <: TrailEventSelector] (val x: Self) extends AnyVal {
    
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
    def setDataResourcesVarargs(value: Input[TrailEventSelectorDataResource]*): Self = this.set("dataResources", js.Array(value :_*))
    
    @scala.inline
    def setDataResources(value: Input[js.Array[Input[TrailEventSelectorDataResource]]]): Self = this.set("dataResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataResources: Self = this.set("dataResources", js.undefined)
    
    @scala.inline
    def setIncludeManagementEvents(value: Input[Boolean]): Self = this.set("includeManagementEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeManagementEvents: Self = this.set("includeManagementEvents", js.undefined)
    
    @scala.inline
    def setReadWriteType(value: Input[String]): Self = this.set("readWriteType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadWriteType: Self = this.set("readWriteType", js.undefined)
  }
}
