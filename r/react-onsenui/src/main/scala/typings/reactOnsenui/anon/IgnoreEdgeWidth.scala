package typings.reactOnsenui.anon

import typings.reactOnsenui.mod.Tabbar
import typings.reactOnsenui.mod.TabbarRenderTab
import typings.reactOnsenui.reactOnsenuiStrings.auto
import typings.reactOnsenui.reactOnsenuiStrings.bottom
import typings.reactOnsenui.reactOnsenuiStrings.none
import typings.reactOnsenui.reactOnsenuiStrings.slide
import typings.reactOnsenui.reactOnsenuiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreEdgeWidth extends StObject {
  
  var animation: js.UndefOr[none | slide] = js.undefined
  
  var animationOptions: js.UndefOr[typings.reactOnsenui.mod.AnimationOptions] = js.undefined
  
  var ignoreEdgeWidth: js.UndefOr[Double] = js.undefined
  
  var index: Double
  
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPreChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onReactive: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSwipe: js.UndefOr[
    js.Function2[
      /* index */ Double, 
      /* animationOptions */ typings.reactOnsenui.mod.AnimationOptions, 
      Unit
    ]
  ] = js.undefined
  
  var position: js.UndefOr[bottom | top | auto] = js.undefined
  
  def renderTabs(index: Double, tabbar: Tabbar): js.Array[TabbarRenderTab]
  
  var swipeable: js.UndefOr[Boolean] = js.undefined
  
  var tabBorder: js.UndefOr[Boolean] = js.undefined
}
object IgnoreEdgeWidth {
  
  inline def apply(index: Double, renderTabs: (Double, Tabbar) => js.Array[TabbarRenderTab]): IgnoreEdgeWidth = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], renderTabs = js.Any.fromFunction2(renderTabs))
    __obj.asInstanceOf[IgnoreEdgeWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgnoreEdgeWidth] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: none | slide): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptions(value: typings.reactOnsenui.mod.AnimationOptions): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    inline def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setIgnoreEdgeWidth(value: Double): Self = StObject.set(x, "ignoreEdgeWidth", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEdgeWidthUndefined: Self = StObject.set(x, "ignoreEdgeWidth", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOnPostChange(value: () => Unit): Self = StObject.set(x, "onPostChange", js.Any.fromFunction0(value))
    
    inline def setOnPostChangeUndefined: Self = StObject.set(x, "onPostChange", js.undefined)
    
    inline def setOnPreChange(value: () => Unit): Self = StObject.set(x, "onPreChange", js.Any.fromFunction0(value))
    
    inline def setOnPreChangeUndefined: Self = StObject.set(x, "onPreChange", js.undefined)
    
    inline def setOnReactive(value: () => Unit): Self = StObject.set(x, "onReactive", js.Any.fromFunction0(value))
    
    inline def setOnReactiveUndefined: Self = StObject.set(x, "onReactive", js.undefined)
    
    inline def setOnSwipe(
      value: (/* index */ Double, /* animationOptions */ typings.reactOnsenui.mod.AnimationOptions) => Unit
    ): Self = StObject.set(x, "onSwipe", js.Any.fromFunction2(value))
    
    inline def setOnSwipeUndefined: Self = StObject.set(x, "onSwipe", js.undefined)
    
    inline def setPosition(value: bottom | top | auto): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRenderTabs(value: (Double, Tabbar) => js.Array[TabbarRenderTab]): Self = StObject.set(x, "renderTabs", js.Any.fromFunction2(value))
    
    inline def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
    
    inline def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
    
    inline def setTabBorder(value: Boolean): Self = StObject.set(x, "tabBorder", value.asInstanceOf[js.Any])
    
    inline def setTabBorderUndefined: Self = StObject.set(x, "tabBorder", js.undefined)
  }
}
