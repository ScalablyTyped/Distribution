package typings.pulumiAws.outputMod.lambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSourceMappingDestinationConfig extends js.Object {
  
  /**
    * The destination configuration for failed invocations. Detailed below.
    */
  var onFailure: js.UndefOr[EventSourceMappingDestinationConfigOnFailure] = js.native
}
object EventSourceMappingDestinationConfig {
  
  @scala.inline
  def apply(): EventSourceMappingDestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceMappingDestinationConfig]
  }
  
  @scala.inline
  implicit class EventSourceMappingDestinationConfigOps[Self <: EventSourceMappingDestinationConfig] (val x: Self) extends AnyVal {
    
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
    def setOnFailure(value: EventSourceMappingDestinationConfigOnFailure): Self = this.set("onFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnFailure: Self = this.set("onFailure", js.undefined)
  }
}
