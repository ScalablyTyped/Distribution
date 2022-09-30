package typings.simplSchema

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.meteor.checkMod.Match.Matcher
import typings.meteor.checkMod.Match.Pattern
import typings.simplSchema.mod.IntegerSchema
import typings.simplSchema.mod.SchemaDefinition
import typings.simplSchema.mod.SimpleSchema
import typings.simplSchema.mod.SimpleSchemaDefinition
import typings.simplSchema.mod.SimpleSchemaMessagesDict
import typings.simplSchema.mod.SimpleSchemaOptions
import typings.simplSchema.mod.ValidationOption
import typings.simplSchema.mod.Validator
import typings.simplSchema.mod.ValidatorOption
import typings.simplSchema.simplSchemaBooleans.`false`
import typings.simplSchema.simplSchemaBooleans.`true`
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.DateConstructor
import typings.std.FunctionConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.Record
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BADDATE extends StObject {
    
    var BAD_DATE: String
    
    var EXPECTED_TYPE: String
    
    var FAILED_REGULAR_EXPRESSION: String
    
    var KEY_NOT_IN_SCHEMA: String
    
    var MAX_COUNT: String
    
    var MAX_DATE: String
    
    var MAX_NUMBER: String
    
    var MAX_NUMBER_EXCLUSIVE: String
    
    var MAX_STRING: String
    
    var MIN_COUNT: String
    
    var MIN_DATE: String
    
    var MIN_NUMBER: String
    
    var MIN_NUMBER_EXCLUSIVE: String
    
    var MIN_STRING: String
    
    var MUST_BE_INTEGER: String
    
    var REQUIRED: String
    
    var VALUE_NOT_ALLOWED: String
  }
  object BADDATE {
    
    inline def apply(
      BAD_DATE: String,
      EXPECTED_TYPE: String,
      FAILED_REGULAR_EXPRESSION: String,
      KEY_NOT_IN_SCHEMA: String,
      MAX_COUNT: String,
      MAX_DATE: String,
      MAX_NUMBER: String,
      MAX_NUMBER_EXCLUSIVE: String,
      MAX_STRING: String,
      MIN_COUNT: String,
      MIN_DATE: String,
      MIN_NUMBER: String,
      MIN_NUMBER_EXCLUSIVE: String,
      MIN_STRING: String,
      MUST_BE_INTEGER: String,
      REQUIRED: String,
      VALUE_NOT_ALLOWED: String
    ): BADDATE = {
      val __obj = js.Dynamic.literal(BAD_DATE = BAD_DATE.asInstanceOf[js.Any], EXPECTED_TYPE = EXPECTED_TYPE.asInstanceOf[js.Any], FAILED_REGULAR_EXPRESSION = FAILED_REGULAR_EXPRESSION.asInstanceOf[js.Any], KEY_NOT_IN_SCHEMA = KEY_NOT_IN_SCHEMA.asInstanceOf[js.Any], MAX_COUNT = MAX_COUNT.asInstanceOf[js.Any], MAX_DATE = MAX_DATE.asInstanceOf[js.Any], MAX_NUMBER = MAX_NUMBER.asInstanceOf[js.Any], MAX_NUMBER_EXCLUSIVE = MAX_NUMBER_EXCLUSIVE.asInstanceOf[js.Any], MAX_STRING = MAX_STRING.asInstanceOf[js.Any], MIN_COUNT = MIN_COUNT.asInstanceOf[js.Any], MIN_DATE = MIN_DATE.asInstanceOf[js.Any], MIN_NUMBER = MIN_NUMBER.asInstanceOf[js.Any], MIN_NUMBER_EXCLUSIVE = MIN_NUMBER_EXCLUSIVE.asInstanceOf[js.Any], MIN_STRING = MIN_STRING.asInstanceOf[js.Any], MUST_BE_INTEGER = MUST_BE_INTEGER.asInstanceOf[js.Any], REQUIRED = REQUIRED.asInstanceOf[js.Any], VALUE_NOT_ALLOWED = VALUE_NOT_ALLOWED.asInstanceOf[js.Any])
      __obj.asInstanceOf[BADDATE]
    }
    
    extension [Self <: BADDATE](x: Self) {
      
      inline def setBAD_DATE(value: String): Self = StObject.set(x, "BAD_DATE", value.asInstanceOf[js.Any])
      
      inline def setEXPECTED_TYPE(value: String): Self = StObject.set(x, "EXPECTED_TYPE", value.asInstanceOf[js.Any])
      
      inline def setFAILED_REGULAR_EXPRESSION(value: String): Self = StObject.set(x, "FAILED_REGULAR_EXPRESSION", value.asInstanceOf[js.Any])
      
      inline def setKEY_NOT_IN_SCHEMA(value: String): Self = StObject.set(x, "KEY_NOT_IN_SCHEMA", value.asInstanceOf[js.Any])
      
      inline def setMAX_COUNT(value: String): Self = StObject.set(x, "MAX_COUNT", value.asInstanceOf[js.Any])
      
      inline def setMAX_DATE(value: String): Self = StObject.set(x, "MAX_DATE", value.asInstanceOf[js.Any])
      
      inline def setMAX_NUMBER(value: String): Self = StObject.set(x, "MAX_NUMBER", value.asInstanceOf[js.Any])
      
      inline def setMAX_NUMBER_EXCLUSIVE(value: String): Self = StObject.set(x, "MAX_NUMBER_EXCLUSIVE", value.asInstanceOf[js.Any])
      
      inline def setMAX_STRING(value: String): Self = StObject.set(x, "MAX_STRING", value.asInstanceOf[js.Any])
      
      inline def setMIN_COUNT(value: String): Self = StObject.set(x, "MIN_COUNT", value.asInstanceOf[js.Any])
      
      inline def setMIN_DATE(value: String): Self = StObject.set(x, "MIN_DATE", value.asInstanceOf[js.Any])
      
      inline def setMIN_NUMBER(value: String): Self = StObject.set(x, "MIN_NUMBER", value.asInstanceOf[js.Any])
      
      inline def setMIN_NUMBER_EXCLUSIVE(value: String): Self = StObject.set(x, "MIN_NUMBER_EXCLUSIVE", value.asInstanceOf[js.Any])
      
      inline def setMIN_STRING(value: String): Self = StObject.set(x, "MIN_STRING", value.asInstanceOf[js.Any])
      
      inline def setMUST_BE_INTEGER(value: String): Self = StObject.set(x, "MUST_BE_INTEGER", value.asInstanceOf[js.Any])
      
      inline def setREQUIRED(value: String): Self = StObject.set(x, "REQUIRED", value.asInstanceOf[js.Any])
      
      inline def setVALUE_NOT_ALLOWED(value: String): Self = StObject.set(x, "VALUE_NOT_ALLOWED", value.asInstanceOf[js.Any])
    }
  }
  
  trait Domain extends StObject {
    
    var Domain: js.RegExp
    
    var Email: js.RegExp
    
    var EmailWithTLD: js.RegExp
    
    var IP: js.RegExp
    
    var IPv4: js.RegExp
    
    var IPv6: js.RegExp
    
    var Id: js.RegExp
    
    var Phone: js.RegExp
    
    var Url: js.RegExp
    
    var WeakDomain: js.RegExp
    
    var ZipCode: js.RegExp
  }
  object Domain {
    
    inline def apply(
      Domain: js.RegExp,
      Email: js.RegExp,
      EmailWithTLD: js.RegExp,
      IP: js.RegExp,
      IPv4: js.RegExp,
      IPv6: js.RegExp,
      Id: js.RegExp,
      Phone: js.RegExp,
      Url: js.RegExp,
      WeakDomain: js.RegExp,
      ZipCode: js.RegExp
    ): Domain = {
      val __obj = js.Dynamic.literal(Domain = Domain.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], EmailWithTLD = EmailWithTLD.asInstanceOf[js.Any], IP = IP.asInstanceOf[js.Any], IPv4 = IPv4.asInstanceOf[js.Any], IPv6 = IPv6.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Phone = Phone.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], WeakDomain = WeakDomain.asInstanceOf[js.Any], ZipCode = ZipCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    extension [Self <: Domain](x: Self) {
      
      inline def setDomain(value: js.RegExp): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: js.RegExp): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
      
      inline def setEmailWithTLD(value: js.RegExp): Self = StObject.set(x, "EmailWithTLD", value.asInstanceOf[js.Any])
      
      inline def setIP(value: js.RegExp): Self = StObject.set(x, "IP", value.asInstanceOf[js.Any])
      
      inline def setIPv4(value: js.RegExp): Self = StObject.set(x, "IPv4", value.asInstanceOf[js.Any])
      
      inline def setIPv6(value: js.RegExp): Self = StObject.set(x, "IPv6", value.asInstanceOf[js.Any])
      
      inline def setId(value: js.RegExp): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: js.RegExp): Self = StObject.set(x, "Phone", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: js.RegExp): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
      
      inline def setWeakDomain(value: js.RegExp): Self = StObject.set(x, "WeakDomain", value.asInstanceOf[js.Any])
      
      inline def setZipCode(value: js.RegExp): Self = StObject.set(x, "ZipCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndPointsOnly extends StObject {
    
    var endPointsOnly: Boolean
  }
  object EndPointsOnly {
    
    inline def apply(endPointsOnly: Boolean): EndPointsOnly = {
      val __obj = js.Dynamic.literal(endPointsOnly = endPointsOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndPointsOnly]
    }
    
    extension [Self <: EndPointsOnly](x: Self) {
      
      inline def setEndPointsOnly(value: Boolean): Self = StObject.set(x, "endPointsOnly", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(value: Any, pattern: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())))*/ Boolean = js.native
    def apply(value: Any, pattern: Boolean): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(boolean))),IArray())))*/ Boolean = js.native
    def apply(value: Any, pattern: Double): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())))*/ Boolean = js.native
    def apply(value: Any, pattern: Null): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())))*/ Boolean = js.native
    def apply(value: Any, pattern: Unit): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean = js.native
    def apply(value: Any, pattern: BooleanConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(BooleanConstructor))),IArray())))*/ Boolean = js.native
    def apply(value: Any, pattern: FunctionConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(FunctionConstructor))),IArray())))*/ Boolean = js.native
    def apply(value: Any, pattern: NumberConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(NumberConstructor))),IArray())))*/ Boolean = js.native
    def apply(value: Any, pattern: ObjectConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(ObjectConstructor))),IArray())))*/ Boolean = js.native
    def apply(value: Any, pattern: StringConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(StringConstructor))),IArray())))*/ Boolean = js.native
    def apply[T /* <: (Instantiable1[/* args (repeated) */ Any, Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[Any] */](value: Any, pattern: T): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
  }
  
  trait KeepArrays extends StObject {
    
    var keepArrays: js.UndefOr[Boolean] = js.undefined
  }
  object KeepArrays {
    
    inline def apply(): KeepArrays = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeepArrays]
    }
    
    extension [Self <: KeepArrays](x: Self) {
      
      inline def setKeepArrays(value: Boolean): Self = StObject.set(x, "keepArrays", value.asInstanceOf[js.Any])
      
      inline def setKeepArraysUndefined: Self = StObject.set(x, "keepArrays", js.undefined)
    }
  }
  
  trait Label extends StObject {
    
    var label: String
    
    var regExp: String
  }
  object Label {
    
    inline def apply(label: String, regExp: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: String): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Messages extends StObject {
    
    var messages: SimpleSchemaMessagesDict
  }
  object Messages {
    
    inline def apply(messages: SimpleSchemaMessagesDict): Messages = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Messages]
    }
    
    extension [Self <: Messages](x: Self) {
      
      inline def setMessages(value: SimpleSchemaMessagesDict): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofSimpleSchema
    extends StObject
       with Instantiable1[/* schema */ SimpleSchemaDefinition, SimpleSchema]
       with Instantiable2[/* schema */ SimpleSchemaDefinition, /* options */ SimpleSchemaOptions, SimpleSchema] {
    
    var ErrorTypes: BADDATE = js.native
    
    var Integer: IntegerSchema = js.native
    
    var RegEx: Domain = js.native
    
    def addValidator(validator: Validator): Unit = js.native
    
    def extendOptions(options: js.Array[String]): Unit = js.native
    
    def isSimpleSchema(obj: Any): Boolean = js.native
    
    def oneOf(
      types: (js.RegExp | SchemaDefinition | BooleanConstructor | StringConstructor | NumberConstructor | DateConstructor | ArrayConstructor | IntegerSchema)*
    ): SimpleSchema = js.native
    
    def setDefaultMessages(messages: Messages): Unit = js.native
    
    def validate(obj: Any, schema: SimpleSchema): Unit = js.native
    def validate(obj: Any, schema: SimpleSchema, options: ValidationOption): Unit = js.native
  }
  
  /* Inlined {  clean :false | undefined} & simpl-schema.simpl-schema.ValidationOption */
  trait cleanfalseundefinedValida
    extends StObject
       with ValidatorOption {
    
    var clean: js.UndefOr[`false`] = js.undefined
    
    var extendedCustomContext: js.UndefOr[Record[String, Any]] = js.undefined
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    var keys: js.UndefOr[js.Array[String]] = js.undefined
    
    var modifier: js.UndefOr[Boolean] = js.undefined
    
    var upsert: js.UndefOr[Boolean] = js.undefined
  }
  object cleanfalseundefinedValida {
    
    inline def apply(): cleanfalseundefinedValida = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[cleanfalseundefinedValida]
    }
    
    extension [Self <: cleanfalseundefinedValida](x: Self) {
      
      inline def setClean(value: `false`): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
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
  
  /* Inlined {  clean :true} & simpl-schema.simpl-schema.ValidationOption & simpl-schema.simpl-schema.CleanOption */
  trait cleantrueValidationOption
    extends StObject
       with ValidatorOption {
    
    var autoConvert: js.UndefOr[Boolean] = js.undefined
    
    var clean: `true`
    
    var extendAutoValueContext: js.UndefOr[Boolean] = js.undefined
    
    var extendedCustomContext: js.UndefOr[Record[String, Any]] = js.undefined
    
    var filter: js.UndefOr[Boolean] = js.undefined
    
    var getAutoValues: js.UndefOr[Boolean] = js.undefined
    
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    
    var isModifier: js.UndefOr[Boolean] = js.undefined
    
    var isUpsert: js.UndefOr[Boolean] = js.undefined
    
    var keys: js.UndefOr[js.Array[String]] = js.undefined
    
    var modifier: js.UndefOr[Boolean] = js.undefined
    
    var mongoObject: js.UndefOr[Boolean] = js.undefined
    
    var mutate: js.UndefOr[Boolean] = js.undefined
    
    var removeEmptyStrings: js.UndefOr[Boolean] = js.undefined
    
    var removeNullsFromArrays: js.UndefOr[Boolean] = js.undefined
    
    var trimStrings: js.UndefOr[Boolean] = js.undefined
    
    var upsert: js.UndefOr[Boolean] = js.undefined
  }
  object cleantrueValidationOption {
    
    inline def apply(): cleantrueValidationOption = {
      val __obj = js.Dynamic.literal(clean = true)
      __obj.asInstanceOf[cleantrueValidationOption]
    }
    
    extension [Self <: cleantrueValidationOption](x: Self) {
      
      inline def setAutoConvert(value: Boolean): Self = StObject.set(x, "autoConvert", value.asInstanceOf[js.Any])
      
      inline def setAutoConvertUndefined: Self = StObject.set(x, "autoConvert", js.undefined)
      
      inline def setClean(value: `true`): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      inline def setExtendAutoValueContext(value: Boolean): Self = StObject.set(x, "extendAutoValueContext", value.asInstanceOf[js.Any])
      
      inline def setExtendAutoValueContextUndefined: Self = StObject.set(x, "extendAutoValueContext", js.undefined)
      
      inline def setExtendedCustomContext(value: Record[String, Any]): Self = StObject.set(x, "extendedCustomContext", value.asInstanceOf[js.Any])
      
      inline def setExtendedCustomContextUndefined: Self = StObject.set(x, "extendedCustomContext", js.undefined)
      
      inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGetAutoValues(value: Boolean): Self = StObject.set(x, "getAutoValues", value.asInstanceOf[js.Any])
      
      inline def setGetAutoValuesUndefined: Self = StObject.set(x, "getAutoValues", js.undefined)
      
      inline def setIgnore(value: js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setIsModifier(value: Boolean): Self = StObject.set(x, "isModifier", value.asInstanceOf[js.Any])
      
      inline def setIsModifierUndefined: Self = StObject.set(x, "isModifier", js.undefined)
      
      inline def setIsUpsert(value: Boolean): Self = StObject.set(x, "isUpsert", value.asInstanceOf[js.Any])
      
      inline def setIsUpsertUndefined: Self = StObject.set(x, "isUpsert", js.undefined)
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setModifier(value: Boolean): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
      
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
      
      inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
      
      inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
    }
  }
}
