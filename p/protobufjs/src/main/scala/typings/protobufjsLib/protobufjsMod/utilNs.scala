package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "util")
@js.native
object utilNs extends js.Object {
  /** A minimal event emitter. */
  @js.native
  /** Constructs a new event emitter instance. */
  class EventEmitter () extends js.Object {
    /**
      * Emits an event by calling its listeners with the specified arguments.
      * @param evt Event name
      * @param args Arguments
      * @returns `this`
      */
    def emit(evt: java.lang.String, args: js.Any*): this.type = js.native
    /**
      * Removes an event listener or any matching listeners if arguments are omitted.
      * @param [evt] Event name. Removes all listeners if omitted.
      * @param [fn] Listener to remove. Removes all listeners of `evt` if omitted.
      * @returns `this`
      */
    def off(): this.type = js.native
    def off(evt: java.lang.String): this.type = js.native
    def off(evt: java.lang.String, fn: protobufjsLib.EventEmitterListener): this.type = js.native
    /**
      * Registers an event listener.
      * @param evt Event name
      * @param fn Listener
      * @param [ctx] Listener context
      * @returns `this`
      */
    def on(evt: java.lang.String, fn: protobufjsLib.EventEmitterListener): this.type = js.native
    def on(evt: java.lang.String, fn: protobufjsLib.EventEmitterListener, ctx: js.Any): this.type = js.native
  }
  
  /** Helper class for working with the low and high bits of a 64 bit value. */
  @js.native
  class LongBits protected () extends js.Object {
    /**
      * Constructs new long bits.
      * @param lo Low 32 bits, unsigned
      * @param hi High 32 bits, unsigned
      */
    def this(lo: scala.Double, hi: scala.Double) = this()
    /** High bits. */
    var hi: scala.Double = js.native
    /** Low bits. */
    var lo: scala.Double = js.native
    /**
      * Calculates the length of this longbits when encoded as a varint.
      * @returns Length
      */
    def length(): scala.Double = js.native
    /**
      * Converts this long bits to a 8 characters long hash.
      * @returns Hash
      */
    def toHash(): java.lang.String = js.native
    /**
      * Converts this long bits to a long.
      * @param [unsigned=false] Whether unsigned or not
      * @returns Long
      */
    def toLong(): protobufjsLib.protobufjsMod.Long = js.native
    def toLong(unsigned: scala.Boolean): protobufjsLib.protobufjsMod.Long = js.native
    /**
      * Converts this long bits to a possibly unsafe JavaScript number.
      * @param [unsigned=false] Whether unsigned or not
      * @returns Possibly unsafe number
      */
    def toNumber(): scala.Double = js.native
    def toNumber(unsigned: scala.Boolean): scala.Double = js.native
    /**
      * Zig-zag decodes this long bits.
      * @returns `this`
      */
    def zzDecode(): LongBits = js.native
    /**
      * Zig-zag encodes this long bits.
      * @returns `this`
      */
    def zzEncode(): LongBits = js.native
  }
  
  /** Error subclass indicating a protocol specifc error. */
  @js.native
  class ProtocolError[T /* <: protobufjsLib.protobufjsMod.Message[T] */] protected ()
    extends stdLib.Error {
    /**
      * Constructs a new protocol error.
      * @param message Error message
      * @param [properties] Additional properties
      */
    def this(message: java.lang.String) = this()
    def this(message: java.lang.String, properties: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
    /** So far decoded message instance. */
    var instance: protobufjsLib.protobufjsMod.Message[T] = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
  /** Array implementation used in the browser. `Uint8Array` if supported, otherwise `Array`. */
  var Array: protobufjsLib.protobufjsMod.Constructor[stdLib.Uint8Array] = js.native
  /** Node's Buffer class if available. */
  var Buffer: protobufjsLib.protobufjsMod.Constructor[protobufjsLib.protobufjsMod.Buffer] = js.native
  /** Long.js's Long class if available. */
  var Long: protobufjsLib.protobufjsMod.Constructor[protobufjsLib.protobufjsMod.Long] = js.native
  /** Decorator root (TypeScript). */
  var decorateRoot: protobufjsLib.protobufjsMod.Root = js.native
  /** An immuable empty array. */
  val emptyArray: js.Array[js.Any] = js.native
  /** An immutable empty object. */
  val emptyObject: js.Object = js.native
  /** Whether running within node or not. */
  val isNode: scala.Boolean = js.native
  /** Regular expression used to verify 2 bit (`bool`) map keys. */
  val key2Re: stdLib.RegExp = js.native
  /** Regular expression used to verify 32 bit (`int32` etc.) map keys. */
  val key32Re: stdLib.RegExp = js.native
  /** Regular expression used to verify 64 bit (`int64` etc.) map keys. */
  val key64Re: stdLib.RegExp = js.native
  /**
    * Default conversion options used for {@link Message#toJSON} implementations.
    *
    * These options are close to proto3's JSON mapping with the exception that internal types like Any are handled just like messages. More precisely:
    *
    * - Longs become strings
    * - Enums become string keys
    * - Bytes become base64 encoded strings
    * - (Sub-)Messages become plain objects
    * - Maps become plain objects with all string keys
    * - Repeated fields become arrays
    * - NaN and Infinity for float and double fields become strings
    *
    * @see https://developers.google.com/protocol-buffers/docs/proto3?hl=en#json
    */
  var toJSONOptions: protobufjsLib.protobufjsMod.IConversionOptions = js.native
  /**
    * Returns a promise from a node-style callback function.
    * @param fn Function to call
    * @param ctx Function context
    * @param params Function arguments
    * @returns Promisified function
    */
  def asPromise(fn: protobufjsLib.asPromiseCallback, ctx: js.Any, params: js.Any*): js.Promise[_] = js.native
  /**
    * Converts a string to camel case.
    * @param str String to convert
    * @returns Converted string
    */
  def camelCase(str: java.lang.String): java.lang.String = js.native
  /**
    * Begins generating a function.
    * @param [functionName] Function name if not anonymous
    * @returns Appender that appends code to the function's body
    */
  def codegen(): protobufjsLib.Codegen = js.native
  def codegen(functionName: java.lang.String): protobufjsLib.Codegen = js.native
  /**
    * Begins generating a function.
    * @param functionParams Function parameter names
    * @param [functionName] Function name if not anonymous
    * @returns Appender that appends code to the function's body
    */
  def codegen(functionParams: js.Array[java.lang.String]): protobufjsLib.Codegen = js.native
  def codegen(functionParams: js.Array[java.lang.String], functionName: java.lang.String): protobufjsLib.Codegen = js.native
  /**
    * Compares reflected fields by id.
    * @param a First field
    * @param b Second field
    * @returns Comparison value
    */
  def compareFieldsById(a: protobufjsLib.protobufjsMod.Field, b: protobufjsLib.protobufjsMod.Field): scala.Double = js.native
  /**
    * Decorator helper for enums (TypeScript).
    * @param object Enum object
    * @returns Reflected enum
    */
  def decorateEnum(`object`: js.Object): protobufjsLib.protobufjsMod.Enum = js.native
  /**
    * Decorator helper for types (TypeScript).
    * @param ctor Constructor function
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Reflected type
    */
  def decorateType[T /* <: protobufjsLib.protobufjsMod.Message[T] */](ctor: protobufjsLib.protobufjsMod.Constructor[T]): protobufjsLib.protobufjsMod.Type = js.native
  def decorateType[T /* <: protobufjsLib.protobufjsMod.Message[T] */](ctor: protobufjsLib.protobufjsMod.Constructor[T], typeName: java.lang.String): protobufjsLib.protobufjsMod.Type = js.native
  /**
    * Fetches the contents of a file.
    * @param filename File path or url
    * @param options Fetch options
    * @param callback Callback function
    */
  def fetch(
    filename: java.lang.String,
    options: protobufjsLib.protobufjsMod.IFetchOptions,
    callback: protobufjsLib.FetchCallback
  ): scala.Unit = js.native
  /**
    * Fetches the contents of a file.
    * @param path File path or url
    * @param [options] Fetch options
    * @returns Promise
    */
  def fetch(path: java.lang.String): js.Promise[java.lang.String | stdLib.Uint8Array] = js.native
  /**
    * Fetches the contents of a file.
    * @param path File path or url
    * @param callback Callback function
    */
  def fetch(path: java.lang.String, callback: protobufjsLib.FetchCallback): scala.Unit = js.native
  def fetch(path: java.lang.String, options: protobufjsLib.protobufjsMod.IFetchOptions): js.Promise[java.lang.String | stdLib.Uint8Array] = js.native
  /**
    * Requires a module only if available.
    * @param moduleName Module to require
    * @returns Required module if available and not empty, otherwise `null`
    */
  def inquire(moduleName: java.lang.String): js.Object = js.native
  /**
    * Tests if the specified value is an integer.
    * @param value Value to test
    * @returns `true` if the value is an integer
    */
  def isInteger(value: js.Any): scala.Boolean = js.native
  /**
    * Tests if the specified value is a non-null object.
    * @param value Value to test
    * @returns `true` if the value is a non-null object
    */
  def isObject(value: js.Any): scala.Boolean = js.native
  /**
    * Tests whether the specified name is a reserved word in JS.
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  def isReserved(name: java.lang.String): scala.Boolean = js.native
  /**
    * Checks if a property on a message is considered to be present.
    * @param obj Plain object or message instance
    * @param prop Property name
    * @returns `true` if considered to be present, otherwise `false`
    */
  def isSet(obj: js.Object, prop: java.lang.String): scala.Boolean = js.native
  /**
    * Tests if the specified value is a string.
    * @param value Value to test
    * @returns `true` if the value is a string
    */
  def isString(value: js.Any): scala.Boolean = js.native
  /**
    * Checks if a property on a message is considered to be present.
    * This is an alias of {@link util.isSet}.
    * @param obj Plain object or message instance
    * @param prop Property name
    * @returns `true` if considered to be present, otherwise `false`
    */
  def isset(obj: js.Object, prop: java.lang.String): scala.Boolean = js.native
  /**
    * Converts the first character of a string to lower case.
    * @param str String to convert
    * @returns Converted string
    */
  def lcFirst(str: java.lang.String): java.lang.String = js.native
  /**
    * Converts an 8 characters long hash string to a long or number.
    * @param hash Hash
    * @param [unsigned=false] Whether unsigned or not
    * @returns Original value
    */
  def longFromHash(hash: java.lang.String): protobufjsLib.protobufjsMod.Long | scala.Double = js.native
  def longFromHash(hash: java.lang.String, unsigned: scala.Boolean): protobufjsLib.protobufjsMod.Long | scala.Double = js.native
  /**
    * Converts a number or long to an 8 characters long hash string.
    * @param value Value to convert
    * @returns Hash
    */
  def longToHash(value: protobufjsLib.protobufjsMod.Long): java.lang.String = js.native
  def longToHash(value: scala.Double): java.lang.String = js.native
  /**
    * Merges the properties of the source object into the destination object.
    * @param dst Destination object
    * @param src Source object
    * @param [ifNotSet=false] Merges only if the key is not already set
    * @returns Destination object
    */
  def merge(
    dst: org.scalablytyped.runtime.StringDictionary[js.Any],
    src: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def merge(
    dst: org.scalablytyped.runtime.StringDictionary[js.Any],
    src: org.scalablytyped.runtime.StringDictionary[js.Any],
    ifNotSet: scala.Boolean
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Creates a new buffer of whatever type supported by the environment.
    * @param [sizeOrArray=0] Buffer size or number array
    * @returns Buffer
    */
  def newBuffer(): stdLib.Uint8Array | protobufjsLib.protobufjsMod.Buffer = js.native
  def newBuffer(sizeOrArray: js.Array[scala.Double]): stdLib.Uint8Array | protobufjsLib.protobufjsMod.Buffer = js.native
  def newBuffer(sizeOrArray: scala.Double): stdLib.Uint8Array | protobufjsLib.protobufjsMod.Buffer = js.native
  /**
    * Creates a custom error constructor.
    * @param name Error name
    * @returns Custom error constructor
    */
  def newError(name: java.lang.String): protobufjsLib.protobufjsMod.Constructor[stdLib.Error] = js.native
  /**
    * Builds a getter for a oneof's present field name.
    * @param fieldNames Field names
    * @returns Unbound getter
    */
  def oneOfGetter(fieldNames: js.Array[java.lang.String]): protobufjsLib.OneOfGetter = js.native
  /**
    * Builds a setter for a oneof's present field name.
    * @param fieldNames Field names
    * @returns Unbound setter
    */
  def oneOfSetter(fieldNames: js.Array[java.lang.String]): protobufjsLib.OneOfSetter = js.native
  /**
    * A general purpose buffer pool.
    * @param alloc Allocator
    * @param slice Slicer
    * @param [size=8192] Slab size
    * @returns Pooled allocator
    */
  def pool(alloc: protobufjsLib.PoolAllocator, slice: protobufjsLib.PoolSlicer): protobufjsLib.PoolAllocator = js.native
  def pool(alloc: protobufjsLib.PoolAllocator, slice: protobufjsLib.PoolSlicer, size: scala.Double): protobufjsLib.PoolAllocator = js.native
  /**
    * Returns a safe property accessor for the specified property name.
    * @param prop Property name
    * @returns Safe accessor
    */
  def safeProp(prop: java.lang.String): java.lang.String = js.native
  /**
    * Converts an object's values to an array.
    * @param object Object to convert
    * @returns Converted array
    */
  def toArray(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Array[_] = js.native
  /**
    * Converts an array of keys immediately followed by their respective value to an object, omitting undefined values.
    * @param array Array to convert
    * @returns Converted object
    */
  def toObject(array: js.Array[_]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Converts the first character of a string to upper case.
    * @param str String to convert
    * @returns Converted string
    */
  def ucFirst(str: java.lang.String): java.lang.String = js.native
  /* static members */
  @js.native
  object LongBits extends js.Object {
    /** Zero bits. */
    var zero: protobufjsLib.protobufjsMod.utilNs.LongBits = js.native
    /** Zero hash. */
    var zeroHash: java.lang.String = js.native
    def from(value: java.lang.String): protobufjsLib.protobufjsMod.utilNs.LongBits = js.native
    /**
      * Constructs new long bits from a number, long or string.
      * @param value Value
      * @returns Instance
      */
    def from(value: protobufjsLib.protobufjsMod.Long): protobufjsLib.protobufjsMod.utilNs.LongBits = js.native
    def from(value: scala.Double): protobufjsLib.protobufjsMod.utilNs.LongBits = js.native
    /**
      * Constructs new long bits from the specified 8 characters long hash.
      * @param hash Hash
      * @returns Bits
      */
    def fromHash(hash: java.lang.String): protobufjsLib.protobufjsMod.utilNs.LongBits = js.native
    /**
      * Constructs new long bits from the specified number.
      * @param value Value
      * @returns Instance
      */
    def fromNumber(value: scala.Double): protobufjsLib.protobufjsMod.utilNs.LongBits = js.native
  }
  
  /** A minimal base64 implementation for number arrays. */
  @JSName("base64")
  @js.native
  object base64Ns extends js.Object {
    /**
      * Decodes a base64 encoded string to a buffer.
      * @param string Source string
      * @param buffer Destination buffer
      * @param offset Destination offset
      * @returns Number of bytes written
      * @throws {Error} If encoding is invalid
      */
    def decode(string: java.lang.String, buffer: stdLib.Uint8Array, offset: scala.Double): scala.Double = js.native
    /**
      * Encodes a buffer to a base64 encoded string.
      * @param buffer Source buffer
      * @param start Source start
      * @param end Source end
      * @returns Base64 encoded string
      */
    def encode(buffer: stdLib.Uint8Array, start: scala.Double, end: scala.Double): java.lang.String = js.native
    /**
      * Calculates the byte length of a base64 encoded string.
      * @param string Base64 encoded string
      * @returns Byte length
      */
    def length(string: java.lang.String): scala.Double = js.native
    /**
      * Tests if the specified string appears to be base64 encoded.
      * @param string String to test
      * @returns `true` if probably base64 encoded, otherwise false
      */
    def test(string: java.lang.String): scala.Boolean = js.native
  }
  
  @JSName("codegen")
  @js.native
  object codegenNs extends js.Object {
    /** When set to `true`, codegen will log generated code to console. Useful for debugging. */
    var verbose: scala.Boolean = js.native
  }
  
  /** Reads / writes floats / doubles from / to buffers. */
  @JSName("float")
  @js.native
  object floatNs extends js.Object {
    /**
      * Reads a 64 bit double from a buffer using big endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    def readDoubleBE(buf: stdLib.Uint8Array, pos: scala.Double): scala.Double = js.native
    /**
      * Reads a 64 bit double from a buffer using little endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    def readDoubleLE(buf: stdLib.Uint8Array, pos: scala.Double): scala.Double = js.native
    /**
      * Reads a 32 bit float from a buffer using big endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    def readFloatBE(buf: stdLib.Uint8Array, pos: scala.Double): scala.Double = js.native
    /**
      * Reads a 32 bit float from a buffer using little endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    def readFloatLE(buf: stdLib.Uint8Array, pos: scala.Double): scala.Double = js.native
    /**
      * Writes a 64 bit double to a buffer using big endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    def writeDoubleBE(`val`: scala.Double, buf: stdLib.Uint8Array, pos: scala.Double): scala.Unit = js.native
    /**
      * Writes a 64 bit double to a buffer using little endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    def writeDoubleLE(`val`: scala.Double, buf: stdLib.Uint8Array, pos: scala.Double): scala.Unit = js.native
    /**
      * Writes a 32 bit float to a buffer using big endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    def writeFloatBE(`val`: scala.Double, buf: stdLib.Uint8Array, pos: scala.Double): scala.Unit = js.native
    /**
      * Writes a 32 bit float to a buffer using little endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    def writeFloatLE(`val`: scala.Double, buf: stdLib.Uint8Array, pos: scala.Double): scala.Unit = js.native
  }
  
  /** Node's fs module if available. */
  @js.native
  object fs
    extends /* k */ org.scalablytyped.runtime.StringDictionary[js.Any]
  
  /** A minimal path module to resolve Unix, Windows and URL paths alike. */
  @JSName("path")
  @js.native
  object pathNs extends js.Object {
    /**
      * Tests if the specified path is absolute.
      * @param path Path to test
      * @returns `true` if path is absolute
      */
    def isAbsolute(path: java.lang.String): scala.Boolean = js.native
    /**
      * Normalizes the specified path.
      * @param path Path to normalize
      * @returns Normalized path
      */
    def normalize(path: java.lang.String): java.lang.String = js.native
    /**
      * Resolves the specified include path against the specified origin path.
      * @param originPath Path to the origin file
      * @param includePath Include path relative to origin path
      * @param [alreadyNormalized=false] `true` if both paths are already known to be normalized
      * @returns Path to the include file
      */
    def resolve(originPath: java.lang.String, includePath: java.lang.String): java.lang.String = js.native
    def resolve(originPath: java.lang.String, includePath: java.lang.String, alreadyNormalized: scala.Boolean): java.lang.String = js.native
  }
  
  /** A minimal UTF8 implementation for number arrays. */
  @JSName("utf8")
  @js.native
  object utf8Ns extends js.Object {
    /**
      * Calculates the UTF8 byte length of a string.
      * @param string String
      * @returns Byte length
      */
    def length(string: java.lang.String): scala.Double = js.native
    /**
      * Reads UTF8 bytes as a string.
      * @param buffer Source buffer
      * @param start Source start
      * @param end Source end
      * @returns String read
      */
    def read(buffer: stdLib.Uint8Array, start: scala.Double, end: scala.Double): java.lang.String = js.native
    /**
      * Writes a string as UTF8 bytes.
      * @param string Source string
      * @param buffer Destination buffer
      * @param offset Destination offset
      * @returns Bytes written
      */
    def write(string: java.lang.String, buffer: stdLib.Uint8Array, offset: scala.Double): scala.Double = js.native
  }
  
}

