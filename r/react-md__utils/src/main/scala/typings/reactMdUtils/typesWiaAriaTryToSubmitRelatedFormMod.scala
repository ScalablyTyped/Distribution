package typings.reactMdUtils

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWiaAriaTryToSubmitRelatedFormMod {
  
  @JSImport("@react-md/utils/types/wia-aria/tryToSubmitRelatedForm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tryToSubmitRelatedForm(event: KeyboardSubmitEventPartial): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("tryToSubmitRelatedForm")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Inlined std.Pick<std.KeyboardEvent, 'key' | 'preventDefault' | 'stopPropagation' | 'currentTarget'> */
  trait KeyboardSubmitEventPartial extends StObject {
    
    var currentTarget: EventTarget | Null
    
    var key: String
    
    var preventDefault: js.Function0[Unit]
    
    var stopPropagation: js.Function0[Unit]
  }
  object KeyboardSubmitEventPartial {
    
    inline def apply(key: String, preventDefault: () => Unit, stopPropagation: () => Unit): KeyboardSubmitEventPartial = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), currentTarget = null)
      __obj.asInstanceOf[KeyboardSubmitEventPartial]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardSubmitEventPartial] (val x: Self) extends AnyVal {
      
      inline def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetNull: Self = StObject.set(x, "currentTarget", null)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    }
  }
}
