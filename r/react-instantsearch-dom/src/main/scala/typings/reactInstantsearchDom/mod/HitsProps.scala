package typings.reactInstantsearchDom.mod

import typings.react.mod.ComponentType
import typings.reactInstantsearchDom.anon.Hit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HitsProps[T] extends StObject {
  
  var hitComponent: js.UndefOr[ComponentType[Hit[T]]] = js.undefined
}
object HitsProps {
  
  inline def apply[T](): HitsProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HitsProps[T]]
  }
  
  extension [Self <: HitsProps[?], T](x: Self & HitsProps[T]) {
    
    inline def setHitComponent(value: ComponentType[Hit[T]]): Self = StObject.set(x, "hitComponent", value.asInstanceOf[js.Any])
    
    inline def setHitComponentUndefined: Self = StObject.set(x, "hitComponent", js.undefined)
  }
}
