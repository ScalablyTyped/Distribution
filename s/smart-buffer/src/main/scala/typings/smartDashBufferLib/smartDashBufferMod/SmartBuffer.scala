package typings
package smartDashBufferLib.smartDashBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartBuffer extends js.Object {
  /**
       * Gets the current length of the smart buffer instance
       */
  var length: scala.Double = js.native
  // Misc Functions
  /**
       * Clears the smart buffer
       */
  def clear(): js.Any = js.native
  /**
       * Destroys the smart buffer instance
       */
  def destroy(): js.Any = js.native
  // Buffer readers
  /**
       * Reads binary data into a Buffer
       *
       * @param len { Number } The amount of data to read
       */
  def readBuffer(): nodeLib.Buffer = js.native
  // Buffer readers
  /**
       * Reads binary data into a Buffer
       *
       * @param len { Number } The amount of data to read
       */
  def readBuffer(len: scala.Double): nodeLib.Buffer = js.native
  /**
       * Reads null terminated binary data into a Buffer
       */
  def readBufferNT(): nodeLib.Buffer = js.native
  /**
       * Reads a double (big endian)
       */
  def readDoubleBE(): scala.Double = js.native
  /**
       * Reads a double (little endian)
       */
  def readDoubleLE(): scala.Double = js.native
  // Floating point readers
  /**
       * Reads a float (big endian)
       */
  def readFloatBE(): scala.Double = js.native
  /**
       * Reads a float (little endian)
       */
  def readFloatLE(): scala.Double = js.native
  /**
       * Reads a 16-bit signed integer (big endian)
       */
  def readInt16BE(): scala.Double = js.native
  /**
       * Reads a 16-bit signed integer (little endian)
       */
  def readInt16LE(): scala.Double = js.native
  /**
       * Reads a 32-bit signed integer (big endian)
       */
  def readInt32BE(): scala.Double = js.native
  /**
       * Reads a 32-bit signed integer (little endian)
       */
  def readInt32LE(): scala.Double = js.native
  // Signed number readers
  /**
       * Reads a 8-bit signed integer
       */
  def readInt8(): scala.Double = js.native
  // String readers
  /**
       * Reads a string
       *
       * @param length { Number } The length of the string to read
       * @param encoding { Number} The encoding to use (defaults to instance level encoding)
       */
  def readString(): java.lang.String = js.native
  // String readers
  /**
       * Reads a string
       *
       * @param length { Number } The length of the string to read
       * @param encoding { Number} The encoding to use (defaults to instance level encoding)
       */
  def readString(length: scala.Double): java.lang.String = js.native
  // String readers
  /**
       * Reads a string
       *
       * @param length { Number } The length of the string to read
       * @param encoding { Number} The encoding to use (defaults to instance level encoding)
       */
  def readString(length: scala.Double, encoding: java.lang.String): java.lang.String = js.native
  /**
       * Reads a null terminated string
       *
       * @param encoding The encoding to use (defaults to instance level encoding)
       */
  def readStringNT(): java.lang.String = js.native
  /**
       * Reads a null terminated string
       *
       * @param encoding The encoding to use (defaults to instance level encoding)
       */
  def readStringNT(encoding: java.lang.String): java.lang.String = js.native
  /**
       * Reads a 16-bit unsigned integer (big endian)
       */
  def readUInt16BE(): scala.Double = js.native
  /**
       * Reads a 16-bit unsigned integer (little endian)
       */
  def readUInt16LE(): scala.Double = js.native
  /**
       * Reads a 32-bit unsigned integer (big endian)
       */
  def readUInt32BE(): scala.Double = js.native
  /**
       * Reads a 32-bit unsigned integer (little endian)
       */
  def readUInt32LE(): scala.Double = js.native
  // Unsigned number readers
  /**
       * Reads a 8-bit unsigned integer
       */
  def readUInt8(): scala.Double = js.native
  /**
       * Gets the number of bytes that remain to be read
       */
  def remaining(): scala.Double = js.native
  /**
       * Decreases the read offset position
       *
       * @param amount { Number } The amount to decrease the read offset position by
       */
  def rewind(amount: scala.Double): js.Any = js.native
  /**
       * Increases the read offset position
       *
       * @param amount { Number } The amount to increase the read offset position by
       */
  def skip(amount: scala.Double): js.Any = js.native
  /**
       * Changes the read offset position
       *
       * @param position { Number } The position to change the read offset to
       */
  def skipTo(position: scala.Double): js.Any = js.native
  /**
       * Gets the underlying Buffer instance
       */
  def toBuffer(): nodeLib.Buffer = js.native
  /**
       * Gets the string representation of the underlying Buffer
       *
       * @param encoding { String } The encoding to use (defaults to instance level encoding)
       */
  def toString(encoding: java.lang.String): java.lang.String = js.native
  // Buffer writers
  /**
       * Writes a Buffer
       *
       * @param value { Buffer } The Buffer to write to the smart buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeBuffer(value: nodeLib.Buffer): this.type = js.native
  // Buffer writers
  /**
       * Writes a Buffer
       *
       * @param value { Buffer } The Buffer to write to the smart buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeBuffer(value: nodeLib.Buffer, offset: scala.Double): this.type = js.native
  /**
       * Writes a Buffer with null termination
       *
       * @param value { Buffer } The buffer to write to the smart buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeBufferNT(value: nodeLib.Buffer): this.type = js.native
  /**
       * Writes a Buffer with null termination
       *
       * @param value { Buffer } The buffer to write to the smart buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeBufferNT(value: nodeLib.Buffer, offset: scala.Double): this.type = js.native
  /**
       * Writes a double (big endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeDoubleBE(value: scala.Double): this.type = js.native
  /**
       * Writes a double (big endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeDoubleBE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
       * Writes a double (little endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeDoubleLE(value: scala.Double): this.type = js.native
  /**
       * Writes a double (little endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeDoubleLE(value: scala.Double, offset: scala.Double): this.type = js.native
  // Floating point writers
  /**
       * Writes a float (big endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeFloatBE(value: scala.Double): this.type = js.native
  // Floating point writers
  /**
       * Writes a float (big endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeFloatBE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
       * Writes a float (little endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeFloatLE(value: scala.Double): this.type = js.native
  /**
       * Writes a float (little endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeFloatLE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
       * Writes a 16-bit signed integer (big endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeInt16BE(value: scala.Double): this.type = js.native
  /**
       * Writes a 16-bit signed integer (big endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeInt16BE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
       * Writes a 16-bit signed integer (little endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeInt16LE(value: scala.Double): this.type = js.native
  /**
       * Writes a 16-bit signed integer (little endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeInt16LE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
       * Writes a 32-bit signed integer (big endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeInt32BE(value: scala.Double): this.type = js.native
  /**
       * Writes a 32-bit signed integer (big endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeInt32BE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
       * Writes a 32-bit signed integer (little endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeInt32LE(value: scala.Double): this.type = js.native
  /**
       * Writes a 32-bit signed integer (little endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeInt32LE(value: scala.Double, offset: scala.Double): this.type = js.native
  // Signed number writers
  /**
       * Writes a 8-bit signed integer value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeInt8(value: scala.Double): this.type = js.native
  // Signed number writers
  /**
       * Writes a 8-bit signed integer value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeInt8(value: scala.Double, offset: scala.Double): this.type = js.native
  // String writers
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       * @param encoding { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  def writeString(value: java.lang.String): this.type = js.native
  // String writers
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       * @param encoding { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  def writeString(value: java.lang.String, offset: java.lang.String): this.type = js.native
  // String writers
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       * @param encoding { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  def writeString(value: java.lang.String, offset: java.lang.String, encoding: java.lang.String): this.type = js.native
  // String writers
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       * @param encoding { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  def writeString(value: java.lang.String, offset: scala.Double): this.type = js.native
  // String writers
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  /**
       * Writes a string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       * @param encoding { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  def writeString(value: java.lang.String, offset: scala.Double, encoding: java.lang.String): this.type = js.native
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       * @param encoding { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  def writeStringNT(value: java.lang.String): this.type = js.native
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       * @param encoding { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  def writeStringNT(value: java.lang.String, offset: java.lang.String): this.type = js.native
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       * @param encoding { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  def writeStringNT(value: java.lang.String, offset: java.lang.String, encoding: java.lang.String): this.type = js.native
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       * @param encoding { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  def writeStringNT(value: java.lang.String, offset: scala.Double): this.type = js.native
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  /**
       * Writes a null terminated string
       *
       * @param value { String } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       * @param encoding { String } The encoding to use when writing the string (defaults to instance level encoding)
       */
  def writeStringNT(value: java.lang.String, offset: scala.Double, encoding: java.lang.String): this.type = js.native
  /**
       * Writes a 16-bit unsigned integer (big endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeUInt16BE(value: scala.Double): this.type = js.native
  /**
       * Writes a 16-bit unsigned integer (big endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeUInt16BE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
       * Writes a 16-bit unsigned integer (little endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeUInt16LE(value: scala.Double): this.type = js.native
  /**
       * Writes a 16-bit unsigned integer (little endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeUInt16LE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
       * Writes a 32-bit unsigned integer (big endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeUInt32BE(value: scala.Double): this.type = js.native
  /**
       * Writes a 32-bit unsigned integer (big endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeUInt32BE(value: scala.Double, offset: scala.Double): this.type = js.native
  /**
       * Writes a 32-bit unsigned integer (little endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeUInt32LE(value: scala.Double): this.type = js.native
  /**
       * Writes a 32-bit unsigned integer (little endian) value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeUInt32LE(value: scala.Double, offset: scala.Double): this.type = js.native
  // Unsigned number writers
  /**
       * Writes a 8-bit unsigned integer value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeUInt8(value: scala.Double): this.type = js.native
  // Unsigned number writers
  /**
       * Writes a 8-bit unsigned integer value
       *
       * @param value { Number } The value to write to the buffer
       * @param offset { Number } The offset position to write the value to
       */
  def writeUInt8(value: scala.Double, offset: scala.Double): this.type = js.native
}

