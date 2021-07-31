package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldRange extends StObject {
  
  var oldRange: js.Any
  
  var range: js.Any
  
  var source: String
}
object OldRange {
  
  @scala.inline
  def apply(oldRange: js.Any, range: js.Any, source: String): OldRange = {
    val __obj = js.Dynamic.literal(oldRange = oldRange.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldRange]
  }
  
  @scala.inline
  implicit class OldRangeMutableBuilder[Self <: OldRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldRange(value: js.Any): Self = StObject.set(x, "oldRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: js.Any): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
