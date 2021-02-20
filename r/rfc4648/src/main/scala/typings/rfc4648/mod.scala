package typings.rfc4648

import typings.rfc4648.codecMod.Encoding
import typings.rfc4648.codecMod.ParseOptions
import typings.rfc4648.codecMod.StringifyOptions
import typings.std.ArrayLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object base16 {
    
    @JSImport("rfc4648", "base16.parse")
    @js.native
    def parse(string: String): Uint8Array = js.native
    @JSImport("rfc4648", "base16.parse")
    @js.native
    def parse(string: String, opts: ParseOptions): Uint8Array = js.native
    
    @JSImport("rfc4648", "base16.stringify")
    @js.native
    def stringify(data: ArrayLike[Double]): String = js.native
    @JSImport("rfc4648", "base16.stringify")
    @js.native
    def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = js.native
  }
  
  object base32 {
    
    @JSImport("rfc4648", "base32.parse")
    @js.native
    def parse(string: String): Uint8Array = js.native
    @JSImport("rfc4648", "base32.parse")
    @js.native
    def parse(string: String, opts: ParseOptions): Uint8Array = js.native
    
    @JSImport("rfc4648", "base32.stringify")
    @js.native
    def stringify(data: ArrayLike[Double]): String = js.native
    @JSImport("rfc4648", "base32.stringify")
    @js.native
    def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = js.native
  }
  
  object base32hex {
    
    @JSImport("rfc4648", "base32hex.parse")
    @js.native
    def parse(string: String): Uint8Array = js.native
    @JSImport("rfc4648", "base32hex.parse")
    @js.native
    def parse(string: String, opts: ParseOptions): Uint8Array = js.native
    
    @JSImport("rfc4648", "base32hex.stringify")
    @js.native
    def stringify(data: ArrayLike[Double]): String = js.native
    @JSImport("rfc4648", "base32hex.stringify")
    @js.native
    def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = js.native
  }
  
  object base64 {
    
    @JSImport("rfc4648", "base64.parse")
    @js.native
    def parse(string: String): Uint8Array = js.native
    @JSImport("rfc4648", "base64.parse")
    @js.native
    def parse(string: String, opts: ParseOptions): Uint8Array = js.native
    
    @JSImport("rfc4648", "base64.stringify")
    @js.native
    def stringify(data: ArrayLike[Double]): String = js.native
    @JSImport("rfc4648", "base64.stringify")
    @js.native
    def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = js.native
  }
  
  object base64url {
    
    @JSImport("rfc4648", "base64url.parse")
    @js.native
    def parse(string: String): Uint8Array = js.native
    @JSImport("rfc4648", "base64url.parse")
    @js.native
    def parse(string: String, opts: ParseOptions): Uint8Array = js.native
    
    @JSImport("rfc4648", "base64url.stringify")
    @js.native
    def stringify(data: ArrayLike[Double]): String = js.native
    @JSImport("rfc4648", "base64url.stringify")
    @js.native
    def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = js.native
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
        Uint8Array
      ] = js.native
    @JSImport("rfc4648", "codec.parse")
    @js.native
    def parse(string: String, encoding: Encoding): Uint8Array = js.native
    @JSImport("rfc4648", "codec.parse")
    @js.native
    def parse(string: String, encoding: Encoding, opts: ParseOptions): Uint8Array = js.native
    @scala.inline
    def parse_=(
      x: js.Function3[
          /* string */ String, 
          /* encoding */ Encoding, 
          /* opts */ js.UndefOr[ParseOptions], 
          Uint8Array
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
    @JSImport("rfc4648", "codec.stringify")
    @js.native
    def stringify(data: ArrayLike[Double], encoding: Encoding): String = js.native
    @JSImport("rfc4648", "codec.stringify")
    @js.native
    def stringify(data: ArrayLike[Double], encoding: Encoding, opts: StringifyOptions): String = js.native
    @scala.inline
    def stringify_=(
      x: js.Function3[
          /* data */ ArrayLike[Double], 
          /* encoding */ Encoding, 
          /* opts */ js.UndefOr[StringifyOptions], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stringify")(x.asInstanceOf[js.Any])
  }
}
