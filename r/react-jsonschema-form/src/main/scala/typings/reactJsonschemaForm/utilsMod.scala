package typings.reactJsonschemaForm

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema6
import typings.jsonSchema.mod.JSONSchema6Definition
import typings.jsonSchema.mod.JSONSchema6Type
import typings.jsonSchema.mod.JSONSchema6TypeName
import typings.react.mod.Component
import typings.reactJsonschemaForm.anon.Blob
import typings.reactJsonschemaForm.anon.Definitions
import typings.reactJsonschemaForm.anon.Label
import typings.reactJsonschemaForm.mod.IdSchema
import typings.reactJsonschemaForm.mod.PathSchema
import typings.reactJsonschemaForm.mod.UiSchema
import typings.reactJsonschemaForm.mod.Widget
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-jsonschema-form/lib/utils", "ADDITIONAL_PROPERTY_FLAG")
  @js.native
  val ADDITIONAL_PROPERTY_FLAG: String = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "allowAdditionalItems")
  @js.native
  def allowAdditionalItems(schema: JSONSchema6): Boolean = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "asNumber")
  @js.native
  def asNumber(): js.UndefOr[Double | String | Null] = js.native
  @JSImport("react-jsonschema-form/lib/utils", "asNumber")
  @js.native
  def asNumber(value: String): js.UndefOr[Double | String | Null] = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "computeDefaults")
  @js.native
  def computeDefaults[T](
    schema: JSONSchema6,
    parentDefaults: js.Array[js.UndefOr[JSONSchema6Type]],
    definitions: StringDictionary[js.Any]
  ): js.Array[js.UndefOr[JSONSchema6Type]] = js.native
  @JSImport("react-jsonschema-form/lib/utils", "computeDefaults")
  @js.native
  def computeDefaults[T](
    schema: JSONSchema6,
    parentDefaults: js.Array[js.UndefOr[JSONSchema6Type]],
    definitions: StringDictionary[js.Any],
    rawFormData: T
  ): js.Array[js.UndefOr[JSONSchema6Type]] = js.native
  @JSImport("react-jsonschema-form/lib/utils", "computeDefaults")
  @js.native
  def computeDefaults[T](
    schema: JSONSchema6,
    parentDefaults: js.Array[js.UndefOr[JSONSchema6Type]],
    definitions: StringDictionary[js.Any],
    rawFormData: T,
    includeUndefinedValues: Boolean
  ): js.Array[js.UndefOr[JSONSchema6Type]] = js.native
  @JSImport("react-jsonschema-form/lib/utils", "computeDefaults")
  @js.native
  def computeDefaults[T](
    schema: JSONSchema6,
    parentDefaults: js.Array[js.UndefOr[JSONSchema6Type]],
    definitions: StringDictionary[js.Any],
    rawFormData: js.UndefOr[scala.Nothing],
    includeUndefinedValues: Boolean
  ): js.Array[js.UndefOr[JSONSchema6Type]] = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "dataURItoBlob")
  @js.native
  def dataURItoBlob(dataURI: String): Blob = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "deepEquals")
  @js.native
  def deepEquals[T](a: T, b: T): Boolean = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "getDefaultFormState")
  @js.native
  def getDefaultFormState[T](schema: JSONSchema6, formData: T): T | js.Array[js.UndefOr[JSONSchema6Type]] = js.native
  @JSImport("react-jsonschema-form/lib/utils", "getDefaultFormState")
  @js.native
  def getDefaultFormState[T](
    schema: JSONSchema6,
    formData: T,
    definitions: js.UndefOr[scala.Nothing],
    includeUndefinedValues: Boolean
  ): T | js.Array[js.UndefOr[JSONSchema6Type]] = js.native
  @JSImport("react-jsonschema-form/lib/utils", "getDefaultFormState")
  @js.native
  def getDefaultFormState[T](schema: JSONSchema6, formData: T, definitions: StringDictionary[js.Any]): T | js.Array[js.UndefOr[JSONSchema6Type]] = js.native
  @JSImport("react-jsonschema-form/lib/utils", "getDefaultFormState")
  @js.native
  def getDefaultFormState[T](
    schema: JSONSchema6,
    formData: T,
    definitions: StringDictionary[js.Any],
    includeUndefinedValues: Boolean
  ): T | js.Array[js.UndefOr[JSONSchema6Type]] = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "getDefaultRegistry")
  @js.native
  def getDefaultRegistry(): Definitions = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "getMatchingOption")
  @js.native
  def getMatchingOption(formData: js.Any, options: js.Array[JSONSchema6], definitions: StringDictionary[js.Any]): Double = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "getSchemaType")
  @js.native
  def getSchemaType(schema: JSONSchema6): String = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "getUiOptions")
  @js.native
  def getUiOptions(uiSchema: UiSchema): js.UndefOr[StringDictionary[Boolean | Double | String | js.Object | js.Array[_] | Null]] = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "getWidget")
  @js.native
  def getWidget(schema: JSONSchema6, widget: String): Widget = js.native
  @JSImport("react-jsonschema-form/lib/utils", "getWidget")
  @js.native
  def getWidget(schema: JSONSchema6, widget: String, registeredWidgets: StringDictionary[Widget]): Widget = js.native
  @JSImport("react-jsonschema-form/lib/utils", "getWidget")
  @js.native
  def getWidget(schema: JSONSchema6, widget: Widget): Widget = js.native
  @JSImport("react-jsonschema-form/lib/utils", "getWidget")
  @js.native
  def getWidget(schema: JSONSchema6, widget: Widget, registeredWidgets: StringDictionary[Widget]): Widget = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "guessType")
  @js.native
  def guessType(value: js.Any): JSONSchema6TypeName = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "hasWidget")
  @js.native
  def hasWidget(schema: JSONSchema6, widget: String): Boolean = js.native
  @JSImport("react-jsonschema-form/lib/utils", "hasWidget")
  @js.native
  def hasWidget(schema: JSONSchema6, widget: String, registeredWidgets: StringDictionary[Widget]): Boolean = js.native
  @JSImport("react-jsonschema-form/lib/utils", "hasWidget")
  @js.native
  def hasWidget(schema: JSONSchema6, widget: Widget): Boolean = js.native
  @JSImport("react-jsonschema-form/lib/utils", "hasWidget")
  @js.native
  def hasWidget(schema: JSONSchema6, widget: Widget, registeredWidgets: StringDictionary[Widget]): Boolean = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "isConstant")
  @js.native
  def isConstant(schema: JSONSchema6): Boolean = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "isFilesArray")
  @js.native
  def isFilesArray(schema: JSONSchema6, uiSchema: UiSchema): Boolean = js.native
  @JSImport("react-jsonschema-form/lib/utils", "isFilesArray")
  @js.native
  def isFilesArray(schema: JSONSchema6, uiSchema: UiSchema, definitions: StringDictionary[js.Any]): Boolean = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "isFixedItems")
  @js.native
  def isFixedItems(schema: JSONSchema6): Boolean = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "isMultiSelect")
  @js.native
  def isMultiSelect(schema: JSONSchema6): Boolean = js.native
  @JSImport("react-jsonschema-form/lib/utils", "isMultiSelect")
  @js.native
  def isMultiSelect(schema: JSONSchema6, definitions: StringDictionary[js.Any]): Boolean = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "isObject")
  @js.native
  def isObject(thing: js.Any): Boolean = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "isSelect")
  @js.native
  def isSelect(_schema: JSONSchema6): Boolean = js.native
  @JSImport("react-jsonschema-form/lib/utils", "isSelect")
  @js.native
  def isSelect(_schema: JSONSchema6, definitions: StringDictionary[js.Any]): Boolean = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "mergeObjects")
  @js.native
  def mergeObjects(obj1: js.Object, obj2: js.Object): js.Object = js.native
  @JSImport("react-jsonschema-form/lib/utils", "mergeObjects")
  @js.native
  def mergeObjects(obj1: js.Object, obj2: js.Object, concatArrays: Boolean): js.Object = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "optionsList")
  @js.native
  def optionsList(schema: JSONSchema6): js.Array[Label] = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "orderProperties")
  @js.native
  def orderProperties(properties: js.Array[js.Any], order: js.Array[js.Any]): js.Array[js.Any] = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "pad")
  @js.native
  def pad(num: Double, size: Double): String = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "parseDateString")
  @js.native
  def parseDateString(dateString: String): DateObject = js.native
  @JSImport("react-jsonschema-form/lib/utils", "parseDateString")
  @js.native
  def parseDateString(dateString: String, includeTime: Boolean): DateObject = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "rangeSpec")
  @js.native
  def rangeSpec(schema: JSONSchema6): IRangeSpec = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "resolveSchema")
  @js.native
  def resolveSchema[T](schema: JSONSchema6Definition): JSONSchema6 = js.native
  @JSImport("react-jsonschema-form/lib/utils", "resolveSchema")
  @js.native
  def resolveSchema[T](schema: JSONSchema6Definition, definitions: js.UndefOr[scala.Nothing], formData: T): JSONSchema6 = js.native
  @JSImport("react-jsonschema-form/lib/utils", "resolveSchema")
  @js.native
  def resolveSchema[T](schema: JSONSchema6Definition, definitions: StringDictionary[js.Any]): JSONSchema6 = js.native
  @JSImport("react-jsonschema-form/lib/utils", "resolveSchema")
  @js.native
  def resolveSchema[T](schema: JSONSchema6Definition, definitions: StringDictionary[js.Any], formData: T): JSONSchema6 = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "retrieveSchema")
  @js.native
  def retrieveSchema[T](schema: JSONSchema6Definition): JSONSchema6 = js.native
  @JSImport("react-jsonschema-form/lib/utils", "retrieveSchema")
  @js.native
  def retrieveSchema[T](schema: JSONSchema6Definition, definitions: js.UndefOr[scala.Nothing], formData: T): JSONSchema6 = js.native
  @JSImport("react-jsonschema-form/lib/utils", "retrieveSchema")
  @js.native
  def retrieveSchema[T](schema: JSONSchema6Definition, definitions: StringDictionary[js.Any]): JSONSchema6 = js.native
  @JSImport("react-jsonschema-form/lib/utils", "retrieveSchema")
  @js.native
  def retrieveSchema[T](schema: JSONSchema6Definition, definitions: StringDictionary[js.Any], formData: T): JSONSchema6 = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "setState")
  @js.native
  def setState(instance: Component[js.Object, js.Object, _], state: js.Any, callback: js.Function): Unit = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "shouldRender")
  @js.native
  def shouldRender(comp: Component[js.Object, js.Object, _], nextProps: js.Any, nextState: js.Any): Boolean = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "stubExistingAdditionalProperties")
  @js.native
  def stubExistingAdditionalProperties[T](schema: JSONSchema6): JSONSchema6 = js.native
  @JSImport("react-jsonschema-form/lib/utils", "stubExistingAdditionalProperties")
  @js.native
  def stubExistingAdditionalProperties[T](schema: JSONSchema6, definitions: js.UndefOr[scala.Nothing], formData: T): JSONSchema6 = js.native
  @JSImport("react-jsonschema-form/lib/utils", "stubExistingAdditionalProperties")
  @js.native
  def stubExistingAdditionalProperties[T](schema: JSONSchema6, definitions: StringDictionary[js.Any]): JSONSchema6 = js.native
  @JSImport("react-jsonschema-form/lib/utils", "stubExistingAdditionalProperties")
  @js.native
  def stubExistingAdditionalProperties[T](schema: JSONSchema6, definitions: StringDictionary[js.Any], formData: T): JSONSchema6 = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "toConstant")
  @js.native
  def toConstant(schema: JSONSchema6): js.UndefOr[JSONSchema6Type | Error] = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "toDateString")
  @js.native
  def toDateString(dateObject: DateObject): String = js.native
  @JSImport("react-jsonschema-form/lib/utils", "toDateString")
  @js.native
  def toDateString(dateObject: DateObject, time: Boolean): String = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "toIdSchema")
  @js.native
  def toIdSchema[T](schema: JSONSchema6Definition, id: String, definitions: StringDictionary[js.Any]): IdSchema[_] | js.Array[IdSchema[_]] = js.native
  @JSImport("react-jsonschema-form/lib/utils", "toIdSchema")
  @js.native
  def toIdSchema[T](schema: JSONSchema6Definition, id: String, definitions: StringDictionary[js.Any], formData: T): IdSchema[_] | js.Array[IdSchema[_]] = js.native
  @JSImport("react-jsonschema-form/lib/utils", "toIdSchema")
  @js.native
  def toIdSchema[T](
    schema: JSONSchema6Definition,
    id: String,
    definitions: StringDictionary[js.Any],
    formData: T,
    idPredix: String
  ): IdSchema[_] | js.Array[IdSchema[_]] = js.native
  @JSImport("react-jsonschema-form/lib/utils", "toIdSchema")
  @js.native
  def toIdSchema[T](
    schema: JSONSchema6Definition,
    id: String,
    definitions: StringDictionary[js.Any],
    formData: js.UndefOr[scala.Nothing],
    idPredix: String
  ): IdSchema[_] | js.Array[IdSchema[_]] = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "toPathSchema")
  @js.native
  def toPathSchema[T](
    schema: JSONSchema6Definition,
    name: js.UndefOr[scala.Nothing],
    definitions: StringDictionary[js.Any]
  ): PathSchema[_] | js.Array[PathSchema[_]] = js.native
  @JSImport("react-jsonschema-form/lib/utils", "toPathSchema")
  @js.native
  def toPathSchema[T](
    schema: JSONSchema6Definition,
    name: js.UndefOr[scala.Nothing],
    definitions: StringDictionary[js.Any],
    formData: T
  ): PathSchema[_] | js.Array[PathSchema[_]] = js.native
  @JSImport("react-jsonschema-form/lib/utils", "toPathSchema")
  @js.native
  def toPathSchema[T](schema: JSONSchema6Definition, name: String, definitions: StringDictionary[js.Any]): PathSchema[_] | js.Array[PathSchema[_]] = js.native
  @JSImport("react-jsonschema-form/lib/utils", "toPathSchema")
  @js.native
  def toPathSchema[T](schema: JSONSchema6Definition, name: String, definitions: StringDictionary[js.Any], formData: T): PathSchema[_] | js.Array[PathSchema[_]] = js.native
  
  @js.native
  trait DateObject extends StObject {
    
    var day: Double = js.native
    
    var hour: Double = js.native
    
    var minute: Double = js.native
    
    var month: Double = js.native
    
    var second: Double = js.native
    
    var year: Double = js.native
  }
  object DateObject {
    
    @scala.inline
    def apply(day: Double, hour: Double, minute: Double, month: Double, second: Double, year: Double): DateObject = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateObject]
    }
    
    @scala.inline
    implicit class DateObjectMutableBuilder[Self <: DateObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IRangeSpec extends StObject {
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var step: js.UndefOr[Double] = js.native
  }
  object IRangeSpec {
    
    @scala.inline
    def apply(): IRangeSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRangeSpec]
    }
    
    @scala.inline
    implicit class IRangeSpecMutableBuilder[Self <: IRangeSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
