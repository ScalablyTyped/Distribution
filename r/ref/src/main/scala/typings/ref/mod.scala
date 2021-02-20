package typings.ref

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ref", "NULL")
  @js.native
  def NULL: Buffer = js.native
  @scala.inline
  def NULL_=(x: Buffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
  
  @JSImport("ref", "NULL_POINTER")
  @js.native
  def NULL_POINTER: Buffer = js.native
  @scala.inline
  def NULL_POINTER_=(x: Buffer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL_POINTER")(x.asInstanceOf[js.Any])
  
  @JSImport("ref", "_reinterpret")
  @js.native
  def _reinterpret(buffer: Buffer, size: Double): Buffer = js.native
  @JSImport("ref", "_reinterpret")
  @js.native
  def _reinterpret(buffer: Buffer, size: Double, offset: Double): Buffer = js.native
  
  @JSImport("ref", "_reinterpretUntilZeros")
  @js.native
  def _reinterpretUntilZeros(buffer: Buffer, size: Double): Buffer = js.native
  @JSImport("ref", "_reinterpretUntilZeros")
  @js.native
  def _reinterpretUntilZeros(buffer: Buffer, size: Double, offset: Double): Buffer = js.native
  
  @JSImport("ref", "_writeObject")
  @js.native
  def _writeObject(buffer: Buffer, offset: Double, `object`: js.Object): Unit = js.native
  
  @JSImport("ref", "_writePointer")
  @js.native
  def _writePointer(buffer: Buffer, offset: Double, pointer: Buffer): Unit = js.native
  
  @JSImport("ref", "address")
  @js.native
  def address(buffer: Buffer): Double = js.native
  
  @JSImport("ref", "alloc")
  @js.native
  def alloc(`type`: String): Buffer = js.native
  @JSImport("ref", "alloc")
  @js.native
  def alloc(`type`: String, value: js.Any): Buffer = js.native
  @JSImport("ref", "alloc")
  @js.native
  def alloc(`type`: Type): Buffer = js.native
  @JSImport("ref", "alloc")
  @js.native
  def alloc(`type`: Type, value: js.Any): Buffer = js.native
  
  @JSImport("ref", "allocCString")
  @js.native
  def allocCString(string: String): Buffer = js.native
  @JSImport("ref", "allocCString")
  @js.native
  def allocCString(string: String, encoding: String): Buffer = js.native
  
  @JSImport("ref", "_attach")
  @js.native
  def attach(buffer: Buffer, `object`: js.Object): Unit = js.native
  
  @JSImport("ref", "coerceType")
  @js.native
  def coerceType(`type`: String): Type = js.native
  @JSImport("ref", "coerceType")
  @js.native
  def coerceType(`type`: Type): Type = js.native
  
  @JSImport("ref", "deref")
  @js.native
  def deref(buffer: Buffer): js.Any = js.native
  
  @JSImport("ref", "derefType")
  @js.native
  def derefType(`type`: String): Type = js.native
  @JSImport("ref", "derefType")
  @js.native
  def derefType(`type`: Type): Type = js.native
  
  @JSImport("ref", "endianness")
  @js.native
  def endianness: String = js.native
  @scala.inline
  def endianness_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("endianness")(x.asInstanceOf[js.Any])
  
  @JSImport("ref", "get")
  @js.native
  def get(buffer: Buffer): js.Any = js.native
  @JSImport("ref", "get")
  @js.native
  def get(buffer: Buffer, offset: js.UndefOr[scala.Nothing], `type`: String): js.Any = js.native
  @JSImport("ref", "get")
  @js.native
  def get(buffer: Buffer, offset: js.UndefOr[scala.Nothing], `type`: Type): js.Any = js.native
  @JSImport("ref", "get")
  @js.native
  def get(buffer: Buffer, offset: Double): js.Any = js.native
  @JSImport("ref", "get")
  @js.native
  def get(buffer: Buffer, offset: Double, `type`: String): js.Any = js.native
  @JSImport("ref", "get")
  @js.native
  def get(buffer: Buffer, offset: Double, `type`: Type): js.Any = js.native
  
  @JSImport("ref", "getType")
  @js.native
  def getType(buffer: Buffer): Type = js.native
  
  @JSImport("ref", "isNull")
  @js.native
  def isNull(buffer: Buffer): Boolean = js.native
  
  @JSImport("ref", "readCString")
  @js.native
  def readCString(buffer: Buffer): String = js.native
  @JSImport("ref", "readCString")
  @js.native
  def readCString(buffer: Buffer, offset: Double): String = js.native
  
  @JSImport("ref", "readInt64BE")
  @js.native
  def readInt64BE(buffer: Buffer): js.Any = js.native
  @JSImport("ref", "readInt64BE")
  @js.native
  def readInt64BE(buffer: Buffer, offset: Double): js.Any = js.native
  
  @JSImport("ref", "readInt64LE")
  @js.native
  def readInt64LE(buffer: Buffer): js.Any = js.native
  @JSImport("ref", "readInt64LE")
  @js.native
  def readInt64LE(buffer: Buffer, offset: Double): js.Any = js.native
  
  @JSImport("ref", "readObject")
  @js.native
  def readObject(buffer: Buffer): js.Object = js.native
  @JSImport("ref", "readObject")
  @js.native
  def readObject(buffer: Buffer, offset: Double): js.Object = js.native
  
  @JSImport("ref", "readPointer")
  @js.native
  def readPointer(buffer: Buffer): Buffer = js.native
  @JSImport("ref", "readPointer")
  @js.native
  def readPointer(buffer: Buffer, offset: js.UndefOr[scala.Nothing], length: Double): Buffer = js.native
  @JSImport("ref", "readPointer")
  @js.native
  def readPointer(buffer: Buffer, offset: Double): Buffer = js.native
  @JSImport("ref", "readPointer")
  @js.native
  def readPointer(buffer: Buffer, offset: Double, length: Double): Buffer = js.native
  
  @JSImport("ref", "readUInt64BE")
  @js.native
  def readUInt64BE(buffer: Buffer): js.Any = js.native
  @JSImport("ref", "readUInt64BE")
  @js.native
  def readUInt64BE(buffer: Buffer, offset: Double): js.Any = js.native
  
  @JSImport("ref", "readUInt64LE")
  @js.native
  def readUInt64LE(buffer: Buffer): js.Any = js.native
  @JSImport("ref", "readUInt64LE")
  @js.native
  def readUInt64LE(buffer: Buffer, offset: Double): js.Any = js.native
  
  @JSImport("ref", "ref")
  @js.native
  def ref(buffer: Buffer): Buffer = js.native
  
  @JSImport("ref", "refType")
  @js.native
  def refType(`type`: String): Type = js.native
  @JSImport("ref", "refType")
  @js.native
  def refType(`type`: Type): Type = js.native
  
  @JSImport("ref", "reinterpret")
  @js.native
  def reinterpret(buffer: Buffer, size: Double): Buffer = js.native
  @JSImport("ref", "reinterpret")
  @js.native
  def reinterpret(buffer: Buffer, size: Double, offset: Double): Buffer = js.native
  
  @JSImport("ref", "reinterpretUntilZeros")
  @js.native
  def reinterpretUntilZeros(buffer: Buffer, size: Double): Buffer = js.native
  @JSImport("ref", "reinterpretUntilZeros")
  @js.native
  def reinterpretUntilZeros(buffer: Buffer, size: Double, offset: Double): Buffer = js.native
  
  @JSImport("ref", "set")
  @js.native
  def set(buffer: Buffer, offset: Double, value: js.Any): Unit = js.native
  @JSImport("ref", "set")
  @js.native
  def set(buffer: Buffer, offset: Double, value: js.Any, `type`: String): Unit = js.native
  @JSImport("ref", "set")
  @js.native
  def set(buffer: Buffer, offset: Double, value: js.Any, `type`: Type): Unit = js.native
  
  object types {
    
    @JSImport("ref", "types")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ref", "types.CString")
    @js.native
    def CString: Type = js.native
    @scala.inline
    def CString_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CString")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.Object")
    @js.native
    def Object: Type = js.native
    @scala.inline
    def Object_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.bool")
    @js.native
    def bool: Type = js.native
    @scala.inline
    def bool_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bool")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.byte")
    @js.native
    def byte: Type = js.native
    @scala.inline
    def byte_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("byte")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.char")
    @js.native
    def char: Type = js.native
    @scala.inline
    def char_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("char")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.double")
    @js.native
    def double: Type = js.native
    @scala.inline
    def double_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("double")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.float")
    @js.native
    def float: Type = js.native
    @scala.inline
    def float_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.int")
    @js.native
    def int: Type = js.native
    
    @JSImport("ref", "types.int16")
    @js.native
    def int16: Type = js.native
    @scala.inline
    def int16_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int16")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.int32")
    @js.native
    def int32: Type = js.native
    @scala.inline
    def int32_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int32")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.int64")
    @js.native
    def int64: Type = js.native
    @scala.inline
    def int64_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int64")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.int8")
    @js.native
    def int8: Type = js.native
    @scala.inline
    def int8_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int8")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def int_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.long")
    @js.native
    def long: Type = js.native
    @scala.inline
    def long_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("long")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.longlong")
    @js.native
    def longlong: Type = js.native
    @scala.inline
    def longlong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("longlong")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.short")
    @js.native
    def short: Type = js.native
    @scala.inline
    def short_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("short")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.size_t")
    @js.native
    def sizeT: Type = js.native
    
    @scala.inline
    def sizeT_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size_t")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.uchar")
    @js.native
    def uchar: Type = js.native
    @scala.inline
    def uchar_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uchar")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.uint")
    @js.native
    def uint: Type = js.native
    
    @JSImport("ref", "types.uint16")
    @js.native
    def uint16: Type = js.native
    @scala.inline
    def uint16_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint16")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.uint32")
    @js.native
    def uint32: Type = js.native
    @scala.inline
    def uint32_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint32")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.uint64")
    @js.native
    def uint64: Type = js.native
    @scala.inline
    def uint64_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint64")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.uint8")
    @js.native
    def uint8: Type = js.native
    @scala.inline
    def uint8_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint8")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def uint_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.ulong")
    @js.native
    def ulong: Type = js.native
    @scala.inline
    def ulong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ulong")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.ulonglong")
    @js.native
    def ulonglong: Type = js.native
    @scala.inline
    def ulonglong_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ulonglong")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.ushort")
    @js.native
    def ushort: Type = js.native
    @scala.inline
    def ushort_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ushort")(x.asInstanceOf[js.Any])
    
    @JSImport("ref", "types.void")
    @js.native
    def void: Type = js.native
    @scala.inline
    def void_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("void")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ref", "writeCString")
  @js.native
  def writeCString(buffer: Buffer, offset: Double, string: String): Unit = js.native
  @JSImport("ref", "writeCString")
  @js.native
  def writeCString(buffer: Buffer, offset: Double, string: String, encoding: String): Unit = js.native
  
  @JSImport("ref", "writeInt64BE")
  @js.native
  def writeInt64BE(buffer: Buffer, offset: Double, input: String): Unit = js.native
  @JSImport("ref", "writeInt64BE")
  @js.native
  def writeInt64BE(buffer: Buffer, offset: Double, input: Double): Unit = js.native
  
  @JSImport("ref", "writeInt64LE")
  @js.native
  def writeInt64LE(buffer: Buffer, offset: Double, input: String): Unit = js.native
  @JSImport("ref", "writeInt64LE")
  @js.native
  def writeInt64LE(buffer: Buffer, offset: Double, input: Double): Unit = js.native
  
  @JSImport("ref", "writeObject")
  @js.native
  def writeObject(buffer: Buffer, offset: Double, `object`: js.Object): Unit = js.native
  
  @JSImport("ref", "writePointer")
  @js.native
  def writePointer(buffer: Buffer, offset: Double, pointer: Buffer): Unit = js.native
  
  @JSImport("ref", "writeUInt64BE")
  @js.native
  def writeUInt64BE(buffer: Buffer, offset: Double, input: String): Unit = js.native
  @JSImport("ref", "writeUInt64BE")
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
}
