package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefAttributes[T]
  extends StObject
     with Attributes {
  
  /**
    * Allows getting a ref to the component instance.
    * Once the component unmounts, React will set `ref.current` to `null` (or call the ref with `null` if you passed a callback ref).
    * @see https://react.dev/learn/referencing-values-with-refs#refs-and-the-dom
    */
  var ref: js.UndefOr[Ref[T]] = js.undefined
}
object RefAttributes {
  
  inline def apply[T](): RefAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefAttributes[?], T] (val x: Self & RefAttributes[T]) extends AnyVal {
    
    inline def setRef(value: Ref[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ T | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
