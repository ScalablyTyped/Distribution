package typings.protobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.Codegen
import typings.protobufjs.mod.Constructor
import typings.protobufjs.mod.FetchCallback
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.IFetchOptions
import typings.protobufjs.mod.OneOfGetter
import typings.protobufjs.mod.OneOfSetter
import typings.protobufjs.mod.PoolAllocator
import typings.protobufjs.mod.PoolSlicer
import typings.protobufjs.mod.asPromiseCallback
import typings.std.Error
import typings.std.RegExp
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSImport("protobufjs/light", "util")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("protobufjs/light", "util.Array")
  @js.native
  class Array protected ()
    extends StObject
       with Uint8Array {
    def this(params: js.Any*) = this()
  }
  /** Array implementation used in the browser. `Uint8Array` if supported, otherwise `Array`. */
  @JSImport("protobufjs/light", "util.Array")
  @js.native
  def Array: Constructor[Uint8Array] = js.native
  @scala.inline
  def Array_=(x: Constructor[Uint8Array]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Array")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("protobufjs/light", "util.Buffer")
  @js.native
  class Buffer protected ()
    extends StObject
       with Uint8Array {
    def this(params: js.Any*) = this()
  }
  /** Node's Buffer class if available. */
  @JSImport("protobufjs/light", "util.Buffer")
  @js.native
  def Buffer: Constructor[typings.protobufjs.mod.Buffer] = js.native
  @scala.inline
  def Buffer_=(x: Constructor[typings.protobufjs.mod.Buffer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Buffer")(x.asInstanceOf[js.Any])
  
  /** A minimal event emitter. */
  @JSImport("protobufjs/light", "util.EventEmitter")
  @js.native
  /** Constructs a new event emitter instance. */
  class EventEmitter ()
    extends typings.protobufjs.mod.util.EventEmitter
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("protobufjs/light", "util.Long")
  @js.native
  class Long protected ()
    extends StObject
       with typings.protobufjs.mod.Long {
    def this(params: js.Any*) = this()
    
    /** High bits */
    /* CompleteClass */
    var high: Double = js.native
    
    /** Low bits */
    /* CompleteClass */
    var low: Double = js.native
    
    /** Whether unsigned or not */
    /* CompleteClass */
    var unsigned: Boolean = js.native
  }
  /** Long.js's Long class if available. */
  @JSImport("protobufjs/light", "util.Long")
  @js.native
  def Long: Constructor[typings.protobufjs.mod.Long] = js.native
  
  /** Helper class for working with the low and high bits of a 64 bit value. */
  @JSImport("protobufjs/light", "util.LongBits")
  @js.native
  class LongBits protected ()
    extends typings.protobufjs.mod.util.LongBits {
    /**
      * Constructs new long bits.
      * @param lo Low 32 bits, unsigned
      * @param hi High 32 bits, unsigned
      */
    def this(lo: Double, hi: Double) = this()
  }
  object LongBits {
    
    @JSImport("protobufjs/light", "util.LongBits")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def from(value: String): typings.protobufjs.mod.util.LongBits = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.util.LongBits]
    @scala.inline
    def from(value: Double): typings.protobufjs.mod.util.LongBits = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.util.LongBits]
    /**
      * Constructs new long bits from a number, long or string.
      * @param value Value
      * @returns Instance
      */
    /* static member */
    @scala.inline
    def from(value: typings.protobufjs.mod.Long): typings.protobufjs.mod.util.LongBits = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.util.LongBits]
    
    /**
      * Constructs new long bits from the specified 8 characters long hash.
      * @param hash Hash
      * @returns Bits
      */
    /* static member */
    @scala.inline
    def fromHash(hash: String): typings.protobufjs.mod.util.LongBits = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHash")(hash.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.util.LongBits]
    
    /**
      * Constructs new long bits from the specified number.
      * @param value Value
      * @returns Instance
      */
    /* static member */
    @scala.inline
    def fromNumber(value: Double): typings.protobufjs.mod.util.LongBits = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(value.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.util.LongBits]
    
    /** Zero bits. */
    /* static member */
    @JSImport("protobufjs/light", "util.LongBits.zero")
    @js.native
    def zero: typings.protobufjs.mod.util.LongBits = js.native
    
    /** Zero hash. */
    /* static member */
    @JSImport("protobufjs/light", "util.LongBits.zeroHash")
    @js.native
    def zeroHash: String = js.native
    @scala.inline
    def zeroHash_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zeroHash")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def zero_=(x: typings.protobufjs.mod.util.LongBits): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zero")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def Long_=(x: Constructor[typings.protobufjs.mod.Long]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Long")(x.asInstanceOf[js.Any])
  
  /** Error subclass indicating a protocol specifc error. */
  @JSImport("protobufjs/light", "util.ProtocolError")
  @js.native
  class ProtocolError[T /* <: typings.protobufjs.mod.Message[T] */] protected ()
    extends typings.protobufjs.mod.util.ProtocolError[T] {
    /**
      * Constructs a new protocol error.
      * @param message Error message
      * @param [properties] Additional properties
      */
    def this(message: String) = this()
    def this(message: String, properties: StringDictionary[js.Any]) = this()
  }
  
  /**
    * Returns a promise from a node-style callback function.
    * @param fn Function to call
    * @param ctx Function context
    * @param params Function arguments
    * @returns Promisified function
    */
  @scala.inline
  def asPromise(fn: asPromiseCallback, ctx: js.Any, params: js.Any*): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("asPromise")(fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  /** A minimal base64 implementation for number arrays. */
  object base64 {
    
    @JSImport("protobufjs/light", "util.base64")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decodes a base64 encoded string to a buffer.
      * @param string Source string
      * @param buffer Destination buffer
      * @param offset Destination offset
      * @returns Number of bytes written
      * @throws {Error} If encoding is invalid
      */
    @scala.inline
    def decode(string: String, buffer: Uint8Array, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(string.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Encodes a buffer to a base64 encoded string.
      * @param buffer Source buffer
      * @param start Source start
      * @param end Source end
      * @returns Base64 encoded string
      */
    @scala.inline
    def encode(buffer: Uint8Array, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Calculates the byte length of a base64 encoded string.
      * @param string Base64 encoded string
      * @returns Byte length
      */
    @scala.inline
    def length(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Tests if the specified string appears to be base64 encoded.
      * @param string String to test
      * @returns `true` if probably base64 encoded, otherwise false
      */
    @scala.inline
    def test(string: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * Converts a string to camel case.
    * @param str String to convert
    * @returns Converted string
    */
  @scala.inline
  def camelCase(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object codegen {
    
    /**
      * Begins generating a function.
      * @param [functionName] Function name if not anonymous
      * @returns Appender that appends code to the function's body
      */
    @scala.inline
    def apply(): Codegen = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Codegen]
    @scala.inline
    def apply(functionName: String): Codegen = ^.asInstanceOf[js.Dynamic].apply(functionName.asInstanceOf[js.Any]).asInstanceOf[Codegen]
    /**
      * Begins generating a function.
      * @param functionParams Function parameter names
      * @param [functionName] Function name if not anonymous
      * @returns Appender that appends code to the function's body
      */
    @scala.inline
    def apply(functionParams: js.Array[String]): Codegen = ^.asInstanceOf[js.Dynamic].apply(functionParams.asInstanceOf[js.Any]).asInstanceOf[Codegen]
    @scala.inline
    def apply(functionParams: js.Array[String], functionName: String): Codegen = (^.asInstanceOf[js.Dynamic].apply(functionParams.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[Codegen]
    
    @JSImport("protobufjs/light", "util.codegen")
    @js.native
    val ^ : js.Any = js.native
    
    /** When set to `true`, codegen will log generated code to console. Useful for debugging. */
    @JSImport("protobufjs/light", "util.codegen.verbose")
    @js.native
    def verbose: Boolean = js.native
    @scala.inline
    def verbose_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verbose")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Compares reflected fields by id.
    * @param a First field
    * @param b Second field
    * @returns Comparison value
    */
  @scala.inline
  def compareFieldsById(a: typings.protobufjs.mod.Field, b: typings.protobufjs.mod.Field): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareFieldsById")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Decorator helper for enums (TypeScript).
    * @param object Enum object
    * @returns Reflected enum
    */
  @scala.inline
  def decorateEnum(`object`: js.Object): typings.protobufjs.mod.Enum = ^.asInstanceOf[js.Dynamic].applyDynamic("decorateEnum")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Enum]
  
  /** Decorator root (TypeScript). */
  @JSImport("protobufjs/light", "util.decorateRoot")
  @js.native
  def decorateRoot: typings.protobufjs.mod.Root = js.native
  @scala.inline
  def decorateRoot_=(x: typings.protobufjs.mod.Root): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorateRoot")(x.asInstanceOf[js.Any])
  
  /**
    * Decorator helper for types (TypeScript).
    * @param ctor Constructor function
    * @param [typeName] Type name, defaults to the constructor's name
    * @returns Reflected type
    */
  @scala.inline
  def decorateType[T /* <: typings.protobufjs.mod.Message[T] */](ctor: Constructor[T]): typings.protobufjs.mod.Type = ^.asInstanceOf[js.Dynamic].applyDynamic("decorateType")(ctor.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Type]
  @scala.inline
  def decorateType[T /* <: typings.protobufjs.mod.Message[T] */](ctor: Constructor[T], typeName: String): typings.protobufjs.mod.Type = (^.asInstanceOf[js.Dynamic].applyDynamic("decorateType")(ctor.asInstanceOf[js.Any], typeName.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Type]
  
  /** An immuable empty array. */
  @JSImport("protobufjs/light", "util.emptyArray")
  @js.native
  val emptyArray: js.Array[js.Any] = js.native
  
  /** An immutable empty object. */
  @JSImport("protobufjs/light", "util.emptyObject")
  @js.native
  val emptyObject: js.Object = js.native
  
  /**
    * Fetches the contents of a file.
    * @param filename File path or url
    * @param options Fetch options
    * @param callback Callback function
    */
  @scala.inline
  def fetch(filename: String, options: IFetchOptions, callback: FetchCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Fetches the contents of a file.
    * @param path File path or url
    * @param [options] Fetch options
    * @returns Promise
    */
  @scala.inline
  def fetch(path: String): js.Promise[String | Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Uint8Array]]
  /**
    * Fetches the contents of a file.
    * @param path File path or url
    * @param callback Callback function
    */
  @scala.inline
  def fetch(path: String, callback: FetchCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fetch(path: String, options: IFetchOptions): js.Promise[String | Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | Uint8Array]]
  
  /** Reads / writes floats / doubles from / to buffers. */
  object float {
    
    @JSImport("protobufjs/light", "util.float")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Reads a 64 bit double from a buffer using big endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    @scala.inline
    def readDoubleBE(buf: Uint8Array, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readDoubleBE")(buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Reads a 64 bit double from a buffer using little endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    @scala.inline
    def readDoubleLE(buf: Uint8Array, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readDoubleLE")(buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Reads a 32 bit float from a buffer using big endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    @scala.inline
    def readFloatBE(buf: Uint8Array, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readFloatBE")(buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Reads a 32 bit float from a buffer using little endian byte order.
      * @param buf Source buffer
      * @param pos Source buffer offset
      * @returns Value read
      */
    @scala.inline
    def readFloatLE(buf: Uint8Array, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readFloatLE")(buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Writes a 64 bit double to a buffer using big endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    @scala.inline
    def writeDoubleBE(`val`: Double, buf: Uint8Array, pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDoubleBE")(`val`.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Writes a 64 bit double to a buffer using little endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    @scala.inline
    def writeDoubleLE(`val`: Double, buf: Uint8Array, pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDoubleLE")(`val`.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Writes a 32 bit float to a buffer using big endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    @scala.inline
    def writeFloatBE(`val`: Double, buf: Uint8Array, pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFloatBE")(`val`.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Writes a 32 bit float to a buffer using little endian byte order.
      * @param val Value to write
      * @param buf Target buffer
      * @param pos Target buffer offset
      */
    @scala.inline
    def writeFloatLE(`val`: Double, buf: Uint8Array, pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFloatLE")(`val`.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /** Global object reference. */
  @JSImport("protobufjs/light", "util.global")
  @js.native
  def global: js.Object = js.native
  @scala.inline
  def global_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("global")(x.asInstanceOf[js.Any])
  
  /**
    * Requires a module only if available.
    * @param moduleName Module to require
    * @returns Required module if available and not empty, otherwise `null`
    */
  @scala.inline
  def inquire(moduleName: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("inquire")(moduleName.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  /**
    * Tests if the specified value is an integer.
    * @param value Value to test
    * @returns `true` if the value is an integer
    */
  @scala.inline
  def isInteger(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteger")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Whether running within node or not. */
  @JSImport("protobufjs/light", "util.isNode")
  @js.native
  def isNode: Boolean = js.native
  @scala.inline
  def isNode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isNode")(x.asInstanceOf[js.Any])
  
  /**
    * Tests if the specified value is a non-null object.
    * @param value Value to test
    * @returns `true` if the value is a non-null object
    */
  @scala.inline
  def isObject(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Tests whether the specified name is a reserved word in JS.
    * @param name Name to test
    * @returns `true` if reserved, otherwise `false`
    */
  @scala.inline
  def isReserved(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReserved")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Checks if a property on a message is considered to be present.
    * @param obj Plain object or message instance
    * @param prop Property name
    * @returns `true` if considered to be present, otherwise `false`
    */
  @scala.inline
  def isSet_(obj: js.Object, prop: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSet")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Tests if the specified value is a string.
    * @param value Value to test
    * @returns `true` if the value is a string
    */
  @scala.inline
  def isString(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Checks if a property on a message is considered to be present.
    * This is an alias of {@link util.isSet}.
    * @param obj Plain object or message instance
    * @param prop Property name
    * @returns `true` if considered to be present, otherwise `false`
    */
  @scala.inline
  def isset(obj: js.Object, prop: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isset")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /** Regular expression used to verify 2 bit (`bool`) map keys. */
  @JSImport("protobufjs/light", "util.key2Re")
  @js.native
  val key2Re: RegExp = js.native
  
  /** Regular expression used to verify 32 bit (`int32` etc.) map keys. */
  @JSImport("protobufjs/light", "util.key32Re")
  @js.native
  val key32Re: RegExp = js.native
  
  /** Regular expression used to verify 64 bit (`int64` etc.) map keys. */
  @JSImport("protobufjs/light", "util.key64Re")
  @js.native
  val key64Re: RegExp = js.native
  
  /**
    * Converts the first character of a string to lower case.
    * @param str String to convert
    * @returns Converted string
    */
  @scala.inline
  def lcFirst(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lcFirst")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Converts an 8 characters long hash string to a long or number.
    * @param hash Hash
    * @param [unsigned=false] Whether unsigned or not
    * @returns Original value
    */
  @scala.inline
  def longFromHash(hash: String): typings.protobufjs.mod.Long | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("longFromHash")(hash.asInstanceOf[js.Any]).asInstanceOf[typings.protobufjs.mod.Long | Double]
  @scala.inline
  def longFromHash(hash: String, unsigned: Boolean): typings.protobufjs.mod.Long | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("longFromHash")(hash.asInstanceOf[js.Any], unsigned.asInstanceOf[js.Any])).asInstanceOf[typings.protobufjs.mod.Long | Double]
  
  @scala.inline
  def longToHash(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("longToHash")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  /**
    * Converts a number or long to an 8 characters long hash string.
    * @param value Value to convert
    * @returns Hash
    */
  @scala.inline
  def longToHash(value: typings.protobufjs.mod.Long): String = ^.asInstanceOf[js.Dynamic].applyDynamic("longToHash")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Merges the properties of the source object into the destination object.
    * @param dst Destination object
    * @param src Source object
    * @param [ifNotSet=false] Merges only if the key is not already set
    * @returns Destination object
    */
  @scala.inline
  def merge(dst: StringDictionary[js.Any], src: StringDictionary[js.Any]): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def merge(dst: StringDictionary[js.Any], src: StringDictionary[js.Any], ifNotSet: Boolean): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(dst.asInstanceOf[js.Any], src.asInstanceOf[js.Any], ifNotSet.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Creates a new buffer of whatever type supported by the environment.
    * @param [sizeOrArray=0] Buffer size or number array
    * @returns Buffer
    */
  @scala.inline
  def newBuffer(): Uint8Array | typings.protobufjs.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("newBuffer")().asInstanceOf[Uint8Array | typings.protobufjs.mod.Buffer]
  @scala.inline
  def newBuffer(sizeOrArray: js.Array[Double]): Uint8Array | typings.protobufjs.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("newBuffer")(sizeOrArray.asInstanceOf[js.Any]).asInstanceOf[Uint8Array | typings.protobufjs.mod.Buffer]
  @scala.inline
  def newBuffer(sizeOrArray: Double): Uint8Array | typings.protobufjs.mod.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("newBuffer")(sizeOrArray.asInstanceOf[js.Any]).asInstanceOf[Uint8Array | typings.protobufjs.mod.Buffer]
  
  /**
    * Creates a custom error constructor.
    * @param name Error name
    * @returns Custom error constructor
    */
  @scala.inline
  def newError(name: String): Constructor[Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("newError")(name.asInstanceOf[js.Any]).asInstanceOf[Constructor[Error]]
  
  /**
    * Builds a getter for a oneof's present field name.
    * @param fieldNames Field names
    * @returns Unbound getter
    */
  @scala.inline
  def oneOfGetter(fieldNames: js.Array[String]): OneOfGetter = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOfGetter")(fieldNames.asInstanceOf[js.Any]).asInstanceOf[OneOfGetter]
  
  /**
    * Builds a setter for a oneof's present field name.
    * @param fieldNames Field names
    * @returns Unbound setter
    */
  @scala.inline
  def oneOfSetter(fieldNames: js.Array[String]): OneOfSetter = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOfSetter")(fieldNames.asInstanceOf[js.Any]).asInstanceOf[OneOfSetter]
  
  /** A minimal path module to resolve Unix, Windows and URL paths alike. */
  object path {
    
    @JSImport("protobufjs/light", "util.path")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Tests if the specified path is absolute.
      * @param path Path to test
      * @returns `true` if path is absolute
      */
    @scala.inline
    def isAbsolute(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Normalizes the specified path.
      * @param path Path to normalize
      * @returns Normalized path
      */
    @scala.inline
    def normalize(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Resolves the specified include path against the specified origin path.
      * @param originPath Path to the origin file
      * @param includePath Include path relative to origin path
      * @param [alreadyNormalized=false] `true` if both paths are already known to be normalized
      * @returns Path to the include file
      */
    @scala.inline
    def resolve(originPath: String, includePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(originPath.asInstanceOf[js.Any], includePath.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def resolve(originPath: String, includePath: String, alreadyNormalized: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(originPath.asInstanceOf[js.Any], includePath.asInstanceOf[js.Any], alreadyNormalized.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  /**
    * A general purpose buffer pool.
    * @param alloc Allocator
    * @param slice Slicer
    * @param [size=8192] Slab size
    * @returns Pooled allocator
    */
  @scala.inline
  def pool(alloc: PoolAllocator, slice: PoolSlicer): PoolAllocator = (^.asInstanceOf[js.Dynamic].applyDynamic("pool")(alloc.asInstanceOf[js.Any], slice.asInstanceOf[js.Any])).asInstanceOf[PoolAllocator]
  @scala.inline
  def pool(alloc: PoolAllocator, slice: PoolSlicer, size: Double): PoolAllocator = (^.asInstanceOf[js.Dynamic].applyDynamic("pool")(alloc.asInstanceOf[js.Any], slice.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[PoolAllocator]
  
  /**
    * Returns a safe property accessor for the specified property name.
    * @param prop Property name
    * @returns Safe accessor
    */
  @scala.inline
  def safeProp(prop: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("safeProp")(prop.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Sets the value of a property by property path. If a value already exists, it is turned to an array
    * @param dst Destination object
    * @param path dot '.' delimited path of the property to set
    * @param value the value to set
    * @returns Destination object
    */
  @scala.inline
  def setProperty(dst: StringDictionary[js.Any], path: String, value: js.Object): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setProperty")(dst.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Converts an object's values to an array.
    * @param object Object to convert
    * @returns Converted array
    */
  @scala.inline
  def toArray(`object`: StringDictionary[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
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
  @JSImport("protobufjs/light", "util.toJSONOptions")
  @js.native
  def toJSONOptions: IConversionOptions = js.native
  @scala.inline
  def toJSONOptions_=(x: IConversionOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toJSONOptions")(x.asInstanceOf[js.Any])
  
  /**
    * Converts an array of keys immediately followed by their respective value to an object, omitting undefined values.
    * @param array Array to convert
    * @returns Converted object
    */
  @scala.inline
  def toObject(array: js.Array[js.Any]): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(array.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Converts the first character of a string to upper case.
    * @param str String to convert
    * @returns Converted string
    */
  @scala.inline
  def ucFirst(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ucFirst")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** A minimal UTF8 implementation for number arrays. */
  object utf8 {
    
    @JSImport("protobufjs/light", "util.utf8")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Calculates the UTF8 byte length of a string.
      * @param string String
      * @returns Byte length
      */
    @scala.inline
    def length(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * Reads UTF8 bytes as a string.
      * @param buffer Source buffer
      * @param start Source start
      * @param end Source end
      * @returns String read
      */
    @scala.inline
    def read(buffer: Uint8Array, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Writes a string as UTF8 bytes.
      * @param string Source string
      * @param buffer Destination buffer
      * @param offset Destination offset
      * @returns Bytes written
      */
    @scala.inline
    def write(string: String, buffer: Uint8Array, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(string.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  /** Node's fs module if available. */
  object fs
}
