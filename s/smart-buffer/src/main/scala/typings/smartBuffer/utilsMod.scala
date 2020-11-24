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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smart-buffer/typings/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  /**
    * Throws if Node.js version is too low to support bigint
    */
  def bigIntAndBufferInt64Check(
    bufferMethod: /* keyof smart-buffer.smart-buffer/typings/utils.Buffer */ readBigInt64BE | readBigInt64LE | readBigUInt64BE | readBigUInt64LE | writeBigInt64BE | writeBigInt64LE | writeBigUInt64BE | writeBigUInt64LE
  ): Unit = js.native
  
  /**
    * Checks if a given encoding is a valid Buffer encoding. (Throws an exception if check fails)
    *
    * @param { String } encoding The encoding string to check.
    */
  def checkEncoding(encoding: BufferEncoding): Unit = js.native
  
  /**
    * Checks if a length value is valid. (Throws an exception if check fails)
    *
    * @param { Number } length The value to check.
    */
  def checkLengthValue(length: js.Any): Unit = js.native
  
  /**
    * Checks if a offset value is valid. (Throws an exception if check fails)
    *
    * @param { Number } offset The value to check.
    */
  def checkOffsetValue(offset: js.Any): Unit = js.native
  
  /**
    * Checks if a target offset value is out of bounds. (Throws an exception if check fails)
    *
    * @param { Number } offset The offset value to check.
    * @param { SmartBuffer } buff The SmartBuffer instance to check against.
    */
  def checkTargetOffset(offset: Double, buff: SmartBuffer): Unit = js.native
  
  /**
    * Checks if a given number is a finite integer. (Throws an exception if check fails)
    *
    * @param { Number } value The number value to check.
    */
  def isFiniteInteger(value: Double): Boolean = js.native
  
  @js.native
  trait Buffer extends js.Object {
    
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
  
  /**
    * Error strings
    */
  @js.native
  object ERRORS extends js.Object {
    
    var INVALID_ENCODING: String = js.native
    
    var INVALID_LENGTH: String = js.native
    
    var INVALID_LENGTH_NON_NUMBER: String = js.native
    
    var INVALID_OFFSET: String = js.native
    
    var INVALID_OFFSET_NON_NUMBER: String = js.native
    
    var INVALID_READ_BEYOND_BOUNDS: String = js.native
    
    var INVALID_SMARTBUFFER_BUFFER: String = js.native
    
    var INVALID_SMARTBUFFER_OBJECT: String = js.native
    
    var INVALID_SMARTBUFFER_SIZE: String = js.native
    
    var INVALID_TARGET_LENGTH: String = js.native
    
    var INVALID_TARGET_OFFSET: String = js.native
    
    var INVALID_WRITE_BEYOND_BOUNDS: String = js.native
  }
}
