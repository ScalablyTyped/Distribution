package typings
package reactDashJsonschemaDashFormLib.libUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ADDITIONAL_PROPERTY_FLAG: java.lang.String = js.native
  def asNumber(value: js.Any): stdLib.Number | java.lang.String = js.native
  def computeDefaults[T](
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6,
    parentDefaults: js.Array[js.UndefOr[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6Type]],
    definitions: org.scalablytyped.runtime.StringDictionary[js.Any],
    rawFormData: T
  ): js.Array[js.UndefOr[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6Type]] = js.native
  def dataURItoBlob(dataURI: java.lang.String): reactDashJsonschemaDashFormLib.Anon_Blob = js.native
  def getDefaultFormState[T](
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6,
    formData: T,
    definitions: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): T | js.Array[js.UndefOr[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6Type]] = js.native
  def getDefaultRegistry(): reactDashJsonschemaDashFormLib.Anon_Definitions = js.native
  def getSchemaType(schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6): java.lang.String = js.native
  def getUiOptions(uiSchema: reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod.UiSchema): js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      scala.Boolean | scala.Double | java.lang.String | js.Object | js.Array[_] | scala.Null
    ]
  ] = js.native
  def getWidget(
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6,
    widget: reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod.Widget,
    registeredWidgets: org.scalablytyped.runtime.StringDictionary[reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod.Widget]
  ): reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod.Widget | stdLib.Error = js.native
  def guessType(value: js.Any): java.lang.String = js.native
  def hasWidget(
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6,
    wdiget: reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod.Widget,
    registeredWidgets: org.scalablytyped.runtime.StringDictionary[reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod.Widget]
  ): scala.Boolean = js.native
  def isConstant(schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6): scala.Boolean = js.native
  def isMultiSelect(
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6,
    definitions: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Boolean = js.native
  def isObject(thing: js.Any): scala.Boolean = js.native
  def isSelect(
    _schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6,
    definitions: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): scala.Boolean = js.native
  def mergeObjects(obj1: js.Object, obj2: js.Object, concatArrays: scala.Boolean): js.Object = js.native
  def orderProperties(properties: js.Array[js.Any], order: js.Array[js.Any]): js.Array[js.Any] = js.native
  def rangeSpec(schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6): IRangeSpec = js.native
  def resolveSchema[T](
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6Definition,
    definitions: org.scalablytyped.runtime.StringDictionary[js.Any],
    formData: T
  ): jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6 = js.native
  def setState(
    instance: reactLib.reactMod.Component[js.Object, js.Object, _],
    state: js.Any,
    callback: js.Function
  ): scala.Unit = js.native
  def shouldRender(comp: reactLib.reactMod.Component[js.Object, js.Object, _], nextProps: js.Any, nextState: js.Any): scala.Boolean = js.native
  def toConstant(schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6): js.UndefOr[jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6Type | stdLib.Error] = js.native
}

