package typings.reactcss.mod

import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoverProps[T] extends Props[T] {
  
  var hover: js.UndefOr[Boolean] = js.native
}
object HoverProps {
  
  @scala.inline
  def apply[T](): HoverProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverProps[T]]
  }
  
  @scala.inline
  implicit class HoverPropsOps[Self <: HoverProps[_], T] (val x: Self with HoverProps[T]) extends AnyVal {
    
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
    def setHover(value: Boolean): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
  }
}
