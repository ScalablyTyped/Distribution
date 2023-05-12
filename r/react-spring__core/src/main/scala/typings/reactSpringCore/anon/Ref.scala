package typings.reactSpringCore.anon

import typings.reactSpringCore.mod.SpringRef
import typings.reactSpringTypes.mod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref[State /* <: Lookup[Any] */] extends StObject {
  
  var ref: js.UndefOr[SpringRef[State]] = js.undefined
}
object Ref {
  
  inline def apply[State /* <: Lookup[Any] */](): Ref[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref[State]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ref[?], State /* <: Lookup[Any] */] (val x: Self & Ref[State]) extends AnyVal {
    
    inline def setRef(value: SpringRef[State]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
