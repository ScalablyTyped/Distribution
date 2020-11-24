package typings.reactNativeSwiper.mod

import typings.reactNativeSwiper.anon.X
import typings.reactNativeSwiper.reactNativeSwiperStrings.x
import typings.reactNativeSwiper.reactNativeSwiperStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwiperState extends js.Object {
  
  var autoplayEnd: Boolean = js.native
  
  var dir: x | y = js.native
  
  var height: Double = js.native
  
  var index: Double = js.native
  
  var isScrolling: Boolean = js.native
  
  var loopJump: Boolean = js.native
  
  var offset: X = js.native
  
  var total: Double = js.native
  
  var width: Double = js.native
}
object SwiperState {
  
  @scala.inline
  def apply(
    autoplayEnd: Boolean,
    dir: x | y,
    height: Double,
    index: Double,
    isScrolling: Boolean,
    loopJump: Boolean,
    offset: X,
    total: Double,
    width: Double
  ): SwiperState = {
    val __obj = js.Dynamic.literal(autoplayEnd = autoplayEnd.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], loopJump = loopJump.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwiperState]
  }
  
  @scala.inline
  implicit class SwiperStateOps[Self <: SwiperState] (val x: Self) extends AnyVal {
    
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
    def setAutoplayEnd(value: Boolean): Self = this.set("autoplayEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir(value: typings.reactNativeSwiper.reactNativeSwiperStrings.x | y): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrolling(value: Boolean): Self = this.set("isScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopJump(value: Boolean): Self = this.set("loopJump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: X): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
