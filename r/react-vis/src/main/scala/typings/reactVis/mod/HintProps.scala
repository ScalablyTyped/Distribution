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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HintProps extends js.Object {
  
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
  implicit class HintPropsOps[Self <: HintProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlign(value: Vertical): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setFormat(value: /* x */ js.Any => js.Array[Title]): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGetAlignStyle(value: (/* align */ Horizontal, /* x */ Double, /* y */ Double) => CSSProperties): Self = this.set("getAlignStyle", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGetAlignStyle: Self = this.set("getAlignStyle", js.undefined)
    
    @scala.inline
    def setInnerHeight(value: Double): Self = this.set("innerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerHeight: Self = this.set("innerHeight", js.undefined)
    
    @scala.inline
    def setInnerWidth(value: Double): Self = this.set("innerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerWidth: Self = this.set("innerWidth", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setOrientation(value: bottomleft | bottomright | topleft | topright): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setScales(value: StringDictionary[js.Any]): Self = this.set("scales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScales: Self = this.set("scales", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setValue(value: StringDictionary[js.Any]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
