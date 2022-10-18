package typings.rfc4648

import typings.rfc4648.libSrcCodecMod.Encoding
import typings.rfc4648.libSrcCodecMod.ParseOptions
import typings.rfc4648.libSrcCodecMod.StringifyOptions
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object base16 {
    
    @JSImport("rfc4648", "base16")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(string: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def parse(string: String, opts: ParseOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def stringify(data: ArrayLike[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object base32 {
    
    @JSImport("rfc4648", "base32")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(string: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def parse(string: String, opts: ParseOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def stringify(data: ArrayLike[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object base32hex {
    
    @JSImport("rfc4648", "base32hex")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(string: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def parse(string: String, opts: ParseOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def stringify(data: ArrayLike[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object base64 {
    
    @JSImport("rfc4648", "base64")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(string: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def parse(string: String, opts: ParseOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def stringify(data: ArrayLike[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object base64url {
    
    @JSImport("rfc4648", "base64url")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(string: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    inline def parse(string: String, opts: ParseOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def stringify(data: ArrayLike[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object codec {
    
    @JSImport("rfc4648", "codec")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rfc4648", "codec.parse")
    @js.native
    def parse: js.Function3[
        /* string */ String, 
        /* encoding */ Encoding, 
        /* opts */ js.UndefOr[ParseOptions], 
        js.typedarray.Uint8Array
      ] = js.native
    inline def parse(string: String, encoding: Encoding): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def parse(string: String, encoding: Encoding, opts: ParseOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
    inline def parse_=(
      x: js.Function3[
          /* string */ String, 
          /* encoding */ Encoding, 
          /* opts */ js.UndefOr[ParseOptions], 
          js.typedarray.Uint8Array
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("rfc4648", "codec.stringify")
    @js.native
    def stringify: js.Function3[
        /* data */ ArrayLike[Double], 
        /* encoding */ Encoding, 
        /* opts */ js.UndefOr[StringifyOptions], 
        String
      ] = js.native
    inline def stringify(data: ArrayLike[Double], encoding: Encoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(data: ArrayLike[Double], encoding: Encoding, opts: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify_=(
      x: js.Function3[
          /* data */ ArrayLike[Double], 
          /* encoding */ Encoding, 
          /* opts */ js.UndefOr[StringifyOptions], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringify")(x.asInstanceOf[js.Any])
  }
}
