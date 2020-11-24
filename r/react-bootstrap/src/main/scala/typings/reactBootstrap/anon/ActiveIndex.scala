package typings.reactBootstrap.anon

import typings.react.mod.ReactNode
import typings.reactBootstrap.mod.SelectCallback
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveIndex extends js.Object {
  
  var activeIndex: js.UndefOr[Double] = js.native
  
  var bsSize: js.UndefOr[Sizes] = js.native
  
  var bsStyle: js.UndefOr[String] = js.native
  
  var controls: js.UndefOr[Boolean] = js.native
  
  var defaultActiveIndex: js.UndefOr[Double] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var indicators: js.UndefOr[Boolean] = js.native
  
  var interval: js.UndefOr[Double | Null] = js.native
  
  var nextIcon: js.UndefOr[ReactNode] = js.native
  
  var onSelect: js.UndefOr[SelectCallback] = js.native
  
  // TODO: Add more specific type
  var onSlideEnd: js.UndefOr[js.Function] = js.native
  
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  
  var prevIcon: js.UndefOr[ReactNode] = js.native
  
  var slide: js.UndefOr[Boolean] = js.native
  
  var wrap: js.UndefOr[Boolean] = js.native
}
object ActiveIndex {
  
  @scala.inline
  def apply(): ActiveIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveIndex]
  }
  
  @scala.inline
  implicit class ActiveIndexOps[Self <: ActiveIndex] (val x: Self) extends AnyVal {
    
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
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    
    @scala.inline
    def setBsSize(value: Sizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    
    @scala.inline
    def setBsStyle(value: String): Self = this.set("bsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsStyle: Self = this.set("bsStyle", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setDefaultActiveIndex(value: Double): Self = this.set("defaultActiveIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveIndex: Self = this.set("defaultActiveIndex", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setIndicators(value: Boolean): Self = this.set("indicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicators: Self = this.set("indicators", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setIntervalNull: Self = this.set("interval", null)
    
    @scala.inline
    def setNextIcon(value: ReactNode): Self = this.set("nextIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextIcon: Self = this.set("nextIcon", js.undefined)
    
    @scala.inline
    def setOnSelect(value: SelectCallback): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setOnSlideEnd(value: js.Function): Self = this.set("onSlideEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSlideEnd: Self = this.set("onSlideEnd", js.undefined)
    
    @scala.inline
    def setPauseOnHover(value: Boolean): Self = this.set("pauseOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseOnHover: Self = this.set("pauseOnHover", js.undefined)
    
    @scala.inline
    def setPrevIcon(value: ReactNode): Self = this.set("prevIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevIcon: Self = this.set("prevIcon", js.undefined)
    
    @scala.inline
    def setSlide(value: Boolean): Self = this.set("slide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlide: Self = this.set("slide", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = this.set("wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrap: Self = this.set("wrap", js.undefined)
  }
}
