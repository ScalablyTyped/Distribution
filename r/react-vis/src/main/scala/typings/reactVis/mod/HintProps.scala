package typings.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.reactVis.anon.Horizontal
import typings.reactVis.anon.Title
import typings.reactVis.anon.Vertical
import typings.reactVis.reactVisStrings.bottomleft
import typings.reactVis.reactVisStrings.bottomright
import typings.reactVis.reactVisStrings.topleft
import typings.reactVis.reactVisStrings.topright
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HintProps extends StObject {
  
  // default: {}
  var align: js.UndefOr[Vertical] = js.undefined
  
  var format: js.UndefOr[js.Function1[/* x */ Any, js.Array[Title]]] = js.undefined
  
  // default: {'horizontal':'auto','vertical':'auto'}
  var getAlignStyle: js.UndefOr[RVGetAlignStyle] = js.undefined
  
  var innerHeight: js.UndefOr[Double] = js.undefined
  
  var innerWidth: js.UndefOr[Double] = js.undefined
  
  var marginLeft: js.UndefOr[Double] = js.undefined
  
  var marginTop: js.UndefOr[Double] = js.undefined
  
  var orientation: js.UndefOr[bottomleft | bottomright | topleft | topright] = js.undefined
  
  var scales: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var value: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object HintProps {
  
  inline def apply(): HintProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HintProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HintProps] (val x: Self) extends AnyVal {
    
    inline def setAlign(value: Vertical): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setFormat(value: /* x */ Any => js.Array[Title]): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGetAlignStyle(value: (/* align */ Horizontal, /* x */ Double, /* y */ Double) => CSSProperties): Self = StObject.set(x, "getAlignStyle", js.Any.fromFunction3(value))
    
    inline def setGetAlignStyleUndefined: Self = StObject.set(x, "getAlignStyle", js.undefined)
    
    inline def setInnerHeight(value: Double): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
    
    inline def setInnerHeightUndefined: Self = StObject.set(x, "innerHeight", js.undefined)
    
    inline def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    inline def setInnerWidthUndefined: Self = StObject.set(x, "innerWidth", js.undefined)
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setOrientation(value: bottomleft | bottomright | topleft | topright): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setScales(value: StringDictionary[Any]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    
    inline def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setValue(value: StringDictionary[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
