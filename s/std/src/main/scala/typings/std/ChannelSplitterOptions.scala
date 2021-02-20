package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelSplitterOptions extends AudioNodeOptions {
  
  var numberOfOutputs: js.UndefOr[Double] = js.native
}
object ChannelSplitterOptions {
  
  @scala.inline
  def apply(): ChannelSplitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSplitterOptions]
  }
  
  @scala.inline
  implicit class ChannelSplitterOptionsMutableBuilder[Self <: ChannelSplitterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberOfOutputs(value: Double): Self = StObject.set(x, "numberOfOutputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfOutputsUndefined: Self = StObject.set(x, "numberOfOutputs", js.undefined)
  }
}
