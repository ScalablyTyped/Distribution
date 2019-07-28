package typings.reactDashJsonschemaDashForm.libUtilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6Definition
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6Type
import typings.react.reactMod.Component
import typings.reactDashJsonschemaDashForm.Anon_Blob
import typings.reactDashJsonschemaDashForm.Anon_Definitions
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.UiSchema
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.Widget
import typings.std.Error
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ADDITIONAL_PROPERTY_FLAG: String = js.native
  def asNumber(value: js.Any): Number | String = js.native
  def computeDefaults[T](
    schema: JSONSchema6,
    parentDefaults: js.Array[js.UndefOr[JSONSchema6Type]],
    definitions: StringDictionary[js.Any],
    rawFormData: T
  ): js.Array[js.UndefOr[JSONSchema6Type]] = js.native
  def dataURItoBlob(dataURI: String): Anon_Blob = js.native
  def getDefaultFormState[T](schema: JSONSchema6, formData: T, definitions: StringDictionary[js.Any]): T | js.Array[js.UndefOr[JSONSchema6Type]] = js.native
  def getDefaultRegistry(): Anon_Definitions = js.native
  def getSchemaType(schema: JSONSchema6): String = js.native
  def getUiOptions(uiSchema: UiSchema): js.UndefOr[StringDictionary[Boolean | Double | String | js.Object | js.Array[_] | Null]] = js.native
  def getWidget(schema: JSONSchema6, widget: Widget, registeredWidgets: StringDictionary[Widget]): Widget | Error = js.native
  def guessType(value: js.Any): String = js.native
  def hasWidget(schema: JSONSchema6, wdiget: Widget, registeredWidgets: StringDictionary[Widget]): Boolean = js.native
  def isConstant(schema: JSONSchema6): Boolean = js.native
  def isMultiSelect(schema: JSONSchema6, definitions: StringDictionary[js.Any]): Boolean = js.native
  def isObject(thing: js.Any): Boolean = js.native
  def isSelect(_schema: JSONSchema6, definitions: StringDictionary[js.Any]): Boolean = js.native
  def mergeObjects(obj1: js.Object, obj2: js.Object, concatArrays: Boolean): js.Object = js.native
  def orderProperties(properties: js.Array[js.Any], order: js.Array[js.Any]): js.Array[js.Any] = js.native
  def rangeSpec(schema: JSONSchema6): IRangeSpec = js.native
  def resolveSchema[T](schema: JSONSchema6Definition, definitions: StringDictionary[js.Any], formData: T): JSONSchema6 = js.native
  def setState(instance: Component[js.Object, js.Object, _], state: js.Any, callback: js.Function): Unit = js.native
  def shouldRender(comp: Component[js.Object, js.Object, _], nextProps: js.Any, nextState: js.Any): Boolean = js.native
  def toConstant(schema: JSONSchema6): js.UndefOr[JSONSchema6Type | Error] = js.native
}

