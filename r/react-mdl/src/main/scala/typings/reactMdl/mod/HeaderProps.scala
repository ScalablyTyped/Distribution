package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderProps
  extends HTMLProps[js.Any] {
  
  var hideSpacer: js.UndefOr[Boolean] = js.native
  
  var hideTop: js.UndefOr[Boolean] = js.native
  
  // string | JSX.Element
  var scroll: js.UndefOr[Boolean] = js.native
  
  var seamed: js.UndefOr[Boolean] = js.native
  
  @JSName("title")
  var title_HeaderProps: js.UndefOr[js.Any] = js.native
  
  var transparent: js.UndefOr[Boolean] = js.native
  
  var waterfall: js.UndefOr[Boolean] = js.native
}
object HeaderProps {
  
  @scala.inline
  def apply(): HeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderProps]
  }
  
  @scala.inline
  implicit class HeaderPropsMutableBuilder[Self <: HeaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideSpacer(value: Boolean): Self = StObject.set(x, "hideSpacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSpacerUndefined: Self = StObject.set(x, "hideSpacer", js.undefined)
    
    @scala.inline
    def setHideTop(value: Boolean): Self = StObject.set(x, "hideTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideTopUndefined: Self = StObject.set(x, "hideTop", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    @scala.inline
    def setSeamed(value: Boolean): Self = StObject.set(x, "seamed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeamedUndefined: Self = StObject.set(x, "seamed", js.undefined)
    
    @scala.inline
    def setTitle(value: js.Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    @scala.inline
    def setWaterfall(value: Boolean): Self = StObject.set(x, "waterfall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaterfallUndefined: Self = StObject.set(x, "waterfall", js.undefined)
  }
}
