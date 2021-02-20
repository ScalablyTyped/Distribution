package typings.smartBuffer

import typings.node.BufferEncoding
import typings.smartBuffer.mod.SmartBuffer
import typings.smartBuffer.smartBufferStrings.readBigInt64BE
import typings.smartBuffer.smartBufferStrings.readBigInt64LE
import typings.smartBuffer.smartBufferStrings.readBigUInt64BE
import typings.smartBuffer.smartBufferStrings.readBigUInt64LE
import typings.smartBuffer.smartBufferStrings.writeBigInt64BE
import typings.smartBuffer.smartBufferStrings.writeBigInt64LE
import typings.smartBuffer.smartBufferStrings.writeBigUInt64BE
import typings.smartBuffer.smartBufferStrings.writeBigUInt64LE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  /**
    * Error strings
    */
  object ERRORS {
    
    @JSImport("smart-buffer/typings/utils", "ERRORS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("smart-buffer/typings/utils", "ERRORS.INVALID_ENCODING")
    @js.native
    def INVALID_ENCODING: String = js.native
    @scala.inline
    def INVALID_ENCODING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ENCODING")(x.asInstanceOf[js.Any])
    
    @JSImport("smart-buffer/typings/utils", "ERRORS.INVALID_LENGTH")
    @js.native
    def INVALID_LENGTH: String = js.native
    @scala.inline
    def INVALID_LENGTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_LENGTH")(x.asInstanceOf[js.Any])
    
    @JSImport("smart-buffer/typings/utils", "ERRORS.INVALID_LENGTH_NON_NUMBER")
    @js.native
    def INVALID_LENGTH_NON_NUMBER: String = js.native
    @scala.inline
    def INVALID_LENGTH_NON_NUMBER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_LENGTH_NON_NUMBER")(x.asInstanceOf[js.Any])
    
    @JSImport("smart-buffer/typings/utils", "ERRORS.INVALID_OFFSET")
    @js.native
    def INVALID_OFFSET: String = js.native
    @scala.inline
    def INVALID_OFFSET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_OFFSET")(x.asInstanceOf[js.Any])
    
    @JSImport("smart-buffer/typings/utils", "ERRORS.INVALID_OFFSET_NON_NUMBER")
    @js.native
    def INVALID_OFFSET_NON_NUMBER: String = js.native
    @scala.inline
    def INVALID_OFFSET_NON_NUMBER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_OFFSET_NON_NUMBER")(x.asInstanceOf[js.Any])
    
    @JSImport("smart-buffer/typings/utils", "ERRORS.INVALID_READ_BEYOND_BOUNDS")
    @js.native
    def INVALID_READ_BEYOND_BOUNDS: String = js.native
    @scala.inline
    def INVALID_READ_BEYOND_BOUNDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_READ_BEYOND_BOUNDS")(x.asInstanceOf[js.Any])
    
    @JSImport("smart-buffer/typings/utils", "ERRORS.INVALID_SMARTBUFFER_BUFFER")
    @js.native
    def INVALID_SMARTBUFFER_BUFFER: String = js.native
    @scala.inline
    def INVALID_SMARTBUFFER_BUFFER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_SMARTBUFFER_BUFFER")(x.asInstanceOf[js.Any])
    
    @JSImport("smart-buffer/typings/utils", "ERRORS.INVALID_SMARTBUFFER_OBJECT")
    @js.native
    def INVALID_SMARTBUFFER_OBJECT: String = js.native
    @scala.inline
    def INVALID_SMARTBUFFER_OBJECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_SMARTBUFFER_OBJECT")(x.asInstanceOf[js.Any])
    
    @JSImport("smart-buffer/typings/utils", "ERRORS.INVALID_SMARTBUFFER_SIZE")
    @js.native
    def INVALID_SMARTBUFFER_SIZE: String = js.native
    @scala.inline
    def INVALID_SMARTBUFFER_SIZE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_SMARTBUFFER_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("smart-buffer/typings/utils", "ERRORS.INVALID_TARGET_LENGTH")
    @js.native
    def INVALID_TARGET_LENGTH: String = js.native
    @scala.inline
    def INVALID_TARGET_LENGTH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_TARGET_LENGTH")(x.asInstanceOf[js.Any])
    
    @JSImport("smart-buffer/typings/utils", "ERRORS.INVALID_TARGET_OFFSET")
    @js.native
    def INVALID_TARGET_OFFSET: String = js.native
    @scala.inline
    def INVALID_TARGET_OFFSET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_TARGET_OFFSET")(x.asInstanceOf[js.Any])
    
    @JSImport("smart-buffer/typings/utils", "ERRORS.INVALID_WRITE_BEYOND_BOUNDS")
    @js.native
    def INVALID_WRITE_BEYOND_BOUNDS: String = js.native
    @scala.inline
    def INVALID_WRITE_BEYOND_BOUNDS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_WRITE_BEYOND_BOUNDS")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Throws if Node.js version is too low to support bigint
    */
  @JSImport("smart-buffer/typings/utils", "bigIntAndBufferInt64Check")
  @js.native
  def bigIntAndBufferInt64Check(
    bufferMethod: /* keyof smart-buffer.smart-buffer/typings/utils.Buffer */ readBigInt64BE | readBigInt64LE | readBigUInt64BE | readBigUInt64LE | writeBigInt64BE | writeBigInt64LE | writeBigUInt64BE | writeBigUInt64LE
  ): Unit = js.native
  
  /**
    * Checks if a given encoding is a valid Buffer encoding. (Throws an exception if check fails)
    *
    * @param { String } encoding The encoding string to check.
    */
  @JSImport("smart-buffer/typings/utils", "checkEncoding")
  @js.native
  def checkEncoding(encoding: BufferEncoding): Unit = js.native
  
  /**
    * Checks if a length value is valid. (Throws an exception if check fails)
    *
    * @param { Number } length The value to check.
    */
  @JSImport("smart-buffer/typings/utils", "checkLengthValue")
  @js.native
  def checkLengthValue(length: js.Any): Unit = js.native
  
  /**
    * Checks if a offset value is valid. (Throws an exception if check fails)
    *
    * @param { Number } offset The value to check.
    */
  @JSImport("smart-buffer/typings/utils", "checkOffsetValue")
  @js.native
  def checkOffsetValue(offset: js.Any): Unit = js.native
  
  /**
    * Checks if a target offset value is out of bounds. (Throws an exception if check fails)
    *
    * @param { Number } offset The offset value to check.
    * @param { SmartBuffer } buff The SmartBuffer instance to check against.
    */
  @JSImport("smart-buffer/typings/utils", "checkTargetOffset")
  @js.native
  def checkTargetOffset(offset: Double, buff: SmartBuffer): Unit = js.native
  
  /**
    * Checks if a given number is a finite integer. (Throws an exception if check fails)
    *
    * @param { Number } value The number value to check.
    */
  @JSImport("smart-buffer/typings/utils", "isFiniteInteger")
  @js.native
  def isFiniteInteger(value: Double): Boolean = js.native
  
  @js.native
  trait Buffer extends StObject {
    
    def readBigInt64BE(): js.BigInt = js.native
    def readBigInt64BE(offset: Double): js.BigInt = js.native
    
    def readBigInt64LE(): js.BigInt = js.native
    def readBigInt64LE(offset: Double): js.BigInt = js.native
    
    def readBigUInt64BE(): js.BigInt = js.native
    def readBigUInt64BE(offset: Double): js.BigInt = js.native
    
    def readBigUInt64LE(): js.BigInt = js.native
    def readBigUInt64LE(offset: Double): js.BigInt = js.native
    
    def writeBigInt64BE(value: js.BigInt): Double = js.native
    def writeBigInt64BE(value: js.BigInt, offset: Double): Double = js.native
    
    def writeBigInt64LE(value: js.BigInt): Double = js.native
    def writeBigInt64LE(value: js.BigInt, offset: Double): Double = js.native
    
    def writeBigUInt64BE(value: js.BigInt): Double = js.native
    def writeBigUInt64BE(value: js.BigInt, offset: Double): Double = js.native
    
    def writeBigUInt64LE(value: js.BigInt): Double = js.native
    def writeBigUInt64LE(value: js.BigInt, offset: Double): Double = js.native
  }
}
