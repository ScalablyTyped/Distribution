package typings.resizeObserverBrowser

import typings.std.DOMRectReadOnly
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeObserverEntry extends js.Object {
  
  val borderBoxSize: js.UndefOr[js.Array[ResizeObserverSize]] = js.native
  
  val contentBoxSize: js.UndefOr[js.Array[ResizeObserverSize]] = js.native
  
  val contentRect: DOMRectReadOnly = js.native
  
  val devicePixelContentBoxSize: js.UndefOr[js.Array[ResizeObserverSize]] = js.native
  
  val target: Element = js.native
}
object ResizeObserverEntry {
  
  @scala.inline
  def apply(contentRect: DOMRectReadOnly, target: Element): ResizeObserverEntry = {
    val __obj = js.Dynamic.literal(contentRect = contentRect.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverEntry]
  }
  
  @scala.inline
  implicit class ResizeObserverEntryOps[Self <: ResizeObserverEntry] (val x: Self) extends AnyVal {
    
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
    def setContentRect(value: DOMRectReadOnly): Self = this.set("contentRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Element): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBoxSizeVarargs(value: ResizeObserverSize*): Self = this.set("borderBoxSize", js.Array(value :_*))
    
    @scala.inline
    def setBorderBoxSize(value: js.Array[ResizeObserverSize]): Self = this.set("borderBoxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderBoxSize: Self = this.set("borderBoxSize", js.undefined)
    
    @scala.inline
    def setContentBoxSizeVarargs(value: ResizeObserverSize*): Self = this.set("contentBoxSize", js.Array(value :_*))
    
    @scala.inline
    def setContentBoxSize(value: js.Array[ResizeObserverSize]): Self = this.set("contentBoxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentBoxSize: Self = this.set("contentBoxSize", js.undefined)
    
    @scala.inline
    def setDevicePixelContentBoxSizeVarargs(value: ResizeObserverSize*): Self = this.set("devicePixelContentBoxSize", js.Array(value :_*))
    
    @scala.inline
    def setDevicePixelContentBoxSize(value: js.Array[ResizeObserverSize]): Self = this.set("devicePixelContentBoxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevicePixelContentBoxSize: Self = this.set("devicePixelContentBoxSize", js.undefined)
  }
}
