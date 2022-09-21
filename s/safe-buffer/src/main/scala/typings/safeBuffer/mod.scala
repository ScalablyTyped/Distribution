package typings.safeBuffer

import typings.safeBuffer.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("safe-buffer", "Buffer")
  @js.native
  open class Buffer protected () extends StObject {
    /**
      * Produces a Buffer backed by the same allocated memory as
      * the given {ArrayBuffer}.
      *
      *
      * @param arrayBuffer The ArrayBuffer with which to share memory.
      */
    def this(arrayBuffer: js.typedarray.ArrayBuffer) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      */
    def this(array: js.Array[Any]) = this()
    /**
      * Allocates a new buffer containing the given {array} of octets.
      *
      * @param array The octets to store.
      */
    def this(array: js.typedarray.Uint8Array) = this()
    /**
      * Copies the passed {buffer} data onto a new {Buffer} instance.
      *
      * @param buffer The buffer to copy.
      */
    def this(buffer: Buffer) = this()
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      */
    def this(size: Double) = this()
    /**
      * Allocates a new buffer containing the given {str}.
      *
      * @param str String to store in buffer.
      * @param encoding encoding to use, optional.  Default is 'utf8'
      */
    def this(str: String) = this()
    def this(str: String, encoding: String) = this()
    
    def compare(otherBuffer: Buffer): Double = js.native
    def compare(otherBuffer: Buffer, targetStart: Double): Double = js.native
    def compare(otherBuffer: Buffer, targetStart: Double, targetEnd: Double): Double = js.native
    def compare(otherBuffer: Buffer, targetStart: Double, targetEnd: Double, sourceStart: Double): Double = js.native
    def compare(
      otherBuffer: Buffer,
      targetStart: Double,
      targetEnd: Double,
      sourceStart: Double,
      sourceEnd: Double
    ): Double = js.native
    def compare(otherBuffer: Buffer, targetStart: Double, targetEnd: Double, sourceStart: Unit, sourceEnd: Double): Double = js.native
    def compare(otherBuffer: Buffer, targetStart: Double, targetEnd: Unit, sourceStart: Double): Double = js.native
    def compare(otherBuffer: Buffer, targetStart: Double, targetEnd: Unit, sourceStart: Double, sourceEnd: Double): Double = js.native
    def compare(otherBuffer: Buffer, targetStart: Double, targetEnd: Unit, sourceStart: Unit, sourceEnd: Double): Double = js.native
    def compare(otherBuffer: Buffer, targetStart: Unit, targetEnd: Double): Double = js.native
    def compare(otherBuffer: Buffer, targetStart: Unit, targetEnd: Double, sourceStart: Double): Double = js.native
    def compare(otherBuffer: Buffer, targetStart: Unit, targetEnd: Double, sourceStart: Double, sourceEnd: Double): Double = js.native
    def compare(otherBuffer: Buffer, targetStart: Unit, targetEnd: Double, sourceStart: Unit, sourceEnd: Double): Double = js.native
    def compare(otherBuffer: Buffer, targetStart: Unit, targetEnd: Unit, sourceStart: Double): Double = js.native
    def compare(otherBuffer: Buffer, targetStart: Unit, targetEnd: Unit, sourceStart: Double, sourceEnd: Double): Double = js.native
    def compare(otherBuffer: Buffer, targetStart: Unit, targetEnd: Unit, sourceStart: Unit, sourceEnd: Double): Double = js.native
    
    def copy(targetBuffer: Buffer): Double = js.native
    def copy(targetBuffer: Buffer, targetStart: Double): Double = js.native
    def copy(targetBuffer: Buffer, targetStart: Double, sourceStart: Double): Double = js.native
    def copy(targetBuffer: Buffer, targetStart: Double, sourceStart: Double, sourceEnd: Double): Double = js.native
    def copy(targetBuffer: Buffer, targetStart: Double, sourceStart: Unit, sourceEnd: Double): Double = js.native
    def copy(targetBuffer: Buffer, targetStart: Unit, sourceStart: Double): Double = js.native
    def copy(targetBuffer: Buffer, targetStart: Unit, sourceStart: Double, sourceEnd: Double): Double = js.native
    def copy(targetBuffer: Buffer, targetStart: Unit, sourceStart: Unit, sourceEnd: Double): Double = js.native
    
    def equals(otherBuffer: Buffer): Boolean = js.native
    
    def fill(value: Any): this.type = js.native
    def fill(value: Any, offset: Double): this.type = js.native
    def fill(value: Any, offset: Double, end: Double): this.type = js.native
    def fill(value: Any, offset: Unit, end: Double): this.type = js.native
    
    def includes(value: String): Boolean = js.native
    def includes(value: String, byteOffset: Double): Boolean = js.native
    def includes(value: String, byteOffset: Double, encoding: String): Boolean = js.native
    def includes(value: String, byteOffset: Unit, encoding: String): Boolean = js.native
    def includes(value: Double): Boolean = js.native
    def includes(value: Double, byteOffset: Double): Boolean = js.native
    def includes(value: Double, byteOffset: Double, encoding: String): Boolean = js.native
    def includes(value: Double, byteOffset: Unit, encoding: String): Boolean = js.native
    def includes(value: Buffer): Boolean = js.native
    def includes(value: Buffer, byteOffset: Double): Boolean = js.native
    def includes(value: Buffer, byteOffset: Double, encoding: String): Boolean = js.native
    def includes(value: Buffer, byteOffset: Unit, encoding: String): Boolean = js.native
    
    def indexOf(value: String): Double = js.native
    def indexOf(value: String, byteOffset: Double): Double = js.native
    def indexOf(value: String, byteOffset: Double, encoding: String): Double = js.native
    def indexOf(value: String, byteOffset: Unit, encoding: String): Double = js.native
    def indexOf(value: Double): Double = js.native
    def indexOf(value: Double, byteOffset: Double): Double = js.native
    def indexOf(value: Double, byteOffset: Double, encoding: String): Double = js.native
    def indexOf(value: Double, byteOffset: Unit, encoding: String): Double = js.native
    def indexOf(value: Buffer): Double = js.native
    def indexOf(value: Buffer, byteOffset: Double): Double = js.native
    def indexOf(value: Buffer, byteOffset: Double, encoding: String): Double = js.native
    def indexOf(value: Buffer, byteOffset: Unit, encoding: String): Double = js.native
    
    def lastIndexOf(value: String): Double = js.native
    def lastIndexOf(value: String, byteOffset: Double): Double = js.native
    def lastIndexOf(value: String, byteOffset: Double, encoding: String): Double = js.native
    def lastIndexOf(value: String, byteOffset: Unit, encoding: String): Double = js.native
    def lastIndexOf(value: Double): Double = js.native
    def lastIndexOf(value: Double, byteOffset: Double): Double = js.native
    def lastIndexOf(value: Double, byteOffset: Double, encoding: String): Double = js.native
    def lastIndexOf(value: Double, byteOffset: Unit, encoding: String): Double = js.native
    def lastIndexOf(value: Buffer): Double = js.native
    def lastIndexOf(value: Buffer, byteOffset: Double): Double = js.native
    def lastIndexOf(value: Buffer, byteOffset: Double, encoding: String): Double = js.native
    def lastIndexOf(value: Buffer, byteOffset: Unit, encoding: String): Double = js.native
    
    var length: Double = js.native
    
    def readDoubleBE(offset: Double): Double = js.native
    def readDoubleBE(offset: Double, noAssert: Boolean): Double = js.native
    
    def readDoubleLE(offset: Double): Double = js.native
    def readDoubleLE(offset: Double, noAssert: Boolean): Double = js.native
    
    def readFloatBE(offset: Double): Double = js.native
    def readFloatBE(offset: Double, noAssert: Boolean): Double = js.native
    
    def readFloatLE(offset: Double): Double = js.native
    def readFloatLE(offset: Double, noAssert: Boolean): Double = js.native
    
    def readInt16BE(offset: Double): Double = js.native
    def readInt16BE(offset: Double, noAssert: Boolean): Double = js.native
    
    def readInt16LE(offset: Double): Double = js.native
    def readInt16LE(offset: Double, noAssert: Boolean): Double = js.native
    
    def readInt32BE(offset: Double): Double = js.native
    def readInt32BE(offset: Double, noAssert: Boolean): Double = js.native
    
    def readInt32LE(offset: Double): Double = js.native
    def readInt32LE(offset: Double, noAssert: Boolean): Double = js.native
    
    def readInt8(offset: Double): Double = js.native
    def readInt8(offset: Double, noAssert: Boolean): Double = js.native
    
    def readIntBE(offset: Double, byteLength: Double): Double = js.native
    def readIntBE(offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
    
    def readIntLE(offset: Double, byteLength: Double): Double = js.native
    def readIntLE(offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
    
    def readUInt16BE(offset: Double): Double = js.native
    def readUInt16BE(offset: Double, noAssert: Boolean): Double = js.native
    
    def readUInt16LE(offset: Double): Double = js.native
    def readUInt16LE(offset: Double, noAssert: Boolean): Double = js.native
    
    def readUInt32BE(offset: Double): Double = js.native
    def readUInt32BE(offset: Double, noAssert: Boolean): Double = js.native
    
    def readUInt32LE(offset: Double): Double = js.native
    def readUInt32LE(offset: Double, noAssert: Boolean): Double = js.native
    
    def readUInt8(offset: Double): Double = js.native
    def readUInt8(offset: Double, noAssert: Boolean): Double = js.native
    
    def readUIntBE(offset: Double, byteLength: Double): Double = js.native
    def readUIntBE(offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
    
    def readUIntLE(offset: Double, byteLength: Double): Double = js.native
    def readUIntLE(offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
    
    def slice(): Buffer = js.native
    def slice(start: Double): Buffer = js.native
    def slice(start: Double, end: Double): Buffer = js.native
    def slice(start: Unit, end: Double): Buffer = js.native
    
    def swap16(): Buffer = js.native
    
    def swap32(): Buffer = js.native
    
    def swap64(): Buffer = js.native
    
    def toJSON(): Data = js.native
    
    def toString(encoding: String): String = js.native
    def toString(encoding: String, start: Double): String = js.native
    def toString(encoding: String, start: Double, end: Double): String = js.native
    def toString(encoding: String, start: Unit, end: Double): String = js.native
    def toString(encoding: Unit, start: Double): String = js.native
    def toString(encoding: Unit, start: Double, end: Double): String = js.native
    def toString(encoding: Unit, start: Unit, end: Double): String = js.native
    
    def write(string: String): Double = js.native
    def write(string: String, offset: Double): Double = js.native
    def write(string: String, offset: Double, length: Double): Double = js.native
    def write(string: String, offset: Double, length: Double, encoding: String): Double = js.native
    def write(string: String, offset: Double, length: Unit, encoding: String): Double = js.native
    def write(string: String, offset: Unit, length: Double): Double = js.native
    def write(string: String, offset: Unit, length: Double, encoding: String): Double = js.native
    def write(string: String, offset: Unit, length: Unit, encoding: String): Double = js.native
    
    def writeDoubleBE(value: Double, offset: Double): Double = js.native
    def writeDoubleBE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
    
    def writeDoubleLE(value: Double, offset: Double): Double = js.native
    def writeDoubleLE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
    
    def writeFloatBE(value: Double, offset: Double): Double = js.native
    def writeFloatBE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
    
    def writeFloatLE(value: Double, offset: Double): Double = js.native
    def writeFloatLE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
    
    def writeInt16BE(value: Double, offset: Double): Double = js.native
    def writeInt16BE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
    
    def writeInt16LE(value: Double, offset: Double): Double = js.native
    def writeInt16LE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
    
    def writeInt32BE(value: Double, offset: Double): Double = js.native
    def writeInt32BE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
    
    def writeInt32LE(value: Double, offset: Double): Double = js.native
    def writeInt32LE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
    
    def writeInt8(value: Double, offset: Double): Double = js.native
    def writeInt8(value: Double, offset: Double, noAssert: Boolean): Double = js.native
    
    def writeIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
    def writeIntBE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
    
    def writeIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
    def writeIntLE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
    
    def writeUInt16BE(value: Double, offset: Double): Double = js.native
    def writeUInt16BE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
    
    def writeUInt16LE(value: Double, offset: Double): Double = js.native
    def writeUInt16LE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
    
    def writeUInt32BE(value: Double, offset: Double): Double = js.native
    def writeUInt32BE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
    
    def writeUInt32LE(value: Double, offset: Double): Double = js.native
    def writeUInt32LE(value: Double, offset: Double, noAssert: Boolean): Double = js.native
    
    def writeUInt8(value: Double, offset: Double): Double = js.native
    def writeUInt8(value: Double, offset: Double, noAssert: Boolean): Double = js.native
    
    def writeUIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
    def writeUIntBE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
    
    def writeUIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
    def writeUIntLE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean): Double = js.native
  }
  /* static members */
  object Buffer {
    
    @JSImport("safe-buffer", "Buffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Allocates a new buffer of {size} octets.
      *
      * @param size count of octets to allocate.
      * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
      *    If parameter is omitted, buffer will be filled with zeros.
      * @param encoding encoding used for call to buf.fill while initalizing
      */
    inline def alloc(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def alloc(size: Double, fill: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def alloc(size: Double, fill: String, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def alloc(size: Double, fill: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def alloc(size: Double, fill: Double, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def alloc(size: Double, fill: Unit, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def alloc(size: Double, fill: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def alloc(size: Double, fill: Buffer, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    /**
      * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
      * of the newly created Buffer are unknown and may contain sensitive data.
      *
      * @param size count of octets to allocate
      */
    inline def allocUnsafe(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafe")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /**
      * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
      * of the newly created Buffer are unknown and may contain sensitive data.
      *
      * @param size count of octets to allocate
      */
    inline def allocUnsafeSlow(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafeSlow")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /**
      * Gives the actual byte length of a string. encoding defaults to 'utf8'.
      * This is not the same as String.prototype.length since that returns the number of characters in a string.
      *
      * @param string string to test.
      * @param encoding encoding used to evaluate (defaults to 'utf8')
      */
    inline def byteLength(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def byteLength(string: String, encoding: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * The same as buf1.compare(buf2).
      */
    inline def compare(buf1: Buffer, buf2: Buffer): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(buf1.asInstanceOf[js.Any], buf2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a buffer which is the result of concatenating all the buffers in the list together.
      *
      * If the list has no items, or if the totalLength is 0, then it returns a zero-length buffer.
      * If the list has exactly one item, then the first item of the list is returned.
      * If the list has more than one item, then a new Buffer is created.
      *
      * @param list An array of Buffer objects to concatenate
      * @param totalLength Total length of the buffers when concatenated.
      *   If totalLength is not provided, it is read from the buffers in the list. However, this adds an additional loop to the function, so it is faster to provide the length explicitly.
      */
    inline def concat(list: js.Array[Buffer]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(list.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def concat(list: js.Array[Buffer], totalLength: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(list.asInstanceOf[js.Any], totalLength.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    /**
      * When passed a reference to the .buffer property of a TypedArray instance,
      * the newly created Buffer will share the same allocated memory as the TypedArray.
      * The optional {byteOffset} and {length} arguments specify a memory range
      * within the {arrayBuffer} that will be shared by the Buffer.
      *
      * @param arrayBuffer The .buffer property of a TypedArray or a new ArrayBuffer()
      * @param byteOffset
      * @param length
      */
    inline def from(arrayBuffer: js.typedarray.ArrayBuffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Double, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def from(arrayBuffer: js.typedarray.ArrayBuffer, byteOffset: Unit, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    /**
      * Allocates a new Buffer using an {array} of octets.
      *
      * @param array
      */
    inline def from(array: js.Array[Any]): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(array.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    /**
      * Copies the passed {buffer} data onto a new Buffer instance.
      *
      * @param buffer
      */
    inline def from(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    /**
      * Creates a new Buffer containing the given JavaScript string {str}.
      * If provided, the {encoding} parameter identifies the character encoding.
      * If not provided, {encoding} defaults to 'utf8'.
      *
      * @param str
      */
    inline def from(str: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def from(str: String, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    /**
      * Returns true if {obj} is a Buffer
      *
      * @param obj object to test.
      */
    inline def isBuffer(obj: Any): /* is safe-buffer.safe-buffer.Buffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is safe-buffer.safe-buffer.Buffer */ Boolean]
    
    /**
      * Returns true if {encoding} is a valid encoding argument.
      * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
      *
      * @param encoding string to test.
      */
    inline def isEncoding(encoding: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncoding")(encoding.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
