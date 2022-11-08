package typings.secretboxEncoding

import typings.node.bufferMod.global.Buffer
import typings.secretboxEncoding.anon.Bytes
import typings.secretboxEncoding.anon.Call
import typings.secretboxEncoding.secretboxEncodingInts.`16`
import typings.secretboxEncoding.secretboxEncodingInts.`24`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates and returns an [`abstract-encoding`](https://github.com/mafintosh/abstract-encoding)
    * interface to encode and decode values using the
    * [Xsalsa20poly1305](https://download.libsodium.org/doc/secret-key_cryptography/secretbox)
    * cipher from 32 byte `secretKey`.
    *
    * Nonces are prepended (attached) to encoded output and must be present when decoding.
    * Detached nonces may be used when attached to the `Buffer` instance to decode as a `nonce` property on it.
    *
    * @example
    * import * as crypto from 'node:crypto'
    * import createCodec = require('secretbox-encoding')
    *
    * const secretKey = crypto.randomBytes(32)
    * const codec = createCodec(secretKey)
    *
    * // encode a value
    * const buffer = codec.encode(Buffer.from('hello world'))
    *
    * // decode a value
    * codec.decode(buffer).toString('utf8') // => 'hello world'
    *
    * @example
    * import pbs = require('protocol-buffers')
    * import createCodec = require('secretbox-encoding')
    *
    * const { Message } = pbs(`
    * message {
    *   string data = 1;
    * }
    * `)
    *
    * const codec = createCodec(key, { valueEncoding: Message })
    * const encoded = codec.encode({ data: 'hello world' })
    * const message = codec.decode(encoded) // { data: 'hello world' }
    */
  inline def apply[TEnc, TDec](key: Buffer): Codec[TEnc, TDec] = ^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any]).asInstanceOf[Codec[TEnc, TDec]]
  inline def apply[TEnc, TDec](key: Buffer, opts: Options[TEnc, TDec]): Codec[TEnc, TDec] = (^.asInstanceOf[js.Dynamic].apply(key.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Codec[TEnc, TDec]]
  
  @JSImport("secretbox-encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The size in bytes for the MAC used to encipher/decipher
    * values encoded or decoded by this module.
    */
  @JSImport("secretbox-encoding", "MAC_BYTES")
  @js.native
  val MAC_BYTES: `16` = js.native
  
  /**
    * The size in bytes for the nonce used to encipher/decipher
    * values encoded or decoded by this module.
    */
  @JSImport("secretbox-encoding", "NONCE_BYTES")
  @js.native
  val NONCE_BYTES: `24` = js.native
  
  @js.native
  trait BufferWithNonce
    extends StObject
       with Buffer {
    
    var nonce: js.UndefOr[Buffer] = js.native
  }
  
  trait Codec[TEnc, TDec] extends StObject {
    
    /**
      * Decode a buffer using
      * [crypto_secretbox_easy](https://download.libsodium.org/doc/secret-key_cryptography/secretbox).
      *
      * @param buffer The buffer with the encoded data.
      * @param [start=0] The byte offset at which to start decoding.
      * @param [end=buffer.length] The byte offset at which to stop decoding.
      *
      * @example
      * import * as crypto from 'node:crypto'
      * import createCodec = require('secretbox-encoding')
      *
      * const secretKey = crypto.randomBytes(32)
      * const codec = createCodec(secretKey)
      *
      * // encode a value
      * const buffer = codec.encode(Buffer.from('hello world'))
      *
      * // decode a value
      * codec.decode(buffer).toString('utf8') // => 'hello world'
      */
    def decode(buffer: BufferWithNonce): TDec
    def decode(buffer: BufferWithNonce, start: Double): TDec
    def decode(buffer: BufferWithNonce, start: Double, end: Double): TDec
    def decode(buffer: BufferWithNonce, start: Unit, end: Double): TDec
    /**
      * Decode a buffer using
      * [crypto_secretbox_easy](https://download.libsodium.org/doc/secret-key_cryptography/secretbox).
      *
      * @param buffer The buffer with the encoded data.
      * @param [start=0] The byte offset at which to start decoding.
      * @param [end=buffer.length] The byte offset at which to stop decoding.
      *
      * @example
      * import * as crypto from 'node:crypto'
      * import createCodec = require('secretbox-encoding')
      *
      * const secretKey = crypto.randomBytes(32)
      * const codec = createCodec(secretKey)
      *
      * // encode a value
      * const buffer = codec.encode(Buffer.from('hello world'))
      *
      * // decode a value
      * codec.decode(buffer).toString('utf8') // => 'hello world'
      */
    @JSName("decode")
    var decode_Original: Bytes[TDec]
    
    /**
      * Encode a value using
      * [crypto_secretbox_easy](https://download.libsodium.org/doc/secret-key_cryptography/secretbox)
      * into a buffer.
      *
      * @param value The value to encode.
      * @param buffer If given, this buffer will be used to write the encoded value.
      * Otherwise, a new `Buffer` is allocated.
      * @param [offset=0] The byte offset into the `buffer` to encode the `value`.
      *
      * @example
      * import * as crypto from 'node:crypto'
      * import createCodec = require('secretbox-encoding')
      *
      * const secretKey = crypto.randomBytes(32)
      * const codec = createCodec(secretKey)
      *
      * // encode a value
      * const buffer = codec.encode(Buffer.from('hello world'))
      */
    def encode(value: TEnc): Buffer
    def encode(value: TEnc, buffer: Unit, offset: Double): Buffer
    def encode(value: TEnc, buffer: Buffer): Buffer
    def encode(value: TEnc, buffer: Buffer, offset: Double): Buffer
    /**
      * Encode a value using
      * [crypto_secretbox_easy](https://download.libsodium.org/doc/secret-key_cryptography/secretbox)
      * into a buffer.
      *
      * @param value The value to encode.
      * @param buffer If given, this buffer will be used to write the encoded value.
      * Otherwise, a new `Buffer` is allocated.
      * @param [offset=0] The byte offset into the `buffer` to encode the `value`.
      *
      * @example
      * import * as crypto from 'node:crypto'
      * import createCodec = require('secretbox-encoding')
      *
      * const secretKey = crypto.randomBytes(32)
      * const codec = createCodec(secretKey)
      *
      * // encode a value
      * const buffer = codec.encode(Buffer.from('hello world'))
      */
    @JSName("encode")
    var encode_Original: Call[TEnc]
    
    /**
      * Computes the encoding length for a given `value`.
      *
      * @example
      * import * as crypto from 'node:crypto'
      * import createCodec = require('secretbox-encoding')
      *
      * const secretKey = crypto.randomBytes(32)
      * const codec = createCodec(secretKey)
      *
      * const length = codec.encodingLength('hello world') // 11
      */
    def encodingLength(value: ValueToEncode): Double
    
    val key: Buffer
    
    val valueEncoding: ValueEncoding[TEnc, TDec]
  }
  object Codec {
    
    inline def apply[TEnc, TDec](
      decode: Bytes[TDec],
      encode: Call[TEnc],
      encodingLength: ValueToEncode => Double,
      key: Buffer,
      valueEncoding: ValueEncoding[TEnc, TDec]
    ): Codec[TEnc, TDec] = {
      val __obj = js.Dynamic.literal(decode = decode.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], encodingLength = js.Any.fromFunction1(encodingLength), key = key.asInstanceOf[js.Any], valueEncoding = valueEncoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Codec[TEnc, TDec]]
    }
    
    extension [Self <: Codec[?, ?], TEnc, TDec](x: Self & (Codec[TEnc, TDec])) {
      
      inline def setDecode(value: Bytes[TDec]): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      inline def setEncode(value: Call[TEnc]): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
      
      inline def setEncodingLength(value: ValueToEncode => Double): Self = StObject.set(x, "encodingLength", js.Any.fromFunction1(value))
      
      inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValueEncoding(value: ValueEncoding[TEnc, TDec]): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSONParsedBuffer extends StObject {
    
    var data: js.Array[Double]
    
    var `type`: typings.secretboxEncoding.secretboxEncodingStrings.Buffer
  }
  object JSONParsedBuffer {
    
    inline def apply(data: js.Array[Double]): JSONParsedBuffer = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Buffer")
      __obj.asInstanceOf[JSONParsedBuffer]
    }
    
    extension [Self <: JSONParsedBuffer](x: Self) {
      
      inline def setData(value: js.Array[Double]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Double*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setType(value: typings.secretboxEncoding.secretboxEncodingStrings.Buffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[TEnc, TDec] extends StObject {
    
    var nonce: js.UndefOr[js.Function0[Buffer]] = js.undefined
    
    var valueEncoding: js.UndefOr[ValueEncoding[TEnc, TDec]] = js.undefined
  }
  object Options {
    
    inline def apply[TEnc, TDec](): Options[TEnc, TDec] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[TEnc, TDec]]
    }
    
    extension [Self <: Options[?, ?], TEnc, TDec](x: Self & (Options[TEnc, TDec])) {
      
      inline def setNonce(value: () => Buffer): Self = StObject.set(x, "nonce", js.Any.fromFunction0(value))
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setValueEncoding(value: ValueEncoding[TEnc, TDec]): Self = StObject.set(x, "valueEncoding", value.asInstanceOf[js.Any])
      
      inline def setValueEncodingUndefined: Self = StObject.set(x, "valueEncoding", js.undefined)
    }
  }
  
  trait ValueEncoding[TEnc, TDec] extends StObject {
    
    def decode(buffer: Buffer, offset: Double): TDec
    
    def encode(value: TEnc): ValueToEncode
  }
  object ValueEncoding {
    
    inline def apply[TEnc, TDec](decode: (Buffer, Double) => TDec, encode: TEnc => ValueToEncode): ValueEncoding[TEnc, TDec] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction2(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[ValueEncoding[TEnc, TDec]]
    }
    
    extension [Self <: ValueEncoding[?, ?], TEnc, TDec](x: Self & (ValueEncoding[TEnc, TDec])) {
      
      inline def setDecode(value: (Buffer, Double) => TDec): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
      
      inline def setEncode(value: TEnc => ValueToEncode): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  type ValueToEncode = Buffer | String | js.Array[Double] | JSONParsedBuffer
}
