package typings.sentryReplay.typesTypesReplayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlowClickConfig extends StObject {
  
  var ignoreSelector: String
  
  var multiClickTimeout: Double
  
  var scrollTimeout: Double
  
  var threshold: Double
  
  var timeout: Double
}
object SlowClickConfig {
  
  inline def apply(
    ignoreSelector: String,
    multiClickTimeout: Double,
    scrollTimeout: Double,
    threshold: Double,
    timeout: Double
  ): SlowClickConfig = {
    val __obj = js.Dynamic.literal(ignoreSelector = ignoreSelector.asInstanceOf[js.Any], multiClickTimeout = multiClickTimeout.asInstanceOf[js.Any], scrollTimeout = scrollTimeout.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlowClickConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlowClickConfig] (val x: Self) extends AnyVal {
    
    inline def setIgnoreSelector(value: String): Self = StObject.set(x, "ignoreSelector", value.asInstanceOf[js.Any])
    
    inline def setMultiClickTimeout(value: Double): Self = StObject.set(x, "multiClickTimeout", value.asInstanceOf[js.Any])
    
    inline def setScrollTimeout(value: Double): Self = StObject.set(x, "scrollTimeout", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
