package typings.reactLazyload.mod

import typings.react.mod.ReactNode
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LazyLoadProps extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var classNamePrefix: js.UndefOr[String] = js.native
  
  var debounce: js.UndefOr[Double | Boolean] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var offset: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var once: js.UndefOr[Boolean] = js.native
  
  var overflow: js.UndefOr[Boolean] = js.native
  
  var placeholder: js.UndefOr[ReactNode] = js.native
  
  var preventLoading: js.UndefOr[Boolean] = js.native
  
  var resize: js.UndefOr[Boolean] = js.native
  
  var scroll: js.UndefOr[Boolean] = js.native
  
  var scrollContainer: js.UndefOr[String | Element] = js.native
  
  var throttle: js.UndefOr[Double | Boolean] = js.native
  
  var unmountIfInvisible: js.UndefOr[Boolean] = js.native
}
object LazyLoadProps {
  
  @scala.inline
  def apply(): LazyLoadProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LazyLoadProps]
  }
  
  @scala.inline
  implicit class LazyLoadPropsOps[Self <: LazyLoadProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassNamePrefix(value: String): Self = this.set("classNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNamePrefix: Self = this.set("classNamePrefix", js.undefined)
    
    @scala.inline
    def setDebounce(value: Double | Boolean): Self = this.set("debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebounce: Self = this.set("debounce", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Double | js.Array[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    
    @scala.inline
    def setOverflow(value: Boolean): Self = this.set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: ReactNode): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPreventLoading(value: Boolean): Self = this.set("preventLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventLoading: Self = this.set("preventLoading", js.undefined)
    
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setScrollContainer(value: String | Element): Self = this.set("scrollContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollContainer: Self = this.set("scrollContainer", js.undefined)
    
    @scala.inline
    def setThrottle(value: Double | Boolean): Self = this.set("throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
    
    @scala.inline
    def setUnmountIfInvisible(value: Boolean): Self = this.set("unmountIfInvisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmountIfInvisible: Self = this.set("unmountIfInvisible", js.undefined)
  }
}
