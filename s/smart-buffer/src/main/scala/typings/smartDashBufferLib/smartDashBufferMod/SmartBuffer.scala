package typings
package smartDashBufferLib.smartDashBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smart-buffer", "SmartBuffer")
@js.native
/**
  * Creates a new SmartBuffer instance.
  *
  * @param options { SmartBufferOptions } The SmartBufferOptions to apply to this instance.
  */
class SmartBuffer () extends js.Object {
  def this(options: SmartBufferOptions) = this()
  var _buff: js.Any = js.native
  var _encoding: js.Any = js.native
  var _readOffset: js.Any = js.native
  var _writeOffset: js.Any = js.native
  /**
    * Gets the currently set string encoding of the SmartBuffer instance.
    *
    * @return { BufferEncoding } The string Buffer encoding currently set.
    */
  /**
    * Sets the string encoding of the SmartBuffer instance.
    *
    * @param encoding { BufferEncoding } The string Buffer encoding to set.
    */
  var encoding: nodeLib.BufferEncoding = js.native
  /**
    * Gets the underlying internal Buffer. (This includes unmanaged data in the Buffer)
    *
    * @return { Buffer } The Buffer value.
    */
  val internalBuffer: nodeLib.Buffer = js.native
  var length: scala.Double = js.native
  /**
    * Gets the current read offset value of the SmartBuffer instance.
    *
    * @return { Number }
    */
  /**
    * Sets the read offset value of the SmartBuffer instance.
    *
    * @param offset { Number } - The offset value to set.
    */
  var readOffset: scala.Double = js.native
  /**
    * Gets the current write offset value of the SmartBuffer instance.
    *
    * @return { Number }
    */
  /**
    * Sets the write offset value of the SmartBuffer instance.
    *
    * @param offset { Number } - The offset value to set.
    */
  var writeOffset: scala.Double = js.native
  /**
    * Ensures that the internal Buffer is large enough to write at least the given amount of data.
    *
    * @param minLength { Number } The minimum length of the data needs to be written.
    */
  /* private */ def _ensureCapacity(minLength: js.Any): js.Any = js.native
  /**
    * Ensures that the internal Buffer is large enough to write data.
    *
    * @param dataLength { Number } The length of the data that needs to be written.
    * @param offset { Number } The offset of the data to be written (defaults to writeOffset).
    */
  /* private */ def _ensureWriteable(dataLength: js.Any): js.Any = js.native
  /* private */ def _ensureWriteable(dataLength: js.Any, offset: js.Any): js.Any = js.native
  /**
    * Handles writing or insert of a Buffer.
    *
    * @param value { Buffer } The Buffer to write.
    * @param offset { Number } The offset to write the Buffer to.
    */
  /* private */ def _handleBuffer(value: js.Any, isInsert: js.Any): js.Any = js.native
  /* private */ def _handleBuffer(value: js.Any, isInsert: js.Any, offset: js.Any): js.Any = js.native
  /**
    * Handles inserting and writing strings.
    *
    * @param value { String } The String value to insert.
    * @param isInsert { Boolean } True if inserting a string, false if writing.
    * @param arg2 { Number | String } The offset to insert the string at, or the BufferEncoding to use.
    * @param encoding { String } The BufferEncoding to use for writing strings (defaults to instance encoding).
    */
  /* private */ def _handleString(value: js.Any, isInsert: js.Any): js.Any = js.native
  /* private */ def _handleString(value: js.Any, isInsert: js.Any, arg3: js.Any): js.Any = js.native
  /* private */ def _handleString(value: js.Any, isInsert: js.Any, arg3: js.Any, encoding: js.Any): js.Any = js.native
  /**
    * Inserts a numeric number value based on the given offset and value.
    *
    * @param func { Function(offset: number, offset?) => number} The function to write data on the internal Buffer with.
    * @param byteSize { Number } The number of bytes written.
    * @param value { Number } The number value to write.
    * @param offset { Number } the offset to write the number at (REQUIRED).
    *
    */
  /* private */ def _insertNumberValue(func: js.Any, byteSize: js.Any, value: js.Any, offset: js.Any): js.Any = js.native
  /**
    * Reads a numeric number value using the provided function.
    *
    * @param func { Function(offset: number) => number } The function to read data on the internal Buffer with.
    * @param byteSize { Number } The number of bytes read.
    * @param offset { Number } The offset to read from (optional). When this is not provided, the managed readOffset is used instead.
    *
    * @param { Number }
    */
  /* private */ def _readNumberValue(func: js.Any, byteSize: js.Any): js.Any = js.native
  /* private */ def _readNumberValue(func: js.Any, byteSize: js.Any, offset: js.Any): js.Any = js.native
  /**
    * Writes a numeric number value based on the given offset and value.
    *
    * @param func { Function(offset: number, offset?) => number} The function to write data on the internal Buffer with.
    * @param byteSize { Number } The number of bytes written.
    * @param value { Number } The number value to write.
    * @param offset { Number } the offset to write the number at (REQUIRED).
    *
    */
  /* private */ def _writeNumberValue(func: js.Any, byteSize: js.Any, value: js.Any): js.Any = js.native
  /* private */ def _writeNumberValue(func: js.Any, byteSize: js.Any, value: js.Any, offset: js.Any): js.Any = js.native
  /**
    * Clears the SmartBuffer instance to its original empty state.
    */
  def clear(): SmartBuffer = js.native
  /**
    * Destroys the SmartBuffer instance.
    */
  def destroy(): SmartBuffer = js.native
  /**
    * Ensures that the internal Buffer is large enough to insert data.
    *
    * @param dataLength { Number } The length of the data that needs to be written.
    * @param offset { Number } The offset of the data to be written.
    */
  /* private */ def ensureInsertable(dataLength: js.Any, offset: js.Any): js.Any = js.native
  /**
    * Ensures that the internal Buffer is large enough to read data.
    *
    * @param length { Number } The length of the data that needs to be read.
    * @param offset { Number } The offset of the data that needs to be read.
    */
  /* private */ def ensureReadable(length: js.Any): js.Any = js.native
  /* private */ def ensureReadable(length: js.Any, offset: js.Any): js.Any = js.native
  /**
    * Writes a Buffer to the current write position.
    *
    * @param value { Buffer } The Buffer to write.
    * @param offset { Number } The offset to write the Buffer to.
    *
    * @return this
    */
  def insertBuffer(value: nodeLib.Buffer, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts a null-terminated Buffer.
    *
    * @param value { Buffer } The Buffer to write.
    * @param offset { Number } The offset to write the Buffer to.
    *
    * @return this
    */
  def insertBufferNT(value: nodeLib.Buffer, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts a DoubleBE value at the given offset value.
    *
    * @param value { Number } The value to insert.
    * @param offset { Number } The offset to insert the value at.
    *
    * @return this
    */
  def insertDoubleBE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts a DoubleLE value at the given offset value.
    *
    * @param value { Number } The value to insert.
    * @param offset { Number } The offset to insert the value at.
    *
    * @return this
    */
  def insertDoubleLE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts a FloatBE value at the given offset value.
    *
    * @param value { Number } The value to insert.
    * @param offset { Number } The offset to insert the value at.
    *
    * @return this
    */
  def insertFloatBE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts a FloatLE value at the given offset value.
    *
    * @param value { Number } The value to insert.
    * @param offset { Number } The offset to insert the value at.
    *
    * @return this
    */
  def insertFloatLE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts an Int16BE value at the given offset value.
    *
    * @param value { Number } The value to insert.
    * @param offset { Number } The offset to insert the value at.
    *
    * @return this
    */
  def insertInt16BE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts an Int16LE value at the given offset value.
    *
    * @param value { Number } The value to insert.
    * @param offset { Number } The offset to insert the value at.
    *
    * @return this
    */
  def insertInt16LE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts an Int32BE value at the given offset value.
    *
    * @param value { Number } The value to insert.
    * @param offset { Number } The offset to insert the value at.
    *
    * @return this
    */
  def insertInt32BE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts an Int32LE value at the given offset value.
    *
    * @param value { Number } The value to insert.
    * @param offset { Number } The offset to insert the value at.
    *
    * @return this
    */
  def insertInt32LE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts an Int8 value at the given offset value.
    *
    * @param value { Number } The value to insert.
    * @param offset { Number } The offset to insert the value at.
    *
    * @return this
    */
  def insertInt8(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts a String
    *
    * @param value { String } The String value to insert.
    * @param offset { Number } The offset to insert the string at.
    * @param encoding { String } The BufferEncoding to use for writing strings (defaults to instance encoding).
    *
    * @return this
    */
  def insertString(value: java.lang.String, offset: scala.Double): SmartBuffer = js.native
  def insertString(value: java.lang.String, offset: scala.Double, encoding: nodeLib.BufferEncoding): SmartBuffer = js.native
  /**
    * Inserts a null-terminated String.
    *
    * @param value { String } The String value to write.
    * @param arg2 { Number | String } The offset to write the string to, or the BufferEncoding to use.
    * @param encoding { String } The BufferEncoding to use for writing strings (defaults to instance encoding).
    *
    * @return this
    */
  def insertStringNT(value: java.lang.String, offset: scala.Double): SmartBuffer = js.native
  def insertStringNT(value: java.lang.String, offset: scala.Double, encoding: nodeLib.BufferEncoding): SmartBuffer = js.native
  /**
    * Inserts an UInt16BE value at the given offset value.
    *
    * @param value { Number } The value to insert.
    * @param offset { Number } The offset to insert the value at.
    *
    * @return this
    */
  def insertUInt16BE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts an UInt16LE value at the given offset value.
    *
    * @param value { Number } The value to insert.
    * @param offset { Number } The offset to insert the value at.
    *
    * @return this
    */
  def insertUInt16LE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts an UInt32BE value at the given offset value.
    *
    * @param value { Number } The value to insert.
    * @param offset { Number } The offset to insert the value at.
    *
    * @return this
    */
  def insertUInt32BE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts an UInt32LE value at the given offset value.
    *
    * @param value { Number } The value to insert.
    * @param offset { Number } The offset to insert the value at.
    *
    * @return this
    */
  def insertUInt32LE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Inserts an UInt8 value at the given offset value.
    *
    * @param value { Number } The value to insert.
    * @param offset { Number } The offset to insert the value at.
    *
    * @return this
    */
  def insertUInt8(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Reads a Buffer from the internal read position.
    *
    * @param length { Number } The length of data to read as a Buffer.
    *
    * @return { Buffer }
    */
  def readBuffer(): nodeLib.Buffer = js.native
  def readBuffer(length: scala.Double): nodeLib.Buffer = js.native
  /**
    * Reads a null-terminated Buffer from the current read poisiton.
    *
    * @return { Buffer }
    */
  def readBufferNT(): nodeLib.Buffer = js.native
  /**
    * Reads an DoublEBE value from the current read position or an optionally provided offset.
    *
    * @param offset { Number } The offset to read data from (optional)
    * @return { Number }
    */
  def readDoubleBE(): scala.Double = js.native
  def readDoubleBE(offset: scala.Double): scala.Double = js.native
  /**
    * Reads an DoubleLE value from the current read position or an optionally provided offset.
    *
    * @param offset { Number } The offset to read data from (optional)
    * @return { Number }
    */
  def readDoubleLE(): scala.Double = js.native
  def readDoubleLE(offset: scala.Double): scala.Double = js.native
  /**
    * Reads an FloatBE value from the current read position or an optionally provided offset.
    *
    * @param offset { Number } The offset to read data from (optional)
    * @return { Number }
    */
  def readFloatBE(): scala.Double = js.native
  def readFloatBE(offset: scala.Double): scala.Double = js.native
  /**
    * Reads an FloatLE value from the current read position or an optionally provided offset.
    *
    * @param offset { Number } The offset to read data from (optional)
    * @return { Number }
    */
  def readFloatLE(): scala.Double = js.native
  def readFloatLE(offset: scala.Double): scala.Double = js.native
  /**
    * Reads an Int16BE value from the current read position or an optionally provided offset.
    *
    * @param offset { Number } The offset to read data from (optional)
    * @return { Number }
    */
  def readInt16BE(): scala.Double = js.native
  def readInt16BE(offset: scala.Double): scala.Double = js.native
  /**
    * Reads an Int16LE value from the current read position or an optionally provided offset.
    *
    * @param offset { Number } The offset to read data from (optional)
    * @return { Number }
    */
  def readInt16LE(): scala.Double = js.native
  def readInt16LE(offset: scala.Double): scala.Double = js.native
  /**
    * Reads an Int32BE value from the current read position or an optionally provided offset.
    *
    * @param offset { Number } The offset to read data from (optional)
    * @return { Number }
    */
  def readInt32BE(): scala.Double = js.native
  def readInt32BE(offset: scala.Double): scala.Double = js.native
  /**
    * Reads an Int32LE value from the current read position or an optionally provided offset.
    *
    * @param offset { Number } The offset to read data from (optional)
    * @return { Number }
    */
  def readInt32LE(): scala.Double = js.native
  def readInt32LE(offset: scala.Double): scala.Double = js.native
  /**
    * Reads an Int8 value from the current read position or an optionally provided offset.
    *
    * @param offset { Number } The offset to read data from (optional)
    * @return { Number }
    */
  def readInt8(): scala.Double = js.native
  def readInt8(offset: scala.Double): scala.Double = js.native
  /**
    * Reads a String from the current read position.
    *
    * @param arg1 { Number | String } The number of bytes to read as a String, or the BufferEncoding to use for
    *             the string (Defaults to instance level encoding).
    * @param encoding { String } The BufferEncoding to use for the string (Defaults to instance level encoding).
    *
    * @return { String }
    */
  def readString(): java.lang.String = js.native
  def readString(arg1: nodeLib.BufferEncoding): java.lang.String = js.native
  def readString(arg1: nodeLib.BufferEncoding, encoding: nodeLib.BufferEncoding): java.lang.String = js.native
  def readString(arg1: scala.Double): java.lang.String = js.native
  def readString(arg1: scala.Double, encoding: nodeLib.BufferEncoding): java.lang.String = js.native
  /**
    * Reads a null-terminated String from the current read position.
    *
    * @param encoding { String } The BufferEncoding to use for the string (Defaults to instance level encoding).
    *
    * @return { String }
    */
  def readStringNT(): java.lang.String = js.native
  def readStringNT(encoding: nodeLib.BufferEncoding): java.lang.String = js.native
  /**
    * Reads an UInt16BE value from the current read position or an optionally provided offset.
    *
    * @param offset { Number } The offset to read data from (optional)
    * @return { Number }
    */
  def readUInt16BE(): scala.Double = js.native
  def readUInt16BE(offset: scala.Double): scala.Double = js.native
  /**
    * Reads an UInt16LE value from the current read position or an optionally provided offset.
    *
    * @param offset { Number } The offset to read data from (optional)
    * @return { Number }
    */
  def readUInt16LE(): scala.Double = js.native
  def readUInt16LE(offset: scala.Double): scala.Double = js.native
  /**
    * Reads an UInt32BE value from the current read position or an optionally provided offset.
    *
    * @param offset { Number } The offset to read data from (optional)
    * @return { Number }
    */
  def readUInt32BE(): scala.Double = js.native
  def readUInt32BE(offset: scala.Double): scala.Double = js.native
  /**
    * Reads an UInt32LE value from the current read position or an optionally provided offset.
    *
    * @param offset { Number } The offset to read data from (optional)
    * @return { Number }
    */
  def readUInt32LE(): scala.Double = js.native
  def readUInt32LE(offset: scala.Double): scala.Double = js.native
  /**
    * Reads an UInt8 value from the current read position or an optionally provided offset.
    *
    * @param offset { Number } The offset to read data from (optional)
    * @return { Number }
    */
  def readUInt8(): scala.Double = js.native
  def readUInt8(offset: scala.Double): scala.Double = js.native
  /**
    * Gets the remaining data left to be read from the SmartBuffer instance.
    *
    * @return { Number }
    */
  def remaining(): scala.Double = js.native
  /**
    * Gets the value of the internal managed Buffer (Includes managed data only)
    *
    * @param { Buffer }
    */
  def toBuffer(): nodeLib.Buffer = js.native
  def toString(encoding: nodeLib.BufferEncoding): java.lang.String = js.native
  /**
    * Writes a Buffer to the current write position.
    *
    * @param value { Buffer } The Buffer to write.
    * @param offset { Number } The offset to write the Buffer to.
    *
    * @return this
    */
  def writeBuffer(value: nodeLib.Buffer): SmartBuffer = js.native
  def writeBuffer(value: nodeLib.Buffer, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes a null-terminated Buffer.
    *
    * @param value { Buffer } The Buffer to write.
    * @param offset { Number } The offset to write the Buffer to.
    *
    * @return this
    */
  def writeBufferNT(value: nodeLib.Buffer): SmartBuffer = js.native
  def writeBufferNT(value: nodeLib.Buffer, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes a DoubleBE value to the current write position (or at optional offset).
    *
    * @param value { Number } The value to write.
    * @param offset { Number } The offset to write the value at.
    *
    * @return this
    */
  def writeDoubleBE(value: scala.Double): SmartBuffer = js.native
  def writeDoubleBE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes a DoubleLE value to the current write position (or at optional offset).
    *
    * @param value { Number } The value to write.
    * @param offset { Number } The offset to write the value at.
    *
    * @return this
    */
  def writeDoubleLE(value: scala.Double): SmartBuffer = js.native
  def writeDoubleLE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes a FloatBE value to the current write position (or at optional offset).
    *
    * @param value { Number } The value to write.
    * @param offset { Number } The offset to write the value at.
    *
    * @return this
    */
  def writeFloatBE(value: scala.Double): SmartBuffer = js.native
  def writeFloatBE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes a FloatLE value to the current write position (or at optional offset).
    *
    * @param value { Number } The value to write.
    * @param offset { Number } The offset to write the value at.
    *
    * @return this
    */
  def writeFloatLE(value: scala.Double): SmartBuffer = js.native
  def writeFloatLE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes an Int16BE value to the current write position (or at optional offset).
    *
    * @param value { Number } The value to write.
    * @param offset { Number } The offset to write the value at.
    *
    * @return this
    */
  def writeInt16BE(value: scala.Double): SmartBuffer = js.native
  def writeInt16BE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes an Int16LE value to the current write position (or at optional offset).
    *
    * @param value { Number } The value to write.
    * @param offset { Number } The offset to write the value at.
    *
    * @return this
    */
  def writeInt16LE(value: scala.Double): SmartBuffer = js.native
  def writeInt16LE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes an Int32BE value to the current write position (or at optional offset).
    *
    * @param value { Number } The value to write.
    * @param offset { Number } The offset to write the value at.
    *
    * @return this
    */
  def writeInt32BE(value: scala.Double): SmartBuffer = js.native
  def writeInt32BE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes an Int32LE value to the current write position (or at optional offset).
    *
    * @param value { Number } The value to write.
    * @param offset { Number } The offset to write the value at.
    *
    * @return this
    */
  def writeInt32LE(value: scala.Double): SmartBuffer = js.native
  def writeInt32LE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes an Int8 value to the current write position (or at optional offset).
    *
    * @param value { Number } The value to write.
    * @param offset { Number } The offset to write the value at.
    *
    * @return this
    */
  def writeInt8(value: scala.Double): SmartBuffer = js.native
  def writeInt8(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes a String
    *
    * @param value { String } The String value to write.
    * @param arg2 { Number | String } The offset to write the string at, or the BufferEncoding to use.
    * @param encoding { String } The BufferEncoding to use for writing strings (defaults to instance encoding).
    *
    * @return this
    */
  def writeString(value: java.lang.String): SmartBuffer = js.native
  def writeString(value: java.lang.String, arg2: nodeLib.BufferEncoding): SmartBuffer = js.native
  def writeString(value: java.lang.String, arg2: nodeLib.BufferEncoding, encoding: nodeLib.BufferEncoding): SmartBuffer = js.native
  def writeString(value: java.lang.String, arg2: scala.Double): SmartBuffer = js.native
  def writeString(value: java.lang.String, arg2: scala.Double, encoding: nodeLib.BufferEncoding): SmartBuffer = js.native
  /**
    * Writes a null-terminated String.
    *
    * @param value { String } The String value to write.
    * @param arg2 { Number | String } The offset to write the string to, or the BufferEncoding to use.
    * @param encoding { String } The BufferEncoding to use for writing strings (defaults to instance encoding).
    *
    * @return this
    */
  def writeStringNT(value: java.lang.String): SmartBuffer = js.native
  def writeStringNT(value: java.lang.String, arg2: nodeLib.BufferEncoding): SmartBuffer = js.native
  def writeStringNT(value: java.lang.String, arg2: nodeLib.BufferEncoding, encoding: nodeLib.BufferEncoding): SmartBuffer = js.native
  def writeStringNT(value: java.lang.String, arg2: scala.Double): SmartBuffer = js.native
  def writeStringNT(value: java.lang.String, arg2: scala.Double, encoding: nodeLib.BufferEncoding): SmartBuffer = js.native
  /**
    * Writes an UInt16BE value to the current write position (or at optional offset).
    *
    * @param value { Number } The value to write.
    * @param offset { Number } The offset to write the value at.
    *
    * @return this
    */
  def writeUInt16BE(value: scala.Double): SmartBuffer = js.native
  def writeUInt16BE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes an UInt16LE value to the current write position (or at optional offset).
    *
    * @param value { Number } The value to write.
    * @param offset { Number } The offset to write the value at.
    *
    * @return this
    */
  def writeUInt16LE(value: scala.Double): SmartBuffer = js.native
  def writeUInt16LE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes an UInt32BE value to the current write position (or at optional offset).
    *
    * @param value { Number } The value to write.
    * @param offset { Number } The offset to write the value at.
    *
    * @return this
    */
  def writeUInt32BE(value: scala.Double): SmartBuffer = js.native
  def writeUInt32BE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes an UInt32LE value to the current write position (or at optional offset).
    *
    * @param value { Number } The value to write.
    * @param offset { Number } The offset to write the value at.
    *
    * @return this
    */
  def writeUInt32LE(value: scala.Double): SmartBuffer = js.native
  def writeUInt32LE(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
  /**
    * Writes an UInt8 value to the current write position (or at optional offset).
    *
    * @param value { Number } The value to write.
    * @param offset { Number } The offset to write the value at.
    *
    * @return this
    */
  def writeUInt8(value: scala.Double): SmartBuffer = js.native
  def writeUInt8(value: scala.Double, offset: scala.Double): SmartBuffer = js.native
}

/* static members */
@JSImport("smart-buffer", "SmartBuffer")
@js.native
object SmartBuffer extends js.Object {
  /**
    * Creates a new SmartBuffer instance with the provided Buffer and optional encoding.
    *
    * @param buffer { Buffer } The Buffer to use as the internal Buffer value.
    * @param encoding { String } The BufferEncoding to use for strings.
    *
    * @return { SmartBuffer }
    */
  def fromBuffer(buff: nodeLib.Buffer): smartDashBufferLib.smartDashBufferMod.SmartBuffer = js.native
  def fromBuffer(buff: nodeLib.Buffer, encoding: nodeLib.BufferEncoding): smartDashBufferLib.smartDashBufferMod.SmartBuffer = js.native
  /**
    * Creates a new SmartBuffer instance with the provided SmartBufferOptions options.
    *
    * @param options { SmartBufferOptions } The options to use when creating the SmartBuffer instance.
    */
  def fromOptions(options: smartDashBufferLib.smartDashBufferMod.SmartBufferOptions): smartDashBufferLib.smartDashBufferMod.SmartBuffer = js.native
  /**
    * Creates a new SmartBuffer instance with the provided internal Buffer size and optional encoding.
    *
    * @param size { Number } The size of the internal Buffer.
    * @param encoding { String } The BufferEncoding to use for strings.
    *
    * @return { SmartBuffer }
    */
  def fromSize(size: scala.Double): smartDashBufferLib.smartDashBufferMod.SmartBuffer = js.native
  def fromSize(size: scala.Double, encoding: nodeLib.BufferEncoding): smartDashBufferLib.smartDashBufferMod.SmartBuffer = js.native
  /**
    * Type checking function that determines if an object is a SmartBufferOptions object.
    */
  def isSmartBufferOptions(options: smartDashBufferLib.smartDashBufferMod.SmartBufferOptions): /* is smart-buffer.smart-buffer.SmartBufferOptions */ scala.Boolean = js.native
}

