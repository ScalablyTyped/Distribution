package typings.refNapi

import typings.refNapi.anon.FnCall
import typings.refNapi.mod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ref-napi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ref-napi", "NULL")
  @js.native
  def NULL: Buffer = js.native
  @scala.inline
  def NULL_=(x: Buffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
  
  @JSImport("ref-napi", "NULL_POINTER")
  @js.native
  def NULL_POINTER: Buffer = js.native
  @scala.inline
  def NULL_POINTER_=(x: Buffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL_POINTER")(x.asInstanceOf[js.Any])
  
  @JSImport("ref-napi", "_reinterpret")
  @js.native
  def _reinterpret(buffer: Buffer, size: Double): Buffer = js.native
  @JSImport("ref-napi", "_reinterpret")
  @js.native
  def _reinterpret(buffer: Buffer, size: Double, offset: Double): Buffer = js.native
  
  @JSImport("ref-napi", "_reinterpretUntilZeros")
  @js.native
  def _reinterpretUntilZeros(buffer: Buffer, size: Double): Buffer = js.native
  @JSImport("ref-napi", "_reinterpretUntilZeros")
  @js.native
  def _reinterpretUntilZeros(buffer: Buffer, size: Double, offset: Double): Buffer = js.native
  
  @JSImport("ref-napi", "_writeObject")
  @js.native
  def _writeObject(buffer: Buffer, offset: Double, `object`: js.Object): Unit = js.native
  
  @JSImport("ref-napi", "_writePointer")
  @js.native
  def _writePointer(buffer: Buffer, offset: Double, pointer: Buffer): Unit = js.native
  
  @JSImport("ref-napi", "address")
  @js.native
  def address(buffer: Buffer): Double = js.native
  
  @JSImport("ref-napi", "alloc")
  @js.native
  def alloc(`type`: String): Buffer = js.native
  @JSImport("ref-napi", "alloc")
  @js.native
  def alloc(`type`: String, value: js.Any): Buffer = js.native
  @JSImport("ref-napi", "alloc")
  @js.native
  def alloc(`type`: Type): Buffer = js.native
  @JSImport("ref-napi", "alloc")
  @js.native
  def alloc(`type`: Type, value: js.Any): Buffer = js.native
  
  @JSImport("ref-napi", "allocCString")
  @js.native
  def allocCString(string: String): Buffer = js.native
  @JSImport("ref-napi", "allocCString")
  @js.native
  def allocCString(string: String, encoding: String): Buffer = js.native
  
  @JSImport("ref-napi", "_attach")
  @js.native
  def attach(buffer: Buffer, `object`: js.Object): Unit = js.native
  
  @JSImport("ref-napi", "coerceType")
  @js.native
  def coerceType(`type`: String): Type = js.native
  @JSImport("ref-napi", "coerceType")
  @js.native
  def coerceType(`type`: Type): Type = js.native
  
  @JSImport("ref-napi", "deref")
  @js.native
  def deref(buffer: Buffer): js.Any = js.native
  
  @JSImport("ref-napi", "derefType")
  @js.native
  def derefType(`type`: String): Type = js.native
  @JSImport("ref-napi", "derefType")
  @js.native
  def derefType(`type`: Type): Type = js.native
  
  @JSImport("ref-napi", "endianness")
  @js.native
  def endianness: String = js.native
  @scala.inline
  def endianness_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endianness")(x.asInstanceOf[js.Any])
  
  @JSImport("ref-napi", "get")
  @js.native
  def get(buffer: Buffer): js.Any = js.native
  @JSImport("ref-napi", "get")
  @js.native
  def get(buffer: Buffer, offset: js.UndefOr[scala.Nothing], `type`: String): js.Any = js.native
  @JSImport("ref-napi", "get")
  @js.native
  def get(buffer: Buffer, offset: js.UndefOr[scala.Nothing], `type`: Type): js.Any = js.native
  @JSImport("ref-napi", "get")
  @js.native
  def get(buffer: Buffer, offset: Double): js.Any = js.native
  @JSImport("ref-napi", "get")
  @js.native
  def get(buffer: Buffer, offset: Double, `type`: String): js.Any = js.native
  @JSImport("ref-napi", "get")
  @js.native
  def get(buffer: Buffer, offset: Double, `type`: Type): js.Any = js.native
  
  @JSImport("ref-napi", "getType")
  @js.native
  def getType(buffer: Buffer): Type = js.native
  
  @JSImport("ref-napi", "isNull")
  @js.native
  def isNull(buffer: Buffer): Boolean = js.native
  
  @JSImport("ref-napi", "readCString")
  @js.native
  def readCString(buffer: Buffer): String = js.native
  @JSImport("ref-napi", "readCString")
  @js.native
  def readCString(buffer: Buffer, offset: Double): String = js.native
  
  @JSImport("ref-napi", "readInt64BE")
  @js.native
  def readInt64BE(buffer: Buffer): js.Any = js.native
  @JSImport("ref-napi", "readInt64BE")
  @js.native
  def readInt64BE(buffer: Buffer, offset: Double): js.Any = js.native
  
  @JSImport("ref-napi", "readInt64LE")
  @js.native
  def readInt64LE(buffer: Buffer): js.Any = js.native
  @JSImport("ref-napi", "readInt64LE")
  @js.native
  def readInt64LE(buffer: Buffer, offset: Double): js.Any = js.native
  
  @JSImport("ref-napi", "readObject")
  @js.native
  def readObject(buffer: Buffer): js.Object = js.native
  @JSImport("ref-napi", "readObject")
  @js.native
  def readObject(buffer: Buffer, offset: Double): js.Object = js.native
  
  @JSImport("ref-napi", "readPointer")
  @js.native
  def readPointer(buffer: Buffer): Buffer = js.native
  @JSImport("ref-napi", "readPointer")
  @js.native
  def readPointer(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): Buffer = js.native
  @JSImport("ref-napi", "readPointer")
  @js.native
  def readPointer(buffer: Buffer, offset: Double): Buffer = js.native
  @JSImport("ref-napi", "readPointer")
  @js.native
  def readPointer(buffer: Buffer, offset: Double, length: Double): Buffer = js.native
  
  @JSImport("ref-napi", "readUInt64BE")
  @js.native
  def readUInt64BE(buffer: Buffer): js.Any = js.native
  @JSImport("ref-napi", "readUInt64BE")
  @js.native
  def readUInt64BE(buffer: Buffer, offset: Double): js.Any = js.native
  
  @JSImport("ref-napi", "readUInt64LE")
  @js.native
  def readUInt64LE(buffer: Buffer): js.Any = js.native
  @JSImport("ref-napi", "readUInt64LE")
  @js.native
  def readUInt64LE(buffer: Buffer, offset: Double): js.Any = js.native
  
  @JSImport("ref-napi", "ref")
  @js.native
  def ref(buffer: Buffer): Buffer = js.native
  
  @JSImport("ref-napi", "refType")
  @js.native
  def refType(`type`: String): Type = js.native
  @JSImport("ref-napi", "refType")
  @js.native
  def refType(`type`: Type): Type = js.native
  
  @JSImport("ref-napi", "reinterpret")
  @js.native
  def reinterpret(buffer: Buffer, size: Double): Buffer = js.native
  @JSImport("ref-napi", "reinterpret")
  @js.native
  def reinterpret(buffer: Buffer, size: Double, offset: Double): Buffer = js.native
  
  @JSImport("ref-napi", "reinterpretUntilZeros")
  @js.native
  def reinterpretUntilZeros(buffer: Buffer, size: Double): Buffer = js.native
  @JSImport("ref-napi", "reinterpretUntilZeros")
  @js.native
  def reinterpretUntilZeros(buffer: Buffer, size: Double, offset: Double): Buffer = js.native
  
  @JSImport("ref-napi", "set")
  @js.native
  def set(buffer: Buffer, offset: Double, value: js.Any): Unit = js.native
  @JSImport("ref-napi", "set")
  @js.native
  def set(buffer: Buffer, offset: Double, value: js.Any, `type`: String): Unit = js.native
  @JSImport("ref-napi", "set")
  @js.native
  def set(buffer: Buffer, offset: Double, value: js.Any, `type`: Type): Unit = js.native
  
  object types {
    
    @JSImport("ref-napi", "types")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ref-napi", "types.CString")
    @js.native
    def CString: Type = js.native
    @scala.inline
    def CString_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CString")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.Object")
    @js.native
    def Object: Type = js.native
    @scala.inline
    def Object_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.bool")
    @js.native
    def bool: Type = js.native
    @scala.inline
    def bool_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bool")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.byte")
    @js.native
    def byte: Type = js.native
    @scala.inline
    def byte_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byte")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.char")
    @js.native
    def char: Type = js.native
    @scala.inline
    def char_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("char")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.double")
    @js.native
    def double: Type = js.native
    @scala.inline
    def double_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("double")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.float")
    @js.native
    def float: Type = js.native
    @scala.inline
    def float_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.int")
    @js.native
    def int: Type = js.native
    
    @JSImport("ref-napi", "types.int16")
    @js.native
    def int16: Type = js.native
    @scala.inline
    def int16_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int16")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.int32")
    @js.native
    def int32: Type = js.native
    @scala.inline
    def int32_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int32")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.int64")
    @js.native
    def int64: Type = js.native
    @scala.inline
    def int64_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int64")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.int8")
    @js.native
    def int8: Type = js.native
    @scala.inline
    def int8_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int8")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def int_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.long")
    @js.native
    def long: Type = js.native
    @scala.inline
    def long_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("long")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.longlong")
    @js.native
    def longlong: Type = js.native
    @scala.inline
    def longlong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longlong")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.short")
    @js.native
    def short: Type = js.native
    @scala.inline
    def short_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("short")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.size_t")
    @js.native
    def sizeT: Type = js.native
    
    @scala.inline
    def sizeT_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size_t")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.uchar")
    @js.native
    def uchar: Type = js.native
    @scala.inline
    def uchar_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uchar")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.uint")
    @js.native
    def uint: Type = js.native
    
    @JSImport("ref-napi", "types.uint16")
    @js.native
    def uint16: Type = js.native
    @scala.inline
    def uint16_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint16")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.uint32")
    @js.native
    def uint32: Type = js.native
    @scala.inline
    def uint32_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint32")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.uint64")
    @js.native
    def uint64: Type = js.native
    @scala.inline
    def uint64_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint64")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.uint8")
    @js.native
    def uint8: Type = js.native
    @scala.inline
    def uint8_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint8")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def uint_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.ulong")
    @js.native
    def ulong: Type = js.native
    @scala.inline
    def ulong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ulong")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.ulonglong")
    @js.native
    def ulonglong: Type = js.native
    @scala.inline
    def ulonglong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ulonglong")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.ushort")
    @js.native
    def ushort: Type = js.native
    @scala.inline
    def ushort_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ushort")(x.asInstanceOf[js.Any])
    
    @JSImport("ref-napi", "types.void")
    @js.native
    def void: Type = js.native
    @scala.inline
    def void_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("void")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ref-napi", "writeCString")
  @js.native
  def writeCString(buffer: Buffer, offset: Double, string: String): Unit = js.native
  @JSImport("ref-napi", "writeCString")
  @js.native
  def writeCString(buffer: Buffer, offset: Double, string: String, encoding: String): Unit = js.native
  
  @JSImport("ref-napi", "writeInt64BE")
  @js.native
  def writeInt64BE(buffer: Buffer, offset: Double, input: String): Unit = js.native
  @JSImport("ref-napi", "writeInt64BE")
  @js.native
  def writeInt64BE(buffer: Buffer, offset: Double, input: Double): Unit = js.native
  
  @JSImport("ref-napi", "writeInt64LE")
  @js.native
  def writeInt64LE(buffer: Buffer, offset: Double, input: String): Unit = js.native
  @JSImport("ref-napi", "writeInt64LE")
  @js.native
  def writeInt64LE(buffer: Buffer, offset: Double, input: Double): Unit = js.native
  
  @JSImport("ref-napi", "writeObject")
  @js.native
  def writeObject(buffer: Buffer, offset: Double, `object`: js.Object): Unit = js.native
  
  @JSImport("ref-napi", "writePointer")
  @js.native
  def writePointer(buffer: Buffer, offset: Double, pointer: Buffer): Unit = js.native
  
  @JSImport("ref-napi", "writeUInt64BE")
  @js.native
  def writeUInt64BE(buffer: Buffer, offset: Double, input: String): Unit = js.native
  @JSImport("ref-napi", "writeUInt64BE")
  @js.native
  def writeUInt64BE(buffer: Buffer, offset: Double, input: Double): Unit = js.native
  
  @js.native
  trait Type extends StObject {
    
    /** The alignment of this datatype when placed inside a struct. */
    var alignment: js.UndefOr[Double] = js.native
    
    /** To invoke when `ref.get` is invoked on a buffer of this type. */
    def get(buffer: Buffer, offset: Double): js.Any = js.native
    
    /** The current level of indirection of the buffer. */
    var indirection: Double = js.native
    
    /** The name to use during debugging for this datatype. */
    var name: js.UndefOr[String] = js.native
    
    /** To invoke when `ref.set` is invoked on a buffer of this type. */
    def set(buffer: Buffer, offset: Double, value: js.Any): Unit = js.native
    
    /** The size in bytes required to hold this datatype. */
    var size: Double = js.native
  }
  object Type {
    
    @scala.inline
    def apply(
      get: (Buffer, Double) => js.Any,
      indirection: Double,
      set: (Buffer, Double, js.Any) => Unit,
      size: Double
    ): Type = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), indirection = indirection.asInstanceOf[js.Any], set = js.Any.fromFunction3(set), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: Double): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setGet(value: (Buffer, Double) => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIndirection(value: Double): Self = StObject.set(x, "indirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSet(value: (Buffer, Double, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    @js.native
    trait Buffer extends StObject {
      
      def address(buffer: this.type): Double = js.native
      @JSName("address")
      var address_Original: js.Function1[/* buffer */ this.type, Double] = js.native
      
      def deref(buffer: this.type): js.Any = js.native
      @JSName("deref")
      var deref_Original: js.Function1[/* buffer */ this.type, _] = js.native
      
      def isNull(buffer: this.type): Boolean = js.native
      @JSName("isNull")
      var isNull_Original: js.Function1[/* buffer */ this.type, Boolean] = js.native
      
      def readCString(buffer: this.type): String = js.native
      def readCString(buffer: this.type, offset: Double): String = js.native
      @JSName("readCString")
      var readCString_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], String] = js.native
      
      def readInt64BE(buffer: this.type): js.Any = js.native
      def readInt64BE(buffer: this.type, offset: Double): js.Any = js.native
      @JSName("readInt64BE")
      var readInt64BE_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], _] = js.native
      
      def readInt64LE(buffer: this.type): js.Any = js.native
      def readInt64LE(buffer: this.type, offset: Double): js.Any = js.native
      @JSName("readInt64LE")
      var readInt64LE_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], _] = js.native
      
      def readObject(buffer: this.type): js.Object = js.native
      def readObject(buffer: this.type, offset: Double): js.Object = js.native
      @JSName("readObject")
      var readObject_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], js.Object] = js.native
      
      def readPointer(buffer: this.type): this.type = js.native
      def readPointer(buffer: this.type, offset: js.UndefOr[scala.Nothing], length: Double): this.type = js.native
      def readPointer(buffer: this.type, offset: Double): this.type = js.native
      def readPointer(buffer: this.type, offset: Double, length: Double): this.type = js.native
      @JSName("readPointer")
      var readPointer_Original: js.Function3[
            /* buffer */ this.type, 
            /* offset */ js.UndefOr[Double], 
            /* length */ js.UndefOr[Double], 
            this.type
          ] = js.native
      
      def readUInt64BE(buffer: this.type): js.Any = js.native
      def readUInt64BE(buffer: this.type, offset: Double): js.Any = js.native
      @JSName("readUInt64BE")
      var readUInt64BE_Original: js.Function2[/* buffer */ this.type, /* offset */ js.UndefOr[Double], _] = js.native
      
      def ref(buffer: this.type): this.type = js.native
      @JSName("ref")
      var ref_Original: js.Function1[/* buffer */ this.type, this.type] = js.native
      
      def reinterpret(buffer: this.type, size: Double): this.type = js.native
      def reinterpret(buffer: this.type, size: Double, offset: Double): this.type = js.native
      
      def reinterpretUntilZeros(buffer: this.type, size: Double): this.type = js.native
      def reinterpretUntilZeros(buffer: this.type, size: Double, offset: Double): this.type = js.native
      @JSName("reinterpretUntilZeros")
      var reinterpretUntilZeros_Original: js.Function3[/* buffer */ this.type, /* size */ Double, /* offset */ js.UndefOr[Double], this.type] = js.native
      
      @JSName("reinterpret")
      var reinterpret_Original: js.Function3[/* buffer */ this.type, /* size */ Double, /* offset */ js.UndefOr[Double], this.type] = js.native
      
      var `type`: js.UndefOr[Type] = js.native
      
      def writeCString(buffer: this.type, offset: Double, string: String): Unit = js.native
      def writeCString(buffer: this.type, offset: Double, string: String, encoding: String): Unit = js.native
      @JSName("writeCString")
      var writeCString_Original: js.Function4[
            /* buffer */ this.type, 
            /* offset */ Double, 
            /* string */ String, 
            /* encoding */ js.UndefOr[String], 
            Unit
          ] = js.native
      
      def writeInt64BE(buffer: Buffer, offset: Double, input: String): Unit = js.native
      def writeInt64BE(buffer: Buffer, offset: Double, input: Double): Unit = js.native
      @JSName("writeInt64BE")
      var writeInt64BE_Original: FnCall = js.native
      
      def writeInt64LE(buffer: Buffer, offset: Double, input: String): Unit = js.native
      def writeInt64LE(buffer: Buffer, offset: Double, input: Double): Unit = js.native
      @JSName("writeInt64LE")
      var writeInt64LE_Original: FnCall = js.native
      
      def writeObject(buffer: this.type, offset: Double, `object`: js.Object): Unit = js.native
      @JSName("writeObject")
      var writeObject_Original: js.Function3[/* buffer */ this.type, /* offset */ Double, /* object */ js.Object, Unit] = js.native
      
      def writePointer(buffer: this.type, offset: Double, pointer: this.type): Unit = js.native
      @JSName("writePointer")
      var writePointer_Original: js.Function3[/* buffer */ this.type, /* offset */ Double, /* pointer */ this.type, Unit] = js.native
      
      def writeUInt64BE(buffer: Buffer, offset: Double, input: String): Unit = js.native
      def writeUInt64BE(buffer: Buffer, offset: Double, input: Double): Unit = js.native
      @JSName("writeUInt64BE")
      var writeUInt64BE_Original: FnCall = js.native
    }
  }
}
