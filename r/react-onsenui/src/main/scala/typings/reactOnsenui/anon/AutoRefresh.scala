package typings.reactOnsenui.anon

import typings.reactOnsenui.reactOnsenuiStrings.horizontal
import typings.reactOnsenui.reactOnsenuiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoRefresh extends StObject {
  
  var animationOptions: js.UndefOr[typings.reactOnsenui.mod.AnimationOptions] = js.native
  
  var autoRefresh: js.UndefOr[Boolean] = js.native
  
  var autoScroll: js.UndefOr[Boolean] = js.native
  
  var autoScrollRatio: js.UndefOr[Double] = js.native
  
  var centered: js.UndefOr[Boolean] = js.native
  
  var direction: js.UndefOr[horizontal | vertical] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var fullscreen: js.UndefOr[Boolean] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var itemHeight: js.UndefOr[Double | String] = js.native
  
  var itemWidth: js.UndefOr[Double | String] = js.native
  
  var onOverscroll: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.native
  
  var overscrollable: js.UndefOr[Boolean] = js.native
  
  var swipeable: js.UndefOr[Boolean] = js.native
}
object AutoRefresh {
  
  @scala.inline
  def apply(): AutoRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoRefresh]
  }
  
  @scala.inline
  implicit class AutoRefreshMutableBuilder[Self <: AutoRefresh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationOptions(value: typings.reactOnsenui.mod.AnimationOptions): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    @scala.inline
    def setAutoRefresh(value: Boolean): Self = StObject.set(x, "autoRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRefreshUndefined: Self = StObject.set(x, "autoRefresh", js.undefined)
    
    @scala.inline
    def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScrollRatio(value: Double): Self = StObject.set(x, "autoScrollRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScrollRatioUndefined: Self = StObject.set(x, "autoScrollRatio", js.undefined)
    
    @scala.inline
    def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    @scala.inline
    def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
    
    @scala.inline
    def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setItemHeight(value: Double | String): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
    
    @scala.inline
    def setItemWidth(value: Double | String): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
    
    @scala.inline
    def setOnOverscroll(value: () => Unit): Self = StObject.set(x, "onOverscroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnOverscrollUndefined: Self = StObject.set(x, "onOverscroll", js.undefined)
    
    @scala.inline
    def setOnPostChange(value: () => Unit): Self = StObject.set(x, "onPostChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPostChangeUndefined: Self = StObject.set(x, "onPostChange", js.undefined)
    
    @scala.inline
    def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    @scala.inline
    def setOverscrollable(value: Boolean): Self = StObject.set(x, "overscrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverscrollableUndefined: Self = StObject.set(x, "overscrollable", js.undefined)
    
    @scala.inline
    def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
  }
}
