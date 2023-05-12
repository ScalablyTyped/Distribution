package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to a `TitleFieldTemplate` implementation */
trait TitleFieldProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
  
  /** The id of the field title in the hierarchy */
  var id: String
  
  /** The `registry` object */
  var registry: Registry[T, S, F]
  
  /** A boolean value stating if the field is required */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /** The schema object for the field being titled */
  var schema: S
  
  /** The title for the field being rendered */
  var title: String
  
  /** The uiSchema object for this title field */
  var uiSchema: js.UndefOr[UiSchema[T, S, F]] = js.undefined
}
object TitleFieldProps {
  
  inline def apply[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](id: String, registry: Registry[T, S, F], schema: S, title: String): TitleFieldProps[T, S, F] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleFieldProps[T, S, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TitleFieldProps[?, ?, ?], T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] (val x: Self & (TitleFieldProps[T, S, F])) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, S, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, S, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
