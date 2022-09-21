package typings.rjsfUtils.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties of each element in the ObjectFieldTemplateProps.properties array */
trait ObjectFieldTemplatePropertyType extends StObject {
  
  /** The html for the property's content */
  var content: ReactElement
  
  /** A boolean value stating if the object property is disabled */
  var disabled: Boolean
  
  /** A boolean value stating if the property should be hidden */
  var hidden: Boolean
  
  /** A string representing the property name */
  var name: String
  
  /** A boolean value stating if the property is read-only */
  var readonly: Boolean
}
object ObjectFieldTemplatePropertyType {
  
  inline def apply(content: ReactElement, disabled: Boolean, hidden: Boolean, name: String, readonly: Boolean): ObjectFieldTemplatePropertyType = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectFieldTemplatePropertyType]
  }
  
  extension [Self <: ObjectFieldTemplatePropertyType](x: Self) {
    
    inline def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
  }
}
