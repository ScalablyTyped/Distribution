package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharRange extends StObject {
  
  var qCharCount: Double
  
  var qCharPos: Double
}
object CharRange {
  
  @scala.inline
  def apply(qCharCount: Double, qCharPos: Double): CharRange = {
    val __obj = js.Dynamic.literal(qCharCount = qCharCount.asInstanceOf[js.Any], qCharPos = qCharPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharRange]
  }
  
  @scala.inline
  implicit class CharRangeMutableBuilder[Self <: CharRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQCharCount(value: Double): Self = StObject.set(x, "qCharCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCharPos(value: Double): Self = StObject.set(x, "qCharPos", value.asInstanceOf[js.Any])
  }
}
