package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EditingConfig definitions
  */
trait AttributeValue extends StObject {
  
  var title: String
  
  var value: String
}
object AttributeValue {
  
  @scala.inline
  def apply(title: String, value: String): AttributeValue = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeValue]
  }
  
  @scala.inline
  implicit class AttributeValueMutableBuilder[Self <: AttributeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
