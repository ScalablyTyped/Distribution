package typings.rjsfUtils.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to an `FieldHelpTemplate` implementation */
trait FieldHelpProps[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
  
  /** Flag indicating whether there are errors associated with this field */
  var hasErrors: js.UndefOr[Boolean] = js.undefined
  
  /** The help information to be rendered */
  var help: js.UndefOr[String | ReactElement] = js.undefined
  
  /** The tree of unique ids for every child field */
  var idSchema: IdSchema[T]
  
  /** The `registry` object */
  var registry: Registry[T, S, F]
  
  /** The schema that was passed to field */
  var schema: S
  
  /** The uiSchema that was passed to field */
  var uiSchema: js.UndefOr[UiSchema[T, S, F]] = js.undefined
}
object FieldHelpProps {
  
  inline def apply[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */](idSchema: IdSchema[T], registry: Registry[T, S, F], schema: S): FieldHelpProps[T, S, F] = {
    val __obj = js.Dynamic.literal(idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldHelpProps[T, S, F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldHelpProps[?, ?, ?], T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] (val x: Self & (FieldHelpProps[T, S, F])) extends AnyVal {
    
    inline def setHasErrors(value: Boolean): Self = StObject.set(x, "hasErrors", value.asInstanceOf[js.Any])
    
    inline def setHasErrorsUndefined: Self = StObject.set(x, "hasErrors", js.undefined)
    
    inline def setHelp(value: String | ReactElement): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setIdSchema(value: IdSchema[T]): Self = StObject.set(x, "idSchema", value.asInstanceOf[js.Any])
    
    inline def setRegistry(value: Registry[T, S, F]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setUiSchema(value: UiSchema[T, S, F]): Self = StObject.set(x, "uiSchema", value.asInstanceOf[js.Any])
    
    inline def setUiSchemaUndefined: Self = StObject.set(x, "uiSchema", js.undefined)
  }
}
