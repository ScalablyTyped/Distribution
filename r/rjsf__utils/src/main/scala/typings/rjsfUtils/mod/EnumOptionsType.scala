package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This type represents an element used to render an enum option */
trait EnumOptionsType extends StObject {
  
  /** The label for the enum options */
  var label: String
  
  /** The schema associated with the enum option when the option represents a `oneOf` or `anyOf` choice */
  var schema: js.UndefOr[RJSFSchema] = js.undefined
  
  /** The value for the enum option */
  var value: Any
}
object EnumOptionsType {
  
  inline def apply(label: String, value: Any): EnumOptionsType = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumOptionsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumOptionsType] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: RJSFSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
