package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelayOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var delayTime: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var maxDelayTime: js.UndefOr[Double] = js.undefined
}
object DelayOptions {
  
  inline def apply(): DelayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelayOptions] (val x: Self) extends AnyVal {
    
    inline def setDelayTime(value: Double): Self = StObject.set(x, "delayTime", value.asInstanceOf[js.Any])
    
    inline def setDelayTimeUndefined: Self = StObject.set(x, "delayTime", js.undefined)
    
    inline def setMaxDelayTime(value: Double): Self = StObject.set(x, "maxDelayTime", value.asInstanceOf[js.Any])
    
    inline def setMaxDelayTimeUndefined: Self = StObject.set(x, "maxDelayTime", js.undefined)
  }
}
