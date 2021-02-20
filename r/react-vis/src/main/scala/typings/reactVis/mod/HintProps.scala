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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HintProps extends StObject {
  
  // default: {}
  var align: js.UndefOr[Vertical] = js.native
  
  var format: js.UndefOr[js.Function1[/* x */ js.Any, js.Array[Title]]] = js.native
  
  // default: {'horizontal':'auto','vertical':'auto'}
  var getAlignStyle: js.UndefOr[RVGetAlignStyle] = js.native
  
  var innerHeight: js.UndefOr[Double] = js.native
  
  var innerWidth: js.UndefOr[Double] = js.native
  
  var marginLeft: js.UndefOr[Double] = js.native
  
  var marginTop: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[bottomleft | bottomright | topleft | topright] = js.native
  
  var scales: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var value: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object HintProps {
  
  @scala.inline
  def apply(): HintProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HintProps]
  }
  
  @scala.inline
  implicit class HintPropsMutableBuilder[Self <: HintProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: Vertical): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setFormat(value: /* x */ js.Any => js.Array[Title]): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGetAlignStyle(value: (/* align */ Horizontal, /* x */ Double, /* y */ Double) => CSSProperties): Self = StObject.set(x, "getAlignStyle", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetAlignStyleUndefined: Self = StObject.set(x, "getAlignStyle", js.undefined)
    
    @scala.inline
    def setInnerHeight(value: Double): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerHeightUndefined: Self = StObject.set(x, "innerHeight", js.undefined)
    
    @scala.inline
    def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerWidthUndefined: Self = StObject.set(x, "innerWidth", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    @scala.inline
    def setOrientation(value: bottomleft | bottomright | topleft | topright): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setScales(value: StringDictionary[js.Any]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setValue(value: StringDictionary[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
