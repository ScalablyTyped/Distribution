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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("react-jsonschema-form/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-jsonschema-form/lib/utils", "ADDITIONAL_PROPERTY_FLAG")
  @js.native
  val ADDITIONAL_PROPERTY_FLAG: String = js.native
  
  inline def allowAdditionalItems(schema: JSONSchema6): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAdditionalItems")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def asNumber(): js.UndefOr[Double | String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("asNumber")().asInstanceOf[js.UndefOr[Double | String | Null]]
  inline def asNumber(value: String): js.UndefOr[Double | String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("asNumber")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | String | Null]]
  
  inline def computeDefaults[T](
    schema: JSONSchema6,
    parentDefaults: js.Array[js.UndefOr[JSONSchema6Type]],
    definitions: StringDictionary[Any]
  ): js.Array[js.UndefOr[JSONSchema6Type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDefaults")(schema.asInstanceOf[js.Any], parentDefaults.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.UndefOr[JSONSchema6Type]]]
  inline def computeDefaults[T](
    schema: JSONSchema6,
    parentDefaults: js.Array[js.UndefOr[JSONSchema6Type]],
    definitions: StringDictionary[Any],
    rawFormData: T
  ): js.Array[js.UndefOr[JSONSchema6Type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDefaults")(schema.asInstanceOf[js.Any], parentDefaults.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], rawFormData.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.UndefOr[JSONSchema6Type]]]
  inline def computeDefaults[T](
    schema: JSONSchema6,
    parentDefaults: js.Array[js.UndefOr[JSONSchema6Type]],
    definitions: StringDictionary[Any],
    rawFormData: T,
    includeUndefinedValues: Boolean
  ): js.Array[js.UndefOr[JSONSchema6Type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDefaults")(schema.asInstanceOf[js.Any], parentDefaults.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], rawFormData.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.UndefOr[JSONSchema6Type]]]
  inline def computeDefaults[T](
    schema: JSONSchema6,
    parentDefaults: js.Array[js.UndefOr[JSONSchema6Type]],
    definitions: StringDictionary[Any],
    rawFormData: Unit,
    includeUndefinedValues: Boolean
  ): js.Array[js.UndefOr[JSONSchema6Type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDefaults")(schema.asInstanceOf[js.Any], parentDefaults.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], rawFormData.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.UndefOr[JSONSchema6Type]]]
  
  inline def dataURItoBlob(dataURI: String): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("dataURItoBlob")(dataURI.asInstanceOf[js.Any]).asInstanceOf[Blob]
  
  inline def deepEquals[T](a: T, b: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deepEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getDefaultFormState[T](schema: JSONSchema6, formData: T): T | js.Array[js.UndefOr[JSONSchema6Type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(schema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[T | js.Array[js.UndefOr[JSONSchema6Type]]]
  inline def getDefaultFormState[T](schema: JSONSchema6, formData: T, definitions: StringDictionary[Any]): T | js.Array[js.UndefOr[JSONSchema6Type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(schema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[T | js.Array[js.UndefOr[JSONSchema6Type]]]
  inline def getDefaultFormState[T](
    schema: JSONSchema6,
    formData: T,
    definitions: StringDictionary[Any],
    includeUndefinedValues: Boolean
  ): T | js.Array[js.UndefOr[JSONSchema6Type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(schema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[T | js.Array[js.UndefOr[JSONSchema6Type]]]
  inline def getDefaultFormState[T](schema: JSONSchema6, formData: T, definitions: Unit, includeUndefinedValues: Boolean): T | js.Array[js.UndefOr[JSONSchema6Type]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFormState")(schema.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], includeUndefinedValues.asInstanceOf[js.Any])).asInstanceOf[T | js.Array[js.UndefOr[JSONSchema6Type]]]
  
  inline def getDefaultRegistry(): Definitions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultRegistry")().asInstanceOf[Definitions]
  
  inline def getMatchingOption(formData: Any, options: js.Array[JSONSchema6], definitions: StringDictionary[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatchingOption")(formData.asInstanceOf[js.Any], options.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSchemaType(schema: JSONSchema6): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemaType")(schema.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getUiOptions(uiSchema: UiSchema): js.UndefOr[StringDictionary[Boolean | Double | String | js.Object | js.Array[Any] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUiOptions")(uiSchema.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[StringDictionary[Boolean | Double | String | js.Object | js.Array[Any] | Null]]]
  
  inline def getWidget(schema: JSONSchema6, widget: String): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any])).asInstanceOf[Widget]
  inline def getWidget(schema: JSONSchema6, widget: String, registeredWidgets: StringDictionary[Widget]): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any], registeredWidgets.asInstanceOf[js.Any])).asInstanceOf[Widget]
  inline def getWidget(schema: JSONSchema6, widget: Widget): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any])).asInstanceOf[Widget]
  inline def getWidget(schema: JSONSchema6, widget: Widget, registeredWidgets: StringDictionary[Widget]): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any], registeredWidgets.asInstanceOf[js.Any])).asInstanceOf[Widget]
  
  inline def guessType(value: Any): JSONSchema6TypeName = ^.asInstanceOf[js.Dynamic].applyDynamic("guessType")(value.asInstanceOf[js.Any]).asInstanceOf[JSONSchema6TypeName]
  
  inline def hasWidget(schema: JSONSchema6, widget: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasWidget(schema: JSONSchema6, widget: String, registeredWidgets: StringDictionary[Widget]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any], registeredWidgets.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasWidget(schema: JSONSchema6, widget: Widget): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasWidget(schema: JSONSchema6, widget: Widget, registeredWidgets: StringDictionary[Widget]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasWidget")(schema.asInstanceOf[js.Any], widget.asInstanceOf[js.Any], registeredWidgets.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isConstant(schema: JSONSchema6): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstant")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFilesArray(schema: JSONSchema6, uiSchema: UiSchema): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFilesArray")(schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isFilesArray(schema: JSONSchema6, uiSchema: UiSchema, definitions: StringDictionary[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFilesArray")(schema.asInstanceOf[js.Any], uiSchema.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFixedItems(schema: JSONSchema6): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFixedItems")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMultiSelect(schema: JSONSchema6): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultiSelect")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isMultiSelect(schema: JSONSchema6, definitions: StringDictionary[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMultiSelect")(schema.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isObject(thing: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(thing.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSelect(_schema: JSONSchema6): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelect")(_schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSelect(_schema: JSONSchema6, definitions: StringDictionary[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSelect")(_schema.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mergeObjects(obj1: js.Object, obj2: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeObjects")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def mergeObjects(obj1: js.Object, obj2: js.Object, concatArrays: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeObjects")(obj1.asInstanceOf[js.Any], obj2.asInstanceOf[js.Any], concatArrays.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def optionsList(schema: JSONSchema6): js.Array[Label] = ^.asInstanceOf[js.Dynamic].applyDynamic("optionsList")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Array[Label]]
  
  inline def orderProperties(properties: js.Array[Any], order: js.Array[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("orderProperties")(properties.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def pad(num: Double, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(num.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseDateString(dateString: String): DateObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDateString")(dateString.asInstanceOf[js.Any]).asInstanceOf[DateObject]
  inline def parseDateString(dateString: String, includeTime: Boolean): DateObject = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDateString")(dateString.asInstanceOf[js.Any], includeTime.asInstanceOf[js.Any])).asInstanceOf[DateObject]
  
  inline def rangeSpec(schema: JSONSchema6): IRangeSpec = ^.asInstanceOf[js.Dynamic].applyDynamic("rangeSpec")(schema.asInstanceOf[js.Any]).asInstanceOf[IRangeSpec]
  
  inline def resolveSchema[T](schema: JSONSchema6Definition): JSONSchema6 = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[JSONSchema6]
  inline def resolveSchema[T](schema: JSONSchema6Definition, definitions: StringDictionary[Any]): JSONSchema6 = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSchema")(schema.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[JSONSchema6]
  inline def resolveSchema[T](schema: JSONSchema6Definition, definitions: StringDictionary[Any], formData: T): JSONSchema6 = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSchema")(schema.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[JSONSchema6]
  inline def resolveSchema[T](schema: JSONSchema6Definition, definitions: Unit, formData: T): JSONSchema6 = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSchema")(schema.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[JSONSchema6]
  
  inline def retrieveSchema[T](schema: JSONSchema6Definition): JSONSchema6 = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[JSONSchema6]
  inline def retrieveSchema[T](schema: JSONSchema6Definition, definitions: StringDictionary[Any]): JSONSchema6 = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSchema")(schema.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[JSONSchema6]
  inline def retrieveSchema[T](schema: JSONSchema6Definition, definitions: StringDictionary[Any], formData: T): JSONSchema6 = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSchema")(schema.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[JSONSchema6]
  inline def retrieveSchema[T](schema: JSONSchema6Definition, definitions: Unit, formData: T): JSONSchema6 = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSchema")(schema.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[JSONSchema6]
  
  inline def setState(instance: Component[js.Object, js.Object, Any], state: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setState")(instance.asInstanceOf[js.Any], state.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def shouldRender(comp: Component[js.Object, js.Object, Any], nextProps: Any, nextState: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldRender")(comp.asInstanceOf[js.Any], nextProps.asInstanceOf[js.Any], nextState.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def stubExistingAdditionalProperties[T](schema: JSONSchema6): JSONSchema6 = ^.asInstanceOf[js.Dynamic].applyDynamic("stubExistingAdditionalProperties")(schema.asInstanceOf[js.Any]).asInstanceOf[JSONSchema6]
  inline def stubExistingAdditionalProperties[T](schema: JSONSchema6, definitions: StringDictionary[Any]): JSONSchema6 = (^.asInstanceOf[js.Dynamic].applyDynamic("stubExistingAdditionalProperties")(schema.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[JSONSchema6]
  inline def stubExistingAdditionalProperties[T](schema: JSONSchema6, definitions: StringDictionary[Any], formData: T): JSONSchema6 = (^.asInstanceOf[js.Dynamic].applyDynamic("stubExistingAdditionalProperties")(schema.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[JSONSchema6]
  inline def stubExistingAdditionalProperties[T](schema: JSONSchema6, definitions: Unit, formData: T): JSONSchema6 = (^.asInstanceOf[js.Dynamic].applyDynamic("stubExistingAdditionalProperties")(schema.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[JSONSchema6]
  
  inline def toConstant(schema: JSONSchema6): js.UndefOr[JSONSchema6Type | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("toConstant")(schema.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[JSONSchema6Type | js.Error]]
  
  inline def toDateString(dateObject: DateObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateString")(dateObject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toDateString(dateObject: DateObject, time: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toDateString")(dateObject.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toIdSchema[T](schema: JSONSchema6Definition, id: String, definitions: StringDictionary[Any]): IdSchema[Any] | js.Array[IdSchema[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[IdSchema[Any] | js.Array[IdSchema[Any]]]
  inline def toIdSchema[T](schema: JSONSchema6Definition, id: String, definitions: StringDictionary[Any], formData: T): IdSchema[Any] | js.Array[IdSchema[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[IdSchema[Any] | js.Array[IdSchema[Any]]]
  inline def toIdSchema[T](
    schema: JSONSchema6Definition,
    id: String,
    definitions: StringDictionary[Any],
    formData: T,
    idPredix: String
  ): IdSchema[Any] | js.Array[IdSchema[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPredix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[Any] | js.Array[IdSchema[Any]]]
  inline def toIdSchema[T](
    schema: JSONSchema6Definition,
    id: String,
    definitions: StringDictionary[Any],
    formData: Unit,
    idPredix: String
  ): IdSchema[Any] | js.Array[IdSchema[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toIdSchema")(schema.asInstanceOf[js.Any], id.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], formData.asInstanceOf[js.Any], idPredix.asInstanceOf[js.Any])).asInstanceOf[IdSchema[Any] | js.Array[IdSchema[Any]]]
  
  inline def toPathSchema[T](schema: JSONSchema6Definition, name: String, definitions: StringDictionary[Any]): PathSchema[Any] | js.Array[PathSchema[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[PathSchema[Any] | js.Array[PathSchema[Any]]]
  inline def toPathSchema[T](schema: JSONSchema6Definition, name: String, definitions: StringDictionary[Any], formData: T): PathSchema[Any] | js.Array[PathSchema[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[PathSchema[Any] | js.Array[PathSchema[Any]]]
  inline def toPathSchema[T](schema: JSONSchema6Definition, name: Unit, definitions: StringDictionary[Any]): PathSchema[Any] | js.Array[PathSchema[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any])).asInstanceOf[PathSchema[Any] | js.Array[PathSchema[Any]]]
  inline def toPathSchema[T](schema: JSONSchema6Definition, name: Unit, definitions: StringDictionary[Any], formData: T): PathSchema[Any] | js.Array[PathSchema[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPathSchema")(schema.asInstanceOf[js.Any], name.asInstanceOf[js.Any], definitions.asInstanceOf[js.Any], formData.asInstanceOf[js.Any])).asInstanceOf[PathSchema[Any] | js.Array[PathSchema[Any]]]
  
  trait DateObject extends StObject {
    
    var day: Double
    
    var hour: Double
    
    var minute: Double
    
    var month: Double
    
    var second: Double
    
    var year: Double
  }
  object DateObject {
    
    inline def apply(day: Double, hour: Double, minute: Double, month: Double, second: Double, year: Double): DateObject = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateObject]
    }
    
    extension [Self <: DateObject](x: Self) {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRangeSpec extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object IRangeSpec {
    
    inline def apply(): IRangeSpec = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRangeSpec]
    }
    
    extension [Self <: IRangeSpec](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
