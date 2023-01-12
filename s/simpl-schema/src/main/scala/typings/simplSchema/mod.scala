package typings.simplSchema

import org.scalablytyped.runtime.StringDictionary
import typings.simplSchema.anon.BADDATE
import typings.simplSchema.anon.Domain
import typings.simplSchema.anon.EndPointsOnly
import typings.simplSchema.anon.FnCall
import typings.simplSchema.anon.KeepArrays
import typings.simplSchema.anon.Label
import typings.simplSchema.anon.Messages
import typings.simplSchema.anon.TypeofSimpleSchema
import typings.simplSchema.simplSchemaStrings.SimpleSchemaDotInteger
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.DateConstructor
import typings.std.NumberConstructor
import typings.std.Record
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simpl-schema", JSImport.Default)
  @js.native
  open class default protected () extends SimpleSchema {
    def this(schema: SimpleSchemaDefinition) = this()
    def this(schema: SimpleSchemaDefinition, options: SimpleSchemaOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("simpl-schema", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("simpl-schema", "default.ErrorTypes")
    @js.native
    def ErrorTypes: BADDATE = js.native
    inline def ErrorTypes_=(x: BADDATE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ErrorTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("simpl-schema", "default.Integer")
    @js.native
    def Integer: IntegerSchema = js.native
    inline def Integer_=(x: IntegerSchema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    @JSImport("simpl-schema", "default.RegEx")
    @js.native
    def RegEx: Domain = js.native
    inline def RegEx_=(x: Domain): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegEx")(x.asInstanceOf[js.Any])
    
    inline def addValidator(validator: Validator): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addValidator")(validator.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def extendOptions(options: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def isSimpleSchema(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleSchema")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def oneOf(
      types: (js.RegExp | SchemaDefinition | BooleanConstructor | StringConstructor | NumberConstructor | DateConstructor | ArrayConstructor | IntegerSchema)*
    ): SimpleSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(types.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SimpleSchema]
    
    inline def setDefaultMessages(messages: Messages): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultMessages")(messages.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def validate(obj: Any, schema: SimpleSchema): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(obj.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def validate(obj: Any, schema: SimpleSchema, options: ValidationOption): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(obj.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait MongoObject extends StObject {
    
    def expandKey(`val`: Any, key: String, obj: Any): Unit
  }
  object MongoObject {
    
    @JSImport("simpl-schema", "MongoObject")
    @js.native
    val ^ : MongoObjectStatic = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MongoObject] (val x: Self) extends AnyVal {
      
      inline def setExpandKey(value: (Any, String, Any) => Unit): Self = StObject.set(x, "expandKey", js.Any.fromFunction3(value))
    }
  }
  
  @JSImport("simpl-schema", "SimpleSchema")
  @js.native
  open class SimpleSchema protected () extends StObject {
    def this(schema: SimpleSchemaDefinition) = this()
    def this(schema: SimpleSchemaDefinition, options: SimpleSchemaOptions) = this()
    
    def addValidator(validator: Validator): Unit = js.native
    
    def allowsKey(key: Any): String = js.native
    
    def clean(doc: Any): Any = js.native
    def clean(doc: Any, options: CleanOption): Any = js.native
    
    def extend(otherSchema: SimpleSchema): SimpleSchema = js.native
    def extend(otherSchema: SimpleSchemaDefinition): SimpleSchema = js.native
    
    def get(key: String, prop: String): Any = js.native
    
    def getDefinition(key: String): Any = js.native
    def getDefinition(key: String, propList: Any): Any = js.native
    def getDefinition(key: String, propList: Any, functionContext: Any): Any = js.native
    def getDefinition(key: String, propList: Unit, functionContext: Any): Any = js.native
    
    def getObjectSchema(key: String): js.UndefOr[TypeofSimpleSchema] = js.native
    
    def keyIsInBlackBox(key: String): Boolean = js.native
    
    def label(key: Any): Any = js.native
    
    def labels(labels: StringDictionary[String]): Unit = js.native
    
    def messageForError(`type`: Any, key: Any, `def`: Any, value: Any): String = js.native
    
    def messages(messages: Any): Any = js.native
    
    def namedContext(): SimpleSchemaValidationContextStatic = js.native
    def namedContext(name: String): SimpleSchemaValidationContextStatic = js.native
    
    def newContext(): ValidationContext = js.native
    
    def objectKeys(): js.Array[Any] = js.native
    def objectKeys(keyPrefix: Any): js.Array[Any] = js.native
    
    def omit(fields: String*): SimpleSchema = js.native
    
    def pick(fields: String*): SimpleSchema = js.native
    
    def schema(): SchemaDefinition = js.native
    def schema(key: String): SchemaDefinition = js.native
    
    def validate(obj: Any): Unit = js.native
    def validate(obj: Any, options: ValidationOption): Unit = js.native
    
    def validator(): js.Function1[/* obj */ Any, Boolean] = js.native
    def validator(options: ValidatorOption): js.Function1[/* obj */ Any, Boolean] = js.native
  }
  /* static members */
  object SimpleSchema {
    
    @JSImport("simpl-schema", "SimpleSchema")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("simpl-schema", "SimpleSchema.ErrorTypes")
    @js.native
    def ErrorTypes: BADDATE = js.native
    inline def ErrorTypes_=(x: BADDATE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ErrorTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("simpl-schema", "SimpleSchema.Integer")
    @js.native
    def Integer: IntegerSchema = js.native
    inline def Integer_=(x: IntegerSchema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    @JSImport("simpl-schema", "SimpleSchema.RegEx")
    @js.native
    def RegEx: Domain = js.native
    inline def RegEx_=(x: Domain): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RegEx")(x.asInstanceOf[js.Any])
    
    inline def addValidator(validator: Validator): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addValidator")(validator.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def extendOptions(options: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def isSimpleSchema(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleSchema")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def oneOf(
      types: (js.RegExp | SchemaDefinition | BooleanConstructor | StringConstructor | NumberConstructor | DateConstructor | ArrayConstructor | IntegerSchema)*
    ): SimpleSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(types.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SimpleSchema]
    
    inline def setDefaultMessages(messages: Messages): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultMessages")(messages.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def validate(obj: Any, schema: SimpleSchema): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(obj.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def validate(obj: Any, schema: SimpleSchema, options: ValidationOption): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(obj.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("simpl-schema", "SimpleSchemaValidationContext")
  @js.native
  val SimpleSchemaValidationContext: SimpleSchemaValidationContextStatic = js.native
  
  trait AutoValueContext extends StObject {
    
    var closestSubschemaFieldName: String | Null
    
    def field(fieldName: String): FieldInfo
    
    var isModifier: Boolean
    
    var isSet: Boolean
    
    var isUpsert: Boolean
    
    var key: String
    
    var operator: String | Null
    
    def parentField(): FieldInfo
    
    def siblingField(fieldName: String): FieldInfo
    
    def unset(): Unit
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object AutoValueContext {
    
    inline def apply(
      field: String => FieldInfo,
      isModifier: Boolean,
      isSet: Boolean,
      isUpsert: Boolean,
      key: String,
      parentField: () => FieldInfo,
      siblingField: String => FieldInfo,
      unset: () => Unit
    ): AutoValueContext = {
      val __obj = js.Dynamic.literal(field = js.Any.fromFunction1(field), isModifier = isModifier.asInstanceOf[js.Any], isSet = isSet.asInstanceOf[js.Any], isUpsert = isUpsert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], parentField = js.Any.fromFunction0(parentField), siblingField = js.Any.fromFunction1(siblingField), unset = js.Any.fromFunction0(unset), closestSubschemaFieldName = null, operator = null)
      __obj.asInstanceOf[AutoValueContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoValueContext] (val x: Self) extends AnyVal {
      
      inline def setClosestSubschemaFieldName(value: String): Self = StObject.set(x, "closestSubschemaFieldName", value.asInstanceOf[js.Any])
      
      inline def setClosestSubschemaFieldNameNull: Self = StObject.set(x, "closestSubschemaFieldName", null)
      
      inline def setField(value: String => FieldInfo): Self = StObject.set(x, "field", js.Any.fromFunction1(value))
      
      inline def setIsModifier(value: Boolean): Self = StObject.set(x, "isModifier", value.asInstanceOf[js.Any])
      
      inline def setIsSet(value: Boolean): Self = StObject.set(x, "isSet", value.asInstanceOf[js.Any])
      
      inline def setIsUpsert(value: Boolean): Self = StObject.set(x, "isUpsert", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorNull: Self = StObject.set(x, "operator", null)
      
      inline def setParentField(value: () => FieldInfo): Self = StObject.set(x, "parentField", js.Any.fromFunction0(value))
      
      inline def setSiblingField(value: String => FieldInfo): Self = StObject.set(x, "siblingField", js.Any.fromFunction1(value))
      
      inline def setUnset(value: () => Unit): Self = StObject.set(x, "unset", js.Any.fromFunction0(value))
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CleanOption extends StObject {
    
    var autoConvert: js.UndefOr[Boolean] = js.undefined
    
    var extendAutoValueContext: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[Boolean] = js.undefined
    
    var getAutoValues: js.UndefOr[Boolean] = js.undefined
    
    var isModifier: js.UndefOr[Boolean] = js.undefined
    
    var isUpsert: js.UndefOr[Boolean] = js.undefined
    
    var mongoObject: js.UndefOr[Boolean] = js.undefined
    
    var mutate: js.UndefOr[Boolean] = js.undefined
    
    var removeEmptyStrings: js.UndefOr[Boolean] = js.undefined
    
    var removeNullsFromArrays: js.UndefOr[Boolean] = js.undefined
    
    var trimStrings: js.UndefOr[Boolean] = js.undefined
  }
  object CleanOption {
    
    inline def apply(): CleanOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CleanOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CleanOption] (val x: Self) extends AnyVal {
      
      inline def setAutoConvert(value: Boolean): Self = StObject.set(x, "autoConvert", value.asInstanceOf[js.Any])
      
      inline def setAutoConvertUndefined: Self = StObject.set(x, "autoConvert", js.undefined)
      
      inline def setExtendAutoValueContext(value: Boolean): Self = StObject.set(x, "extendAutoValueContext", value.asInstanceOf[js.Any])
      
      inline def setExtendAutoValueContextUndefined: Self = StObject.set(x, "extendAutoValueContext", js.undefined)
      
      inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGetAutoValues(value: Boolean): Self = StObject.set(x, "getAutoValues", value.asInstanceOf[js.Any])
      
      inline def setGetAutoValuesUndefined: Self = StObject.set(x, "getAutoValues", js.undefined)
      
      inline def setIsModifier(value: Boolean): Self = StObject.set(x, "isModifier", value.asInstanceOf[js.Any])
      
      inline def setIsModifierUndefined: Self = StObject.set(x, "isModifier", js.undefined)
      
      inline def setIsUpsert(value: Boolean): Self = StObject.set(x, "isUpsert", value.asInstanceOf[js.Any])
      
      inline def setIsUpsertUndefined: Self = StObject.set(x, "isUpsert", js.undefined)
      
      inline def setMongoObject(value: Boolean): Self = StObject.set(x, "mongoObject", value.asInstanceOf[js.Any])
      
      inline def setMongoObjectUndefined: Self = StObject.set(x, "mongoObject", js.undefined)
      
      inline def setMutate(value: Boolean): Self = StObject.set(x, "mutate", value.asInstanceOf[js.Any])
      
      inline def setMutateUndefined: Self = StObject.set(x, "mutate", js.undefined)
      
      inline def setRemoveEmptyStrings(value: Boolean): Self = StObject.set(x, "removeEmptyStrings", value.asInstanceOf[js.Any])
      
      inline def setRemoveEmptyStringsUndefined: Self = StObject.set(x, "removeEmptyStrings", js.undefined)
      
      inline def setRemoveNullsFromArrays(value: Boolean): Self = StObject.set(x, "removeNullsFromArrays", value.asInstanceOf[js.Any])
      
      inline def setRemoveNullsFromArraysUndefined: Self = StObject.set(x, "removeNullsFromArrays", js.undefined)
      
      inline def setTrimStrings(value: Boolean): Self = StObject.set(x, "trimStrings", value.asInstanceOf[js.Any])
      
      inline def setTrimStringsUndefined: Self = StObject.set(x, "trimStrings", js.undefined)
    }
  }
  
  trait CustomValidationContext extends StObject {
    
    /**
      * Call this to add validation errors for any key. In general, you should use
      * this to add errors for other keys. To add an error for the current key,
      * return the error type string. If you do use this to add an error for the
      * current key, return false from your custom validation function.
      */
    def addValidationErrors(errors: js.Array[SimpleSchemaValidationError]): Any
    
    /** The schema definition object. */
    var definition: SchemaDefinition
    
    /**
      * Use this method to get information about other fields. Pass a field name
      * (non-generic schema key) as the only argument. The return object will
      * have isSet, value, and operator properties for that field.
      */
    def field(name: String): FieldInfo
    
    /** The generic name of the schema key (e.g., "addresses.$.street") */
    var genericKey: String
    
    /** True if we're traversing an object that's in an array */
    var isInArrayItemObject: Boolean
    
    /** True if we're traversing an object that's somewhere within another object */
    var isInSubObject: Boolean
    
    /** True if this is running on a MongoDB modifier object */
    var isModifier: Boolean
    
    /** Does the object being validated have this key set? */
    var isSet: Boolean
    
    /** The name of the schema key (e.g., "addresses.0.street") */
    var key: String
    
    /** The Mongo operator for which we're doing validation. Might be null. */
    var operator: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Use this method to get information about other fields that have the same
      * parent object. Works the same way as field(). This is helpful when you use
      * sub-schemas or when you're dealing with arrays of objects.
      */
    def siblingField(name: String): FieldInfo
    
    /** The current validation context */
    var validationContext: ValidationContext
    
    /** Value to validate */
    var value: Any
  }
  object CustomValidationContext {
    
    inline def apply(
      addValidationErrors: js.Array[SimpleSchemaValidationError] => Any,
      definition: SchemaDefinition,
      field: String => FieldInfo,
      genericKey: String,
      isInArrayItemObject: Boolean,
      isInSubObject: Boolean,
      isModifier: Boolean,
      isSet: Boolean,
      key: String,
      siblingField: String => FieldInfo,
      validationContext: ValidationContext,
      value: Any
    ): CustomValidationContext = {
      val __obj = js.Dynamic.literal(addValidationErrors = js.Any.fromFunction1(addValidationErrors), definition = definition.asInstanceOf[js.Any], field = js.Any.fromFunction1(field), genericKey = genericKey.asInstanceOf[js.Any], isInArrayItemObject = isInArrayItemObject.asInstanceOf[js.Any], isInSubObject = isInSubObject.asInstanceOf[js.Any], isModifier = isModifier.asInstanceOf[js.Any], isSet = isSet.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], siblingField = js.Any.fromFunction1(siblingField), validationContext = validationContext.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomValidationContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomValidationContext] (val x: Self) extends AnyVal {
      
      inline def setAddValidationErrors(value: js.Array[SimpleSchemaValidationError] => Any): Self = StObject.set(x, "addValidationErrors", js.Any.fromFunction1(value))
      
      inline def setDefinition(value: SchemaDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
      
      inline def setField(value: String => FieldInfo): Self = StObject.set(x, "field", js.Any.fromFunction1(value))
      
      inline def setGenericKey(value: String): Self = StObject.set(x, "genericKey", value.asInstanceOf[js.Any])
      
      inline def setIsInArrayItemObject(value: Boolean): Self = StObject.set(x, "isInArrayItemObject", value.asInstanceOf[js.Any])
      
      inline def setIsInSubObject(value: Boolean): Self = StObject.set(x, "isInSubObject", value.asInstanceOf[js.Any])
      
      inline def setIsModifier(value: Boolean): Self = StObject.set(x, "isModifier", value.asInstanceOf[js.Any])
      
      inline def setIsSet(value: Boolean): Self = StObject.set(x, "isSet", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorNull: Self = StObject.set(x, "operator", null)
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setSiblingField(value: String => FieldInfo): Self = StObject.set(x, "siblingField", js.Any.fromFunction1(value))
      
      inline def setValidationContext(value: ValidationContext): Self = StObject.set(x, "validationContext", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FieldInfo extends StObject {
    
    var isSet: Boolean
    
    var operator: String | Null
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object FieldInfo {
    
    inline def apply(isSet: Boolean): FieldInfo = {
      val __obj = js.Dynamic.literal(isSet = isSet.asInstanceOf[js.Any], operator = null)
      __obj.asInstanceOf[FieldInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldInfo] (val x: Self) extends AnyVal {
      
      inline def setIsSet(value: Boolean): Self = StObject.set(x, "isSet", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorNull: Self = StObject.set(x, "operator", null)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type IntegerSchema = SimpleSchemaDotInteger
  
  @js.native
  trait MongoObjectStatic extends StObject {
    
    def addKey(key: String, `val`: Any, op: String): Any = js.native
    
    def affectsGenericKey(key: String): Any = js.native
    
    def affectsGenericKeyImplicit(key: String): Any = js.native
    
    def affectsKey(key: String): Any = js.native
    
    def filterGenericKeys(test: js.Function0[Boolean]): Unit = js.native
    
    def forEachNode(func: js.Function0[Unit]): Unit = js.native
    def forEachNode(func: js.Function0[Unit], options: EndPointsOnly): Unit = js.native
    
    def getFlatObject(): Any = js.native
    def getFlatObject(options: KeepArrays): Any = js.native
    
    def getGenericKeyForPosition(position: String): Any = js.native
    
    def getInfoForKey(key: String): Any = js.native
    
    def getKeyForPosition(position: String): Any = js.native
    
    def getObject(): Any = js.native
    
    def getPositionForKey(key: String): String = js.native
    
    def getPositionsForGenericKey(key: String): js.Array[String] = js.native
    
    def getValueForKey(key: String): Any = js.native
    
    def getValueForPosition(position: String): Any = js.native
    
    def removeGenericKey(key: String): Unit = js.native
    
    def removeGenericKeys(keys: js.Array[String]): Unit = js.native
    
    def removeKey(key: String): Unit = js.native
    
    def removeKeys(keys: js.Array[String]): Unit = js.native
    
    def removeValueForPosition(position: String): Unit = js.native
    
    def setValueForGenericKey(key: String, `val`: Any): Unit = js.native
    
    def setValueForKey(key: String, `val`: Any): Unit = js.native
    
    def setValueForPosition(position: String, value: Any): Unit = js.native
  }
  
  trait SchemaDefinition extends StObject {
    
    var allowedValues: js.UndefOr[js.Array[Any] | js.Function0[js.Array[Any]]] = js.undefined
    
    var autoValue: js.UndefOr[js.ThisFunction0[/* this */ AutoValueContext, Any]] = js.undefined
    
    var blackbox: js.UndefOr[Boolean] = js.undefined
    
    /**
      * For custom validation function. If you use an arrow function the context
      * for "this" will not be available. Use "custom: function() { return
      * something(this.value); }" instead.
      */
    var custom: js.UndefOr[Validator] = js.undefined
    
    var decimal: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    var exclusiveMax: js.UndefOr[Boolean] = js.undefined
    
    var exclusiveMin: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String | js.Function0[String]] = js.undefined
    
    var max: js.UndefOr[Double | Boolean | js.Date | (js.Function0[Double | Boolean | js.Date])] = js.undefined
    
    var maxCount: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    var min: js.UndefOr[Double | Boolean | js.Date | (js.Function0[Double | Boolean | js.Date])] = js.undefined
    
    var minCount: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    var optional: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
    
    var regEx: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.undefined
    
    var required: js.UndefOr[Boolean | js.Function0[Boolean]] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
    
    var `type`: Any
  }
  object SchemaDefinition {
    
    inline def apply(`type`: Any): SchemaDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchemaDefinition] (val x: Self) extends AnyVal {
      
      inline def setAllowedValues(value: js.Array[Any] | js.Function0[js.Array[Any]]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
      
      inline def setAllowedValuesFunction0(value: () => js.Array[Any]): Self = StObject.set(x, "allowedValues", js.Any.fromFunction0(value))
      
      inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
      
      inline def setAllowedValuesVarargs(value: Any*): Self = StObject.set(x, "allowedValues", js.Array(value*))
      
      inline def setAutoValue(value: js.ThisFunction0[/* this */ AutoValueContext, Any]): Self = StObject.set(x, "autoValue", value.asInstanceOf[js.Any])
      
      inline def setAutoValueUndefined: Self = StObject.set(x, "autoValue", js.undefined)
      
      inline def setBlackbox(value: Boolean): Self = StObject.set(x, "blackbox", value.asInstanceOf[js.Any])
      
      inline def setBlackboxUndefined: Self = StObject.set(x, "blackbox", js.undefined)
      
      inline def setCustom(value: Validator): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setDecimal(value: Boolean): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setDecimalUndefined: Self = StObject.set(x, "decimal", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setExclusiveMax(value: Boolean): Self = StObject.set(x, "exclusiveMax", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMaxUndefined: Self = StObject.set(x, "exclusiveMax", js.undefined)
      
      inline def setExclusiveMin(value: Boolean): Self = StObject.set(x, "exclusiveMin", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMinUndefined: Self = StObject.set(x, "exclusiveMin", js.undefined)
      
      inline def setLabel(value: String | js.Function0[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction0(value: () => String): Self = StObject.set(x, "label", js.Any.fromFunction0(value))
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMax(value: Double | Boolean | js.Date | (js.Function0[Double | Boolean | js.Date])): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxCount(value: Double | js.Function0[Double]): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountFunction0(value: () => Double): Self = StObject.set(x, "maxCount", js.Any.fromFunction0(value))
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setMaxFunction0(value: () => Double | Boolean | js.Date): Self = StObject.set(x, "max", js.Any.fromFunction0(value))
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double | Boolean | js.Date | (js.Function0[Double | Boolean | js.Date])): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinCount(value: Double | js.Function0[Double]): Self = StObject.set(x, "minCount", value.asInstanceOf[js.Any])
      
      inline def setMinCountFunction0(value: () => Double): Self = StObject.set(x, "minCount", js.Any.fromFunction0(value))
      
      inline def setMinCountUndefined: Self = StObject.set(x, "minCount", js.undefined)
      
      inline def setMinFunction0(value: () => Double | Boolean | js.Date): Self = StObject.set(x, "min", js.Any.fromFunction0(value))
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOptional(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalFunction0(value: () => Boolean): Self = StObject.set(x, "optional", js.Any.fromFunction0(value))
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setRegEx(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "regEx", value.asInstanceOf[js.Any])
      
      inline def setRegExUndefined: Self = StObject.set(x, "regEx", js.undefined)
      
      inline def setRegExVarargs(value: js.RegExp*): Self = StObject.set(x, "regEx", js.Array(value*))
      
      inline def setRequired(value: Boolean | js.Function0[Boolean]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredFunction0(value: () => Boolean): Self = StObject.set(x, "required", js.Any.fromFunction0(value))
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type SimpleSchemaCreateFunc = js.Function1[/* options */ Label, String]
  
  type SimpleSchemaDefinition = (StringDictionary[
    SchemaDefinition | BooleanConstructor | StringConstructor | NumberConstructor | DateConstructor | ArrayConstructor | IntegerSchema | (js.Array[IntegerSchema | NumberConstructor | SimpleSchema | StringConstructor]) | String | js.RegExp | SimpleSchema
  ]) | js.Array[Any]
  
  type SimpleSchemaMessageType = StringDictionary[String | SimpleSchemaCreateFunc]
  
  type SimpleSchemaMessagesDict = Record[String, SimpleSchemaMessageType]
  
  trait SimpleSchemaOptions extends StObject {
    
    var check: js.UndefOr[FnCall] = js.undefined
    
    var clean: js.UndefOr[CleanOption] = js.undefined
    
    var defaultLabel: js.UndefOr[String] = js.undefined
    
    var humanizeAutoLabels: js.UndefOr[Boolean] = js.undefined
    
    var requiredByDefault: js.UndefOr[Boolean] = js.undefined
    
    var tracker: js.UndefOr[Any] = js.undefined
  }
  object SimpleSchemaOptions {
    
    inline def apply(): SimpleSchemaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleSchemaOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleSchemaOptions] (val x: Self) extends AnyVal {
      
      inline def setCheck(value: FnCall): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setClean(value: CleanOption): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      inline def setDefaultLabel(value: String): Self = StObject.set(x, "defaultLabel", value.asInstanceOf[js.Any])
      
      inline def setDefaultLabelUndefined: Self = StObject.set(x, "defaultLabel", js.undefined)
      
      inline def setHumanizeAutoLabels(value: Boolean): Self = StObject.set(x, "humanizeAutoLabels", value.asInstanceOf[js.Any])
      
      inline def setHumanizeAutoLabelsUndefined: Self = StObject.set(x, "humanizeAutoLabels", js.undefined)
      
      inline def setRequiredByDefault(value: Boolean): Self = StObject.set(x, "requiredByDefault", value.asInstanceOf[js.Any])
      
      inline def setRequiredByDefaultUndefined: Self = StObject.set(x, "requiredByDefault", js.undefined)
      
      inline def setTracker(value: Any): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
      
      inline def setTrackerUndefined: Self = StObject.set(x, "tracker", js.undefined)
    }
  }
  
  @js.native
  trait SimpleSchemaValidationContextStatic extends StObject {
    
    def isValid(): Boolean = js.native
    
    def keyErrorMessage(name: Any): String = js.native
    
    def keyIsInvalid(name: Any): Boolean = js.native
    
    def validate(obj: Any): Boolean = js.native
    def validate(obj: Any, options: ValidationOption): Boolean = js.native
  }
  
  trait SimpleSchemaValidationError
    extends StObject
       with /* key */ StringDictionary[Double | String] {
    
    var `type`: String
  }
  object SimpleSchemaValidationError {
    
    inline def apply(`type`: String): SimpleSchemaValidationError = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleSchemaValidationError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleSchemaValidationError] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidationContext
    extends StObject
       with SimpleSchemaValidationContextStatic {
    
    def addValidationErrors(errors: Any): Unit = js.native
    
    def clean(args: Any*): Any = js.native
    
    def getErrorForKey(key: Any, args: Any*): Any = js.native
    
    def reset(): Unit = js.native
    
    def setValidationErrors(errors: Any): Unit = js.native
    
    def validationErrors(): Any = js.native
  }
  
  trait ValidationOption extends StObject {
    
    var extendedCustomContext: js.UndefOr[Record[String, Any]] = js.undefined
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    var keys: js.UndefOr[js.Array[String]] = js.undefined
    
    var modifier: js.UndefOr[Boolean] = js.undefined
    
    var upsert: js.UndefOr[Boolean] = js.undefined
  }
  object ValidationOption {
    
    inline def apply(): ValidationOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidationOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationOption] (val x: Self) extends AnyVal {
      
      inline def setExtendedCustomContext(value: Record[String, Any]): Self = StObject.set(x, "extendedCustomContext", value.asInstanceOf[js.Any])
      
      inline def setExtendedCustomContextUndefined: Self = StObject.set(x, "extendedCustomContext", js.undefined)
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setModifier(value: Boolean): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
      
      inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
      
      inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    }
  }
  
  type Validator = js.ThisFunction0[
    /* this */ CustomValidationContext, 
    js.UndefOr[String | SimpleSchemaValidationError]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.simplSchema.anon.cleantrueValidationOption
    - typings.simplSchema.anon.cleanfalseundefinedValida
  */
  trait ValidatorOption extends StObject
  object ValidatorOption {
    
    inline def cleanfalseundefinedValida(): typings.simplSchema.anon.cleanfalseundefinedValida = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.simplSchema.anon.cleanfalseundefinedValida]
    }
    
    inline def cleantrueValidationOption(): typings.simplSchema.anon.cleantrueValidationOption = {
      val __obj = js.Dynamic.literal(clean = true)
      __obj.asInstanceOf[typings.simplSchema.anon.cleantrueValidationOption]
    }
  }
}
