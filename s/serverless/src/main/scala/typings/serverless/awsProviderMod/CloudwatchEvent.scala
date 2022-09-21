package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudwatchEvent extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var event: CloudwatchEventInternalEvent | String
  
  var input: js.UndefOr[Input] = js.undefined
  
  var inputPath: js.UndefOr[String] = js.undefined
  
  var inputTransformer: js.UndefOr[InputTransformer] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object CloudwatchEvent {
  
  inline def apply(event: CloudwatchEventInternalEvent | String): CloudwatchEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchEvent]
  }
  
  extension [Self <: CloudwatchEvent](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEvent(value: CloudwatchEventInternalEvent | String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Input): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputPath(value: String): Self = StObject.set(x, "inputPath", value.asInstanceOf[js.Any])
    
    inline def setInputPathUndefined: Self = StObject.set(x, "inputPath", js.undefined)
    
    inline def setInputTransformer(value: InputTransformer): Self = StObject.set(x, "inputTransformer", value.asInstanceOf[js.Any])
    
    inline def setInputTransformerUndefined: Self = StObject.set(x, "inputTransformer", js.undefined)
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
