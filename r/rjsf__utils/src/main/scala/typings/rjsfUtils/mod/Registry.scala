package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The object containing the registered core, theme and custom fields and widgets as well as the root schema, form
  * context, schema utils and templates.
  */
@js.native
trait Registry[T, S /* <: StrictRJSFSchema */, F /* <: FormContextType */] extends StObject {
  
  /** The set of all fields used by the `Form`. Includes fields from `core`, theme-specific fields and any custom
    * registered fields
    */
  var fields: RegistryFieldsType[T, S, F] = js.native
  
  /** The `formContext` object that was passed to `Form` */
  var formContext: F = js.native
  
  /** The optional global UI Options that are available for all templates, fields and widgets to access */
  var globalUiOptions: js.UndefOr[GlobalUISchemaOptions] = js.native
  
  /** The root schema, as passed to the `Form`, which can contain referenced definitions */
  var rootSchema: S = js.native
  
  /** The current implementation of the `SchemaUtilsType` (from `@rjsf/utils`) in use by the `Form`.  Used to call any
    * of the validation-schema-based utility functions
    */
  var schemaUtils: SchemaUtilsType[T, S, Any] = js.native
  
  /** The set of templates used by the `Form`. Includes templates from `core`, theme-specific fields and any custom
    * registered templates
    */
  var templates: TemplatesType[T, S, F] = js.native
  
  /** The string translation function to use when displaying any of the RJSF strings in templates, fields or widgets */
  def translateString(stringKey: TranslatableString): String = js.native
  def translateString(stringKey: TranslatableString, params: js.Array[String]): String = js.native
  
  /** The set of all widgets used by the `Form`. Includes widgets from `core`, theme-specific widgets and any custom
    * registered widgets
    */
  var widgets: RegistryWidgetsType[T, S, F] = js.native
}
