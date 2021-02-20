package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
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
  implicit class TextLayoutEventDataMutableBuilder[Self <: TextLayoutEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLines(value: js.Array[TextLayoutLine]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesVarargs(value: TextLayoutLine*): Self = StObject.set(x, "lines", js.Array(value :_*))
  }
}
