package typings.protocolBuffersSchema

import org.scalablytyped.runtime.StringDictionary
import typings.protocolBuffersSchema.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Enum extends StObject {
    
    var name: String
    
    var options: Options
    
    var values: StringDictionary[typings.protocolBuffersSchema.anon.Options]
  }
  object Enum {
    
    @scala.inline
    def apply(
      name: String,
      options: Options,
      values: StringDictionary[typings.protocolBuffersSchema.anon.Options]
    ): Enum = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Enum]
    }
    
    @scala.inline
    implicit class EnumMutableBuilder[Self <: Enum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: StringDictionary[typings.protocolBuffersSchema.anon.Options]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extend extends StObject {
    
    var message: Message
    
    var name: String
  }
  object Extend {
    
    @scala.inline
    def apply(message: Message, name: String): Extend = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extend]
    }
    
    @scala.inline
    implicit class ExtendMutableBuilder[Self <: Extend] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Extension extends StObject {
    
    var from: Double
    
    var to: Double
  }
  object Extension {
    
    @scala.inline
    def apply(from: Double, to: Double): Extension = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extension]
    }
    
    @scala.inline
    implicit class ExtensionMutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait Field extends StObject {
    
    var map: From
    
    var name: String
    
    var oneof: Null | String
    
    var options: FieldOptions
    
    var repeated: Boolean
    
    var required: Boolean
    
    var tag: Double
    
    var `type`: String
  }
  object Field {
    
    @scala.inline
    def apply(
      map: From,
      name: String,
      options: FieldOptions,
      repeated: Boolean,
      required: Boolean,
      tag: Double,
      `type`: String
    ): Field = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], oneof = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMap(value: From): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneof(value: String): Self = StObject.set(x, "oneof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneofNull: Self = StObject.set(x, "oneof", null)
      
      @scala.inline
      def setOptions(value: FieldOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type FieldOptions = StringDictionary[String]
  
  trait Message extends StObject {
    
    var enums: js.Array[Enum]
    
    var `extends`: js.Array[Extend]
    
    var extensions: js.Array[Extension]
    
    var fields: js.Array[Field]
    
    var messages: js.Array[Message]
    
    var name: String
    
    var options: Options
  }
  object Message {
    
    @scala.inline
    def apply(
      enums: js.Array[Enum],
      `extends`: js.Array[Extend],
      extensions: js.Array[Extension],
      fields: js.Array[Field],
      messages: js.Array[Message],
      name: String,
      options: Options
    ): Message = {
      val __obj = js.Dynamic.literal(enums = enums.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnums(value: js.Array[Enum]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumsVarargs(value: Enum*): Self = StObject.set(x, "enums", js.Array(value :_*))
      
      @scala.inline
      def setExtends(value: js.Array[Extend]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsVarargs(value: Extend*): Self = StObject.set(x, "extends", js.Array(value :_*))
      
      @scala.inline
      def setExtensions(value: js.Array[Extension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait Method extends StObject {
    
    var client_streaming: Boolean
    
    var input_type: String
    
    var name: String
    
    var options: Options
    
    var output_type: String
    
    var server_streaming: Boolean
  }
  object Method {
    
    @scala.inline
    def apply(
      client_streaming: Boolean,
      input_type: String,
      name: String,
      options: Options,
      output_type: String,
      server_streaming: Boolean
    ): Method = {
      val __obj = js.Dynamic.literal(client_streaming = client_streaming.asInstanceOf[js.Any], input_type = input_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], output_type = output_type.asInstanceOf[js.Any], server_streaming = server_streaming.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient_streaming(value: Boolean): Self = StObject.set(x, "client_streaming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput_type(value: String): Self = StObject.set(x, "input_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput_type(value: String): Self = StObject.set(x, "output_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer_streaming(value: Boolean): Self = StObject.set(x, "server_streaming", value.asInstanceOf[js.Any])
    }
  }
  
  type Option = StringDictionary[String | Boolean]
  
  type Options = StringDictionary[String | Boolean | Option | js.Array[Option]]
  
  trait Schema extends StObject {
    
    @JSName("package")
    var _package: Null | String
    
    var enums: js.Array[Enum]
    
    var `extends`: js.Array[Extend]
    
    var imports: js.Array[String]
    
    var messages: js.Array[Message]
    
    var options: Options
    
    var services: js.UndefOr[js.Array[Service]] = js.undefined
    
    var syntax: Double
  }
  object Schema {
    
    @scala.inline
    def apply(
      enums: js.Array[Enum],
      `extends`: js.Array[Extend],
      imports: js.Array[String],
      messages: js.Array[Message],
      options: Options,
      syntax: Double
    ): Schema = {
      val __obj = js.Dynamic.literal(enums = enums.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
      __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(null)
      __obj.asInstanceOf[Schema]
    }
    
    @scala.inline
    implicit class SchemaMutableBuilder[Self <: Schema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnums(value: js.Array[Enum]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumsVarargs(value: Enum*): Self = StObject.set(x, "enums", js.Array(value :_*))
      
      @scala.inline
      def setExtends(value: js.Array[Extend]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsVarargs(value: Extend*): Self = StObject.set(x, "extends", js.Array(value :_*))
      
      @scala.inline
      def setImports(value: js.Array[String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportsVarargs(value: String*): Self = StObject.set(x, "imports", js.Array(value :_*))
      
      @scala.inline
      def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServices(value: js.Array[Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
      
      @scala.inline
      def setServicesVarargs(value: Service*): Self = StObject.set(x, "services", js.Array(value :_*))
      
      @scala.inline
      def setSyntax(value: Double): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_packageNull: Self = StObject.set(x, "package", null)
    }
  }
  
  trait Service extends StObject {
    
    var methods: js.Array[Method]
    
    var name: String
    
    var options: Options
  }
  object Service {
    
    @scala.inline
    def apply(methods: js.Array[Method], name: String, options: Options): Service = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    @scala.inline
    implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethods(value: js.Array[Method]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsVarargs(value: Method*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
