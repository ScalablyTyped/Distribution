package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RectSeriesProps
  extends StObject
     with AbstractSeriesProps[RectSeriesPoint] {
  
  var linePosAttr: js.UndefOr[String] = js.undefined
  
  var lineSizeAttr: js.UndefOr[String] = js.undefined
  
  var valuePosAttr: js.UndefOr[String] = js.undefined
  
  var valueSizeAttr: js.UndefOr[String] = js.undefined
}
object RectSeriesProps {
  
  @scala.inline
  def apply(): RectSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectSeriesProps]
  }
  
  @scala.inline
  implicit class RectSeriesPropsMutableBuilder[Self <: RectSeriesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinePosAttr(value: String): Self = StObject.set(x, "linePosAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinePosAttrUndefined: Self = StObject.set(x, "linePosAttr", js.undefined)
    
    @scala.inline
    def setLineSizeAttr(value: String): Self = StObject.set(x, "lineSizeAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineSizeAttrUndefined: Self = StObject.set(x, "lineSizeAttr", js.undefined)
    
    @scala.inline
    def setValuePosAttr(value: String): Self = StObject.set(x, "valuePosAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuePosAttrUndefined: Self = StObject.set(x, "valuePosAttr", js.undefined)
    
    @scala.inline
    def setValueSizeAttr(value: String): Self = StObject.set(x, "valueSizeAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSizeAttrUndefined: Self = StObject.set(x, "valueSizeAttr", js.undefined)
  }
}
