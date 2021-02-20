package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudwatchEvent extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var event: String = js.native
  
  var input: js.UndefOr[Input] = js.native
  
  var inputPath: js.UndefOr[String] = js.native
  
  var inputTransformer: js.UndefOr[InputTransformer] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object CloudwatchEvent {
  
  @scala.inline
  def apply(event: String): CloudwatchEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchEvent]
  }
  
  @scala.inline
  implicit class CloudwatchEventMutableBuilder[Self <: CloudwatchEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
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
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
