package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.reactVis.reactVisStrings.horizontal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HorizontalGridLinesProps extends StObject {
  
  var animation: js.UndefOr[String | AnimationParam | Boolean] = js.native
  
  // default: 'horizontal'
  var attr: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[horizontal] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var innerHeight: js.UndefOr[Double] = js.native
  
  var innerWidth: js.UndefOr[Double] = js.native
  
  var left: js.UndefOr[Double] = js.native
  
  var marginBottom: js.UndefOr[Double] = js.native
  
  var marginLeft: js.UndefOr[Double] = js.native
  
  var marginRight: js.UndefOr[Double] = js.native
  
  var marginTop: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var tickTotal: js.UndefOr[Double] = js.native
  
  var tickValues: js.UndefOr[js.Array[_]] = js.native
  
  var top: js.UndefOr[Double] = js.native
  
  // default: 'y'
  var width: js.UndefOr[Double] = js.native
}
object HorizontalGridLinesProps {
  
  @scala.inline
  def apply(): HorizontalGridLinesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalGridLinesProps]
  }
  
  @scala.inline
  implicit class HorizontalGridLinesPropsMutableBuilder[Self <: HorizontalGridLinesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: String | AnimationParam | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAttr(value: String): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttrUndefined: Self = StObject.set(x, "attr", js.undefined)
    
    @scala.inline
    def setDirection(value: horizontal): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
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
    def setTickValues(value: js.Array[_]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
    
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
