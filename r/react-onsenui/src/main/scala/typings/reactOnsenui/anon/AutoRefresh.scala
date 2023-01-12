package typings.reactOnsenui.anon

import typings.reactOnsenui.reactOnsenuiStrings.horizontal
import typings.reactOnsenui.reactOnsenuiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoRefresh extends StObject {
  
  var animationOptions: js.UndefOr[typings.reactOnsenui.mod.AnimationOptions] = js.undefined
  
  var autoRefresh: js.UndefOr[Boolean] = js.undefined
  
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  
  var autoScrollRatio: js.UndefOr[Double] = js.undefined
  
  var centered: js.UndefOr[Boolean] = js.undefined
  
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var itemHeight: js.UndefOr[Double | String] = js.undefined
  
  var itemWidth: js.UndefOr[Double | String] = js.undefined
  
  var onOverscroll: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onRefresh: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var overscrollable: js.UndefOr[Boolean] = js.undefined
  
  var swipeable: js.UndefOr[Boolean] = js.undefined
}
object AutoRefresh {
  
  inline def apply(): AutoRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoRefresh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoRefresh] (val x: Self) extends AnyVal {
    
    inline def setAnimationOptions(value: typings.reactOnsenui.mod.AnimationOptions): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    inline def setAutoRefresh(value: Boolean): Self = StObject.set(x, "autoRefresh", value.asInstanceOf[js.Any])
    
    inline def setAutoRefreshUndefined: Self = StObject.set(x, "autoRefresh", js.undefined)
    
    inline def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollRatio(value: Double): Self = StObject.set(x, "autoScrollRatio", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollRatioUndefined: Self = StObject.set(x, "autoScrollRatio", js.undefined)
    
    inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
    
    inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
    
    inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setItemHeight(value: Double | String): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
    
    inline def setItemWidth(value: Double | String): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
    
    inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
    
    inline def setOnOverscroll(value: () => Unit): Self = StObject.set(x, "onOverscroll", js.Any.fromFunction0(value))
    
    inline def setOnOverscrollUndefined: Self = StObject.set(x, "onOverscroll", js.undefined)
    
    inline def setOnPostChange(value: () => Unit): Self = StObject.set(x, "onPostChange", js.Any.fromFunction0(value))
    
    inline def setOnPostChangeUndefined: Self = StObject.set(x, "onPostChange", js.undefined)
    
    inline def setOnRefresh(value: () => Unit): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
    
    inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    inline def setOverscrollable(value: Boolean): Self = StObject.set(x, "overscrollable", value.asInstanceOf[js.Any])
    
    inline def setOverscrollableUndefined: Self = StObject.set(x, "overscrollable", js.undefined)
    
    inline def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
    
    inline def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
  }
}
