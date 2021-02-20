package typings.reactInstantsearchDom.mod

import typings.react.mod.ComponentType
import typings.reactInstantsearchDom.anon.Hit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HitsProps[T] extends StObject {
  
  var hitComponent: js.UndefOr[ComponentType[Hit[T]]] = js.native
}
object HitsProps {
  
  @scala.inline
  def apply[T](): HitsProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HitsProps[T]]
  }
  
  @scala.inline
  implicit class HitsPropsMutableBuilder[Self <: HitsProps[_], T] (val x: Self with HitsProps[T]) extends AnyVal {
    
    @scala.inline
    def setHitComponent(value: ComponentType[Hit[T]]): Self = StObject.set(x, "hitComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitComponentUndefined: Self = StObject.set(x, "hitComponent", js.undefined)
  }
}
