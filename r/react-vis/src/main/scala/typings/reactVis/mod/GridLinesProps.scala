package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.reactVis.reactVisStrings.horizontal
import typings.reactVis.reactVisStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLinesProps extends StObject {
  
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
  
  // default: 'vertical'
  var attr: String
  
  var direction: js.UndefOr[vertical | horizontal] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var innerHeight: js.UndefOr[Double] = js.undefined
  
  var innerWidth: js.UndefOr[Double] = js.undefined
  
  var left: js.UndefOr[Double] = js.undefined
  
  var marginBottom: js.UndefOr[Double] = js.undefined
  
  var marginLeft: js.UndefOr[Double] = js.undefined
  
  var marginRight: js.UndefOr[Double] = js.undefined
  
  var marginTop: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var tickTotal: js.UndefOr[Double] = js.undefined
  
  var tickValues: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object GridLinesProps {
  
  inline def apply(attr: String): GridLinesProps = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLinesProps]
  }
  
  extension [Self <: GridLinesProps](x: Self) {
    
    inline def setAnimation(value: String | AnimationParam | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: vertical | horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInnerHeight(value: Double): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
    
    inline def setInnerHeightUndefined: Self = StObject.set(x, "innerHeight", js.undefined)
    
    inline def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    inline def setInnerWidthUndefined: Self = StObject.set(x, "innerWidth", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTickTotal(value: Double): Self = StObject.set(x, "tickTotal", value.asInstanceOf[js.Any])
    
    inline def setTickTotalUndefined: Self = StObject.set(x, "tickTotal", js.undefined)
    
    inline def setTickValues(value: js.Array[js.Any]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
    
    inline def setTickValuesUndefined: Self = StObject.set(x, "tickValues", js.undefined)
    
    inline def setTickValuesVarargs(value: js.Any*): Self = StObject.set(x, "tickValues", js.Array(value :_*))
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
