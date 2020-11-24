package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextLayoutEventData extends TargetedEvent {
  
  var lines: js.Array[TextLayoutLine] = js.native
}
object TextLayoutEventData {
  
  @scala.inline
  def apply(lines: js.Array[TextLayoutLine], target: Double): TextLayoutEventData = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextLayoutEventData]
  }
  
  @scala.inline
  implicit class TextLayoutEventDataOps[Self <: TextLayoutEventData] (val x: Self) extends AnyVal {
    
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
    def setLinesVarargs(value: TextLayoutLine*): Self = this.set("lines", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[TextLayoutLine]): Self = this.set("lines", value.asInstanceOf[js.Any])
  }
}
