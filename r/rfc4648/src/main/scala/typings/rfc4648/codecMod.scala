package typings.rfc4648

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codecMod {
  
  @JSImport("rfc4648/lib/src/codec", "parse")
  @js.native
  def parse(string: String, encoding: Encoding): Uint8Array = js.native
  @JSImport("rfc4648/lib/src/codec", "parse")
  @js.native
  def parse(string: String, encoding: Encoding, opts: ParseOptions): Uint8Array = js.native
  
  @JSImport("rfc4648/lib/src/codec", "stringify")
  @js.native
  def stringify(data: ArrayLike[Double], encoding: Encoding): String = js.native
  @JSImport("rfc4648/lib/src/codec", "stringify")
  @js.native
  def stringify(data: ArrayLike[Double], encoding: Encoding, opts: StringifyOptions): String = js.native
  
  @js.native
  trait Encoding extends StObject {
    
    var bits: Double = js.native
    
    var chars: String = js.native
    
    var codes: js.UndefOr[StringDictionary[Double]] = js.native
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
  
  @js.native
  trait ParseOptions extends StObject {
    
    var loose: js.UndefOr[Boolean] = js.native
    
    var out: js.UndefOr[Instantiable1[/* size */ Double, NumberDictionary[Double]]] = js.native
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
  
  @js.native
  trait StringifyOptions extends StObject {
    
    var pad: js.UndefOr[Boolean] = js.native
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
