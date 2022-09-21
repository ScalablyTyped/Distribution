package typings.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.recoil.mod.AtomFamilyOptionsWithDefault[T, P]
  - typings.recoil.mod.AtomFamilyOptionsWithoutDefault[T, P]
*/
trait AtomFamilyOptions[T, P /* <: SerializableParam */] extends StObject
object AtomFamilyOptions {
  
  inline def AtomFamilyOptionsWithDefault[T, P /* <: SerializableParam */](
    default: RecoilValue[T] | js.Promise[T] | Loadable[T] | WrappedValue[T] | T | (js.Function1[P, T | RecoilValue[T] | js.Promise[T] | Loadable[T] | WrappedValue[T]]),
    key: NodeKey
  ): typings.recoil.mod.AtomFamilyOptionsWithDefault[T, P] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.recoil.mod.AtomFamilyOptionsWithDefault[T, P]]
  }
  
  inline def AtomFamilyOptionsWithoutDefault[T, P /* <: SerializableParam */](key: NodeKey): typings.recoil.mod.AtomFamilyOptionsWithoutDefault[T, P] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.recoil.mod.AtomFamilyOptionsWithoutDefault[T, P]]
  }
}
