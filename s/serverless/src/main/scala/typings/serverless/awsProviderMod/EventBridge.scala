package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventBridge extends js.Object {
  
  var eventBus: js.UndefOr[String] = js.native
  
  var input: js.UndefOr[Input] = js.native
  
  var inputPath: js.UndefOr[String] = js.native
  
  var inputTransformer: js.UndefOr[InputTransformer] = js.native
  
  var pattern: js.UndefOr[PatternExisting | PatternInput] = js.native
  
  var schedule: js.UndefOr[String] = js.native
}
object EventBridge {
  
  @scala.inline
  def apply(): EventBridge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventBridge]
  }
  
  @scala.inline
  implicit class EventBridgeOps[Self <: EventBridge] (val x: Self) extends AnyVal {
    
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
    def setEventBus(value: String): Self = this.set("eventBus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventBus: Self = this.set("eventBus", js.undefined)
    
    @scala.inline
    def setInput(value: Input): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setInputPath(value: String): Self = this.set("inputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputPath: Self = this.set("inputPath", js.undefined)
    
    @scala.inline
    def setInputTransformer(value: InputTransformer): Self = this.set("inputTransformer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputTransformer: Self = this.set("inputTransformer", js.undefined)
    
    @scala.inline
    def setPattern(value: PatternExisting | PatternInput): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setSchedule(value: String): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
  }
}
