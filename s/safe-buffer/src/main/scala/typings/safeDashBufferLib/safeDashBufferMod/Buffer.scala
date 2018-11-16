package typings
package safeDashBufferLib.safeDashBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("safe-buffer", "Buffer")
@js.native
class Buffer protected () extends js.Object {
  /**
       * Produces a Buffer backed by the same allocated memory as
       * the given {ArrayBuffer}.
       *
       *
       * @param arrayBuffer The ArrayBuffer with which to share memory.
       */
  def this(arrayBuffer: stdLib.ArrayBuffer) = this()
  /**
       * Allocates a new buffer containing the given {array} of octets.
       *
       * @param array The octets to store.
       */
  def this(array: js.Array[_]) = this()
  /**
       * Allocates a new buffer containing the given {array} of octets.
       *
       * @param array The octets to store.
       */
  def this(array: stdLib.Uint8Array) = this()
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
  def this(size: scala.Double) = this()
  /**
       * Allocates a new buffer containing the given {str}.
       *
       * @param str String to store in buffer.
       * @param encoding encoding to use, optional.  Default is 'utf8'
       */
  def this(str: java.lang.String) = this()
  /**
       * Allocates a new buffer containing the given {str}.
       *
       * @param str String to store in buffer.
       * @param encoding encoding to use, optional.  Default is 'utf8'
       */
  def this(str: java.lang.String, encoding: java.lang.String) = this()
  var length: scala.Double = js.native
  def compare(otherBuffer: Buffer): scala.Double = js.native
  def compare(otherBuffer: Buffer, targetStart: scala.Double): scala.Double = js.native
  def compare(otherBuffer: Buffer, targetStart: scala.Double, targetEnd: scala.Double): scala.Double = js.native
  def compare(otherBuffer: Buffer, targetStart: scala.Double, targetEnd: scala.Double, sourceStart: scala.Double): scala.Double = js.native
  def compare(
    otherBuffer: Buffer,
    targetStart: scala.Double,
    targetEnd: scala.Double,
    sourceStart: scala.Double,
    sourceEnd: scala.Double
  ): scala.Double = js.native
  def copy(targetBuffer: Buffer): scala.Double = js.native
  def copy(targetBuffer: Buffer, targetStart: scala.Double): scala.Double = js.native
  def copy(targetBuffer: Buffer, targetStart: scala.Double, sourceStart: scala.Double): scala.Double = js.native
  def copy(
    targetBuffer: Buffer,
    targetStart: scala.Double,
    sourceStart: scala.Double,
    sourceEnd: scala.Double
  ): scala.Double = js.native
  def equals(otherBuffer: Buffer): scala.Boolean = js.native
  def fill(value: js.Any): this.type = js.native
  def fill(value: js.Any, offset: scala.Double): this.type = js.native
  def fill(value: js.Any, offset: scala.Double, end: scala.Double): this.type = js.native
  def includes(value: java.lang.String): scala.Boolean = js.native
  def includes(value: java.lang.String, byteOffset: scala.Double): scala.Boolean = js.native
  def includes(value: java.lang.String, byteOffset: scala.Double, encoding: java.lang.String): scala.Boolean = js.native
  def includes(value: Buffer): scala.Boolean = js.native
  def includes(value: Buffer, byteOffset: scala.Double): scala.Boolean = js.native
  def includes(value: Buffer, byteOffset: scala.Double, encoding: java.lang.String): scala.Boolean = js.native
  def includes(value: scala.Double): scala.Boolean = js.native
  def includes(value: scala.Double, byteOffset: scala.Double): scala.Boolean = js.native
  def includes(value: scala.Double, byteOffset: scala.Double, encoding: java.lang.String): scala.Boolean = js.native
  def indexOf(value: java.lang.String): scala.Double = js.native
  def indexOf(value: java.lang.String, byteOffset: scala.Double): scala.Double = js.native
  def indexOf(value: java.lang.String, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def indexOf(value: Buffer): scala.Double = js.native
  def indexOf(value: Buffer, byteOffset: scala.Double): scala.Double = js.native
  def indexOf(value: Buffer, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def indexOf(value: scala.Double): scala.Double = js.native
  def indexOf(value: scala.Double, byteOffset: scala.Double): scala.Double = js.native
  def indexOf(value: scala.Double, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def lastIndexOf(value: java.lang.String): scala.Double = js.native
  def lastIndexOf(value: java.lang.String, byteOffset: scala.Double): scala.Double = js.native
  def lastIndexOf(value: java.lang.String, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def lastIndexOf(value: Buffer): scala.Double = js.native
  def lastIndexOf(value: Buffer, byteOffset: scala.Double): scala.Double = js.native
  def lastIndexOf(value: Buffer, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def lastIndexOf(value: scala.Double): scala.Double = js.native
  def lastIndexOf(value: scala.Double, byteOffset: scala.Double): scala.Double = js.native
  def lastIndexOf(value: scala.Double, byteOffset: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def readDoubleBE(offset: scala.Double): scala.Double = js.native
  def readDoubleBE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readDoubleLE(offset: scala.Double): scala.Double = js.native
  def readDoubleLE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readFloatBE(offset: scala.Double): scala.Double = js.native
  def readFloatBE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readFloatLE(offset: scala.Double): scala.Double = js.native
  def readFloatLE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt16BE(offset: scala.Double): scala.Double = js.native
  def readInt16BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt16LE(offset: scala.Double): scala.Double = js.native
  def readInt16LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt32BE(offset: scala.Double): scala.Double = js.native
  def readInt32BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt32LE(offset: scala.Double): scala.Double = js.native
  def readInt32LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readInt8(offset: scala.Double): scala.Double = js.native
  def readInt8(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readIntBE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readIntBE(offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readIntLE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readIntLE(offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt16BE(offset: scala.Double): scala.Double = js.native
  def readUInt16BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt16LE(offset: scala.Double): scala.Double = js.native
  def readUInt16LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt32BE(offset: scala.Double): scala.Double = js.native
  def readUInt32BE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt32LE(offset: scala.Double): scala.Double = js.native
  def readUInt32LE(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUInt8(offset: scala.Double): scala.Double = js.native
  def readUInt8(offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUIntBE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readUIntBE(offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def readUIntLE(offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def readUIntLE(offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def slice(): Buffer = js.native
  def slice(start: scala.Double): Buffer = js.native
  def slice(start: scala.Double, end: scala.Double): Buffer = js.native
  def swap16(): Buffer = js.native
  def swap32(): Buffer = js.native
  def swap64(): Buffer = js.native
  def toJSON(): safeDashBufferLib.Anon_Type = js.native
  def toString(encoding: java.lang.String): java.lang.String = js.native
  def toString(encoding: java.lang.String, start: scala.Double): java.lang.String = js.native
  def toString(encoding: java.lang.String, start: scala.Double, end: scala.Double): java.lang.String = js.native
  def write(string: java.lang.String): scala.Double = js.native
  def write(string: java.lang.String, offset: scala.Double): scala.Double = js.native
  def write(string: java.lang.String, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def write(string: java.lang.String, offset: scala.Double, length: scala.Double, encoding: java.lang.String): scala.Double = js.native
  def writeDoubleBE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeDoubleBE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeDoubleLE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeDoubleLE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeFloatBE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeFloatBE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeFloatLE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeFloatLE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeInt16BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt16BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeInt16LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt16LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeInt32BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt32BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeInt32LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt32LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeInt8(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeInt8(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeIntBE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeIntBE(value: scala.Double, offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeIntLE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeIntLE(value: scala.Double, offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUInt16BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt16BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUInt16LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt16LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUInt32BE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt32BE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUInt32LE(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt32LE(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUInt8(value: scala.Double, offset: scala.Double): scala.Double = js.native
  def writeUInt8(value: scala.Double, offset: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUIntBE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeUIntBE(value: scala.Double, offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
  def writeUIntLE(value: scala.Double, offset: scala.Double, byteLength: scala.Double): scala.Double = js.native
  def writeUIntLE(value: scala.Double, offset: scala.Double, byteLength: scala.Double, noAssert: scala.Boolean): scala.Double = js.native
}

@JSImport("safe-buffer", "Buffer")
@js.native
object Buffer extends js.Object {
  /**
       * Allocates a new buffer of {size} octets.
       *
       * @param size count of octets to allocate.
       * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
       *    If parameter is omitted, buffer will be filled with zeros.
       * @param encoding encoding used for call to buf.fill while initalizing
       */
  def alloc(size: scala.Double): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
  /**
       * Allocates a new buffer of {size} octets.
       *
       * @param size count of octets to allocate.
       * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
       *    If parameter is omitted, buffer will be filled with zeros.
       * @param encoding encoding used for call to buf.fill while initalizing
       */
  def alloc(size: scala.Double, fill: java.lang.String): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
  /**
       * Allocates a new buffer of {size} octets.
       *
       * @param size count of octets to allocate.
       * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
       *    If parameter is omitted, buffer will be filled with zeros.
       * @param encoding encoding used for call to buf.fill while initalizing
       */
  def alloc(size: scala.Double, fill: java.lang.String, encoding: java.lang.String): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
  /**
       * Allocates a new buffer of {size} octets.
       *
       * @param size count of octets to allocate.
       * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
       *    If parameter is omitted, buffer will be filled with zeros.
       * @param encoding encoding used for call to buf.fill while initalizing
       */
  def alloc(size: scala.Double, fill: safeDashBufferLib.safeDashBufferMod.Buffer): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
  /**
       * Allocates a new buffer of {size} octets.
       *
       * @param size count of octets to allocate.
       * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
       *    If parameter is omitted, buffer will be filled with zeros.
       * @param encoding encoding used for call to buf.fill while initalizing
       */
  def alloc(size: scala.Double, fill: safeDashBufferLib.safeDashBufferMod.Buffer, encoding: java.lang.String): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
  /**
       * Allocates a new buffer of {size} octets.
       *
       * @param size count of octets to allocate.
       * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
       *    If parameter is omitted, buffer will be filled with zeros.
       * @param encoding encoding used for call to buf.fill while initalizing
       */
  def alloc(size: scala.Double, fill: scala.Double): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
  /**
       * Allocates a new buffer of {size} octets.
       *
       * @param size count of octets to allocate.
       * @param fill if specified, buffer will be initialized by calling buf.fill(fill).
       *    If parameter is omitted, buffer will be filled with zeros.
       * @param encoding encoding used for call to buf.fill while initalizing
       */
  def alloc(size: scala.Double, fill: scala.Double, encoding: java.lang.String): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
  /**
       * Allocates a new buffer of {size} octets, leaving memory not initialized, so the contents
       * of the newly created Buffer are unknown and may contain sensitive data.
       *
       * @param size count of octets to allocate
       */
  def allocUnsafe(size: scala.Double): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
  /**
       * Allocates a new non-pooled buffer of {size} octets, leaving memory not initialized, so the contents
       * of the newly created Buffer are unknown and may contain sensitive data.
       *
       * @param size count of octets to allocate
       */
  def allocUnsafeSlow(size: scala.Double): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
  /**
       * Gives the actual byte length of a string. encoding defaults to 'utf8'.
       * This is not the same as String.prototype.length since that returns the number of characters in a string.
       *
       * @param string string to test.
       * @param encoding encoding used to evaluate (defaults to 'utf8')
       */
  def byteLength(string: java.lang.String): scala.Double = js.native
  /**
       * Gives the actual byte length of a string. encoding defaults to 'utf8'.
       * This is not the same as String.prototype.length since that returns the number of characters in a string.
       *
       * @param string string to test.
       * @param encoding encoding used to evaluate (defaults to 'utf8')
       */
  def byteLength(string: java.lang.String, encoding: java.lang.String): scala.Double = js.native
  /**
       * The same as buf1.compare(buf2).
       */
  def compare(buf1: safeDashBufferLib.safeDashBufferMod.Buffer, buf2: safeDashBufferLib.safeDashBufferMod.Buffer): scala.Double = js.native
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
  def concat(list: js.Array[safeDashBufferLib.safeDashBufferMod.Buffer]): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
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
  def concat(list: js.Array[safeDashBufferLib.safeDashBufferMod.Buffer], totalLength: scala.Double): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
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
  def from(arrayBuffer: stdLib.ArrayBuffer): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
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
  def from(arrayBuffer: stdLib.ArrayBuffer, byteOffset: scala.Double): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
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
  def from(arrayBuffer: stdLib.ArrayBuffer, byteOffset: scala.Double, length: scala.Double): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
  /**
       * Allocates a new Buffer using an {array} of octets.
       *
       * @param array
       */
  def from(array: js.Array[_]): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
  /**
       * Copies the passed {buffer} data onto a new Buffer instance.
       *
       * @param buffer
       */
  def from(buffer: safeDashBufferLib.safeDashBufferMod.Buffer): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
  /**
       * Creates a new Buffer containing the given JavaScript string {str}.
       * If provided, the {encoding} parameter identifies the character encoding.
       * If not provided, {encoding} defaults to 'utf8'.
       *
       * @param str
       */
  def from(str: java.lang.String): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
  /**
       * Creates a new Buffer containing the given JavaScript string {str}.
       * If provided, the {encoding} parameter identifies the character encoding.
       * If not provided, {encoding} defaults to 'utf8'.
       *
       * @param str
       */
  def from(str: java.lang.String, encoding: java.lang.String): safeDashBufferLib.safeDashBufferMod.Buffer = js.native
  /**
       * Returns true if {obj} is a Buffer
       *
       * @param obj object to test.
       */
  def isBuffer(obj: js.Any): /* is Buffer */scala.Boolean = js.native
  /**
       * Returns true if {encoding} is a valid encoding argument.
       * Valid string encodings in Node 0.12: 'ascii'|'utf8'|'utf16le'|'ucs2'(alias of 'utf16le')|'base64'|'binary'(deprecated)|'hex'
       *
       * @param encoding string to test.
       */
  def isEncoding(encoding: java.lang.String): scala.Boolean = js.native
}

