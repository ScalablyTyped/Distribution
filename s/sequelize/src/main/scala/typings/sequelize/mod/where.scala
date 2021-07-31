package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait where extends StObject {
  
  var attribute: js.Object
  
  var comparator: js.UndefOr[String] = js.undefined
  
  var logic: String | js.Object
}
object where {
  
  @scala.inline
  def apply(attribute: js.Object, logic: String | js.Object): where = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], logic = logic.asInstanceOf[js.Any])
    __obj.asInstanceOf[where]
  }
  
  @scala.inline
  implicit class whereMutableBuilder[Self <: where] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: js.Object): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparator(value: String): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    @scala.inline
    def setLogic(value: String | js.Object): Self = StObject.set(x, "logic", value.asInstanceOf[js.Any])
  }
}
