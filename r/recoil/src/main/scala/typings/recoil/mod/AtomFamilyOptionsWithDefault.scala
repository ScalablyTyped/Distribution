package typings.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.recoil.mod.AtomFamilyOptions because Already inherited */ trait AtomFamilyOptionsWithDefault[T, P /* <: SerializableParam */]
  extends StObject
     with AtomFamilyOptionsWithoutDefault[T, P] {
  
  var default: RecoilValue[T] | js.Promise[T] | Loadable[T] | WrappedValue[T] | T | (js.Function1[/* param */ P, T | RecoilValue[T] | js.Promise[T] | Loadable[T] | WrappedValue[T]])
}
object AtomFamilyOptionsWithDefault {
  
  inline def apply[T, P /* <: SerializableParam */](
    default: RecoilValue[T] | js.Promise[T] | Loadable[T] | WrappedValue[T] | T | (js.Function1[/* param */ P, T | RecoilValue[T] | js.Promise[T] | Loadable[T] | WrappedValue[T]]),
    key: NodeKey
  ): AtomFamilyOptionsWithDefault[T, P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomFamilyOptionsWithDefault[T, P]]
  }
  
  extension [Self <: AtomFamilyOptionsWithDefault[?, ?], T, P /* <: SerializableParam */](x: Self & (AtomFamilyOptionsWithDefault[T, P])) {
    
    inline def setDefault(
      value: RecoilValue[T] | js.Promise[T] | Loadable[T] | WrappedValue[T] | T | (js.Function1[/* param */ P, T | RecoilValue[T] | js.Promise[T] | Loadable[T] | WrappedValue[T]])
    ): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultFunction1(value: /* param */ P => T | RecoilValue[T] | js.Promise[T] | Loadable[T] | WrappedValue[T]): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
  }
}
