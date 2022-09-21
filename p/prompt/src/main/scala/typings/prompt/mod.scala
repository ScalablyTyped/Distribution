package typings.prompt

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.ttyMod.ReadStream
import typings.node.ttyMod.WriteStream
import typings.prompt.promptStrings.SIGINT
import typings.prompt.promptStrings.invalid
import typings.prompt.promptStrings.pause
import typings.prompt.promptStrings.resume
import typings.prompt.promptStrings.start
import typings.prompt.promptStrings.stop
import typings.revalidator.Revalidator.Formats
import typings.revalidator.Revalidator.ISchema
import typings.revalidator.Revalidator.JSONSchema
import typings.revalidator.Revalidator.Types
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prompt", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends typings.prompt.mod.prompt
  @JSImport("prompt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def addProperties(obj: Any, values: js.Array[String | RevalidatorSchema]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addProperties")(obj.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  /* static member */
  inline def addProperties(obj: Any, values: js.Array[String | RevalidatorSchema], callback: GetCallback[Properties]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addProperties")(obj.asInstanceOf[js.Any], values.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @JSImport("prompt", "colors")
  @js.native
  def colors: Boolean = js.native
  inline def colors_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("prompt", "delimiter")
  @js.native
  def delimiter: String = js.native
  inline def delimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def get[T /* <: Properties */](values: js.Array[(/* keyof T */ String) | Schema | RevalidatorSchema]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(values.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  /* static member */
  inline def get[T /* <: Properties */](values: js.Array[(/* keyof T */ String) | Schema | RevalidatorSchema], callback: GetCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(values.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get[T /* <: Properties */](values: RevalidatorSchema): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(values.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def get[T /* <: Properties */](values: RevalidatorSchema, callback: GetCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(values.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def get[T /* <: Properties */](values: Schema): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(values.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def get[T /* <: Properties */](values: Schema, callback: GetCallback[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(values.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def history(): History_ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("history")().asInstanceOf[History_ | Null]
  inline def history(name: String): History_ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("history")(name.asInstanceOf[js.Any]).asInstanceOf[History_ | Null]
  inline def history(name: Double): History_ | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("history")(name.asInstanceOf[js.Any]).asInstanceOf[History_ | Null]
  
  /* static member */
  @JSImport("prompt", "message")
  @js.native
  def message: String = js.native
  inline def message_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("prompt", "override")
  @js.native
  val `override`: js.UndefOr[Any] = js.native
  
  /* static member */
  inline def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
  inline def start(options: StartOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  @JSImport("prompt", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  type AddCallback = js.Function1[/* err */ js.Error | Null, Unit]
  
  type AskFunction = js.Function0[Boolean]
  
  type BeforeFunction = js.Function1[/* line */ String, String]
  
  type GetCallback[T] = js.Function2[/* err */ js.Error | Null, /* result */ T, Unit]
  
  trait History_ extends StObject {
    
    var property: RevalidatorSchema | String
    
    var value: String
  }
  object History_ {
    
    inline def apply(property: RevalidatorSchema | String, value: String): History_ = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[History_]
    }
    
    extension [Self <: History_](x: Self) {
      
      inline def setProperty(value: RevalidatorSchema | String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Properties = StringDictionary[RevalidatorSchema | String]
  
  /* Inlined std.Partial<revalidator.Revalidator.ISchema<any>> & {  ask :prompt.prompt.AskFunction | undefined,   before :prompt.prompt.BeforeFunction | undefined,   name :string | undefined,   raw :[string, string] | undefined} */
  trait RevalidatorSchema extends StObject {
    
    var default: js.UndefOr[Any] = js.undefined
    
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    var ask: js.UndefOr[AskFunction] = js.undefined
    
    var before: js.UndefOr[BeforeFunction] = js.undefined
    
    var conform: js.UndefOr[js.Function2[/* value */ Any, /* data */ js.UndefOr[Any], Boolean]] = js.undefined
    
    var dependencies: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var divisibleBy: js.UndefOr[Double] = js.undefined
    
    var `enum`: js.UndefOr[js.Array[Any]] = js.undefined
    
    var exclusiveMaximum: js.UndefOr[Double] = js.undefined
    
    var exclusiveMinimum: js.UndefOr[Double] = js.undefined
    
    var format: js.UndefOr[Formats] = js.undefined
    
    var items: js.UndefOr[ISchema[Any] | JSONSchema[Any]] = js.undefined
    
    var maxItems: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var maximum: js.UndefOr[Double] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var messages: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var minItems: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var minimum: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var pattern: js.UndefOr[js.RegExp | String] = js.undefined
    
    var raw: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[Types | js.Array[Types]] = js.undefined
    
    var uniqueItems: js.UndefOr[Boolean] = js.undefined
  }
  object RevalidatorSchema {
    
    inline def apply(): RevalidatorSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevalidatorSchema]
    }
    
    extension [Self <: RevalidatorSchema](x: Self) {
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setAsk(value: () => Boolean): Self = StObject.set(x, "ask", js.Any.fromFunction0(value))
      
      inline def setAskUndefined: Self = StObject.set(x, "ask", js.undefined)
      
      inline def setBefore(value: /* line */ String => String): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setConform(value: (/* value */ Any, /* data */ js.UndefOr[Any]) => Boolean): Self = StObject.set(x, "conform", js.Any.fromFunction2(value))
      
      inline def setConformUndefined: Self = StObject.set(x, "conform", js.undefined)
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDependencies(value: String): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDivisibleBy(value: Double): Self = StObject.set(x, "divisibleBy", value.asInstanceOf[js.Any])
      
      inline def setDivisibleByUndefined: Self = StObject.set(x, "divisibleBy", js.undefined)
      
      inline def setEnum(value: js.Array[Any]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: Any*): Self = StObject.set(x, "enum", js.Array(value*))
      
      inline def setExclusiveMaximum(value: Double): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      inline def setExclusiveMinimum(value: Double): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      inline def setFormat(value: Formats): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setItems(value: ISchema[Any] | JSONSchema[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMessages(value: StringDictionary[String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPattern(value: js.RegExp | String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRaw(value: js.Tuple2[String, String]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setType(value: Types | js.Array[Types]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: Types*): Self = StObject.set(x, "type", js.Array(value*))
      
      inline def setUniqueItems(value: Boolean): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
      
      inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
    }
  }
  
  trait Schema extends StObject {
    
    var properties: Properties
  }
  object Schema {
    
    inline def apply(properties: Properties): Schema = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  trait StartOptions extends StObject {
    
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    var colors: js.UndefOr[Boolean] = js.undefined
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var memory: js.UndefOr[Double] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var noHandleSIGINT: js.UndefOr[Boolean] = js.undefined
    
    var stdin: js.UndefOr[ReadStream] = js.undefined
    
    var stdout: js.UndefOr[WriteStream] = js.undefined
  }
  object StartOptions {
    
    inline def apply(): StartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartOptions]
    }
    
    extension [Self <: StartOptions](x: Self) {
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setNoHandleSIGINT(value: Boolean): Self = StObject.set(x, "noHandleSIGINT", value.asInstanceOf[js.Any])
      
      inline def setNoHandleSIGINTUndefined: Self = StObject.set(x, "noHandleSIGINT", js.undefined)
      
      inline def setStdin(value: ReadStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
  
  @js.native
  trait prompt extends EventEmitter {
    
    def on(event: pause | resume | SIGINT | start | stop, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_invalid(
      event: invalid,
      listener: js.Function2[/* prop */ RevalidatorSchema | String, /* line */ Double, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_prompt(
      event: typings.prompt.promptStrings.prompt,
      listener: js.Function1[/* prop */ RevalidatorSchema | String, Unit]
    ): this.type = js.native
  }
}
