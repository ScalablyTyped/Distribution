package typings.reactOnsenui.anon

import typings.react.mod.CSSProperties
import typings.reactOnsenui.mod.AnimationOptions
import typings.reactOnsenui.mod.Tabbar
import typings.reactOnsenui.mod.TabbarRenderTab
import typings.reactOnsenui.reactOnsenuiStrings.auto
import typings.reactOnsenui.reactOnsenuiStrings.bottom
import typings.reactOnsenui.reactOnsenuiStrings.none
import typings.reactOnsenui.reactOnsenuiStrings.slide
import typings.reactOnsenui.reactOnsenuiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  index :number, renderTabs (index : number, tabbar : react-onsenui.react-onsenui.Tabbar): std.Array<react-onsenui.react-onsenui.TabbarRenderTab>,   position :'bottom' | 'top' | 'auto' | undefined,   swipeable :boolean | undefined,   ignoreEdgeWidth :number | undefined,   animation :'none' | 'slide' | undefined,   animationOptions :react-onsenui.react-onsenui.AnimationOptions | undefined,   tabBorder :boolean | undefined,   onPreChange :(): void | undefined,   onPostChange :(): void | undefined,   onReactive :(): void | undefined,   onSwipe :(index : number, animationOptions : react-onsenui.react-onsenui.AnimationOptions): void | undefined} */
@js.native
trait HTMLAttributesidclassNameIgnoreEdgeWidth extends js.Object {
  
  var animation: js.UndefOr[none | slide] = js.native
  
  var animationOptions: js.UndefOr[AnimationOptions] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var ignoreEdgeWidth: js.UndefOr[Double] = js.native
  
  var index: Double = js.native
  
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPreChange: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onReactive: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSwipe: js.UndefOr[js.Function2[/* index */ Double, /* animationOptions */ AnimationOptions, Unit]] = js.native
  
  var position: js.UndefOr[bottom | top | auto] = js.native
  
  def renderTabs(index: Double, tabbar: Tabbar): js.Array[TabbarRenderTab] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var swipeable: js.UndefOr[Boolean] = js.native
  
  var tabBorder: js.UndefOr[Boolean] = js.native
}
object HTMLAttributesidclassNameIgnoreEdgeWidth {
  
  @scala.inline
  def apply(index: Double, renderTabs: (Double, Tabbar) => js.Array[TabbarRenderTab]): HTMLAttributesidclassNameIgnoreEdgeWidth = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], renderTabs = js.Any.fromFunction2(renderTabs))
    __obj.asInstanceOf[HTMLAttributesidclassNameIgnoreEdgeWidth]
  }
  
  @scala.inline
  implicit class HTMLAttributesidclassNameIgnoreEdgeWidthOps[Self <: HTMLAttributesidclassNameIgnoreEdgeWidth] (val x: Self) extends AnyVal {
    
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
    def setRenderTabs(value: (Double, Tabbar) => js.Array[TabbarRenderTab]): Self = this.set("renderTabs", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAnimation(value: none | slide): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAnimationOptions(value: AnimationOptions): Self = this.set("animationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationOptions: Self = this.set("animationOptions", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIgnoreEdgeWidth(value: Double): Self = this.set("ignoreEdgeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEdgeWidth: Self = this.set("ignoreEdgeWidth", js.undefined)
    
    @scala.inline
    def setOnPostChange(value: () => Unit): Self = this.set("onPostChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPostChange: Self = this.set("onPostChange", js.undefined)
    
    @scala.inline
    def setOnPreChange(value: () => Unit): Self = this.set("onPreChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPreChange: Self = this.set("onPreChange", js.undefined)
    
    @scala.inline
    def setOnReactive(value: () => Unit): Self = this.set("onReactive", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnReactive: Self = this.set("onReactive", js.undefined)
    
    @scala.inline
    def setOnSwipe(value: (/* index */ Double, /* animationOptions */ AnimationOptions) => Unit): Self = this.set("onSwipe", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSwipe: Self = this.set("onSwipe", js.undefined)
    
    @scala.inline
    def setPosition(value: bottom | top | auto): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSwipeable(value: Boolean): Self = this.set("swipeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeable: Self = this.set("swipeable", js.undefined)
    
    @scala.inline
    def setTabBorder(value: Boolean): Self = this.set("tabBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabBorder: Self = this.set("tabBorder", js.undefined)
  }
}
