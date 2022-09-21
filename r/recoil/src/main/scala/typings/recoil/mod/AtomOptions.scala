package typings.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.recoil.mod.AtomOptionsWithoutDefault[T]
  - typings.recoil.mod.AtomOptionsWithDefault[T]
*/
trait AtomOptions[T] extends StObject
object AtomOptions {
  
  inline def AtomOptionsWithDefault[T](default: RecoilValue[T] | js.Promise[T] | Loadable[T] | WrappedValue[T] | T, key: NodeKey): typings.recoil.mod.AtomOptionsWithDefault[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.recoil.mod.AtomOptionsWithDefault[T]]
  }
  
  inline def AtomOptionsWithoutDefault[T](key: NodeKey): typings.recoil.mod.AtomOptionsWithoutDefault[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.recoil.mod.AtomOptionsWithoutDefault[T]]
  }
}
