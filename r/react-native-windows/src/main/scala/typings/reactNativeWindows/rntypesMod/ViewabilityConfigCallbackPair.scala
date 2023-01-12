package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.anon.Changed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewabilityConfigCallbackPair extends StObject {
  
  var onViewableItemsChanged: (js.Function1[/* info */ Changed, Unit]) | Null
  
  var viewabilityConfig: ViewabilityConfig
}
object ViewabilityConfigCallbackPair {
  
  inline def apply(viewabilityConfig: ViewabilityConfig): ViewabilityConfigCallbackPair = {
    val __obj = js.Dynamic.literal(viewabilityConfig = viewabilityConfig.asInstanceOf[js.Any], onViewableItemsChanged = null)
    __obj.asInstanceOf[ViewabilityConfigCallbackPair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewabilityConfigCallbackPair] (val x: Self) extends AnyVal {
    
    inline def setOnViewableItemsChanged(value: /* info */ Changed => Unit): Self = StObject.set(x, "onViewableItemsChanged", js.Any.fromFunction1(value))
    
    inline def setOnViewableItemsChangedNull: Self = StObject.set(x, "onViewableItemsChanged", null)
    
    inline def setViewabilityConfig(value: ViewabilityConfig): Self = StObject.set(x, "viewabilityConfig", value.asInstanceOf[js.Any])
  }
}
