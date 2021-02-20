package typings.reactVis.mod

import typings.reactVis.anon.CSSPropertieslineCSSPrope
import typings.reactVis.reactVisStrings.left
import typings.reactVis.reactVisStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YAxisProps extends StObject {
  
  // default: 'left'
  var attr: js.UndefOr[String] = js.native
  
  // default: 'y'
  var attrAxis: js.UndefOr[String] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hideLine: js.UndefOr[Boolean] = js.native
  
  var hideTicks: js.UndefOr[Boolean] = js.native
  
  var innerHeight: js.UndefOr[Double] = js.native
  
  var innerWidth: js.UndefOr[Double] = js.native
  
  var left: js.UndefOr[Double] = js.native
  
  var marginBottom: js.UndefOr[Double] = js.native
  
  var marginLeft: js.UndefOr[Double] = js.native
  
  var marginRight: js.UndefOr[Double] = js.native
  
  var marginTop: js.UndefOr[Double] = js.native
  
  var on0: js.UndefOr[Boolean] = js.native
  
  var orientation: js.UndefOr[left | right] = js.native
  
  var style: js.UndefOr[CSSPropertieslineCSSPrope] = js.native
  
  var tickFormat: js.UndefOr[RVTickFormat] = js.native
  
  var tickLabelAngle: js.UndefOr[Double] = js.native
  
  var tickPadding: js.UndefOr[Double] = js.native
  
  var tickSize: js.UndefOr[Double] = js.native
  
  var tickSizeInner: js.UndefOr[Double] = js.native
  
  var tickSizeOuter: js.UndefOr[Double] = js.native
  
  var tickTotal: js.UndefOr[Double] = js.native
  
  var tickValues: js.UndefOr[js.Array[_]] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var top: js.UndefOr[Double] = js.native
  
  // default: 'x'
  var width: js.UndefOr[Double] = js.native
}
object YAxisProps {
  
  @scala.inline
  def apply(): YAxisProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisProps]
  }
  
  @scala.inline
  implicit class YAxisPropsMutableBuilder[Self <: YAxisProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrAxis(value: String): Self = StObject.set(x, "attrAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrAxisUndefined: Self = StObject.set(x, "attrAxis", js.undefined)
    
    @scala.inline
    def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHideLine(value: Boolean): Self = StObject.set(x, "hideLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideLineUndefined: Self = StObject.set(x, "hideLine", js.undefined)
    
    @scala.inline
    def setHideTicks(value: Boolean): Self = StObject.set(x, "hideTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideTicksUndefined: Self = StObject.set(x, "hideTicks", js.undefined)
    
    @scala.inline
    def setInnerHeight(value: Double): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerHeightUndefined: Self = StObject.set(x, "innerHeight", js.undefined)
    
    @scala.inline
    def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerWidthUndefined: Self = StObject.set(x, "innerWidth", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    @scala.inline
    def setOn0(value: Boolean): Self = StObject.set(x, "on0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn0Undefined: Self = StObject.set(x, "on0", js.undefined)
    
    @scala.inline
    def setOrientation(value: left | right): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSPropertieslineCSSPrope): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTickFormat(value: /* tick */ js.Any => String): Self = StObject.set(x, "tickFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTickFormatUndefined: Self = StObject.set(x, "tickFormat", js.undefined)
    
    @scala.inline
    def setTickLabelAngle(value: Double): Self = StObject.set(x, "tickLabelAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLabelAngleUndefined: Self = StObject.set(x, "tickLabelAngle", js.undefined)
    
    @scala.inline
    def setTickPadding(value: Double): Self = StObject.set(x, "tickPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickPaddingUndefined: Self = StObject.set(x, "tickPadding", js.undefined)
    
    @scala.inline
    def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickSizeInner(value: Double): Self = StObject.set(x, "tickSizeInner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickSizeInnerUndefined: Self = StObject.set(x, "tickSizeInner", js.undefined)
    
    @scala.inline
    def setTickSizeOuter(value: Double): Self = StObject.set(x, "tickSizeOuter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickSizeOuterUndefined: Self = StObject.set(x, "tickSizeOuter", js.undefined)
    
    @scala.inline
    def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
    
    @scala.inline
    def setTickTotal(value: Double): Self = StObject.set(x, "tickTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickTotalUndefined: Self = StObject.set(x, "tickTotal", js.undefined)
    
    @scala.inline
    def setTickValues(value: js.Array[_]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickValuesUndefined: Self = StObject.set(x, "tickValues", js.undefined)
    
    @scala.inline
    def setTickValuesVarargs(value: js.Any*): Self = StObject.set(x, "tickValues", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
