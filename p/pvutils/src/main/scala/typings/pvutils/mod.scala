package typings.pvutils

import typings.std.ArrayBuffer
import typings.std.BufferSource
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pvutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arrayBufferToString(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferToString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Converts "ArrayBuffer" into a hexdecimal string
    * @param {ArrayBuffer} inputBuffer
    * @param {number} [inputOffset=0]
    * @param {number} [inputLength=inputBuffer.byteLength]
    * @returns {string}
    */
  @scala.inline
  def bufferToHexCodes(inputBuffer: ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHexCodes")(inputBuffer.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def bufferToHexCodes(inputBuffer: ArrayBuffer, inputOffset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHexCodes")(inputBuffer.asInstanceOf[js.Any], inputOffset.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def bufferToHexCodes(inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHexCodes")(inputBuffer.asInstanceOf[js.Any], inputOffset.asInstanceOf[js.Any], inputLength.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def bufferToHexCodes(inputBuffer: ArrayBuffer, inputOffset: Unit, inputLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHexCodes")(inputBuffer.asInstanceOf[js.Any], inputOffset.asInstanceOf[js.Any], inputLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Check input "ArrayBuffer" for common functions
    * @param {LocalBaseBlock} baseBlock
    * @param {ArrayBuffer} inputBuffer
    * @param {number} inputOffset
    * @param {number} inputLength
    * @returns {boolean}
    */
  @scala.inline
  def checkBufferParams(baseBlock: js.Any, inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkBufferParams")(baseBlock.asInstanceOf[js.Any], inputBuffer.asInstanceOf[js.Any], inputOffset.asInstanceOf[js.Any], inputLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Decode string from BASE64 (or "base64url")
    * @param {string} input
    * @param {boolean} [useUrlTemplate=false] If "true" then output would be encoded using "base64url"
    * @param {boolean} [cutTailZeros=false] If "true" then cut tailing zeroz from function result
    * @returns {string}
    */
  @scala.inline
  def fromBase64(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def fromBase64(input: String, useUrlTemplate: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def fromBase64(input: String, useUrlTemplate: Boolean, cutTailZeros: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any], cutTailZeros.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def fromBase64(input: String, useUrlTemplate: Unit, cutTailZeros: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any], cutTailZeros.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Get value for input parameters, or set a default value
    * @param {Object} parameters
    * @param {string} name
    * @param defaultValue
    */
  @scala.inline
  def getParametersValue[T](parameters: js.Any, name: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getParametersValue")(parameters.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def getParametersValue[T](parameters: js.Any, name: String, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getParametersValue")(parameters.asInstanceOf[js.Any], name.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Making UTC date from local date
    * @param {Date} date Date to convert from
    * @returns {Date}
    */
  @scala.inline
  def getUTCDate(date: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getUTCDate")(date.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  /**
    * Compare two array buffers
    * @param {!ArrayBuffer} inputBuffer1
    * @param {!ArrayBuffer} inputBuffer2
    * @returns {boolean}
    */
  @scala.inline
  def isEqualBuffer(inputBuffer1: ArrayBuffer, inputBuffer2: ArrayBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqualBuffer")(inputBuffer1.asInstanceOf[js.Any], inputBuffer2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Get nearest to input length power of 2
    * @param {number} length Current length of existing array
    * @returns {number}
    */
  @scala.inline
  def nearestPowerOf2(length: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nearestPowerOf2")(length.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Pad input number with leade "0" if needed
    * @param {number} inputNumber
    * @param {number} fullLength
    * @returns {string}
    */
  @scala.inline
  def padNumber(inputNumber: Double, fullLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padNumber")(inputNumber.asInstanceOf[js.Any], fullLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def stringToArrayBuffer(str: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToArrayBuffer")(str.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  /**
    * Encode string into BASE64 (or "base64url")
    * @param {string} input
    * @param {boolean} [useUrlTemplate = false] useUrlTemplate If "true" then output would be encoded using "base64url"
    * @param {boolean} [skipPadding = false] skipPadding Skip BASE-64 padding or not
    * @returns {string}
    */
  @scala.inline
  def toBase64(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def toBase64(input: String, useUrlTemplate: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toBase64(input: String, useUrlTemplate: Boolean, skipPadding: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any], skipPadding.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def toBase64(input: String, useUrlTemplate: Unit, skipPadding: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any], skipPadding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Concatenate two ArrayBuffers
    * @param {...ArrayBuffer[]} buffers First ArrayBuffer (first part of concatenated array)
    * @returns {ArrayBuffer}
    */
  @scala.inline
  def utilConcatBuf(buf: ArrayBuffer*): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("utilConcatBuf")(buf.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  /**
    * Decoding of "two complement" values
    * The function must be called in scope of instance of "hexBlock" class ("valueHex" and "warnings" properties must be present)
    * @returns {number}
    */
  @scala.inline
  def utilDecodeTC(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("utilDecodeTC")().asInstanceOf[Double]
  
  /**
    * Encode integer value to "two complement" format
    * @param {number} value Value to encode
    * @returns {ArrayBuffer}
    */
  @scala.inline
  def utilEncodeTC(value: Double): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("utilEncodeTC")(value.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  /**
    * Convert number from 2^base to 2^10
    * @param {Uint8Array} inputBuffer
    * @param {number} inputBase
    * @returns {number}
    */
  @scala.inline
  def utilFromBase(inputBuffer: Uint8Array, inputBase: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("utilFromBase")(inputBuffer.asInstanceOf[js.Any], inputBase.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Convert number from 2^10 to 2^base
    * @param {!number} value The number to convert
    * @param {!number} base The base for 2^base
    * @param {number} [reserved=0] Pre-defined number of bytes in output array (-1 = limited by function itself)
    * @returns {ArrayBuffer}
    */
  @scala.inline
  def utilToBase(value: Double, base: Double): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("utilToBase")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
  @scala.inline
  def utilToBase(value: Double, base: Double, reserved: Double): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("utilToBase")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any], reserved.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
}
