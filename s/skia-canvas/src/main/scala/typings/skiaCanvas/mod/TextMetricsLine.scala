package typings.skiaCanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextMetricsLine extends js.Object {
  
  var baseline: Double = js.native
  
  var endIndex: Double = js.native
  
  var height: Double = js.native
  
  var startIndex: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object TextMetricsLine {
  
  @scala.inline
  def apply(baseline: Double, endIndex: Double, height: Double, startIndex: Double, x: Double, y: Double): TextMetricsLine = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], endIndex = endIndex.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMetricsLine]
  }
  
  @scala.inline
  implicit class TextMetricsLineOps[Self <: TextMetricsLine] (val x: Self) extends AnyVal {
    
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
    def setBaseline(value: Double): Self = this.set("baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
