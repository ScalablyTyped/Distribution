package typings.primereact

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsHelpersMod {
  
  type Booleanish = Boolean
  
  trait FormEvent[T, E] extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var originalEvent: js.UndefOr[E] = js.undefined
    
    def preventDefault(): Unit
    
    def stopPropagation(): Unit
    
    var target: FormTarget[T]
    
    var value: Nullable[T]
  }
  object FormEvent {
    
    inline def apply[T, E](preventDefault: () => Unit, stopPropagation: () => Unit, target: FormTarget[T]): FormEvent[T, E] = {
      val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormEvent[T, E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormEvent[?, ?], T, E] (val x: Self & (FormEvent[T, E])) extends AnyVal {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setOriginalEvent(value: E): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setTarget(value: FormTarget[T]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Nullable[T]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FormTarget[T]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var name: String
    
    var value: Nullable[T]
  }
  object FormTarget {
    
    inline def apply[T](id: String, name: String): FormTarget[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormTarget[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormTarget[?], T] (val x: Self & FormTarget[T]) extends AnyVal {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Nullable[T]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Nullable[T] = js.UndefOr[T | Null]
  
  type Numberish = Double | String
}
