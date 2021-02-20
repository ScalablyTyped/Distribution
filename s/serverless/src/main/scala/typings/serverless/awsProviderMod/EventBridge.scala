package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventBridge extends StObject {
  
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
  implicit class EventBridgeMutableBuilder[Self <: EventBridge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventBus(value: String): Self = StObject.set(x, "eventBus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBusUndefined: Self = StObject.set(x, "eventBus", js.undefined)
    
    @scala.inline
    def setInput(value: Input): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPath(value: String): Self = StObject.set(x, "inputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPathUndefined: Self = StObject.set(x, "inputPath", js.undefined)
    
    @scala.inline
    def setInputTransformer(value: InputTransformer): Self = StObject.set(x, "inputTransformer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputTransformerUndefined: Self = StObject.set(x, "inputTransformer", js.undefined)
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setPattern(value: PatternExisting | PatternInput): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
