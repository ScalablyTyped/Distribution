package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioNodeOptions extends StObject {
  
  /* standard dom */
  var channelCount: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var channelCountMode: js.UndefOr[ChannelCountMode] = js.undefined
  
  /* standard dom */
  var channelInterpretation: js.UndefOr[ChannelInterpretation] = js.undefined
}
object AudioNodeOptions {
  
  inline def apply(): AudioNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioNodeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioNodeOptions] (val x: Self) extends AnyVal {
    
    inline def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    inline def setChannelCountMode(value: ChannelCountMode): Self = StObject.set(x, "channelCountMode", value.asInstanceOf[js.Any])
    
    inline def setChannelCountModeUndefined: Self = StObject.set(x, "channelCountMode", js.undefined)
    
    inline def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
    
    inline def setChannelInterpretation(value: ChannelInterpretation): Self = StObject.set(x, "channelInterpretation", value.asInstanceOf[js.Any])
    
    inline def setChannelInterpretationUndefined: Self = StObject.set(x, "channelInterpretation", js.undefined)
  }
}
