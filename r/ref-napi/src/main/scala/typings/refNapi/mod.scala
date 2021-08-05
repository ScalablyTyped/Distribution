package typings.refNapi

import typings.refNapi.anon.FnCall
import typings.refNapi.mod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ref-napi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ref-napi", "NULL")
  @js.native
  def NULL: Buffer = js.native
  inline def NULL_=(x: Buffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
  
  @JSImport("ref-napi", "NULL_POINTER")
  @js.native
  def NULL_POINTER: Buffer = js.native
  inline def NULL_POINTER_=(x: Buffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL_POINTER")(x.asInstanceOf[js.Any])
  
  inline def _reinterpret(buffer: Buffer, size: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("_reinterpret")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def _reinterpret(buffer: Buffer, size: Double, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("_reinterpret")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def _reinterpretUntilZeros(buffer: Buffer, size: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("_reinterpretUntilZeros")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def _reinterpretUntilZeros(buffer: Buffer, size: Double, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("_reinterpretUntilZeros")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def _writeObject(buffer: Buffer, offset: Double, `object`: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_writeObject")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def _writePointer(buffer: Buffer, offset: Double, pointer: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_writePointer")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def address(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("address")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def alloc(`type`: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def alloc(`type`: String, value: js.Any): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def alloc(`type`: Type): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def alloc(`type`: Type, value: js.Any): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def allocCString(string: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocCString")(string.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def allocCString(string: String, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("allocCString")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def attach(buffer: Buffer, `object`: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_attach")(buffer.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def coerceType(`type`: String): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type]
  inline def coerceType(`type`: Type): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  inline def deref(buffer: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deref")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def derefType(`type`: String): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type]
  inline def derefType(`type`: Type): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("derefType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  @JSImport("ref-napi", "endianness")
  @js.native
  def endianness: String = js.native
  inline def endianness_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endianness")(x.asInstanceOf[js.Any])
  
  inline def get(buffer: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def get(buffer: Buffer, offset: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(buffer: Buffer, offset: Double, `type`: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(buffer: Buffer, offset: Double, `type`: Type): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(buffer: Buffer, offset: Unit, `type`: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def get(buffer: Buffer, offset: Unit, `type`: Type): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getType(buffer: Buffer): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("getType")(buffer.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  inline def isNull(buffer: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(buffer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def readCString(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readCString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def readCString(buffer: Buffer, offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("readCString")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def readInt64BE(buffer: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readInt64BE")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def readInt64BE(buffer: Buffer, offset: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def readInt64LE(buffer: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readInt64LE")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def readInt64LE(buffer: Buffer, offset: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def readObject(buffer: Buffer): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("readObject")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def readObject(buffer: Buffer, offset: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("readObject")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def readPointer(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readPointer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def readPointer(buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readPointer")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def readPointer(buffer: Buffer, offset: Double, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readPointer")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def readPointer(buffer: Buffer, offset: Unit, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readPointer")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def readUInt64BE(buffer: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64BE")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def readUInt64BE(buffer: Buffer, offset: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def readUInt64LE(buffer: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64LE")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def readUInt64LE(buffer: Buffer, offset: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def ref(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def refType(`type`: String): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type]
  inline def refType(`type`: Type): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("refType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  inline def reinterpret(buffer: Buffer, size: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("reinterpret")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def reinterpret(buffer: Buffer, size: Double, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("reinterpret")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def reinterpretUntilZeros(buffer: Buffer, size: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("reinterpretUntilZeros")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def reinterpretUntilZeros(buffer: Buffer, size: Double, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("reinterpretUntilZeros")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def set(buffer: Buffer, offset: Double, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set(buffer: Buffer, offset: Double, value: js.Any, `type`: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set(buffer: Buffer, offset: Double, value: js.Any, `type`: Type): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object types {
    
    @JSImport("ref-napi", "types")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ref-napi", "types.CString")
    @js.native
    def CString: Type = js.native
    inline def CString_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CString")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.Object")
    @js.native
    def Object: Type = js.native
    inline def Object_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.bool")
    @js.native
    def bool: Type = js.native
    inline def bool_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bool")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.byte")
    @js.native
    def byte: Type = js.native
    inline def byte_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byte")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.char")
    @js.native
    def char: Type = js.native
    inline def char_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("char")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.double")
    @js.native
    def double: Type = js.native
    inline def double_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("double")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.float")
    @js.native
    def float: Type = js.native
    inline def float_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.int")
    @js.native
    def int: Type = js.native
    
    @JSImport("ref-napi", "types.int16")
    @js.native
    def int16: Type = js.native
    inline def int16_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int16")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.int32")
    @js.native
    def int32: Type = js.native
    inline def int32_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int32")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.int64")
    @js.native
    def int64: Type = js.native
    inline def int64_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int64")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.int8")
    @js.native
    def int8: Type = js.native
    inline def int8_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int8")(x.asInstanceOf[js.Any])
    
    inline def int_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.long")
    @js.native
    def long: Type = js.native
    inline def long_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("long")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.longlong")
    @js.native
    def longlong: Type = js.native
    inline def longlong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longlong")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.short")
    @js.native
    def short: Type = js.native
    inline def short_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("short")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.size_t")
    @js.native
    def sizeT: Type = js.native
    
    inline def sizeT_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size_t")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.uchar")
    @js.native
    def uchar: Type = js.native
    inline def uchar_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uchar")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.uint")
    @js.native
    def uint: Type = js.native
    
    @JSImport("ref-napi", "types.uint16")
    @js.native
    def uint16: Type = js.native
    inline def uint16_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint16")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.uint32")
    @js.native
    def uint32: Type = js.native
    inline def uint32_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint32")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.uint64")
    @js.native
    def uint64: Type = js.native
    inline def uint64_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint64")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.uint8")
    @js.native
    def uint8: Type = js.native
    inline def uint8_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint8")(x.asInstanceOf[js.Any])
    
    inline def uint_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.ulong")
    @js.native
    def ulong: Type = js.native
    inline def ulong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ulong")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.ulonglong")
    @js.native
    def ulonglong: Type = js.native
    inline def ulonglong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ulonglong")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.ushort")
    @js.native
    def ushort: Type = js.native
    inline def ushort_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ushort")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.void")
    @js.native
    def void: Type = js.native
    inline def void_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("void")(x.asInstanceOf[js.Any])
  }
  
  inline def writeCString(buffer: Buffer, offset: Double, string: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCString")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeCString(buffer: Buffer, offset: Double, string: String, encoding: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCString")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeInt64BE(buffer: Buffer, offset: Double, input: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeInt64BE(buffer: Buffer, offset: Double, input: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeInt64LE(buffer: Buffer, offset: Double, input: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeInt64LE(buffer: Buffer, offset: Double, input: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeObject(buffer: Buffer, offset: Double, `object`: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeObject")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writePointer(buffer: Buffer, offset: Double, pointer: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writePointer")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUInt64BE(buffer: Buffer, offset: Double, input: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeUInt64BE(buffer: Buffer, offset: Double, input: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Type extends StObject {
    
    /** The alignment of this datatype when placed inside a struct. */
    var alignment: js.UndefOr[Double] = js.undefined
    
    /** To invoke when `ref.get` is invoked on a buffer of this type. */
    def get(buffer: Buffer, offset: Double): js.Any
    
    /** The current level of indirection of the buffer. */
    var indirection: Double
    
    /** The name to use during debugging for this datatype. */
    var name: js.UndefOr[String] = js.undefined
    
    /** To invoke when `ref.set` is invoked on a buffer of this type. */
    def set(buffer: Buffer, offset: Double, value: js.Any): Unit
    
    /** The size in bytes required to hold this datatype. */
    var size: Double
  }
  object Type {
    
    inline def apply(
      get: (Buffer, Double) => js.Any,
      indirection: Double,
      set: (Buffer, Double, js.Any) => Unit,
      size: Double
    ): Type = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), indirection = indirection.asInstanceOf[js.Any], set = js.Any.fromFunction3(set), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setAlignment(value: Double): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setGet(value: (Buffer, Double) => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setIndirection(value: Double): Self = StObject.set(x, "indirection", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSet(value: (Buffer, Double, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    trait Buffer extends StObject {
      
      def address(buffer: this.type): Double
      @JSName("address")
      var address_Original: js.Function1[/* buffer */ this.type, Double]
      
      def deref(buffer: this.type): js.Any
      @JSName("deref")
      var deref_Original: js.Function1[/* buffer */ this.type, js.Any]
      
      def isNull(buffer: this.type): Boolean
      @JSName("isNull")
      var isNull_Original: js.Function1[/* buffer */ this.type, Boolean]
      
      def readCString(buffer: this.type): String
      def readCString(buffer: this.type, offset: Double): String
      @JSName("readCString")
      var readCString_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], String]
      
      def readInt64BE(buffer: this.type): js.Any
      def readInt64BE(buffer: this.type, offset: Double): js.Any
      @JSName("readInt64BE")
      var readInt64BE_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], js.Any]
      
      def readInt64LE(buffer: this.type): js.Any
      def readInt64LE(buffer: this.type, offset: Double): js.Any
      @JSName("readInt64LE")
      var readInt64LE_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], js.Any]
      
      def readObject(buffer: this.type): js.Object
      def readObject(buffer: this.type, offset: Double): js.Object
      @JSName("readObject")
      var readObject_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], js.Object]
      
      def readPointer(buffer: this.type): this.type
      def readPointer(buffer: this.type, offset: Double): this.type
      def readPointer(buffer: this.type, offset: Double, length: Double): this.type
      def readPointer(buffer: this.type, offset: Unit, length: Double): this.type
      @JSName("readPointer")
      var readPointer_Original: js.Function3[
            /* buffer */ this.type, 
            /* offset */ js.UndefOr[Double], 
            /* length */ js.UndefOr[Double], 
            this.type
          ]
      
      def readUInt64BE(buffer: this.type): js.Any
      def readUInt64BE(buffer: this.type, offset: Double): js.Any
      @JSName("readUInt64BE")
      var readUInt64BE_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], js.Any]
      
      def ref(buffer: this.type): this.type
      @JSName("ref")
      var ref_Original: js.Function1[/* buffer */ this.type, this.type]
      
      def reinterpret(buffer: this.type, size: Double): this.type
      def reinterpret(buffer: this.type, size: Double, offset: Double): this.type
      
      def reinterpretUntilZeros(buffer: this.type, size: Double): this.type
      def reinterpretUntilZeros(buffer: this.type, size: Double, offset: Double): this.type
      @JSName("reinterpretUntilZeros")
      var reinterpretUntilZeros_Original: js.Function3[/* buffer */ this.type, /* size */ Double, /* offset */ js.UndefOr[Double], this.type]
      
      @JSName("reinterpret")
      var reinterpret_Original: js.Function3[/* buffer */ this.type, /* size */ Double, /* offset */ js.UndefOr[Double], this.type]
      
      var `type`: js.UndefOr[Type] = js.undefined
      
      def writeCString(buffer: this.type, offset: Double, string: String): Unit
      def writeCString(buffer: this.type, offset: Double, string: String, encoding: String): Unit
      @JSName("writeCString")
      var writeCString_Original: js.Function4[
            /* buffer */ this.type, 
            /* offset */ Double, 
            /* string */ String, 
            /* encoding */ js.UndefOr[String], 
            Unit
          ]
      
      def writeInt64BE(buffer: Buffer, offset: Double, input: String): Unit
      def writeInt64BE(buffer: Buffer, offset: Double, input: Double): Unit
      @JSName("writeInt64BE")
      var writeInt64BE_Original: FnCall
      
      def writeInt64LE(buffer: Buffer, offset: Double, input: String): Unit
      def writeInt64LE(buffer: Buffer, offset: Double, input: Double): Unit
      @JSName("writeInt64LE")
      var writeInt64LE_Original: FnCall
      
      def writeObject(buffer: this.type, offset: Double, `object`: js.Object): Unit
      @JSName("writeObject")
      var writeObject_Original: js.Function3[/* buffer */ this.type, /* offset */ Double, /* object */ js.Object, Unit]
      
      def writePointer(buffer: this.type, offset: Double, pointer: this.type): Unit
      @JSName("writePointer")
      var writePointer_Original: js.Function3[/* buffer */ this.type, /* offset */ Double, /* pointer */ this.type, Unit]
      
      def writeUInt64BE(buffer: Buffer, offset: Double, input: String): Unit
      def writeUInt64BE(buffer: Buffer, offset: Double, input: Double): Unit
      @JSName("writeUInt64BE")
      var writeUInt64BE_Original: FnCall
    }
    object Buffer {
      
      inline def apply(
        address: Buffer => Double,
        deref: Buffer => js.Any,
        isNull: Buffer => Boolean,
        readCString: (Buffer, /* offset */ js.UndefOr[Double]) => String,
        readInt64BE: (Buffer, /* offset */ js.UndefOr[Double]) => js.Any,
        readInt64LE: (Buffer, /* offset */ js.UndefOr[Double]) => js.Any,
        readObject: (Buffer, /* offset */ js.UndefOr[Double]) => js.Object,
        readPointer: (Buffer, /* offset */ js.UndefOr[Double], /* length */ js.UndefOr[Double]) => Buffer,
        readUInt64BE: (Buffer, /* offset */ js.UndefOr[Double]) => js.Any,
        ref: Buffer => Buffer,
        reinterpret: (Buffer, /* size */ Double, /* offset */ js.UndefOr[Double]) => Buffer,
        reinterpretUntilZeros: (Buffer, /* size */ Double, /* offset */ js.UndefOr[Double]) => Buffer,
        writeCString: (Buffer, /* offset */ Double, /* string */ String, /* encoding */ js.UndefOr[String]) => Unit,
        writeInt64BE: FnCall,
        writeInt64LE: FnCall,
        writeObject: (Buffer, /* offset */ Double, /* object */ js.Object) => Unit,
        writePointer: (Buffer, /* offset */ Double, Buffer) => Unit,
        writeUInt64BE: FnCall
      ): Buffer = {
        val __obj = js.Dynamic.literal(address = js.Any.fromFunction1(address), deref = js.Any.fromFunction1(deref), isNull = js.Any.fromFunction1(isNull), readCString = js.Any.fromFunction2(readCString), readInt64BE = js.Any.fromFunction2(readInt64BE), readInt64LE = js.Any.fromFunction2(readInt64LE), readObject = js.Any.fromFunction2(readObject), readPointer = js.Any.fromFunction3(readPointer), readUInt64BE = js.Any.fromFunction2(readUInt64BE), ref = js.Any.fromFunction1(ref), reinterpret = js.Any.fromFunction3(reinterpret), reinterpretUntilZeros = js.Any.fromFunction3(reinterpretUntilZeros), writeCString = js.Any.fromFunction4(writeCString), writeInt64BE = writeInt64BE.asInstanceOf[js.Any], writeInt64LE = writeInt64LE.asInstanceOf[js.Any], writeObject = js.Any.fromFunction3(writeObject), writePointer = js.Any.fromFunction3(writePointer), writeUInt64BE = writeUInt64BE.asInstanceOf[js.Any])
        __obj.asInstanceOf[Buffer]
      }
      
      extension [Self <: Buffer](x: Self) {
        
        inline def setAddress(value: Buffer => Double): Self = StObject.set(x, "address", js.Any.fromFunction1(value))
        
        inline def setDeref(value: Buffer => js.Any): Self = StObject.set(x, "deref", js.Any.fromFunction1(value))
        
        inline def setIsNull(value: Buffer => Boolean): Self = StObject.set(x, "isNull", js.Any.fromFunction1(value))
        
        inline def setReadCString(value: (Buffer, /* offset */ js.UndefOr[Double]) => String): Self = StObject.set(x, "readCString", js.Any.fromFunction2(value))
        
        inline def setReadInt64BE(value: (Buffer, /* offset */ js.UndefOr[Double]) => js.Any): Self = StObject.set(x, "readInt64BE", js.Any.fromFunction2(value))
        
        inline def setReadInt64LE(value: (Buffer, /* offset */ js.UndefOr[Double]) => js.Any): Self = StObject.set(x, "readInt64LE", js.Any.fromFunction2(value))
        
        inline def setReadObject(value: (Buffer, /* offset */ js.UndefOr[Double]) => js.Object): Self = StObject.set(x, "readObject", js.Any.fromFunction2(value))
        
        inline def setReadPointer(value: (Buffer, /* offset */ js.UndefOr[Double], /* length */ js.UndefOr[Double]) => Buffer): Self = StObject.set(x, "readPointer", js.Any.fromFunction3(value))
        
        inline def setReadUInt64BE(value: (Buffer, /* offset */ js.UndefOr[Double]) => js.Any): Self = StObject.set(x, "readUInt64BE", js.Any.fromFunction2(value))
        
        inline def setRef(value: Buffer => Buffer): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
        
        inline def setReinterpret(value: (Buffer, /* size */ Double, /* offset */ js.UndefOr[Double]) => Buffer): Self = StObject.set(x, "reinterpret", js.Any.fromFunction3(value))
        
        inline def setReinterpretUntilZeros(value: (Buffer, /* size */ Double, /* offset */ js.UndefOr[Double]) => Buffer): Self = StObject.set(x, "reinterpretUntilZeros", js.Any.fromFunction3(value))
        
        inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setWriteCString(
          value: (Buffer, /* offset */ Double, /* string */ String, /* encoding */ js.UndefOr[String]) => Unit
        ): Self = StObject.set(x, "writeCString", js.Any.fromFunction4(value))
        
        inline def setWriteInt64BE(value: FnCall): Self = StObject.set(x, "writeInt64BE", value.asInstanceOf[js.Any])
        
        inline def setWriteInt64LE(value: FnCall): Self = StObject.set(x, "writeInt64LE", value.asInstanceOf[js.Any])
        
        inline def setWriteObject(value: (Buffer, /* offset */ Double, /* object */ js.Object) => Unit): Self = StObject.set(x, "writeObject", js.Any.fromFunction3(value))
        
        inline def setWritePointer(value: (Buffer, /* offset */ Double, Buffer) => Unit): Self = StObject.set(x, "writePointer", js.Any.fromFunction3(value))
        
        inline def setWriteUInt64BE(value: FnCall): Self = StObject.set(x, "writeUInt64BE", value.asInstanceOf[js.Any])
      }
    }
  }
}
