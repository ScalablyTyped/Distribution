package typings.reactSwipeableViewsUtils.mod

import typings.react.mod.ReactNode
import typings.reactSwipeableViews.mod.OnChangeIndexCallback
import typings.reactSwipeableViews.mod.OnTransitionEndCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithVirtualizeProps extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var index: Double = js.native
  
  var onChangeIndex: OnChangeIndexCallback = js.native
  
  var onTransitionEnd: js.UndefOr[OnTransitionEndCallback] = js.native
  
  var overscanSlideAfter: js.UndefOr[Double] = js.native
  
  var overscanSlideBefore: js.UndefOr[Double] = js.native
  
  var slideCount: js.UndefOr[Double] = js.native
  
  var slideRenderer: SlideRendererCallback = js.native
}
object WithVirtualizeProps {
  
  @scala.inline
  def apply(
    index: Double,
    onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit,
    slideRenderer: /* render */ SlideRenderProps => ReactNode
  ): WithVirtualizeProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex), slideRenderer = js.Any.fromFunction1(slideRenderer))
    __obj.asInstanceOf[WithVirtualizeProps]
  }
  
  @scala.inline
  implicit class WithVirtualizePropsOps[Self <: WithVirtualizeProps] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = this.set("onChangeIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSlideRenderer(value: /* render */ SlideRenderProps => ReactNode): Self = this.set("slideRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setOnTransitionEnd(value: () => Unit): Self = this.set("onTransitionEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTransitionEnd: Self = this.set("onTransitionEnd", js.undefined)
    
    @scala.inline
    def setOverscanSlideAfter(value: Double): Self = this.set("overscanSlideAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscanSlideAfter: Self = this.set("overscanSlideAfter", js.undefined)
    
    @scala.inline
    def setOverscanSlideBefore(value: Double): Self = this.set("overscanSlideBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverscanSlideBefore: Self = this.set("overscanSlideBefore", js.undefined)
    
    @scala.inline
    def setSlideCount(value: Double): Self = this.set("slideCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideCount: Self = this.set("slideCount", js.undefined)
  }
}
