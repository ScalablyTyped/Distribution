package typings.reactNative.mod

import typings.reactNative.anon.Changed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewabilityConfigCallbackPair extends StObject {
  
  var onViewableItemsChanged: (js.Function1[/* info */ Changed, Unit]) | Null = js.native
  
  var viewabilityConfig: ViewabilityConfig = js.native
}
object ViewabilityConfigCallbackPair {
  
  @scala.inline
  def apply(viewabilityConfig: ViewabilityConfig): ViewabilityConfigCallbackPair = {
    val __obj = js.Dynamic.literal(viewabilityConfig = viewabilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewabilityConfigCallbackPair]
  }
  
  @scala.inline
  implicit class ViewabilityConfigCallbackPairMutableBuilder[Self <: ViewabilityConfigCallbackPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnViewableItemsChanged(value: /* info */ Changed => Unit): Self = StObject.set(x, "onViewableItemsChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewableItemsChangedNull: Self = StObject.set(x, "onViewableItemsChanged", null)
    
    @scala.inline
    def setViewabilityConfig(value: ViewabilityConfig): Self = StObject.set(x, "viewabilityConfig", value.asInstanceOf[js.Any])
  }
}
