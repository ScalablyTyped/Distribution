package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBridge extends StObject {
  
  var eventBus: js.UndefOr[String] = js.undefined
  
  var input: js.UndefOr[Input] = js.undefined
  
  var inputPath: js.UndefOr[String] = js.undefined
  
  var inputTransformer: js.UndefOr[InputTransformer] = js.undefined
  
  var pattern: js.UndefOr[PatternExisting | PatternInput] = js.undefined
  
  var schedule: js.UndefOr[String] = js.undefined
}
object EventBridge {
  
  inline def apply(): EventBridge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventBridge]
  }
  
  extension [Self <: EventBridge](x: Self) {
    
    inline def setEventBus(value: String): Self = StObject.set(x, "eventBus", value.asInstanceOf[js.Any])
    
    inline def setEventBusUndefined: Self = StObject.set(x, "eventBus", js.undefined)
    
    inline def setInput(value: Input): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputPath(value: String): Self = StObject.set(x, "inputPath", value.asInstanceOf[js.Any])
    
    inline def setInputPathUndefined: Self = StObject.set(x, "inputPath", js.undefined)
    
    inline def setInputTransformer(value: InputTransformer): Self = StObject.set(x, "inputTransformer", value.asInstanceOf[js.Any])
    
    inline def setInputTransformerUndefined: Self = StObject.set(x, "inputTransformer", js.undefined)
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setPattern(value: PatternExisting | PatternInput): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
