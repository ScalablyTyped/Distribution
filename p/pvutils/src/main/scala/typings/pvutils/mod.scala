package typings.pvutils

import typings.std.ArrayBuffer
import typings.std.BufferSource
import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pvutils", "arrayBufferToString")
  @js.native
  def arrayBufferToString(buffer: BufferSource): String = js.native
  
  /**
    * Converts "ArrayBuffer" into a hexdecimal string
    * @param {ArrayBuffer} inputBuffer
    * @param {number} [inputOffset=0]
    * @param {number} [inputLength=inputBuffer.byteLength]
    * @returns {string}
    */
  @JSImport("pvutils", "bufferToHexCodes")
  @js.native
  def bufferToHexCodes(inputBuffer: ArrayBuffer): String = js.native
  @JSImport("pvutils", "bufferToHexCodes")
  @js.native
  def bufferToHexCodes(inputBuffer: ArrayBuffer, inputOffset: js.UndefOr[scala.Nothing], inputLength: Double): String = js.native
  @JSImport("pvutils", "bufferToHexCodes")
  @js.native
  def bufferToHexCodes(inputBuffer: ArrayBuffer, inputOffset: Double): String = js.native
  @JSImport("pvutils", "bufferToHexCodes")
  @js.native
  def bufferToHexCodes(inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double): String = js.native
  
  /**
    * Check input "ArrayBuffer" for common functions
    * @param {LocalBaseBlock} baseBlock
    * @param {ArrayBuffer} inputBuffer
    * @param {number} inputOffset
    * @param {number} inputLength
    * @returns {boolean}
    */
  @JSImport("pvutils", "checkBufferParams")
  @js.native
  def checkBufferParams(baseBlock: js.Any, inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double): Boolean = js.native
  
  /**
    * Decode string from BASE64 (or "base64url")
    * @param {string} input
    * @param {boolean} [useUrlTemplate=false] If "true" then output would be encoded using "base64url"
    * @param {boolean} [cutTailZeros=false] If "true" then cut tailing zeroz from function result
    * @returns {string}
    */
  @JSImport("pvutils", "fromBase64")
  @js.native
  def fromBase64(input: String): String = js.native
  @JSImport("pvutils", "fromBase64")
  @js.native
  def fromBase64(input: String, useUrlTemplate: js.UndefOr[scala.Nothing], cutTailZeros: Boolean): String = js.native
  @JSImport("pvutils", "fromBase64")
  @js.native
  def fromBase64(input: String, useUrlTemplate: Boolean): String = js.native
  @JSImport("pvutils", "fromBase64")
  @js.native
  def fromBase64(input: String, useUrlTemplate: Boolean, cutTailZeros: Boolean): String = js.native
  
  /**
    * Get value for input parameters, or set a default value
    * @param {Object} parameters
    * @param {string} name
    * @param defaultValue
    */
  @JSImport("pvutils", "getParametersValue")
  @js.native
  def getParametersValue[T](parameters: js.Any, name: String): T = js.native
  @JSImport("pvutils", "getParametersValue")
  @js.native
  def getParametersValue[T](parameters: js.Any, name: String, defaultValue: T): T = js.native
  
  /**
    * Making UTC date from local date
    * @param {Date} date Date to convert from
    * @returns {Date}
    */
  @JSImport("pvutils", "getUTCDate")
  @js.native
  def getUTCDate(date: Date): Date = js.native
  
  /**
    * Compare two array buffers
    * @param {!ArrayBuffer} inputBuffer1
    * @param {!ArrayBuffer} inputBuffer2
    * @returns {boolean}
    */
  @JSImport("pvutils", "isEqualBuffer")
  @js.native
  def isEqualBuffer(inputBuffer1: ArrayBuffer, inputBuffer2: ArrayBuffer): Boolean = js.native
  
  /**
    * Get nearest to input length power of 2
    * @param {number} length Current length of existing array
    * @returns {number}
    */
  @JSImport("pvutils", "nearestPowerOf2")
  @js.native
  def nearestPowerOf2(length: Double): Double = js.native
  
  /**
    * Pad input number with leade "0" if needed
    * @param {number} inputNumber
    * @param {number} fullLength
    * @returns {string}
    */
  @JSImport("pvutils", "padNumber")
  @js.native
  def padNumber(inputNumber: Double, fullLength: Double): String = js.native
  
  @JSImport("pvutils", "stringToArrayBuffer")
  @js.native
  def stringToArrayBuffer(str: String): ArrayBuffer = js.native
  
  /**
    * Encode string into BASE64 (or "base64url")
    * @param {string} input
    * @param {boolean} [useUrlTemplate = false] useUrlTemplate If "true" then output would be encoded using "base64url"
    * @param {boolean} [skipPadding = false] skipPadding Skip BASE-64 padding or not
    * @returns {string}
    */
  @JSImport("pvutils", "toBase64")
  @js.native
  def toBase64(input: String): String = js.native
  @JSImport("pvutils", "toBase64")
  @js.native
  def toBase64(input: String, useUrlTemplate: js.UndefOr[scala.Nothing], skipPadding: Boolean): String = js.native
  @JSImport("pvutils", "toBase64")
  @js.native
  def toBase64(input: String, useUrlTemplate: Boolean): String = js.native
  @JSImport("pvutils", "toBase64")
  @js.native
  def toBase64(input: String, useUrlTemplate: Boolean, skipPadding: Boolean): String = js.native
  
  /**
    * Concatenate two ArrayBuffers
    * @param {...ArrayBuffer[]} buffers First ArrayBuffer (first part of concatenated array)
    * @returns {ArrayBuffer}
    */
  @JSImport("pvutils", "utilConcatBuf")
  @js.native
  def utilConcatBuf(buf: ArrayBuffer*): ArrayBuffer = js.native
  
  /**
    * Decoding of "two complement" values
    * The function must be called in scope of instance of "hexBlock" class ("valueHex" and "warnings" properties must be present)
    * @returns {number}
    */
  @JSImport("pvutils", "utilDecodeTC")
  @js.native
  def utilDecodeTC(): Double = js.native
  
  /**
    * Encode integer value to "two complement" format
    * @param {number} value Value to encode
    * @returns {ArrayBuffer}
    */
  @JSImport("pvutils", "utilEncodeTC")
  @js.native
  def utilEncodeTC(value: Double): ArrayBuffer = js.native
  
  /**
    * Convert number from 2^base to 2^10
    * @param {Uint8Array} inputBuffer
    * @param {number} inputBase
    * @returns {number}
    */
  @JSImport("pvutils", "utilFromBase")
  @js.native
  def utilFromBase(inputBuffer: Uint8Array, inputBase: Double): Double = js.native
  
  /**
    * Convert number from 2^10 to 2^base
    * @param {!number} value The number to convert
    * @param {!number} base The base for 2^base
    * @param {number} [reserved=0] Pre-defined number of bytes in output array (-1 = limited by function itself)
    * @returns {ArrayBuffer}
    */
  @JSImport("pvutils", "utilToBase")
  @js.native
  def utilToBase(value: Double, base: Double): ArrayBuffer = js.native
  @JSImport("pvutils", "utilToBase")
  @js.native
  def utilToBase(value: Double, base: Double, reserved: Double): ArrayBuffer = js.native
}
