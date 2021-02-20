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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreEdgeWidth extends StObject {
  
  var animation: js.UndefOr[none | slide] = js.native
  
  var animationOptions: js.UndefOr[typings.reactOnsenui.mod.AnimationOptions] = js.native
  
  var ignoreEdgeWidth: js.UndefOr[Double] = js.native
  
  var index: Double = js.native
  
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPreChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onReactive: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipe: js.UndefOr[
    js.Function2[
      /* index */ Double, 
      /* animationOptions */ typings.reactOnsenui.mod.AnimationOptions, 
      Unit
    ]
  ] = js.native
  
  var position: js.UndefOr[bottom | top | auto] = js.native
  
  def renderTabs(index: Double, tabbar: Tabbar): js.Array[TabbarRenderTab] = js.native
  
  var swipeable: js.UndefOr[Boolean] = js.native
  
  var tabBorder: js.UndefOr[Boolean] = js.native
}
object IgnoreEdgeWidth {
  
  @scala.inline
  def apply(index: Double, renderTabs: (Double, Tabbar) => js.Array[TabbarRenderTab]): IgnoreEdgeWidth = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], renderTabs = js.Any.fromFunction2(renderTabs))
    __obj.asInstanceOf[IgnoreEdgeWidth]
  }
  
  @scala.inline
  implicit class IgnoreEdgeWidthMutableBuilder[Self <: IgnoreEdgeWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: none | slide): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptions(value: typings.reactOnsenui.mod.AnimationOptions): Self = StObject.set(x, "animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOptionsUndefined: Self = StObject.set(x, "animationOptions", js.undefined)
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setIgnoreEdgeWidth(value: Double): Self = StObject.set(x, "ignoreEdgeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreEdgeWidthUndefined: Self = StObject.set(x, "ignoreEdgeWidth", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPostChange(value: () => Unit): Self = StObject.set(x, "onPostChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPostChangeUndefined: Self = StObject.set(x, "onPostChange", js.undefined)
    
    @scala.inline
    def setOnPreChange(value: () => Unit): Self = StObject.set(x, "onPreChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPreChangeUndefined: Self = StObject.set(x, "onPreChange", js.undefined)
    
    @scala.inline
    def setOnReactive(value: () => Unit): Self = StObject.set(x, "onReactive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnReactiveUndefined: Self = StObject.set(x, "onReactive", js.undefined)
    
    @scala.inline
    def setOnSwipe(
      value: (/* index */ Double, /* animationOptions */ typings.reactOnsenui.mod.AnimationOptions) => Unit
    ): Self = StObject.set(x, "onSwipe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSwipeUndefined: Self = StObject.set(x, "onSwipe", js.undefined)
    
    @scala.inline
    def setPosition(value: bottom | top | auto): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRenderTabs(value: (Double, Tabbar) => js.Array[TabbarRenderTab]): Self = StObject.set(x, "renderTabs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSwipeable(value: Boolean): Self = StObject.set(x, "swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeableUndefined: Self = StObject.set(x, "swipeable", js.undefined)
    
    @scala.inline
    def setTabBorder(value: Boolean): Self = StObject.set(x, "tabBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabBorderUndefined: Self = StObject.set(x, "tabBorder", js.undefined)
  }
}
