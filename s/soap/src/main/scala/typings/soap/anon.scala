package typings.soap

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.soap.elementsMod.Element
import typings.soap.typesMod.IXmlAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: Buffer
    
    var headers: StringDictionary[String]
  }
  object Body {
    
    inline def apply(body: Buffer, headers: StringDictionary[String]): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait Elements extends StObject {
    
    var elements: StringDictionary[Element]
    
    var types: StringDictionary[Element]
  }
  object Elements {
    
    inline def apply(elements: StringDictionary[Element], types: StringDictionary[Element]): Elements = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Elements]
    }
    
    extension [Self <: Elements](x: Self) {
      
      inline def setElements(value: StringDictionary[Element]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: StringDictionary[Element]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait Input extends StObject {
    
    var input: Any
    
    var output: Any
  }
  object Input {
    
    inline def apply(input: Any, output: Any): Input = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[Input]
    }
    
    extension [Self <: Input](x: Self) {
      
      inline def setInput(value: Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name[T] extends StObject {
    
    var name: T
    
    var prefix: String
  }
  object Name {
    
    inline def apply[T](name: T, prefix: String): Name[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name[T]]
    }
    
    extension [Self <: Name[?], T](x: Self & Name[T]) {
      
      inline def setName(value: T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait Namespace extends StObject {
    
    var namespace: String
    
    var xmlnsAttributes: js.UndefOr[js.Array[IXmlAttribute]] = js.undefined
  }
  object Namespace {
    
    inline def apply(namespace: String): Namespace = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Namespace]
    }
    
    extension [Self <: Namespace](x: Self) {
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setXmlnsAttributes(value: js.Array[IXmlAttribute]): Self = StObject.set(x, "xmlnsAttributes", value.asInstanceOf[js.Any])
      
      inline def setXmlnsAttributesUndefined: Self = StObject.set(x, "xmlnsAttributes", js.undefined)
      
      inline def setXmlnsAttributesVarargs(value: IXmlAttribute*): Self = StObject.set(x, "xmlnsAttributes", js.Array(value*))
    }
  }
  
  trait Namespaces extends StObject {
    
    var namespaces: js.UndefOr[js.Array[String]] = js.undefined
    
    var `override`: js.UndefOr[Boolean] = js.undefined
  }
  object Namespaces {
    
    inline def apply(): Namespaces = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Namespaces]
    }
    
    extension [Self <: Namespaces](x: Self) {
      
      inline def setNamespaces(value: js.Array[String]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
      
      inline def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
      
      inline def setNamespacesVarargs(value: String*): Self = StObject.set(x, "namespaces", js.Array(value*))
      
      inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    }
  }
  
  trait Prefix extends StObject {
    
    var name: String
    
    var prefix: String
  }
  object Prefix {
    
    inline def apply(name: String, prefix: String): Prefix = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prefix]
    }
    
    extension [Self <: Prefix](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait Subcode extends StObject {
    
    var Subcode: js.UndefOr[Value] = js.undefined
    
    var Value: String
  }
  object Subcode {
    
    inline def apply(Value: String): Subcode = {
      val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subcode]
    }
    
    extension [Self <: Subcode](x: Self) {
      
      inline def setSubcode(value: Value): Self = StObject.set(x, "Subcode", value.asInstanceOf[js.Any])
      
      inline def setSubcodeUndefined: Self = StObject.set(x, "Subcode", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var Text: String
  }
  object Text {
    
    inline def apply(Text: String): Text = {
      val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var Value: String
  }
  object Value {
    
    inline def apply(Value: String): Value = {
      val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
}
