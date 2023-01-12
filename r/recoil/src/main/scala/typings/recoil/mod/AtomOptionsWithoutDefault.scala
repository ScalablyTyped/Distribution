package typings.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// atom.d.ts
trait AtomOptionsWithoutDefault[T]
  extends StObject
     with AtomOptions[T] {
  
  var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  
  var effects: js.UndefOr[js.Array[AtomEffect[T]]] = js.undefined
  
  var effects_UNSTABLE: js.UndefOr[js.Array[AtomEffect[T]]] = js.undefined
  
  var key: NodeKey
}
object AtomOptionsWithoutDefault {
  
  inline def apply[T](key: NodeKey): AtomOptionsWithoutDefault[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomOptionsWithoutDefault[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AtomOptionsWithoutDefault[?], T] (val x: Self & AtomOptionsWithoutDefault[T]) extends AnyVal {
    
    inline def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
    
    inline def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
    
    inline def setEffects(value: js.Array[AtomEffect[T]]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: AtomEffect[T]*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setEffects_UNSTABLE(value: js.Array[AtomEffect[T]]): Self = StObject.set(x, "effects_UNSTABLE", value.asInstanceOf[js.Any])
    
    inline def setEffects_UNSTABLEUndefined: Self = StObject.set(x, "effects_UNSTABLE", js.undefined)
    
    inline def setEffects_UNSTABLEVarargs(value: AtomEffect[T]*): Self = StObject.set(x, "effects_UNSTABLE", js.Array(value*))
    
    inline def setKey(value: NodeKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
