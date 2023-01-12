package typings.rtsaoCsstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewportFallback[TLength] extends StObject {
  
  var OOrientation: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.undefined
  
  var height: js.UndefOr[ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]] = js.undefined
  
  var maxHeight: js.UndefOr[
    ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]
  ] = js.undefined
  
  var maxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]] = js.undefined
  
  var maxZoom: js.UndefOr[ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]] = js.undefined
  
  var minHeight: js.UndefOr[
    ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]
  ] = js.undefined
  
  var minWidth: js.UndefOr[ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]] = js.undefined
  
  var minZoom: js.UndefOr[ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]] = js.undefined
  
  var msHeight: js.UndefOr[ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]] = js.undefined
  
  var msMaxHeight: js.UndefOr[
    ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]
  ] = js.undefined
  
  var msMaxWidth: js.UndefOr[ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]] = js.undefined
  
  var msMaxZoom: js.UndefOr[ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]] = js.undefined
  
  var msMinHeight: js.UndefOr[
    ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]
  ] = js.undefined
  
  var msMinWidth: js.UndefOr[ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]] = js.undefined
  
  var msMinZoom: js.UndefOr[ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]] = js.undefined
  
  var msOrientation: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.undefined
  
  var msUserZoom: js.UndefOr[ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]] = js.undefined
  
  var msWidth: js.UndefOr[ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]] = js.undefined
  
  var msZoom: js.UndefOr[ViewportZoomProperty | js.Array[ViewportZoomProperty]] = js.undefined
  
  var orientation: js.UndefOr[ViewportOrientationProperty | js.Array[ViewportOrientationProperty]] = js.undefined
  
  var userZoom: js.UndefOr[ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]] = js.undefined
  
  var width: js.UndefOr[ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]] = js.undefined
  
  var zoom: js.UndefOr[ViewportZoomProperty | js.Array[ViewportZoomProperty]] = js.undefined
}
object ViewportFallback {
  
  inline def apply[TLength](): ViewportFallback[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportFallback[TLength]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewportFallback[?], TLength] (val x: Self & ViewportFallback[TLength]) extends AnyVal {
    
    inline def setHeight(value: ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHeightVarargs(value: ViewportHeightProperty[TLength]*): Self = StObject.set(x, "height", js.Array(value*))
    
    inline def setMaxHeight(value: ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxHeightVarargs(value: ViewportMaxHeightProperty[TLength]*): Self = StObject.set(x, "maxHeight", js.Array(value*))
    
    inline def setMaxWidth(value: ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMaxWidthVarargs(value: ViewportMaxWidthProperty[TLength]*): Self = StObject.set(x, "maxWidth", js.Array(value*))
    
    inline def setMaxZoom(value: ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMaxZoomVarargs(value: ViewportMaxZoomProperty*): Self = StObject.set(x, "maxZoom", js.Array(value*))
    
    inline def setMinHeight(value: ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinHeightVarargs(value: ViewportMinHeightProperty[TLength]*): Self = StObject.set(x, "minHeight", js.Array(value*))
    
    inline def setMinWidth(value: ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMinWidthVarargs(value: ViewportMinWidthProperty[TLength]*): Self = StObject.set(x, "minWidth", js.Array(value*))
    
    inline def setMinZoom(value: ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setMinZoomVarargs(value: ViewportMinZoomProperty*): Self = StObject.set(x, "minZoom", js.Array(value*))
    
    inline def setMsHeight(value: ViewportHeightProperty[TLength] | js.Array[ViewportHeightProperty[TLength]]): Self = StObject.set(x, "msHeight", value.asInstanceOf[js.Any])
    
    inline def setMsHeightUndefined: Self = StObject.set(x, "msHeight", js.undefined)
    
    inline def setMsHeightVarargs(value: ViewportHeightProperty[TLength]*): Self = StObject.set(x, "msHeight", js.Array(value*))
    
    inline def setMsMaxHeight(value: ViewportMaxHeightProperty[TLength] | js.Array[ViewportMaxHeightProperty[TLength]]): Self = StObject.set(x, "msMaxHeight", value.asInstanceOf[js.Any])
    
    inline def setMsMaxHeightUndefined: Self = StObject.set(x, "msMaxHeight", js.undefined)
    
    inline def setMsMaxHeightVarargs(value: ViewportMaxHeightProperty[TLength]*): Self = StObject.set(x, "msMaxHeight", js.Array(value*))
    
    inline def setMsMaxWidth(value: ViewportMaxWidthProperty[TLength] | js.Array[ViewportMaxWidthProperty[TLength]]): Self = StObject.set(x, "msMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setMsMaxWidthUndefined: Self = StObject.set(x, "msMaxWidth", js.undefined)
    
    inline def setMsMaxWidthVarargs(value: ViewportMaxWidthProperty[TLength]*): Self = StObject.set(x, "msMaxWidth", js.Array(value*))
    
    inline def setMsMaxZoom(value: ViewportMaxZoomProperty | js.Array[ViewportMaxZoomProperty]): Self = StObject.set(x, "msMaxZoom", value.asInstanceOf[js.Any])
    
    inline def setMsMaxZoomUndefined: Self = StObject.set(x, "msMaxZoom", js.undefined)
    
    inline def setMsMaxZoomVarargs(value: ViewportMaxZoomProperty*): Self = StObject.set(x, "msMaxZoom", js.Array(value*))
    
    inline def setMsMinHeight(value: ViewportMinHeightProperty[TLength] | js.Array[ViewportMinHeightProperty[TLength]]): Self = StObject.set(x, "msMinHeight", value.asInstanceOf[js.Any])
    
    inline def setMsMinHeightUndefined: Self = StObject.set(x, "msMinHeight", js.undefined)
    
    inline def setMsMinHeightVarargs(value: ViewportMinHeightProperty[TLength]*): Self = StObject.set(x, "msMinHeight", js.Array(value*))
    
    inline def setMsMinWidth(value: ViewportMinWidthProperty[TLength] | js.Array[ViewportMinWidthProperty[TLength]]): Self = StObject.set(x, "msMinWidth", value.asInstanceOf[js.Any])
    
    inline def setMsMinWidthUndefined: Self = StObject.set(x, "msMinWidth", js.undefined)
    
    inline def setMsMinWidthVarargs(value: ViewportMinWidthProperty[TLength]*): Self = StObject.set(x, "msMinWidth", js.Array(value*))
    
    inline def setMsMinZoom(value: ViewportMinZoomProperty | js.Array[ViewportMinZoomProperty]): Self = StObject.set(x, "msMinZoom", value.asInstanceOf[js.Any])
    
    inline def setMsMinZoomUndefined: Self = StObject.set(x, "msMinZoom", js.undefined)
    
    inline def setMsMinZoomVarargs(value: ViewportMinZoomProperty*): Self = StObject.set(x, "msMinZoom", js.Array(value*))
    
    inline def setMsOrientation(value: ViewportOrientationProperty | js.Array[ViewportOrientationProperty]): Self = StObject.set(x, "msOrientation", value.asInstanceOf[js.Any])
    
    inline def setMsOrientationUndefined: Self = StObject.set(x, "msOrientation", js.undefined)
    
    inline def setMsOrientationVarargs(value: ViewportOrientationProperty*): Self = StObject.set(x, "msOrientation", js.Array(value*))
    
    inline def setMsUserZoom(value: ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]): Self = StObject.set(x, "msUserZoom", value.asInstanceOf[js.Any])
    
    inline def setMsUserZoomUndefined: Self = StObject.set(x, "msUserZoom", js.undefined)
    
    inline def setMsUserZoomVarargs(value: ViewportUserZoomProperty*): Self = StObject.set(x, "msUserZoom", js.Array(value*))
    
    inline def setMsWidth(value: ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]): Self = StObject.set(x, "msWidth", value.asInstanceOf[js.Any])
    
    inline def setMsWidthUndefined: Self = StObject.set(x, "msWidth", js.undefined)
    
    inline def setMsWidthVarargs(value: ViewportWidthProperty[TLength]*): Self = StObject.set(x, "msWidth", js.Array(value*))
    
    inline def setMsZoom(value: ViewportZoomProperty | js.Array[ViewportZoomProperty]): Self = StObject.set(x, "msZoom", value.asInstanceOf[js.Any])
    
    inline def setMsZoomUndefined: Self = StObject.set(x, "msZoom", js.undefined)
    
    inline def setMsZoomVarargs(value: ViewportZoomProperty*): Self = StObject.set(x, "msZoom", js.Array(value*))
    
    inline def setOOrientation(value: ViewportOrientationProperty | js.Array[ViewportOrientationProperty]): Self = StObject.set(x, "OOrientation", value.asInstanceOf[js.Any])
    
    inline def setOOrientationUndefined: Self = StObject.set(x, "OOrientation", js.undefined)
    
    inline def setOOrientationVarargs(value: ViewportOrientationProperty*): Self = StObject.set(x, "OOrientation", js.Array(value*))
    
    inline def setOrientation(value: ViewportOrientationProperty | js.Array[ViewportOrientationProperty]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setOrientationVarargs(value: ViewportOrientationProperty*): Self = StObject.set(x, "orientation", js.Array(value*))
    
    inline def setUserZoom(value: ViewportUserZoomProperty | js.Array[ViewportUserZoomProperty]): Self = StObject.set(x, "userZoom", value.asInstanceOf[js.Any])
    
    inline def setUserZoomUndefined: Self = StObject.set(x, "userZoom", js.undefined)
    
    inline def setUserZoomVarargs(value: ViewportUserZoomProperty*): Self = StObject.set(x, "userZoom", js.Array(value*))
    
    inline def setWidth(value: ViewportWidthProperty[TLength] | js.Array[ViewportWidthProperty[TLength]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWidthVarargs(value: ViewportWidthProperty[TLength]*): Self = StObject.set(x, "width", js.Array(value*))
    
    inline def setZoom(value: ViewportZoomProperty | js.Array[ViewportZoomProperty]): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
    
    inline def setZoomVarargs(value: ViewportZoomProperty*): Self = StObject.set(x, "zoom", js.Array(value*))
  }
}
