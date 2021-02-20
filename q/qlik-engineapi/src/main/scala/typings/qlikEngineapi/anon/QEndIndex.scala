package typings.qlikEngineapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QEndIndex extends StObject {
  
  var qEndIndex: Double = js.native
  
  var qStartIndex: Double = js.native
}
object QEndIndex {
  
  @scala.inline
  def apply(qEndIndex: Double, qStartIndex: Double): QEndIndex = {
    val __obj = js.Dynamic.literal(qEndIndex = qEndIndex.asInstanceOf[js.Any], qStartIndex = qStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[QEndIndex]
  }
  
  @scala.inline
  implicit class QEndIndexMutableBuilder[Self <: QEndIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQEndIndex(value: Double): Self = StObject.set(x, "qEndIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStartIndex(value: Double): Self = StObject.set(x, "qStartIndex", value.asInstanceOf[js.Any])
  }
}
