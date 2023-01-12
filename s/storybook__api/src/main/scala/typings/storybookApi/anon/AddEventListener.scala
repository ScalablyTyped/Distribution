package typings.storybookApi.anon

import typings.storybookApi.distTs3Dot9ModulesShortcutsMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddEventListener extends StObject {
  
  def addEventListener(): Unit
  
  def dispatchEvent(event: Event): Boolean
  
  def getAttribute(attr: String): String | Null
  
  def removeEventListener(): Boolean
  
  var tagName: String
}
object AddEventListener {
  
  inline def apply(
    addEventListener: () => Unit,
    dispatchEvent: Event => Boolean,
    getAttribute: String => String | Null,
    removeEventListener: () => Boolean,
    tagName: String
  ): AddEventListener = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction0(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), getAttribute = js.Any.fromFunction1(getAttribute), removeEventListener = js.Any.fromFunction0(removeEventListener), tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddEventListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddEventListener] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(value: () => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction0(value))
    
    inline def setDispatchEvent(value: Event => Boolean): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    inline def setGetAttribute(value: String => String | Null): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setRemoveEventListener(value: () => Boolean): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction0(value))
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
  }
}
