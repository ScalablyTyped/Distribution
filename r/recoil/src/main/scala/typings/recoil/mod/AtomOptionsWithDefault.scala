package typings.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.recoil.mod.AtomOptions because Already inherited */ trait AtomOptionsWithDefault[T]
  extends StObject
     with AtomOptionsWithoutDefault[T] {
  
  var default: RecoilValue[T] | js.Promise[T] | Loadable[T] | WrappedValue[T] | T
}
object AtomOptionsWithDefault {
  
  inline def apply[T](default: RecoilValue[T] | js.Promise[T] | Loadable[T] | WrappedValue[T] | T, key: NodeKey): AtomOptionsWithDefault[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtomOptionsWithDefault[T]]
  }
  
  extension [Self <: AtomOptionsWithDefault[?], T](x: Self & AtomOptionsWithDefault[T]) {
    
    inline def setDefault(value: RecoilValue[T] | js.Promise[T] | Loadable[T] | WrappedValue[T] | T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
