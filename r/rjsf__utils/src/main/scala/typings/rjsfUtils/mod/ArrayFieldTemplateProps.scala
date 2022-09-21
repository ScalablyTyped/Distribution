package typings.rjsfUtils.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The properties that are passed to an ArrayFieldTemplate implementation */
@js.native
trait ArrayFieldTemplateProps[T, F] extends StObject {
  
  /** A boolean value stating whether new elements can be added to the array */
  var canAdd: js.UndefOr[Boolean] = js.native
  
  /** The className string */
  var className: js.UndefOr[String] = js.native
  
  /** A boolean value stating if the array is disabled */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /** The `formContext` object that was passed to Form */
  var formContext: js.UndefOr[F] = js.native
  
  /** The formData for this array */
  var formData: T = js.native
  
  /** A boolean value stating if the field is hiding its errors */
  var hideError: js.UndefOr[Boolean] = js.native
  
  /** An object containing the id for this object & ids for its properties */
  var idSchema: IdSchema[T] = js.native
  
  /** An array of objects representing the items in the array */
  var items: js.Array[ArrayFieldTemplateItemType[T, F]] = js.native
  
  /** A function that adds a new item to the array */
  def onAddClick(): Unit = js.native
  def onAddClick(event: Any): Unit = js.native
  
  /** An array of strings listing all generated error messages from encountered errors for this widget */
  var rawErrors: js.UndefOr[js.Array[String]] = js.native
  
  /** A boolean value stating if the array is read-only */
  var readonly: js.UndefOr[Boolean] = js.native
  
  /** The `registry` object */
  var registry: Registry[T, F] = js.native
  
  /** A boolean value stating if the array is required */
  var required: js.UndefOr[Boolean] = js.native
  
  /** The schema object for this array */
  var schema: RJSFSchema = js.native
  
  /** A string value containing the title for the array */
  var title: String = js.native
  
  /** The uiSchema object for this array field */
  var uiSchema: js.UndefOr[UiSchema[T, F]] = js.native
}
