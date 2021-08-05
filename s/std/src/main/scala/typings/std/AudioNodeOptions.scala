package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioNodeOptions extends StObject {
  
  var channelCount: js.UndefOr[Double] = js.undefined
  
  var channelCountMode: js.UndefOr[ChannelCountMode] = js.undefined
  
  var channelInterpretation: js.UndefOr[ChannelInterpretation] = js.undefined
}
object AudioNodeOptions {
  
  inline def apply(): AudioNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioNodeOptions]
  }
  
  extension [Self <: AudioNodeOptions](x: Self) {
    
    inline def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    inline def setChannelCountMode(value: ChannelCountMode): Self = StObject.set(x, "channelCountMode", value.asInstanceOf[js.Any])
    
    inline def setChannelCountModeUndefined: Self = StObject.set(x, "channelCountMode", js.undefined)
    
    inline def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
    
    inline def setChannelInterpretation(value: ChannelInterpretation): Self = StObject.set(x, "channelInterpretation", value.asInstanceOf[js.Any])
    
    inline def setChannelInterpretationUndefined: Self = StObject.set(x, "channelInterpretation", js.undefined)
  }
}
