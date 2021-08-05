package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartLabelProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var includeMargin: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var text: String
  
  var xPercent: Double
  
  var yPercent: Double
}
object ChartLabelProps {
  
  inline def apply(text: String, xPercent: Double, yPercent: Double): ChartLabelProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], xPercent = xPercent.asInstanceOf[js.Any], yPercent = yPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLabelProps]
  }
  
  extension [Self <: ChartLabelProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setIncludeMargin(value: Boolean): Self = StObject.set(x, "includeMargin", value.asInstanceOf[js.Any])
    
    inline def setIncludeMarginUndefined: Self = StObject.set(x, "includeMargin", js.undefined)
    
    inline def setStyle(value: StringDictionary[js.Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setXPercent(value: Double): Self = StObject.set(x, "xPercent", value.asInstanceOf[js.Any])
    
    inline def setYPercent(value: Double): Self = StObject.set(x, "yPercent", value.asInstanceOf[js.Any])
  }
}
