package typings.rfc4648

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codecMod {
  
  @JSImport("rfc4648/lib/src/codec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(string: String, encoding: Encoding): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  @scala.inline
  def parse(string: String, encoding: Encoding, opts: ParseOptions): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  @scala.inline
  def stringify(data: ArrayLike[Double], encoding: Encoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(data: ArrayLike[Double], encoding: Encoding, opts: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Encoding extends StObject {
    
    var bits: Double
    
    var chars: String
    
    var codes: js.UndefOr[StringDictionary[Double]] = js.undefined
  }
  object Encoding {
    
    @scala.inline
    def apply(bits: Double, chars: String): Encoding = {
      val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], chars = chars.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChars(value: String): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodes(value: StringDictionary[Double]): Self = StObject.set(x, "codes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodesUndefined: Self = StObject.set(x, "codes", js.undefined)
    }
  }
  
  trait ParseOptions extends StObject {
    
    var loose: js.UndefOr[Boolean] = js.undefined
    
    var out: js.UndefOr[Instantiable1[/* size */ Double, NumberDictionary[Double]]] = js.undefined
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
      
      @scala.inline
      def setOut(value: Instantiable1[/* size */ Double, NumberDictionary[Double]]): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    }
  }
  
  trait StringifyOptions extends StObject {
    
    var pad: js.UndefOr[Boolean] = js.undefined
  }
  object StringifyOptions {
    
    @scala.inline
    def apply(): StringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyOptions]
    }
    
    @scala.inline
    implicit class StringifyOptionsMutableBuilder[Self <: StringifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPad(value: Boolean): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    }
  }
}
