package typings.storybookTheming.emotionReactNodeModulesCsstypeIndexMod.AtRule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewportHyphen[TLength, TTime] extends StObject {
  
  var height: js.UndefOr[Height[TLength]] = js.undefined
  
  var `max-height`: js.UndefOr[MaxHeight[TLength]] = js.undefined
  
  var `max-width`: js.UndefOr[MaxWidth[TLength]] = js.undefined
  
  var `max-zoom`: js.UndefOr[MaxZoom] = js.undefined
  
  var `min-height`: js.UndefOr[MinHeight[TLength]] = js.undefined
  
  var `min-width`: js.UndefOr[MinWidth[TLength]] = js.undefined
  
  var `min-zoom`: js.UndefOr[MinZoom] = js.undefined
  
  var orientation: js.UndefOr[Orientation] = js.undefined
  
  var `user-zoom`: js.UndefOr[UserZoom] = js.undefined
  
  var `viewport-fit`: js.UndefOr[ViewportFit] = js.undefined
  
  var width: js.UndefOr[Width[TLength]] = js.undefined
  
  var zoom: js.UndefOr[Zoom] = js.undefined
}
object ViewportHyphen {
  
  inline def apply[TLength, TTime](): ViewportHyphen[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportHyphen[TLength, TTime]]
  }
  
  extension [Self <: ViewportHyphen[?, ?], TLength, TTime](x: Self & (ViewportHyphen[TLength, TTime])) {
    
    inline def setHeight(value: Height[TLength]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def `setMax-height`(value: MaxHeight[TLength]): Self = StObject.set(x, "max-height", value.asInstanceOf[js.Any])
    
    inline def `setMax-heightUndefined`: Self = StObject.set(x, "max-height", js.undefined)
    
    inline def `setMax-width`(value: MaxWidth[TLength]): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
    
    inline def `setMax-widthUndefined`: Self = StObject.set(x, "max-width", js.undefined)
    
    inline def `setMax-zoom`(value: MaxZoom): Self = StObject.set(x, "max-zoom", value.asInstanceOf[js.Any])
    
    inline def `setMax-zoomUndefined`: Self = StObject.set(x, "max-zoom", js.undefined)
    
    inline def `setMin-height`(value: MinHeight[TLength]): Self = StObject.set(x, "min-height", value.asInstanceOf[js.Any])
    
    inline def `setMin-heightUndefined`: Self = StObject.set(x, "min-height", js.undefined)
    
    inline def `setMin-width`(value: MinWidth[TLength]): Self = StObject.set(x, "min-width", value.asInstanceOf[js.Any])
    
    inline def `setMin-widthUndefined`: Self = StObject.set(x, "min-width", js.undefined)
    
    inline def `setMin-zoom`(value: MinZoom): Self = StObject.set(x, "min-zoom", value.asInstanceOf[js.Any])
    
    inline def `setMin-zoomUndefined`: Self = StObject.set(x, "min-zoom", js.undefined)
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def `setUser-zoom`(value: UserZoom): Self = StObject.set(x, "user-zoom", value.asInstanceOf[js.Any])
    
    inline def `setUser-zoomUndefined`: Self = StObject.set(x, "user-zoom", js.undefined)
    
    inline def `setViewport-fit`(value: ViewportFit): Self = StObject.set(x, "viewport-fit", value.asInstanceOf[js.Any])
    
    inline def `setViewport-fitUndefined`: Self = StObject.set(x, "viewport-fit", js.undefined)
    
    inline def setWidth(value: Width[TLength]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZoom(value: Zoom): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
