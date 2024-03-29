package typings.smartBuffer

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("smart-buffer", "SmartBuffer")
  @js.native
  /**
    * Creates a new SmartBuffer instance.
    *
    * @param options { SmartBufferOptions } The SmartBufferOptions to apply to this instance.
    */
  open class SmartBuffer () extends StObject {
    def this(options: SmartBufferOptions) = this()
    
    /* private */ var _buff: Any = js.native
    
    /* private */ var _encoding: Any = js.native
    
    /**
      * Ensures that the internal Buffer is large enough to write at least the given amount of data.
      *
      * @param minLength { Number } The minimum length of the data needs to be written.
      */
    /* private */ var _ensureCapacity: Any = js.native
    
    /**
      * Ensures that the internal Buffer is large enough to write data.
      *
      * @param dataLength { Number } The length of the data that needs to be written.
      * @param offset { Number } The offset of the data to be written (defaults to writeOffset).
      */
    /* private */ var _ensureWriteable: Any = js.native
    
    /**
      * Handles writing or insert of a Buffer.
      *
      * @param value { Buffer } The Buffer to write.
      * @param offset { Number } The offset to write the Buffer to.
      */
    /* private */ var _handleBuffer: Any = js.native
    
    /**
      * Handles inserting and writing strings.
      *
      * @param value { String } The String value to insert.
      * @param isInsert { Boolean } True if inserting a string, false if writing.
      * @param arg2 { Number | String } The offset to insert the string at, or the BufferEncoding to use.
      * @param encoding { String } The BufferEncoding to use for writing strings (defaults to instance encoding).
      */
    /* private */ var _handleString: Any = js.native
    
    /**
      * Inserts a numeric number value based on the given offset and value.
      *
      * @typeparam T { number | bigint } The type of the value to be written
      *
      * @param func { Function(offset: T, offset?) => number} The function to write data on the internal Buffer with.
      * @param byteSize { Number } The number of bytes written.
      * @param value { T } The number value to write.
      * @param offset { Number } the offset to write the number at (REQUIRED).
      *
      * @returns SmartBuffer this buffer
      */
    /* private */ var _insertNumberValue: Any = js.native
    
    /**
      * Reads a numeric number value using the provided function.
      *
      * @typeparam T { number | bigint } The type of the value to be read
      *
      * @param func { Function(offset: number) => number } The function to read data on the internal Buffer with.
      * @param byteSize { Number } The number of bytes read.
      * @param offset { Number } The offset to read from (optional). When this is not provided, the managed readOffset is used instead.
      *
      * @returns { T } the number value
      */
    /* private */ var _readNumberValue: Any = js.native
    
    /* private */ var _readOffset: Any = js.native
    
    /**
      * Writes a numeric number value based on the given offset and value.
      *
      * @typeparam T { number | bigint } The type of the value to be written
      *
      * @param func { Function(offset: T, offset?) => number} The function to write data on the internal Buffer with.
      * @param byteSize { Number } The number of bytes written.
      * @param value { T } The number value to write.
      * @param offset { Number } the offset to write the number at (REQUIRED).
      *
      * @returns SmartBuffer this buffer
      */
    /* private */ var _writeNumberValue: Any = js.native
    
    /* private */ var _writeOffset: Any = js.native
    
    /**
      * Clears the SmartBuffer instance to its original empty state.
      */
    def clear(): SmartBuffer = js.native
    
    /**
      * Destroys the SmartBuffer instance.
      */
    def destroy(): SmartBuffer = js.native
    
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
    var encoding: BufferEncoding = js.native
    
    /**
      * Ensures that the internal Buffer is large enough to insert data.
      *
      * @param dataLength { Number } The length of the data that needs to be written.
      * @param offset { Number } The offset of the data to be written.
      */
    /* private */ var ensureInsertable: Any = js.native
    
    /**
      * Ensures that the internal Buffer is large enough to read data.
      *
      * @param length { Number } The length of the data that needs to be read.
      * @param offset { Number } The offset of the data that needs to be read.
      */
    /* private */ var ensureReadable: Any = js.native
    
    /**
      * Inserts a BigInt64BE value at the given offset value.
      *
      * @param value { BigInt } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertBigInt64BE(value: js.BigInt, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts a Int64LE value at the given offset value.
      *
      * @param value { BigInt } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertBigInt64LE(value: js.BigInt, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts a BigUInt64BE value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertBigUInt64BE(value: js.BigInt, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts a BigUInt64LE value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertBigUInt64LE(value: js.BigInt, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes a Buffer to the current write position.
      *
      * @param value { Buffer } The Buffer to write.
      * @param offset { Number } The offset to write the Buffer to.
      *
      * @return this
      */
    def insertBuffer(value: Buffer, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts a null-terminated Buffer.
      *
      * @param value { Buffer } The Buffer to write.
      * @param offset { Number } The offset to write the Buffer to.
      *
      * @return this
      */
    def insertBufferNT(value: Buffer, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts a DoubleBE value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertDoubleBE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts a DoubleLE value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertDoubleLE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts a FloatBE value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertFloatBE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts a FloatLE value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertFloatLE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts an Int16BE value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertInt16BE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts an Int16LE value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertInt16LE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts an Int32BE value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertInt32BE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts an Int32LE value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertInt32LE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts an Int8 value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertInt8(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts a String
      *
      * @param value { String } The String value to insert.
      * @param offset { Number } The offset to insert the string at.
      * @param encoding { String } The BufferEncoding to use for writing strings (defaults to instance encoding).
      *
      * @return this
      */
    def insertString(value: String, offset: Double): SmartBuffer = js.native
    def insertString(value: String, offset: Double, encoding: BufferEncoding): SmartBuffer = js.native
    
    /**
      * Inserts a null-terminated String.
      *
      * @param value { String } The String value to write.
      * @param arg2 { Number | String } The offset to write the string to, or the BufferEncoding to use.
      * @param encoding { String } The BufferEncoding to use for writing strings (defaults to instance encoding).
      *
      * @return this
      */
    def insertStringNT(value: String, offset: Double): SmartBuffer = js.native
    def insertStringNT(value: String, offset: Double, encoding: BufferEncoding): SmartBuffer = js.native
    
    /**
      * Inserts an UInt16BE value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertUInt16BE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts an UInt16LE value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertUInt16LE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts an UInt32BE value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertUInt32BE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts an UInt32LE value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertUInt32LE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Inserts an UInt8 value at the given offset value.
      *
      * @param value { Number } The value to insert.
      * @param offset { Number } The offset to insert the value at.
      *
      * @return this
      */
    def insertUInt8(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Gets the underlying internal Buffer. (This includes unmanaged data in the Buffer)
      *
      * @return { Buffer } The Buffer value.
      */
    val internalBuffer: Buffer = js.native
    
    var length: Double = js.native
    
    /**
      * Reads a BigInt64BE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { BigInt }
      */
    def readBigInt64BE(): js.BigInt = js.native
    def readBigInt64BE(offset: Double): js.BigInt = js.native
    
    /**
      * Reads a BigInt64LE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { BigInt }
      */
    def readBigInt64LE(): js.BigInt = js.native
    def readBigInt64LE(offset: Double): js.BigInt = js.native
    
    /**
      * Reads a BigUInt64BE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { BigInt }
      */
    def readBigUInt64BE(): js.BigInt = js.native
    def readBigUInt64BE(offset: Double): js.BigInt = js.native
    
    /**
      * Reads a BigUInt64LE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { BigInt }
      */
    def readBigUInt64LE(): js.BigInt = js.native
    def readBigUInt64LE(offset: Double): js.BigInt = js.native
    
    /**
      * Reads a Buffer from the internal read position.
      *
      * @param length { Number } The length of data to read as a Buffer.
      *
      * @return { Buffer }
      */
    def readBuffer(): Buffer = js.native
    def readBuffer(length: Double): Buffer = js.native
    
    /**
      * Reads a null-terminated Buffer from the current read poisiton.
      *
      * @return { Buffer }
      */
    def readBufferNT(): Buffer = js.native
    
    /**
      * Reads an DoublEBE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { Number }
      */
    def readDoubleBE(): Double = js.native
    def readDoubleBE(offset: Double): Double = js.native
    
    /**
      * Reads an DoubleLE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { Number }
      */
    def readDoubleLE(): Double = js.native
    def readDoubleLE(offset: Double): Double = js.native
    
    /**
      * Reads an FloatBE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { Number }
      */
    def readFloatBE(): Double = js.native
    def readFloatBE(offset: Double): Double = js.native
    
    /**
      * Reads an FloatLE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { Number }
      */
    def readFloatLE(): Double = js.native
    def readFloatLE(offset: Double): Double = js.native
    
    /**
      * Reads an Int16BE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { Number }
      */
    def readInt16BE(): Double = js.native
    def readInt16BE(offset: Double): Double = js.native
    
    /**
      * Reads an Int16LE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { Number }
      */
    def readInt16LE(): Double = js.native
    def readInt16LE(offset: Double): Double = js.native
    
    /**
      * Reads an Int32BE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { Number }
      */
    def readInt32BE(): Double = js.native
    def readInt32BE(offset: Double): Double = js.native
    
    /**
      * Reads an Int32LE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { Number }
      */
    def readInt32LE(): Double = js.native
    def readInt32LE(offset: Double): Double = js.native
    
    /**
      * Reads an Int8 value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { Number }
      */
    def readInt8(): Double = js.native
    def readInt8(offset: Double): Double = js.native
    
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
    var readOffset: Double = js.native
    
    /**
      * Reads a String from the current read position.
      *
      * @param arg1 { Number | String } The number of bytes to read as a String, or the BufferEncoding to use for
      *             the string (Defaults to instance level encoding).
      * @param encoding { String } The BufferEncoding to use for the string (Defaults to instance level encoding).
      *
      * @return { String }
      */
    def readString(): String = js.native
    def readString(arg1: Double): String = js.native
    def readString(arg1: Double, encoding: BufferEncoding): String = js.native
    def readString(arg1: Unit, encoding: BufferEncoding): String = js.native
    def readString(arg1: BufferEncoding): String = js.native
    def readString(arg1: BufferEncoding, encoding: BufferEncoding): String = js.native
    
    /**
      * Reads a null-terminated String from the current read position.
      *
      * @param encoding { String } The BufferEncoding to use for the string (Defaults to instance level encoding).
      *
      * @return { String }
      */
    def readStringNT(): String = js.native
    def readStringNT(encoding: BufferEncoding): String = js.native
    
    /**
      * Reads an UInt16BE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { Number }
      */
    def readUInt16BE(): Double = js.native
    def readUInt16BE(offset: Double): Double = js.native
    
    /**
      * Reads an UInt16LE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { Number }
      */
    def readUInt16LE(): Double = js.native
    def readUInt16LE(offset: Double): Double = js.native
    
    /**
      * Reads an UInt32BE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { Number }
      */
    def readUInt32BE(): Double = js.native
    def readUInt32BE(offset: Double): Double = js.native
    
    /**
      * Reads an UInt32LE value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { Number }
      */
    def readUInt32LE(): Double = js.native
    def readUInt32LE(offset: Double): Double = js.native
    
    /**
      * Reads an UInt8 value from the current read position or an optionally provided offset.
      *
      * @param offset { Number } The offset to read data from (optional)
      * @return { Number }
      */
    def readUInt8(): Double = js.native
    def readUInt8(offset: Double): Double = js.native
    
    /**
      * Gets the remaining data left to be read from the SmartBuffer instance.
      *
      * @return { Number }
      */
    def remaining(): Double = js.native
    
    /**
      * Gets the value of the internal managed Buffer (Includes managed data only)
      *
      * @param { Buffer }
      */
    def toBuffer(): Buffer = js.native
    
    def toString(encoding: BufferEncoding): String = js.native
    
    /**
      * Writes a BigInt64BE value to the current write position (or at optional offset).
      *
      * @param value { BigInt } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeBigInt64BE(value: js.BigInt): SmartBuffer = js.native
    def writeBigInt64BE(value: js.BigInt, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes a BigInt64LE value to the current write position (or at optional offset).
      *
      * @param value { BigInt } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeBigInt64LE(value: js.BigInt): SmartBuffer = js.native
    def writeBigInt64LE(value: js.BigInt, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes a BigUInt64BE value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeBigUInt64BE(value: js.BigInt): SmartBuffer = js.native
    def writeBigUInt64BE(value: js.BigInt, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes a BigUInt64LE value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeBigUInt64LE(value: js.BigInt): SmartBuffer = js.native
    def writeBigUInt64LE(value: js.BigInt, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes a Buffer to the current write position.
      *
      * @param value { Buffer } The Buffer to write.
      * @param offset { Number } The offset to write the Buffer to.
      *
      * @return this
      */
    def writeBuffer(value: Buffer): SmartBuffer = js.native
    def writeBuffer(value: Buffer, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes a null-terminated Buffer.
      *
      * @param value { Buffer } The Buffer to write.
      * @param offset { Number } The offset to write the Buffer to.
      *
      * @return this
      */
    def writeBufferNT(value: Buffer): SmartBuffer = js.native
    def writeBufferNT(value: Buffer, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes a DoubleBE value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeDoubleBE(value: Double): SmartBuffer = js.native
    def writeDoubleBE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes a DoubleLE value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeDoubleLE(value: Double): SmartBuffer = js.native
    def writeDoubleLE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes a FloatBE value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeFloatBE(value: Double): SmartBuffer = js.native
    def writeFloatBE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes a FloatLE value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeFloatLE(value: Double): SmartBuffer = js.native
    def writeFloatLE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes an Int16BE value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeInt16BE(value: Double): SmartBuffer = js.native
    def writeInt16BE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes an Int16LE value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeInt16LE(value: Double): SmartBuffer = js.native
    def writeInt16LE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes an Int32BE value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeInt32BE(value: Double): SmartBuffer = js.native
    def writeInt32BE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes an Int32LE value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeInt32LE(value: Double): SmartBuffer = js.native
    def writeInt32LE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes an Int8 value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeInt8(value: Double): SmartBuffer = js.native
    def writeInt8(value: Double, offset: Double): SmartBuffer = js.native
    
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
    var writeOffset: Double = js.native
    
    /**
      * Writes a String
      *
      * @param value { String } The String value to write.
      * @param arg2 { Number | String } The offset to write the string at, or the BufferEncoding to use.
      * @param encoding { String } The BufferEncoding to use for writing strings (defaults to instance encoding).
      *
      * @return this
      */
    def writeString(value: String): SmartBuffer = js.native
    def writeString(value: String, arg2: Double): SmartBuffer = js.native
    def writeString(value: String, arg2: Double, encoding: BufferEncoding): SmartBuffer = js.native
    def writeString(value: String, arg2: Unit, encoding: BufferEncoding): SmartBuffer = js.native
    def writeString(value: String, arg2: BufferEncoding): SmartBuffer = js.native
    def writeString(value: String, arg2: BufferEncoding, encoding: BufferEncoding): SmartBuffer = js.native
    
    /**
      * Writes a null-terminated String.
      *
      * @param value { String } The String value to write.
      * @param arg2 { Number | String } The offset to write the string to, or the BufferEncoding to use.
      * @param encoding { String } The BufferEncoding to use for writing strings (defaults to instance encoding).
      *
      * @return this
      */
    def writeStringNT(value: String): SmartBuffer = js.native
    def writeStringNT(value: String, arg2: Double): SmartBuffer = js.native
    def writeStringNT(value: String, arg2: Double, encoding: BufferEncoding): SmartBuffer = js.native
    def writeStringNT(value: String, arg2: Unit, encoding: BufferEncoding): SmartBuffer = js.native
    def writeStringNT(value: String, arg2: BufferEncoding): SmartBuffer = js.native
    def writeStringNT(value: String, arg2: BufferEncoding, encoding: BufferEncoding): SmartBuffer = js.native
    
    /**
      * Writes an UInt16BE value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeUInt16BE(value: Double): SmartBuffer = js.native
    def writeUInt16BE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes an UInt16LE value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeUInt16LE(value: Double): SmartBuffer = js.native
    def writeUInt16LE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes an UInt32BE value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeUInt32BE(value: Double): SmartBuffer = js.native
    def writeUInt32BE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes an UInt32LE value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeUInt32LE(value: Double): SmartBuffer = js.native
    def writeUInt32LE(value: Double, offset: Double): SmartBuffer = js.native
    
    /**
      * Writes an UInt8 value to the current write position (or at optional offset).
      *
      * @param value { Number } The value to write.
      * @param offset { Number } The offset to write the value at.
      *
      * @return this
      */
    def writeUInt8(value: Double): SmartBuffer = js.native
    def writeUInt8(value: Double, offset: Double): SmartBuffer = js.native
  }
  object SmartBuffer {
    
    @JSImport("smart-buffer", "SmartBuffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new SmartBuffer instance with the provided Buffer and optional encoding.
      *
      * @param buffer { Buffer } The Buffer to use as the internal Buffer value.
      * @param encoding { String } The BufferEncoding to use for strings.
      *
      * @return { SmartBuffer }
      */
    /* static member */
    inline def fromBuffer(buff: Buffer): SmartBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buff.asInstanceOf[js.Any]).asInstanceOf[SmartBuffer]
    inline def fromBuffer(buff: Buffer, encoding: BufferEncoding): SmartBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buff.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[SmartBuffer]
    
    /**
      * Creates a new SmartBuffer instance with the provided SmartBufferOptions options.
      *
      * @param options { SmartBufferOptions } The options to use when creating the SmartBuffer instance.
      */
    /* static member */
    inline def fromOptions(options: SmartBufferOptions): SmartBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(options.asInstanceOf[js.Any]).asInstanceOf[SmartBuffer]
    
    /**
      * Creates a new SmartBuffer instance with the provided internal Buffer size and optional encoding.
      *
      * @param size { Number } The size of the internal Buffer.
      * @param encoding { String } The BufferEncoding to use for strings.
      *
      * @return { SmartBuffer }
      */
    /* static member */
    inline def fromSize(size: Double): SmartBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSize")(size.asInstanceOf[js.Any]).asInstanceOf[SmartBuffer]
    inline def fromSize(size: Double, encoding: BufferEncoding): SmartBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSize")(size.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[SmartBuffer]
    
    /**
      * Type checking function that determines if an object is a SmartBufferOptions object.
      */
    /* static member */
    inline def isSmartBufferOptions(options: SmartBufferOptions): /* is smart-buffer.smart-buffer.SmartBufferOptions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSmartBufferOptions")(options.asInstanceOf[js.Any]).asInstanceOf[/* is smart-buffer.smart-buffer.SmartBufferOptions */ Boolean]
  }
  
  /**
    * Object interface for constructing new SmartBuffer instances.
    */
  trait SmartBufferOptions extends StObject {
    
    var buff: js.UndefOr[Buffer] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object SmartBufferOptions {
    
    inline def apply(): SmartBufferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmartBufferOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SmartBufferOptions] (val x: Self) extends AnyVal {
      
      inline def setBuff(value: Buffer): Self = StObject.set(x, "buff", value.asInstanceOf[js.Any])
      
      inline def setBuffUndefined: Self = StObject.set(x, "buff", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
