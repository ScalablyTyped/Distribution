package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioNodeOptions extends StObject {
  
  var channelCount: js.UndefOr[Double] = js.native
  
  var channelCountMode: js.UndefOr[ChannelCountMode] = js.native
  
  var channelInterpretation: js.UndefOr[ChannelInterpretation] = js.native
}
object AudioNodeOptions {
  
  @scala.inline
  def apply(): AudioNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioNodeOptions]
  }
  
  @scala.inline
  implicit class AudioNodeOptionsMutableBuilder[Self <: AudioNodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelCount(value: Double): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCountMode(value: ChannelCountMode): Self = StObject.set(x, "channelCountMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCountModeUndefined: Self = StObject.set(x, "channelCountMode", js.undefined)
    
    @scala.inline
    def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
    
    @scala.inline
    def setChannelInterpretation(value: ChannelInterpretation): Self = StObject.set(x, "channelInterpretation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelInterpretationUndefined: Self = StObject.set(x, "channelInterpretation", js.undefined)
  }
}
