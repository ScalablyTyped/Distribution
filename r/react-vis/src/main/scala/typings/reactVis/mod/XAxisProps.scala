package typings.reactVis.mod

import typings.reactVis.anon.CSSPropertieslineCSSPrope
import typings.reactVis.reactVisStrings.bottom
import typings.reactVis.reactVisStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAxisProps extends StObject {
  
  // default: 'bottom'
  var attr: js.UndefOr[String] = js.undefined
  
  // default: 'x'
  var attrAxis: js.UndefOr[String] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hideLine: js.UndefOr[Boolean] = js.undefined
  
  var hideTicks: js.UndefOr[Boolean] = js.undefined
  
  var innerHeight: js.UndefOr[Double] = js.undefined
  
  var innerWidth: js.UndefOr[Double] = js.undefined
  
  var left: js.UndefOr[Double] = js.undefined
  
  var marginBottom: js.UndefOr[Double] = js.undefined
  
  var marginLeft: js.UndefOr[Double] = js.undefined
  
  var marginRight: js.UndefOr[Double] = js.undefined
  
  var marginTop: js.UndefOr[Double] = js.undefined
  
  var on0: js.UndefOr[Boolean] = js.undefined
  
  var orientation: js.UndefOr[top | bottom] = js.undefined
  
  var style: js.UndefOr[CSSPropertieslineCSSPrope] = js.undefined
  
  var tickFormat: js.UndefOr[RVTickFormat] = js.undefined
  
  var tickLabelAngle: js.UndefOr[Double] = js.undefined
  
  var tickPadding: js.UndefOr[Double] = js.undefined
  
  var tickSize: js.UndefOr[Double] = js.undefined
  
  var tickSizeInner: js.UndefOr[Double] = js.undefined
  
  var tickSizeOuter: js.UndefOr[Double] = js.undefined
  
  var tickTotal: js.UndefOr[Double] = js.undefined
  
  var tickValues: js.UndefOr[js.Array[Any]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var top: js.UndefOr[Double] = js.undefined
  
  // default: 'y'
  var width: js.UndefOr[Double] = js.undefined
}
object XAxisProps {
  
  inline def apply(): XAxisProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAxisProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAxisProps] (val x: Self) extends AnyVal {
    
    inline def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    inline def setAttrAxis(value: String): Self = StObject.set(x, "attrAxis", value.asInstanceOf[js.Any])
    
    inline def setAttrAxisUndefined: Self = StObject.set(x, "attrAxis", js.undefined)
    
    inline def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHideLine(value: Boolean): Self = StObject.set(x, "hideLine", value.asInstanceOf[js.Any])
    
    inline def setHideLineUndefined: Self = StObject.set(x, "hideLine", js.undefined)
    
    inline def setHideTicks(value: Boolean): Self = StObject.set(x, "hideTicks", value.asInstanceOf[js.Any])
    
    inline def setHideTicksUndefined: Self = StObject.set(x, "hideTicks", js.undefined)
    
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
    
    inline def setOn0(value: Boolean): Self = StObject.set(x, "on0", value.asInstanceOf[js.Any])
    
    inline def setOn0Undefined: Self = StObject.set(x, "on0", js.undefined)
    
    inline def setOrientation(value: top | bottom): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setStyle(value: CSSPropertieslineCSSPrope): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTickFormat(value: /* tick */ Any => String): Self = StObject.set(x, "tickFormat", js.Any.fromFunction1(value))
    
    inline def setTickFormatUndefined: Self = StObject.set(x, "tickFormat", js.undefined)
    
    inline def setTickLabelAngle(value: Double): Self = StObject.set(x, "tickLabelAngle", value.asInstanceOf[js.Any])
    
    inline def setTickLabelAngleUndefined: Self = StObject.set(x, "tickLabelAngle", js.undefined)
    
    inline def setTickPadding(value: Double): Self = StObject.set(x, "tickPadding", value.asInstanceOf[js.Any])
    
    inline def setTickPaddingUndefined: Self = StObject.set(x, "tickPadding", js.undefined)
    
    inline def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
    
    inline def setTickSizeInner(value: Double): Self = StObject.set(x, "tickSizeInner", value.asInstanceOf[js.Any])
    
    inline def setTickSizeInnerUndefined: Self = StObject.set(x, "tickSizeInner", js.undefined)
    
    inline def setTickSizeOuter(value: Double): Self = StObject.set(x, "tickSizeOuter", value.asInstanceOf[js.Any])
    
    inline def setTickSizeOuterUndefined: Self = StObject.set(x, "tickSizeOuter", js.undefined)
    
    inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
    
    inline def setTickTotal(value: Double): Self = StObject.set(x, "tickTotal", value.asInstanceOf[js.Any])
    
    inline def setTickTotalUndefined: Self = StObject.set(x, "tickTotal", js.undefined)
    
    inline def setTickValues(value: js.Array[Any]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
    
    inline def setTickValuesUndefined: Self = StObject.set(x, "tickValues", js.undefined)
    
    inline def setTickValuesVarargs(value: Any*): Self = StObject.set(x, "tickValues", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
