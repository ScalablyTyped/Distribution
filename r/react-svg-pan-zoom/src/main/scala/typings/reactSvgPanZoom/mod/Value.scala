package typings.reactSvgPanZoom.mod

import typings.reactSvgPanZoom.reactSvgPanZoomNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends js.Object {
  
  var SVGHeight: Double = js.native
  
  var SVGWidth: Double = js.native
  
  var a: Double = js.native
  
  var b: Double = js.native
  
  var c: Double = js.native
  
  var d: Double = js.native
  
  var e: Double = js.native
  
  var endX: js.UndefOr[Double | Null] = js.native
  
  var endY: js.UndefOr[Double | Null] = js.native
  
  var f: Double = js.native
  
  var focus: Boolean = js.native
  
  var miniatureOpen: Boolean = js.native
  
  var mode: Mode = js.native
  
  var startX: js.UndefOr[Double | Null] = js.native
  
  var startY: js.UndefOr[Double | Null] = js.native
  
  var version: `2` = js.native
  
  var viewerHeight: Double = js.native
  
  var viewerWidth: Double = js.native
}
object Value {
  
  @scala.inline
  def apply(
    SVGHeight: Double,
    SVGWidth: Double,
    a: Double,
    b: Double,
    c: Double,
    d: Double,
    e: Double,
    f: Double,
    focus: Boolean,
    miniatureOpen: Boolean,
    mode: Mode,
    version: `2`,
    viewerHeight: Double,
    viewerWidth: Double
  ): Value = {
    val __obj = js.Dynamic.literal(SVGHeight = SVGHeight.asInstanceOf[js.Any], SVGWidth = SVGWidth.asInstanceOf[js.Any], a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], miniatureOpen = miniatureOpen.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], viewerHeight = viewerHeight.asInstanceOf[js.Any], viewerWidth = viewerWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    
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
    def setSVGHeight(value: Double): Self = this.set("SVGHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSVGWidth(value: Double): Self = this.set("SVGWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA(value: Double): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: Double): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: Double): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: Double): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: Double): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(value: Double): Self = this.set("f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiniatureOpen(value: Boolean): Self = this.set("miniatureOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: `2`): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewerHeight(value: Double): Self = this.set("viewerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewerWidth(value: Double): Self = this.set("viewerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndX(value: Double): Self = this.set("endX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndX: Self = this.set("endX", js.undefined)
    
    @scala.inline
    def setEndXNull: Self = this.set("endX", null)
    
    @scala.inline
    def setEndY(value: Double): Self = this.set("endY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndY: Self = this.set("endY", js.undefined)
    
    @scala.inline
    def setEndYNull: Self = this.set("endY", null)
    
    @scala.inline
    def setStartX(value: Double): Self = this.set("startX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartX: Self = this.set("startX", js.undefined)
    
    @scala.inline
    def setStartXNull: Self = this.set("startX", null)
    
    @scala.inline
    def setStartY(value: Double): Self = this.set("startY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartY: Self = this.set("startY", js.undefined)
    
    @scala.inline
    def setStartYNull: Self = this.set("startY", null)
  }
}
