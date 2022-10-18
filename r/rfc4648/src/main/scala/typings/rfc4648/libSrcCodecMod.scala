package typings.rfc4648

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcCodecMod {
  
  @JSImport("rfc4648/lib/src/codec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(string: String, encoding: Encoding): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def parse(string: String, encoding: Encoding, opts: ParseOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def stringify(data: ArrayLike[Double], encoding: Encoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(data: ArrayLike[Double], encoding: Encoding, opts: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Encoding extends StObject {
    
    var bits: Double
    
    var chars: String
    
    var codes: js.UndefOr[StringDictionary[Double]] = js.undefined
  }
  object Encoding {
    
    inline def apply(bits: Double, chars: String): Encoding = {
      val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], chars = chars.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setChars(value: String): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCodes(value: StringDictionary[Double]): Self = StObject.set(x, "codes", value.asInstanceOf[js.Any])
      
      inline def setCodesUndefined: Self = StObject.set(x, "codes", js.undefined)
    }
  }
  
  trait ParseOptions extends StObject {
    
    var loose: js.UndefOr[Boolean] = js.undefined
    
    var out: js.UndefOr[Instantiable1[/* size */ Double, NumberDictionary[Double]]] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      inline def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
      
      inline def setOut(value: Instantiable1[/* size */ Double, NumberDictionary[Double]]): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
    }
  }
  
  trait StringifyOptions extends StObject {
    
    var pad: js.UndefOr[Boolean] = js.undefined
  }
  object StringifyOptions {
    
    inline def apply(): StringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyOptions]
    }
    
    extension [Self <: StringifyOptions](x: Self) {
      
      inline def setPad(value: Boolean): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    }
  }
}
