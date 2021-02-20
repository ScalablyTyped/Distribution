package typings.simplSchema

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.simplSchema.anon.BADDATE
import typings.simplSchema.anon.Domain
import typings.simplSchema.anon.EndPointsOnly
import typings.simplSchema.anon.KeepArrays
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.Date
import typings.std.DateConstructor
import typings.std.NumberConstructor
import typings.std.RegExp
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("simpl-schema", JSImport.Default)
  @js.native
  val default: SimpleSchemaStatic = js.native
  
  @js.native
  trait MongoObject extends StObject {
    
    def expandKey(`val`: js.Any, key: String, obj: js.Any): Unit = js.native
  }
  object MongoObject {
    
    @JSImport("simpl-schema", "MongoObject")
    @js.native
    val ^ : MongoObjectStatic = js.native
    
    @scala.inline
    implicit class MongoObjectMutableBuilder[Self <: MongoObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandKey(value: (js.Any, String, js.Any) => Unit): Self = StObject.set(x, "expandKey", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait SimpleSchema extends SimpleSchemaStatic {
    
    var debug: Boolean = js.native
  }
  @JSImport("simpl-schema", "SimpleSchema")
  @js.native
  val SimpleSchema: SimpleSchemaStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("simpl-schema", "SimpleSchema")
  @js.native
  class SimpleSchemaCls protected ()
    extends typings.simplSchema.mod.SimpleSchema {
    def this(schema: SimpleSchemaDefinition) = this()
    def this(schema: SimpleSchemaDefinition, options: SimpleSchemaOptions) = this()
  }
  
  @JSImport("simpl-schema", "SimpleSchemaValidationContext")
  @js.native
  val SimpleSchemaValidationContext: SimpleSchemaValidationContextStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("simpl-schema", JSImport.Default)
  @js.native
  class defaultCls protected ()
    extends typings.simplSchema.mod.SimpleSchema {
    def this(schema: SimpleSchemaDefinition) = this()
    def this(schema: SimpleSchemaDefinition, options: SimpleSchemaOptions) = this()
  }
  
  @js.native
  trait CleanOption extends StObject {
    
    var autoConvert: js.UndefOr[Boolean] = js.native
    
    var extendAutoValueContext: js.UndefOr[Boolean] = js.native
    
    var filter: js.UndefOr[Boolean] = js.native
    
    var getAutoValues: js.UndefOr[Boolean] = js.native
    
    var isModifier: js.UndefOr[Boolean] = js.native
    
    var removeEmptyStrings: js.UndefOr[Boolean] = js.native
    
    var removeNullsFromArrays: js.UndefOr[Boolean] = js.native
    
    var trimStrings: js.UndefOr[Boolean] = js.native
  }
  object CleanOption {
    
    @scala.inline
    def apply(): CleanOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CleanOption]
    }
    
    @scala.inline
    implicit class CleanOptionMutableBuilder[Self <: CleanOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoConvert(value: Boolean): Self = StObject.set(x, "autoConvert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoConvertUndefined: Self = StObject.set(x, "autoConvert", js.undefined)
      
      @scala.inline
      def setExtendAutoValueContext(value: Boolean): Self = StObject.set(x, "extendAutoValueContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendAutoValueContextUndefined: Self = StObject.set(x, "extendAutoValueContext", js.undefined)
      
      @scala.inline
      def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGetAutoValues(value: Boolean): Self = StObject.set(x, "getAutoValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetAutoValuesUndefined: Self = StObject.set(x, "getAutoValues", js.undefined)
      
      @scala.inline
      def setIsModifier(value: Boolean): Self = StObject.set(x, "isModifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsModifierUndefined: Self = StObject.set(x, "isModifier", js.undefined)
      
      @scala.inline
      def setRemoveEmptyStrings(value: Boolean): Self = StObject.set(x, "removeEmptyStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveEmptyStringsUndefined: Self = StObject.set(x, "removeEmptyStrings", js.undefined)
      
      @scala.inline
      def setRemoveNullsFromArrays(value: Boolean): Self = StObject.set(x, "removeNullsFromArrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveNullsFromArraysUndefined: Self = StObject.set(x, "removeNullsFromArrays", js.undefined)
      
      @scala.inline
      def setTrimStrings(value: Boolean): Self = StObject.set(x, "trimStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimStringsUndefined: Self = StObject.set(x, "trimStrings", js.undefined)
    }
  }
  
  @js.native
  trait CustomValidationContext extends StObject {
    
    /**
      * Call this to add validation errors for any key. In general, you should use
      * this to add errors for other keys. To add an error for the current key,
      * return the error type string. If you do use this to add an error for the
      * current key, return false from your custom validation function.
      */
    def addValidationErrors(errors: SimpleSchemaValidationError): js.Any = js.native
    
    /** The schema definition object. */
    var definition: SchemaDefinition = js.native
    
    /**
      * Use this method to get information about other fields. Pass a field name
      * (non-generic schema key) as the only argument. The return object will
      * have isSet, value, and operator properties for that field.
      */
    def field(): js.Any = js.native
    
    /** The generic name of the schema key (e.g., "addresses.$.street") */
    var genericKey: String = js.native
    
    /** Does the object being validated have this key set? */
    var isSet: Boolean = js.native
    
    /** The name of the schema key (e.g., "addresses.0.street") */
    var key: String = js.native
    
    /** The Mongo operator for which we're doing validation. Might be null. */
    var operator: js.Any = js.native
    
    /**
      * Use this method to get information about other fields that have the same
      * parent object. Works the same way as field(). This is helpful when you use
      * sub-schemas or when you're dealing with arrays of objects.
      */
    def siblingField(): js.Any = js.native
    
    var validationContext: ValidationContext = js.native
    
    /** Value to validate */
    var value: js.Any = js.native
  }
  object CustomValidationContext {
    
    @scala.inline
    def apply(
      addValidationErrors: SimpleSchemaValidationError => js.Any,
      definition: SchemaDefinition,
      field: () => js.Any,
      genericKey: String,
      isSet: Boolean,
      key: String,
      operator: js.Any,
      siblingField: () => js.Any,
      validationContext: ValidationContext,
      value: js.Any
    ): CustomValidationContext = {
      val __obj = js.Dynamic.literal(addValidationErrors = js.Any.fromFunction1(addValidationErrors), definition = definition.asInstanceOf[js.Any], field = js.Any.fromFunction0(field), genericKey = genericKey.asInstanceOf[js.Any], isSet = isSet.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], siblingField = js.Any.fromFunction0(siblingField), validationContext = validationContext.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomValidationContext]
    }
    
    @scala.inline
    implicit class CustomValidationContextMutableBuilder[Self <: CustomValidationContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddValidationErrors(value: SimpleSchemaValidationError => js.Any): Self = StObject.set(x, "addValidationErrors", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDefinition(value: SchemaDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setField(value: () => js.Any): Self = StObject.set(x, "field", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGenericKey(value: String): Self = StObject.set(x, "genericKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSet(value: Boolean): Self = StObject.set(x, "isSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperator(value: js.Any): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiblingField(value: () => js.Any): Self = StObject.set(x, "siblingField", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValidationContext(value: ValidationContext): Self = StObject.set(x, "validationContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MongoObjectStatic extends StObject {
    
    def addKey(key: String, `val`: js.Any, op: String): js.Any = js.native
    
    def affectsGenericKey(key: String): js.Any = js.native
    
    def affectsGenericKeyImplicit(key: String): js.Any = js.native
    
    def affectsKey(key: String): js.Any = js.native
    
    def filterGenericKeys(test: js.Function0[Boolean]): Unit = js.native
    
    def forEachNode(func: js.Function0[Unit]): Unit = js.native
    def forEachNode(func: js.Function0[Unit], options: EndPointsOnly): Unit = js.native
    
    def getFlatObject(): js.Any = js.native
    def getFlatObject(options: KeepArrays): js.Any = js.native
    
    def getGenericKeyForPosition(position: String): js.Any = js.native
    
    def getInfoForKey(key: String): js.Any = js.native
    
    def getKeyForPosition(position: String): js.Any = js.native
    
    def getObject(): js.Any = js.native
    
    def getPositionForKey(key: String): String = js.native
    
    def getPositionsForGenericKey(key: String): js.Array[String] = js.native
    
    def getValueForKey(key: String): js.Any = js.native
    
    def getValueForPosition(position: String): js.Any = js.native
    
    def removeGenericKey(key: String): Unit = js.native
    
    def removeGenericKeys(keys: js.Array[String]): Unit = js.native
    
    def removeKey(key: String): Unit = js.native
    
    def removeKeys(keys: js.Array[String]): Unit = js.native
    
    def removeValueForPosition(position: String): Unit = js.native
    
    def setValueForGenericKey(key: String, `val`: js.Any): Unit = js.native
    
    def setValueForKey(key: String, `val`: js.Any): Unit = js.native
    
    def setValueForPosition(position: String, value: js.Any): Unit = js.native
  }
  
  @js.native
  trait SchemaDefinition extends StObject {
    
    var allowedValues: js.UndefOr[js.Array[_] | js.Function0[js.Array[_]]] = js.native
    
    var autoValue: js.UndefOr[js.Function0[_]] = js.native
    
    var blackbox: js.UndefOr[Boolean] = js.native
    
    /**
      * For custom validation function. If you use an arrow function the context
      * for "this" will not be available. Use "custom: function() { return
      * something(this.value); }" instead.
      */
    var custom: js.UndefOr[
        js.ThisFunction0[
          /* this */ CustomValidationContext, 
          js.UndefOr[String | SimpleSchemaValidationError]
        ]
      ] = js.native
    
    var decimal: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[js.Any] = js.native
    
    var exclusiveMax: js.UndefOr[Boolean] = js.native
    
    var exclusiveMin: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[String | js.Function0[String]] = js.native
    
    var max: js.UndefOr[Double | Boolean | Date | (js.Function0[Double | Boolean | Date])] = js.native
    
    var maxCount: js.UndefOr[Double | js.Function0[Double]] = js.native
    
    var min: js.UndefOr[Double | Boolean | Date | (js.Function0[Double | Boolean | Date])] = js.native
    
    var minCount: js.UndefOr[Double | js.Function0[Double]] = js.native
    
    var optional: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
    
    var regEx: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
    
    var trim: js.UndefOr[Boolean] = js.native
    
    var `type`: js.Any = js.native
  }
  object SchemaDefinition {
    
    @scala.inline
    def apply(`type`: js.Any): SchemaDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaDefinition]
    }
    
    @scala.inline
    implicit class SchemaDefinitionMutableBuilder[Self <: SchemaDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedValues(value: js.Array[_] | js.Function0[js.Array[_]]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedValuesFunction0(value: () => js.Array[_]): Self = StObject.set(x, "allowedValues", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
      
      @scala.inline
      def setAllowedValuesVarargs(value: js.Any*): Self = StObject.set(x, "allowedValues", js.Array(value :_*))
      
      @scala.inline
      def setAutoValue(value: () => _): Self = StObject.set(x, "autoValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAutoValueUndefined: Self = StObject.set(x, "autoValue", js.undefined)
      
      @scala.inline
      def setBlackbox(value: Boolean): Self = StObject.set(x, "blackbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlackboxUndefined: Self = StObject.set(x, "blackbox", js.undefined)
      
      @scala.inline
      def setCustom(
        value: js.ThisFunction0[
              /* this */ CustomValidationContext, 
              js.UndefOr[String | SimpleSchemaValidationError]
            ]
      ): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setDecimal(value: Boolean): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setExclusiveMax(value: Boolean): Self = StObject.set(x, "exclusiveMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMaxUndefined: Self = StObject.set(x, "exclusiveMax", js.undefined)
      
      @scala.inline
      def setExclusiveMin(value: Boolean): Self = StObject.set(x, "exclusiveMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExclusiveMinUndefined: Self = StObject.set(x, "exclusiveMin", js.undefined)
      
      @scala.inline
      def setLabel(value: String | js.Function0[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction0(value: () => String): Self = StObject.set(x, "label", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMax(value: Double | Boolean | Date | (js.Function0[Double | Boolean | Date])): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCount(value: Double | js.Function0[Double]): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxCountFunction0(value: () => Double): Self = StObject.set(x, "maxCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      @scala.inline
      def setMaxFunction0(value: () => Double | Boolean | Date): Self = StObject.set(x, "max", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double | Boolean | Date | (js.Function0[Double | Boolean | Date])): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCount(value: Double | js.Function0[Double]): Self = StObject.set(x, "minCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinCountFunction0(value: () => Double): Self = StObject.set(x, "minCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMinCountUndefined: Self = StObject.set(x, "minCount", js.undefined)
      
      @scala.inline
      def setMinFunction0(value: () => Double | Boolean | Date): Self = StObject.set(x, "min", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOptional(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalFunction0(value: () => Boolean): Self = StObject.set(x, "optional", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      @scala.inline
      def setRegEx(value: RegExp | js.Array[RegExp]): Self = StObject.set(x, "regEx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegExUndefined: Self = StObject.set(x, "regEx", js.undefined)
      
      @scala.inline
      def setRegExVarargs(value: RegExp*): Self = StObject.set(x, "regEx", js.Array(value :_*))
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type SimpleSchemaDefinition = (StringDictionary[
    SchemaDefinition | BooleanConstructor | StringConstructor | NumberConstructor | DateConstructor | ArrayConstructor | String | RegExp | typings.simplSchema.mod.SimpleSchema
  ]) | js.Array[js.Any]
  
  @js.native
  trait SimpleSchemaError extends StObject {
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object SimpleSchemaError {
    
    @scala.inline
    def apply(name: String, `type`: String): SimpleSchemaError = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleSchemaError]
    }
    
    @scala.inline
    implicit class SimpleSchemaErrorMutableBuilder[Self <: SimpleSchemaError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SimpleSchemaOptions extends StObject {
    
    var check: js.UndefOr[Boolean] = js.native
    
    var clean: js.UndefOr[CleanOption] = js.native
    
    var defaultLabel: js.UndefOr[String] = js.native
    
    var humanizeAutoLabels: js.UndefOr[Boolean] = js.native
    
    var requiredByDefault: js.UndefOr[Boolean] = js.native
    
    var tracker: js.UndefOr[js.Any] = js.native
  }
  object SimpleSchemaOptions {
    
    @scala.inline
    def apply(): SimpleSchemaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleSchemaOptions]
    }
    
    @scala.inline
    implicit class SimpleSchemaOptionsMutableBuilder[Self <: SimpleSchemaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheck(value: Boolean): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setClean(value: CleanOption): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      @scala.inline
      def setDefaultLabel(value: String): Self = StObject.set(x, "defaultLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLabelUndefined: Self = StObject.set(x, "defaultLabel", js.undefined)
      
      @scala.inline
      def setHumanizeAutoLabels(value: Boolean): Self = StObject.set(x, "humanizeAutoLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHumanizeAutoLabelsUndefined: Self = StObject.set(x, "humanizeAutoLabels", js.undefined)
      
      @scala.inline
      def setRequiredByDefault(value: Boolean): Self = StObject.set(x, "requiredByDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredByDefaultUndefined: Self = StObject.set(x, "requiredByDefault", js.undefined)
      
      @scala.inline
      def setTracker(value: js.Any): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackerUndefined: Self = StObject.set(x, "tracker", js.undefined)
    }
  }
  
  @js.native
  trait SimpleSchemaStatic
    extends Instantiable1[/* schema */ SimpleSchemaDefinition, typings.simplSchema.mod.SimpleSchema]
       with Instantiable2[
          /* schema */ SimpleSchemaDefinition, 
          /* options */ SimpleSchemaOptions, 
          typings.simplSchema.mod.SimpleSchema
        ] {
    
    var ErrorTypes: BADDATE = js.native
    
    var Integer: RegExp = js.native
    
    var RegEx: Domain = js.native
    
    def addValidator(validator: js.Function0[Boolean]): js.Any = js.native
    
    def allowsKey(key: js.Any): String = js.native
    
    def clean(doc: js.Any): js.Any = js.native
    def clean(doc: js.Any, options: CleanOption): js.Any = js.native
    
    def extend(otherSchema: SimpleSchemaDefinition): SimpleSchemaStatic = js.native
    def extend(otherSchema: SimpleSchemaStatic): SimpleSchemaStatic = js.native
    
    def extendOptions(options: js.Array[String]): Unit = js.native
    
    def getDefinition(key: String): js.Any = js.native
    def getDefinition(key: String, propList: js.UndefOr[scala.Nothing], functionContext: js.Any): js.Any = js.native
    def getDefinition(key: String, propList: js.Any): js.Any = js.native
    def getDefinition(key: String, propList: js.Any, functionContext: js.Any): js.Any = js.native
    
    def keyIsInBlackBox(key: String): Boolean = js.native
    
    def label(key: js.Any): js.Any = js.native
    
    def labels(labels: StringDictionary[String]): Unit = js.native
    
    def messageForError(`type`: js.Any, key: js.Any, `def`: js.Any, value: js.Any): String = js.native
    
    def messages(messages: js.Any): js.Any = js.native
    
    def namedContext(): SimpleSchemaValidationContextStatic = js.native
    def namedContext(name: String): SimpleSchemaValidationContextStatic = js.native
    
    def newContext(): ValidationContext = js.native
    
    def objectKeys(keyPrefix: js.Any): js.Array[_] = js.native
    
    def omit(fields: String*): SimpleSchemaStatic = js.native
    
    def oneOf(
      types: (SchemaDefinition | BooleanConstructor | StringConstructor | NumberConstructor | DateConstructor | ArrayConstructor)*
    ): SimpleSchemaStatic = js.native
    
    def pick(fields: String*): SimpleSchemaStatic = js.native
    
    def schema(): js.Array[SchemaDefinition] = js.native
    def schema(key: String): SchemaDefinition = js.native
    
    def validate(obj: js.Any): Unit = js.native
    def validate(obj: js.Any, options: ValidationOption): Unit = js.native
    
    def validator(): js.Function1[/* obj */ js.Any, Boolean] = js.native
    def validator(options: ValidationOption): js.Function1[/* obj */ js.Any, Boolean] = js.native
  }
  
  @js.native
  trait SimpleSchemaValidationContextStatic extends StObject {
    
    def addInvalidKeys(errors: js.Array[SimpleSchemaError]): Unit = js.native
    
    def getErrorObject(): js.Any = js.native
    
    def invalidKeys(): js.Array[SimpleSchemaValidationContextStaticKeys] = js.native
    
    def isValid(): Boolean = js.native
    
    def keyErrorMessage(name: js.Any): String = js.native
    
    def keyIsInvalid(name: js.Any): Boolean = js.native
    
    def resetValidation(): Unit = js.native
    
    def validate(obj: js.Any): Boolean = js.native
    def validate(obj: js.Any, options: ValidationOption): Boolean = js.native
    
    def validateOne(doc: js.Any, keyName: String): Boolean = js.native
    def validateOne(doc: js.Any, keyName: String, options: ValidationOption): Boolean = js.native
  }
  
  @js.native
  trait SimpleSchemaValidationContextStaticKeys extends StObject {
    
    var name: String = js.native
    
    var `type`: String = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object SimpleSchemaValidationContextStaticKeys {
    
    @scala.inline
    def apply(name: String, `type`: String): SimpleSchemaValidationContextStaticKeys = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleSchemaValidationContextStaticKeys]
    }
    
    @scala.inline
    implicit class SimpleSchemaValidationContextStaticKeysMutableBuilder[Self <: SimpleSchemaValidationContextStaticKeys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SimpleSchemaValidationError extends /* key */ StringDictionary[Double | String] {
    
    var `type`: String = js.native
  }
  object SimpleSchemaValidationError {
    
    @scala.inline
    def apply(`type`: String): SimpleSchemaValidationError = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleSchemaValidationError]
    }
    
    @scala.inline
    implicit class SimpleSchemaValidationErrorMutableBuilder[Self <: SimpleSchemaValidationError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidationContext extends SimpleSchemaValidationContextStatic {
    
    def addValidationErrors(errors: js.Any): Unit = js.native
    
    def clean(args: js.Any*): js.Any = js.native
    
    def getErrorForKey(key: js.Any, args: js.Any*): js.Any = js.native
    
    def reset(): Unit = js.native
    
    def setValidationErrors(errors: js.Any): Unit = js.native
    
    def validationErrors(): js.Any = js.native
  }
  
  @js.native
  trait ValidationOption extends StObject {
    
    var clean: js.UndefOr[Boolean] = js.native
    
    var filter: js.UndefOr[Boolean] = js.native
    
    var keys: js.UndefOr[js.Array[String]] = js.native
    
    var modifier: js.UndefOr[Boolean] = js.native
    
    var upsert: js.UndefOr[Boolean] = js.native
    
    var upsertextendedCustomContext: js.UndefOr[Boolean] = js.native
  }
  object ValidationOption {
    
    @scala.inline
    def apply(): ValidationOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationOption]
    }
    
    @scala.inline
    implicit class ValidationOptionMutableBuilder[Self <: ValidationOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      @scala.inline
      def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      @scala.inline
      def setModifier(value: Boolean): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
      
      @scala.inline
      def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
      
      @scala.inline
      def setUpsertextendedCustomContext(value: Boolean): Self = StObject.set(x, "upsertextendedCustomContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpsertextendedCustomContextUndefined: Self = StObject.set(x, "upsertextendedCustomContext", js.undefined)
    }
  }
  
  type _To = SimpleSchemaStatic
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: SimpleSchemaStatic = default
}
