package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactVis.anon.Box
import typings.reactVis.anon.Title
import typings.reactVis.reactVisStrings.left
import typings.reactVis.reactVisStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrosshairProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var innerHeight: js.UndefOr[Double] = js.undefined
  
  var innerWidth: js.UndefOr[Double] = js.undefined
  
  var itemsFormat: js.UndefOr[js.Function1[/* x */ Any, js.Array[Title]]] = js.undefined
  
  var marginLeft: js.UndefOr[Double] = js.undefined
  
  var marginTop: js.UndefOr[Double] = js.undefined
  
  var orientation: js.UndefOr[left | right] = js.undefined
  
  var series: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var style: js.UndefOr[Box] = js.undefined
  
  var titleFormat: js.UndefOr[js.Function1[/* x */ Any, Title]] = js.undefined
  
  var values: js.UndefOr[js.Array[Any]] = js.undefined
}
object CrosshairProps {
  
  inline def apply(): CrosshairProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairProps]
  }
  
  extension [Self <: CrosshairProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setInnerHeight(value: Double): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
    
    inline def setInnerHeightUndefined: Self = StObject.set(x, "innerHeight", js.undefined)
    
    inline def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    inline def setInnerWidthUndefined: Self = StObject.set(x, "innerWidth", js.undefined)
    
    inline def setItemsFormat(value: /* x */ Any => js.Array[Title]): Self = StObject.set(x, "itemsFormat", js.Any.fromFunction1(value))
    
    inline def setItemsFormatUndefined: Self = StObject.set(x, "itemsFormat", js.undefined)
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setOrientation(value: left | right): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setSeries(value: StringDictionary[Any]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setStyle(value: Box): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitleFormat(value: /* x */ Any => Title): Self = StObject.set(x, "titleFormat", js.Any.fromFunction1(value))
    
    inline def setTitleFormatUndefined: Self = StObject.set(x, "titleFormat", js.undefined)
    
    inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
