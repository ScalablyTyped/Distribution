package typings.rcFieldForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  var len: String
  
  var max: String
  
  var min: String
  
  var range: String
}
object Max {
  
  @scala.inline
  def apply(len: String, max: String, min: String, range: String): Max = {
    val __obj = js.Dynamic.literal(len = len.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  
  @scala.inline
  implicit class MaxMutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLen(value: String): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
