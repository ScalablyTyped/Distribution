package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticRangeInit extends StObject {
  
  var endContainer: Node = js.native
  
  var endOffset: Double = js.native
  
  var startContainer: Node = js.native
  
  var startOffset: Double = js.native
}
object StaticRangeInit {
  
  @scala.inline
  def apply(endContainer: Node, endOffset: Double, startContainer: Node, startOffset: Double): StaticRangeInit = {
    val __obj = js.Dynamic.literal(endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticRangeInit]
  }
  
  @scala.inline
  implicit class StaticRangeInitMutableBuilder[Self <: StaticRangeInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndContainer(value: Node): Self = StObject.set(x, "endContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartContainer(value: Node): Self = StObject.set(x, "startContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
