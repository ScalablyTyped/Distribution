package typings.reactInstantsearchDom.mod

import typings.react.mod.ComponentType
import typings.reactInstantsearchDom.anon.Hit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HitsProps[T] extends js.Object {
  
  var hitComponent: js.UndefOr[ComponentType[Hit[T]]] = js.native
}
object HitsProps {
  
  @scala.inline
  def apply[T](): HitsProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HitsProps[T]]
  }
  
  @scala.inline
  implicit class HitsPropsOps[Self <: HitsProps[_], T] (val x: Self with HitsProps[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHitComponent(value: ComponentType[Hit[T]]): Self = this.set("hitComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitComponent: Self = this.set("hitComponent", js.undefined)
  }
}
