package typings.scureBase

import typings.scureBase.anon.FnCall
import typings.scureBase.scureBaseBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@scure/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertNumber(n: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNumber")(n.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@scure/base", "base16")
  @js.native
  val base16: BytesCoder = js.native
  
  @JSImport("@scure/base", "base32")
  @js.native
  val base32: BytesCoder = js.native
  
  @JSImport("@scure/base", "base32crockford")
  @js.native
  val base32crockford: BytesCoder = js.native
  
  @JSImport("@scure/base", "base32hex")
  @js.native
  val base32hex: BytesCoder = js.native
  
  @JSImport("@scure/base", "base58")
  @js.native
  val base58: BytesCoder = js.native
  
  inline def base58check(sha256: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): BytesCoder = ^.asInstanceOf[js.Dynamic].applyDynamic("base58check")(sha256.asInstanceOf[js.Any]).asInstanceOf[BytesCoder]
  
  @JSImport("@scure/base", "base58flickr")
  @js.native
  val base58flickr: BytesCoder = js.native
  
  @JSImport("@scure/base", "base58xmr")
  @js.native
  val base58xmr: BytesCoder = js.native
  
  @JSImport("@scure/base", "base58xrp")
  @js.native
  val base58xrp: BytesCoder = js.native
  
  @JSImport("@scure/base", "base64")
  @js.native
  val base64: BytesCoder = js.native
  
  @JSImport("@scure/base", "base64url")
  @js.native
  val base64url: BytesCoder = js.native
  
  object bech32 {
    
    @JSImport("@scure/base", "bech32")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(str: String): Bech32Decoded = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[Bech32Decoded]
    inline def decode(str: String, limit: Double): Bech32Decoded = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Bech32Decoded]
    
    inline def decodeToBytes(str: String): Bech32DecodedWithArray = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeToBytes")(str.asInstanceOf[js.Any]).asInstanceOf[Bech32DecodedWithArray]
    
    inline def decodeUnsafe(str: String): js.UndefOr[Bech32Decoded] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnsafe")(str.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Bech32Decoded]]
    inline def decodeUnsafe(str: String, limit: Double): js.UndefOr[Bech32Decoded] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnsafe")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Bech32Decoded]]
    
    inline def decodeUnsafe_false(str: String, limit: `false`): js.UndefOr[Bech32Decoded] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnsafe")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Bech32Decoded]]
    
    inline def decode_false(str: String, limit: `false`): Bech32Decoded = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Bech32Decoded]
    
    inline def encode(prefix: String, words: js.Array[Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], words.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encode(prefix: String, words: js.Array[Double], limit: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], words.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encode(prefix: String, words: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], words.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encode(prefix: String, words: js.typedarray.Uint8Array, limit: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], words.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def encode_false(prefix: String, words: js.Array[Double], limit: `false`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], words.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encode_false(prefix: String, words: js.typedarray.Uint8Array, limit: `false`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], words.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def fromWords(to: js.Array[Double]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWords")(to.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def fromWordsUnsafe(to: js.Array[Double]): js.UndefOr[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWordsUnsafe")(to.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.typedarray.Uint8Array]]
    
    inline def toWords(from: js.typedarray.Uint8Array): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toWords")(from.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  }
  
  object bech32m {
    
    @JSImport("@scure/base", "bech32m")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(str: String): Bech32Decoded = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[Bech32Decoded]
    inline def decode(str: String, limit: Double): Bech32Decoded = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Bech32Decoded]
    
    inline def decodeToBytes(str: String): Bech32DecodedWithArray = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeToBytes")(str.asInstanceOf[js.Any]).asInstanceOf[Bech32DecodedWithArray]
    
    inline def decodeUnsafe(str: String): js.UndefOr[Bech32Decoded] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnsafe")(str.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Bech32Decoded]]
    inline def decodeUnsafe(str: String, limit: Double): js.UndefOr[Bech32Decoded] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnsafe")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Bech32Decoded]]
    
    inline def decodeUnsafe_false(str: String, limit: `false`): js.UndefOr[Bech32Decoded] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeUnsafe")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Bech32Decoded]]
    
    inline def decode_false(str: String, limit: `false`): Bech32Decoded = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Bech32Decoded]
    
    inline def encode(prefix: String, words: js.Array[Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], words.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encode(prefix: String, words: js.Array[Double], limit: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], words.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encode(prefix: String, words: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], words.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encode(prefix: String, words: js.typedarray.Uint8Array, limit: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], words.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def encode_false(prefix: String, words: js.Array[Double], limit: `false`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], words.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def encode_false(prefix: String, words: js.typedarray.Uint8Array, limit: `false`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], words.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def fromWords(to: js.Array[Double]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWords")(to.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def fromWordsUnsafe(to: js.Array[Double]): js.UndefOr[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWordsUnsafe")(to.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.typedarray.Uint8Array]]
    
    inline def toWords(from: js.typedarray.Uint8Array): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toWords")(from.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  }
  
  inline def bytes(`type`: CoderType, str: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("bytes")(`type`.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def bytesToString(`type`: CoderType, bytes: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bytesToString")(`type`.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("@scure/base", "hex")
  @js.native
  val hex: BytesCoder = js.native
  
  inline def str(`type`: CoderType, bytes: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("str")(`type`.asInstanceOf[js.Any], bytes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringToBytes(`type`: CoderType, str: String): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToBytes")(`type`.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("@scure/base", "utf8")
  @js.native
  val utf8: BytesCoder = js.native
  
  object utils {
    
    @JSImport("@scure/base", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@scure/base", "utils.alphabet")
    @js.native
    def alphabet: js.Function1[/* alphabet */ Alphabet, Coder[js.Array[Double], js.Array[String]]] = js.native
    inline def alphabet(alphabet: Alphabet): Coder[js.Array[Double], js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alphabet")(alphabet.asInstanceOf[js.Any]).asInstanceOf[Coder[js.Array[Double], js.Array[String]]]
    inline def alphabet_=(x: js.Function1[/* alphabet */ Alphabet, Coder[js.Array[Double], js.Array[String]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alphabet")(x.asInstanceOf[js.Any])
    
    @JSImport("@scure/base", "utils.chain")
    @js.native
    def chain: FnCall = js.native
    inline def chain[T /* <: Chain & (AsChain[T, Tail[T]]) */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
    ): Coder[Input[First[T]], Output[Last[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(args.asInstanceOf[js.Any]).asInstanceOf[Coder[Input[First[T]], Output[Last[T]]]]
    inline def chain_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chain")(x.asInstanceOf[js.Any])
    
    @JSImport("@scure/base", "utils.checksum")
    @js.native
    def checksum: js.Function2[
        /* len */ Double, 
        /* fn */ js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array], 
        Coder[js.typedarray.Uint8Array, js.typedarray.Uint8Array]
      ] = js.native
    inline def checksum(len: Double, fn: js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array]): Coder[js.typedarray.Uint8Array, js.typedarray.Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("checksum")(len.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Coder[js.typedarray.Uint8Array, js.typedarray.Uint8Array]]
    inline def checksum_=(
      x: js.Function2[
          /* len */ Double, 
          /* fn */ js.Function1[/* data */ js.typedarray.Uint8Array, js.typedarray.Uint8Array], 
          Coder[js.typedarray.Uint8Array, js.typedarray.Uint8Array]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checksum")(x.asInstanceOf[js.Any])
    
    inline def join(): Coder[js.Array[String], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")().asInstanceOf[Coder[js.Array[String], String]]
    inline def join(separator: String): Coder[js.Array[String], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(separator.asInstanceOf[js.Any]).asInstanceOf[Coder[js.Array[String], String]]
    @JSImport("@scure/base", "utils.join")
    @js.native
    def join_Futils: js.Function1[/* separator */ js.UndefOr[String], Coder[js.Array[String], String]] = js.native
    
    inline def join_Futils_=(x: js.Function1[/* separator */ js.UndefOr[String], Coder[js.Array[String], String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("join")(x.asInstanceOf[js.Any])
    
    @JSImport("@scure/base", "utils.padding")
    @js.native
    def padding: js.Function2[
        /* bits */ Double, 
        /* chr */ js.UndefOr[String], 
        Coder[js.Array[String], js.Array[String]]
      ] = js.native
    inline def padding(bits: Double): Coder[js.Array[String], js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("padding")(bits.asInstanceOf[js.Any]).asInstanceOf[Coder[js.Array[String], js.Array[String]]]
    inline def padding(bits: Double, chr: String): Coder[js.Array[String], js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("padding")(bits.asInstanceOf[js.Any], chr.asInstanceOf[js.Any])).asInstanceOf[Coder[js.Array[String], js.Array[String]]]
    inline def padding_=(
      x: js.Function2[
          /* bits */ Double, 
          /* chr */ js.UndefOr[String], 
          Coder[js.Array[String], js.Array[String]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport("@scure/base", "utils.radix")
    @js.native
    def radix: js.Function1[/* num */ Double, Coder[js.typedarray.Uint8Array, js.Array[Double]]] = js.native
    inline def radix(num: Double): Coder[js.typedarray.Uint8Array, js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("radix")(num.asInstanceOf[js.Any]).asInstanceOf[Coder[js.typedarray.Uint8Array, js.Array[Double]]]
    
    @JSImport("@scure/base", "utils.radix2")
    @js.native
    def radix2: js.Function2[
        /* bits */ Double, 
        /* revPadding */ js.UndefOr[Boolean], 
        Coder[js.typedarray.Uint8Array, js.Array[Double]]
      ] = js.native
    inline def radix2(bits: Double): Coder[js.typedarray.Uint8Array, js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("radix2")(bits.asInstanceOf[js.Any]).asInstanceOf[Coder[js.typedarray.Uint8Array, js.Array[Double]]]
    inline def radix2(bits: Double, revPadding: Boolean): Coder[js.typedarray.Uint8Array, js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("radix2")(bits.asInstanceOf[js.Any], revPadding.asInstanceOf[js.Any])).asInstanceOf[Coder[js.typedarray.Uint8Array, js.Array[Double]]]
    inline def radix2_=(
      x: js.Function2[
          /* bits */ Double, 
          /* revPadding */ js.UndefOr[Boolean], 
          Coder[js.typedarray.Uint8Array, js.Array[Double]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radix2")(x.asInstanceOf[js.Any])
    
    inline def radix_=(x: js.Function1[/* num */ Double, Coder[js.typedarray.Uint8Array, js.Array[Double]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radix")(x.asInstanceOf[js.Any])
  }
  
  type Alphabet = js.Array[String] | String
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof C ]: @scure/base.@scure/base.Coder<@scure/base.@scure/base.Input<C[K]>, @scure/base.@scure/base.Input<K extends keyof Rest? Rest[K] : any>>}
    }}}
    */
  @js.native
  trait AsChain[C /* <: Chain */, Rest] extends StObject
  
  trait Bech32Decoded extends StObject {
    
    var prefix: String
    
    var words: js.Array[Double]
  }
  object Bech32Decoded {
    
    inline def apply(prefix: String, words: js.Array[Double]): Bech32Decoded = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bech32Decoded]
    }
    
    extension [Self <: Bech32Decoded](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setWords(value: js.Array[Double]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      inline def setWordsVarargs(value: Double*): Self = StObject.set(x, "words", js.Array(value*))
    }
  }
  
  trait Bech32DecodedWithArray extends StObject {
    
    var bytes: js.typedarray.Uint8Array
    
    var prefix: String
    
    var words: js.Array[Double]
  }
  object Bech32DecodedWithArray {
    
    inline def apply(bytes: js.typedarray.Uint8Array, prefix: String, words: js.Array[Double]): Bech32DecodedWithArray = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bech32DecodedWithArray]
    }
    
    extension [Self <: Bech32DecodedWithArray](x: Self) {
      
      inline def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setWords(value: js.Array[Double]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      inline def setWordsVarargs(value: Double*): Self = StObject.set(x, "words", js.Array(value*))
    }
  }
  
  trait BytesCoder
    extends StObject
       with Coder[js.typedarray.Uint8Array, String]
  object BytesCoder {
    
    inline def apply(decode: String => js.typedarray.Uint8Array, encode: js.typedarray.Uint8Array => String): BytesCoder = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[BytesCoder]
    }
  }
  
  type Chain = Array[Coder[Any, Any]]
  
  trait Coder[F, T] extends StObject {
    
    def decode(to: T): F
    
    def encode(from: F): T
  }
  object Coder {
    
    inline def apply[F, T](decode: T => F, encode: F => T): Coder[F, T] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Coder[F, T]]
    }
    
    extension [Self <: Coder[?, ?], F, T](x: Self & (Coder[F, T])) {
      
      inline def setDecode(value: T => F): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: F => T): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  /* keyof @scure/base.anon.Base16 */ /* Rewritten from type alias, can be one of: 
    - typings.scureBase.scureBaseStrings.utf8
    - typings.scureBase.scureBaseStrings.hex
    - typings.scureBase.scureBaseStrings.base16
    - typings.scureBase.scureBaseStrings.base32
    - typings.scureBase.scureBaseStrings.base64
    - typings.scureBase.scureBaseStrings.base64url
    - typings.scureBase.scureBaseStrings.base58
    - typings.scureBase.scureBaseStrings.base58xmr
  */
  trait CoderType extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [infer U, ...std.Array<any>] ? U : never
    }}}
    */
  @js.native
  trait First[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    F extends @scure/base.@scure/base.Coder<infer T, any> ? T : never
    }}}
    */
  @js.native
  trait Input[F] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [...std.Array<any>, infer U] ? U : never
    }}}
    */
  @js.native
  trait Last[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    F extends @scure/base.@scure/base.Coder<any, infer T> ? T : never
    }}}
    */
  @js.native
  trait Output[F] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [any, ...infer U] ? U : never
    }}}
    */
  @js.native
  trait Tail[T] extends StObject
}
