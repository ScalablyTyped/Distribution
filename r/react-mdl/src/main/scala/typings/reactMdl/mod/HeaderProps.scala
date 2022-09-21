package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeaderProps
  extends StObject
     with HTMLProps[Any] {
  
  var hideSpacer: js.UndefOr[Boolean] = js.undefined
  
  var hideTop: js.UndefOr[Boolean] = js.undefined
  
  // string | JSX.Element
  var scroll: js.UndefOr[Boolean] = js.undefined
  
  var seamed: js.UndefOr[Boolean] = js.undefined
  
  @JSName("title")
  var title_HeaderProps: js.UndefOr[Any] = js.undefined
  
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  var waterfall: js.UndefOr[Boolean] = js.undefined
}
object HeaderProps {
  
  inline def apply(): HeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderProps]
  }
  
  extension [Self <: HeaderProps](x: Self) {
    
    inline def setHideSpacer(value: Boolean): Self = StObject.set(x, "hideSpacer", value.asInstanceOf[js.Any])
    
    inline def setHideSpacerUndefined: Self = StObject.set(x, "hideSpacer", js.undefined)
    
    inline def setHideTop(value: Boolean): Self = StObject.set(x, "hideTop", value.asInstanceOf[js.Any])
    
    inline def setHideTopUndefined: Self = StObject.set(x, "hideTop", js.undefined)
    
    inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    
    inline def setSeamed(value: Boolean): Self = StObject.set(x, "seamed", value.asInstanceOf[js.Any])
    
    inline def setSeamedUndefined: Self = StObject.set(x, "seamed", js.undefined)
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setWaterfall(value: Boolean): Self = StObject.set(x, "waterfall", value.asInstanceOf[js.Any])
    
    inline def setWaterfallUndefined: Self = StObject.set(x, "waterfall", js.undefined)
  }
}
