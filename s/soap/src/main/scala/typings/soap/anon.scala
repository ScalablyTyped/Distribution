package typings.soap

import org.scalablytyped.runtime.StringDictionary
import typings.soap.elementsMod.Element
import typings.soap.typesMod.IXmlAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Input extends StObject {
    
    var input: js.Any = js.native
    
    var output: js.Any = js.native
  }
  object Input {
    
    @scala.inline
    def apply(input: js.Any, output: js.Any): Input = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[Input]
    }
    
    @scala.inline
    implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: js.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: js.Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name[T] extends StObject {
    
    var name: T = js.native
    
    var prefix: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply[T](name: T, prefix: String): Name[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name[T]]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name[_], T] (val x: Self with Name[T]) extends AnyVal {
      
      @scala.inline
      def setName(value: T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Namespace extends StObject {
    
    var namespace: String = js.native
    
    var xmlnsAttributes: js.UndefOr[js.Array[IXmlAttribute]] = js.native
  }
  object Namespace {
    
    @scala.inline
    def apply(namespace: String): Namespace = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Namespace]
    }
    
    @scala.inline
    implicit class NamespaceMutableBuilder[Self <: Namespace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsAttributes(value: js.Array[IXmlAttribute]): Self = StObject.set(x, "xmlnsAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlnsAttributesUndefined: Self = StObject.set(x, "xmlnsAttributes", js.undefined)
      
      @scala.inline
      def setXmlnsAttributesVarargs(value: IXmlAttribute*): Self = StObject.set(x, "xmlnsAttributes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Namespaces extends StObject {
    
    var namespaces: js.UndefOr[js.Array[String]] = js.native
    
    var `override`: js.UndefOr[Boolean] = js.native
  }
  object Namespaces {
    
    @scala.inline
    def apply(): Namespaces = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Namespaces]
    }
    
    @scala.inline
    implicit class NamespacesMutableBuilder[Self <: Namespaces] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamespaces(value: js.Array[String]): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespacesUndefined: Self = StObject.set(x, "namespaces", js.undefined)
      
      @scala.inline
      def setNamespacesVarargs(value: String*): Self = StObject.set(x, "namespaces", js.Array(value :_*))
      
      @scala.inline
      def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    }
  }
  
  @js.native
  trait Prefix extends StObject {
    
    var name: String = js.native
    
    var prefix: String = js.native
  }
  object Prefix {
    
    @scala.inline
    def apply(name: String, prefix: String): Prefix = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prefix]
    }
    
    @scala.inline
    implicit class PrefixMutableBuilder[Self <: Prefix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Subcode extends StObject {
    
    var Subcode: js.UndefOr[Value] = js.native
    
    var Value: String = js.native
  }
  object Subcode {
    
    @scala.inline
    def apply(Value: String): Subcode = {
      val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subcode]
    }
    
    @scala.inline
    implicit class SubcodeMutableBuilder[Self <: Subcode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubcode(value: Value): Self = StObject.set(x, "Subcode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubcodeUndefined: Self = StObject.set(x, "Subcode", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Text extends StObject {
    
    var Text: String = js.native
  }
  object Text {
    
    @scala.inline
    def apply(Text: String): Text = {
      val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Types extends StObject {
    
    var types: StringDictionary[Element] = js.native
  }
  object Types {
    
    @scala.inline
    def apply(types: StringDictionary[Element]): Types = {
      val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Types]
    }
    
    @scala.inline
    implicit class TypesMutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTypes(value: StringDictionary[Element]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var value: String = js.native
  }
  object Value {
    
    @scala.inline
    def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
