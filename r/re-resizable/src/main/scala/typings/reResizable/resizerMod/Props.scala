package typings.reResizable.resizerMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.TouchEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var children: ReactNode = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var direction: Direction = js.native
  
  var onResizeStart: OnStartCallback = js.native
  
  var replaceStyles: js.UndefOr[CSSProperties] = js.native
}
object Props {
  
  @scala.inline
  def apply(
    direction: Direction,
    onResizeStart: (/* e */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | TouchEvent[HTMLDivElement], /* dir */ Direction) => Unit
  ): Props = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], onResizeStart = js.Any.fromFunction2(onResizeStart))
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResizeStart(
      value: (/* e */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | TouchEvent[HTMLDivElement], /* dir */ Direction) => Unit
    ): Self = this.set("onResizeStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setReplaceStyles(value: CSSProperties): Self = this.set("replaceStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceStyles: Self = this.set("replaceStyles", js.undefined)
  }
}
