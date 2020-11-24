package typings.reactMdUtils.useResizeObserverV1Mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseResizeObserverV1Options[E /* <: HTMLElement */] extends js.Object {
  
  var disableHeight: js.UndefOr[Boolean] = js.native
  
  var disableWidth: js.UndefOr[Boolean] = js.native
  
  var onResize: ObservedResizeEventHandler = js.native
  
  var target: ResizeObserverTarget[E] = js.native
}
object UseResizeObserverV1Options {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](onResize: /* event */ ObservedResizeData => Unit): UseResizeObserverV1Options[E] = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    __obj.asInstanceOf[UseResizeObserverV1Options[E]]
  }
  
  @scala.inline
  implicit class UseResizeObserverV1OptionsOps[Self <: UseResizeObserverV1Options[_], E /* <: HTMLElement */] (val x: Self with UseResizeObserverV1Options[E]) extends AnyVal {
    
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
    def setOnResize(value: /* event */ ObservedResizeData => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisableHeight(value: Boolean): Self = this.set("disableHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableHeight: Self = this.set("disableHeight", js.undefined)
    
    @scala.inline
    def setDisableWidth(value: Boolean): Self = this.set("disableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableWidth: Self = this.set("disableWidth", js.undefined)
    
    @scala.inline
    def setTargetFunction0(value: () => E | Null): Self = this.set("target", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: ResizeObserverTarget[E]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
  }
}
