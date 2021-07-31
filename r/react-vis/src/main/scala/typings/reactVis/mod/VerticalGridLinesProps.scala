package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.reactVis.reactVisStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerticalGridLinesProps extends StObject {
  
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.undefined
  
  // default: 'vertical'
  var attr: js.UndefOr[String] = js.undefined
  
  var direction: js.UndefOr[vertical] = js.undefined
  
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
  
  // default: 'x'
  var width: js.UndefOr[Double] = js.undefined
}
object VerticalGridLinesProps {
  
  @scala.inline
  def apply(): VerticalGridLinesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalGridLinesProps]
  }
  
  @scala.inline
  implicit class VerticalGridLinesPropsMutableBuilder[Self <: VerticalGridLinesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String | AnimationParam | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    @scala.inline
    def setDirection(value: vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
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
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTickTotal(value: Double): Self = StObject.set(x, "tickTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickTotalUndefined: Self = StObject.set(x, "tickTotal", js.undefined)
    
    @scala.inline
    def setTickValues(value: js.Array[js.Any]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickValuesUndefined: Self = StObject.set(x, "tickValues", js.undefined)
    
    @scala.inline
    def setTickValuesVarargs(value: js.Any*): Self = StObject.set(x, "tickValues", js.Array(value :_*))
    
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
