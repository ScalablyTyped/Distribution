package typings.serializeJavascript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Serialize JavaScript to a superset of JSON that includes regular expressions and functions.
    * @param input data to serialize
    * @param options optional object
    * @returns serialized data
    */
  @scala.inline
  def apply(input: js.Any): String = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(input: js.Any, options: SerializeJSOptions): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("serialize-javascript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait SerializeJSOptions extends StObject {
    
    /**
      * This option is to signal serialize() that we do not want serialize JavaScript function.
      * Just treat function like JSON.stringify do, but other features will work as expected.
      */
    var ignoreFunction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This option is a signal to serialize() that the object being serialized does not contain any function or regexps values.
      * This enables a hot-path that allows serialization to be over 3x faster.
      * If you're serializing a lot of data, and know its pure JSON, then you can enable this option for a speed-up.
      */
    var isJSON: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This option is the same as the space argument that can be passed to JSON.stringify.
      * It can be used to add whitespace and indentation to the serialized output to make it more readable.
      */
    var space: js.UndefOr[String | Double] = js.undefined
    
    /**
      * This option is to signal serialize() that we want to do a straight conversion, without the XSS protection.
      * This options needs to be explicitly set to true. HTML characters and JavaScript line terminators will not be escaped.
      * You will have to roll your own.
      */
    var unsafe: js.UndefOr[Boolean] = js.undefined
  }
  object SerializeJSOptions {
    
    @scala.inline
    def apply(): SerializeJSOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeJSOptions]
    }
    
    @scala.inline
    implicit class SerializeJSOptionsMutableBuilder[Self <: SerializeJSOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreFunction(value: Boolean): Self = StObject.set(x, "ignoreFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFunctionUndefined: Self = StObject.set(x, "ignoreFunction", js.undefined)
      
      @scala.inline
      def setIsJSON(value: Boolean): Self = StObject.set(x, "isJSON", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsJSONUndefined: Self = StObject.set(x, "isJSON", js.undefined)
      
      @scala.inline
      def setSpace(value: String | Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      @scala.inline
      def setUnsafe(value: Boolean): Self = StObject.set(x, "unsafe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafeUndefined: Self = StObject.set(x, "unsafe", js.undefined)
    }
  }
}
