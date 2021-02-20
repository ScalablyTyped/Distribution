package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationOptions extends StObject {
  
  /** List of delays between animation frames (in milliseconds), each value between 0 and 65535. (optional) */
  var delay: js.UndefOr[js.Array[Double]] = js.native
  
  /** Number of animation iterations, a value between 0 and 65535. Use 0 for infinite animation. (optional, default 0) */
  var loop: js.UndefOr[Double] = js.native
  
  /** Page height for animated output, a value greater than 0. (optional) */
  var pageHeight: js.UndefOr[Double] = js.native
}
object AnimationOptions {
  
  @scala.inline
  def apply(): AnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationOptions]
  }
  
  @scala.inline
  implicit class AnimationOptionsMutableBuilder[Self <: AnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: js.Array[Double]): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDelayVarargs(value: Double*): Self = StObject.set(x, "delay", js.Array(value :_*))
    
    @scala.inline
    def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setPageHeight(value: Double): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageHeightUndefined: Self = StObject.set(x, "pageHeight", js.undefined)
  }
}
