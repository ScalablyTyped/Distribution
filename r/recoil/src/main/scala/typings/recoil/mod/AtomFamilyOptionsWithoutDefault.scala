package typings.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AtomFamilyOptionsWithoutDefault[T, P /* <: SerializableParam */]
  extends StObject
     with AtomFamilyOptions[T, P] {
  
  var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
  
  var effects: js.UndefOr[js.Array[AtomEffect[T]] | (js.Function1[/* param */ P, js.Array[AtomEffect[T]]])] = js.undefined
  
  var effects_UNSTABLE: js.UndefOr[js.Array[AtomEffect[T]] | (js.Function1[/* param */ P, js.Array[AtomEffect[T]]])] = js.undefined
  
  var key: NodeKey
}
object AtomFamilyOptionsWithoutDefault {
  
  inline def apply[T, P /* <: SerializableParam */](key: NodeKey): AtomFamilyOptionsWithoutDefault[T, P] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomFamilyOptionsWithoutDefault[T, P]]
  }
  
  extension [Self <: AtomFamilyOptionsWithoutDefault[?, ?], T, P /* <: SerializableParam */](x: Self & (AtomFamilyOptionsWithoutDefault[T, P])) {
    
    inline def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
    
    inline def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
    
    inline def setEffects(value: js.Array[AtomEffect[T]] | (js.Function1[/* param */ P, js.Array[AtomEffect[T]]])): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsFunction1(value: /* param */ P => js.Array[AtomEffect[T]]): Self = StObject.set(x, "effects", js.Any.fromFunction1(value))
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: AtomEffect[T]*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setEffects_UNSTABLE(value: js.Array[AtomEffect[T]] | (js.Function1[/* param */ P, js.Array[AtomEffect[T]]])): Self = StObject.set(x, "effects_UNSTABLE", value.asInstanceOf[js.Any])
    
    inline def setEffects_UNSTABLEFunction1(value: /* param */ P => js.Array[AtomEffect[T]]): Self = StObject.set(x, "effects_UNSTABLE", js.Any.fromFunction1(value))
    
    inline def setEffects_UNSTABLEUndefined: Self = StObject.set(x, "effects_UNSTABLE", js.undefined)
    
    inline def setEffects_UNSTABLEVarargs(value: AtomEffect[T]*): Self = StObject.set(x, "effects_UNSTABLE", js.Array(value*))
    
    inline def setKey(value: NodeKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
