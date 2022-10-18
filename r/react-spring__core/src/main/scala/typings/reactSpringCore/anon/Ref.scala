package typings.reactSpringCore.anon

import typings.reactSpringCore.distDeclarationsSrcSpringRefMod.SpringRef
import typings.reactSpringTypes.utilMod.Lookup
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
  
  extension [Self <: Ref[?], State /* <: Lookup[Any] */](x: Self & Ref[State]) {
    
    inline def setRef(value: SpringRef[State]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
