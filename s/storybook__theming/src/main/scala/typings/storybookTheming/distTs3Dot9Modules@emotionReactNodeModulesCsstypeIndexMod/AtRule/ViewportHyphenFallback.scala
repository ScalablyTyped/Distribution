package typings.storybookTheming.`distTs3Dot9Modules@emotionReactNodeModulesCsstypeIndexMod`.AtRule

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/theming.@storybook/theming/dist/ts3.9/_modules/@emotion-react-node_modules-csstype-index.Fallback<@storybook/theming.@storybook/theming/dist/ts3.9/_modules/@emotion-react-node_modules-csstype-index.AtRule.ViewportHyphen<TLength, TTime>> */
trait ViewportHyphenFallback[TLength, TTime] extends StObject {
  
  var height: js.UndefOr[Height[TLength] | js.Array[NonNullable[js.UndefOr[Height[TLength]]]]] = js.undefined
  
  var `max-height`: js.UndefOr[MaxHeight[TLength] | js.Array[NonNullable[js.UndefOr[MaxHeight[TLength]]]]] = js.undefined
  
  var `max-width`: js.UndefOr[MaxWidth[TLength] | js.Array[NonNullable[js.UndefOr[MaxWidth[TLength]]]]] = js.undefined
  
  var `max-zoom`: js.UndefOr[MaxZoom | js.Array[NonNullable[js.UndefOr[MaxZoom]]]] = js.undefined
  
  var `min-height`: js.UndefOr[MinHeight[TLength] | js.Array[NonNullable[js.UndefOr[MinHeight[TLength]]]]] = js.undefined
  
  var `min-width`: js.UndefOr[MinWidth[TLength] | js.Array[NonNullable[js.UndefOr[MinWidth[TLength]]]]] = js.undefined
  
  var `min-zoom`: js.UndefOr[MinZoom | js.Array[NonNullable[js.UndefOr[MinZoom]]]] = js.undefined
  
  var orientation: js.UndefOr[Orientation | js.Array[NonNullable[js.UndefOr[Orientation]]]] = js.undefined
  
  var `user-zoom`: js.UndefOr[UserZoom | js.Array[NonNullable[js.UndefOr[UserZoom]]]] = js.undefined
  
  var `viewport-fit`: js.UndefOr[ViewportFit | js.Array[NonNullable[js.UndefOr[ViewportFit]]]] = js.undefined
  
  var width: js.UndefOr[Width[TLength] | js.Array[NonNullable[js.UndefOr[Width[TLength]]]]] = js.undefined
  
  var zoom: js.UndefOr[Zoom | js.Array[NonNullable[js.UndefOr[Zoom]]]] = js.undefined
}
object ViewportHyphenFallback {
  
  inline def apply[TLength, TTime](): ViewportHyphenFallback[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportHyphenFallback[TLength, TTime]]
  }
  
  extension [Self <: ViewportHyphenFallback[?, ?], TLength, TTime](x: Self & (ViewportHyphenFallback[TLength, TTime])) {
    
    inline def setHeight(value: Height[TLength] | js.Array[NonNullable[js.UndefOr[Height[TLength]]]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHeightVarargs(value: NonNullable[js.UndefOr[Height[TLength]]]*): Self = StObject.set(x, "height", js.Array(value*))
    
    inline def `setMax-height`(value: MaxHeight[TLength] | js.Array[NonNullable[js.UndefOr[MaxHeight[TLength]]]]): Self = StObject.set(x, "max-height", value.asInstanceOf[js.Any])
    
    inline def `setMax-heightUndefined`: Self = StObject.set(x, "max-height", js.undefined)
    
    inline def `setMax-heightVarargs`(value: NonNullable[js.UndefOr[MaxHeight[TLength]]]*): Self = StObject.set(x, "max-height", js.Array(value*))
    
    inline def `setMax-width`(value: MaxWidth[TLength] | js.Array[NonNullable[js.UndefOr[MaxWidth[TLength]]]]): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
    
    inline def `setMax-widthUndefined`: Self = StObject.set(x, "max-width", js.undefined)
    
    inline def `setMax-widthVarargs`(value: NonNullable[js.UndefOr[MaxWidth[TLength]]]*): Self = StObject.set(x, "max-width", js.Array(value*))
    
    inline def `setMax-zoom`(value: MaxZoom | js.Array[NonNullable[js.UndefOr[MaxZoom]]]): Self = StObject.set(x, "max-zoom", value.asInstanceOf[js.Any])
    
    inline def `setMax-zoomUndefined`: Self = StObject.set(x, "max-zoom", js.undefined)
    
    inline def `setMax-zoomVarargs`(value: NonNullable[js.UndefOr[MaxZoom]]*): Self = StObject.set(x, "max-zoom", js.Array(value*))
    
    inline def `setMin-height`(value: MinHeight[TLength] | js.Array[NonNullable[js.UndefOr[MinHeight[TLength]]]]): Self = StObject.set(x, "min-height", value.asInstanceOf[js.Any])
    
    inline def `setMin-heightUndefined`: Self = StObject.set(x, "min-height", js.undefined)
    
    inline def `setMin-heightVarargs`(value: NonNullable[js.UndefOr[MinHeight[TLength]]]*): Self = StObject.set(x, "min-height", js.Array(value*))
    
    inline def `setMin-width`(value: MinWidth[TLength] | js.Array[NonNullable[js.UndefOr[MinWidth[TLength]]]]): Self = StObject.set(x, "min-width", value.asInstanceOf[js.Any])
    
    inline def `setMin-widthUndefined`: Self = StObject.set(x, "min-width", js.undefined)
    
    inline def `setMin-widthVarargs`(value: NonNullable[js.UndefOr[MinWidth[TLength]]]*): Self = StObject.set(x, "min-width", js.Array(value*))
    
    inline def `setMin-zoom`(value: MinZoom | js.Array[NonNullable[js.UndefOr[MinZoom]]]): Self = StObject.set(x, "min-zoom", value.asInstanceOf[js.Any])
    
    inline def `setMin-zoomUndefined`: Self = StObject.set(x, "min-zoom", js.undefined)
    
    inline def `setMin-zoomVarargs`(value: NonNullable[js.UndefOr[MinZoom]]*): Self = StObject.set(x, "min-zoom", js.Array(value*))
    
    inline def setOrientation(value: Orientation | js.Array[NonNullable[js.UndefOr[Orientation]]]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOrientationVarargs(value: NonNullable[js.UndefOr[Orientation]]*): Self = StObject.set(x, "orientation", js.Array(value*))
    
    inline def `setUser-zoom`(value: UserZoom | js.Array[NonNullable[js.UndefOr[UserZoom]]]): Self = StObject.set(x, "user-zoom", value.asInstanceOf[js.Any])
    
    inline def `setUser-zoomUndefined`: Self = StObject.set(x, "user-zoom", js.undefined)
    
    inline def `setUser-zoomVarargs`(value: NonNullable[js.UndefOr[UserZoom]]*): Self = StObject.set(x, "user-zoom", js.Array(value*))
    
    inline def `setViewport-fit`(value: ViewportFit | js.Array[NonNullable[js.UndefOr[ViewportFit]]]): Self = StObject.set(x, "viewport-fit", value.asInstanceOf[js.Any])
    
    inline def `setViewport-fitUndefined`: Self = StObject.set(x, "viewport-fit", js.undefined)
    
    inline def `setViewport-fitVarargs`(value: NonNullable[js.UndefOr[ViewportFit]]*): Self = StObject.set(x, "viewport-fit", js.Array(value*))
    
    inline def setWidth(value: Width[TLength] | js.Array[NonNullable[js.UndefOr[Width[TLength]]]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWidthVarargs(value: NonNullable[js.UndefOr[Width[TLength]]]*): Self = StObject.set(x, "width", js.Array(value*))
    
    inline def setZoom(value: Zoom | js.Array[NonNullable[js.UndefOr[Zoom]]]): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    inline def setZoomVarargs(value: NonNullable[js.UndefOr[Zoom]]*): Self = StObject.set(x, "zoom", js.Array(value*))
  }
}
