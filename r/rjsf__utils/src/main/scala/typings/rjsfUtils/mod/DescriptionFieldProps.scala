package typings.rjsfUtils.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to a `DescriptionFieldTemplate` implementation */
trait DescriptionFieldProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
  
  /** The description of the field being rendered */
  var description: String | ReactElement
  
  /** The id of the field description in the hierarchy */
  var id: String
  
  /** The `registry` object */
  var registry: Registry[T, S, F]
  
  /** The schema object for the field being described */
  var schema: S
  
  /** The uiSchema object for this description field */
  var uiSchema: js.UndefOr[UiSchema[T, S, F]] = js.undefined
}
object DescriptionFieldProps {
  
  inline def apply[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](description: String | ReactElement, id: String, registry: Registry[T, S, F], schema: S): DescriptionFieldProps[T, S, F] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionFieldProps[T, S, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptionFieldProps[?, ?, ?], T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] (val x: Self & (DescriptionFieldProps[T, S, F])) extends AnyVal {
    
    inline def setDescription(value: String | ReactElement): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, S, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, S, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
