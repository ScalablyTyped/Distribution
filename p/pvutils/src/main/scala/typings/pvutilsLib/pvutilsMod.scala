package typings
package pvutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pvutils", JSImport.Namespace)
@js.native
object pvutilsMod extends js.Object {
  def arrayBufferToString(buffer: stdLib.BufferSource): java.lang.String = js.native
  /**
    * Converts "ArrayBuffer" into a hexdecimal string
    * @param {ArrayBuffer} inputBuffer
    * @param {number} [inputOffset=0]
    * @param {number} [inputLength=inputBuffer.byteLength]
    * @returns {string}
    */
  def bufferToHexCodes(inputBuffer: stdLib.ArrayBuffer): java.lang.String = js.native
  def bufferToHexCodes(inputBuffer: stdLib.ArrayBuffer, inputOffset: scala.Double): java.lang.String = js.native
  def bufferToHexCodes(inputBuffer: stdLib.ArrayBuffer, inputOffset: scala.Double, inputLength: scala.Double): java.lang.String = js.native
  /**
    * Check input "ArrayBuffer" for common functions
    * @param {LocalBaseBlock} baseBlock
    * @param {ArrayBuffer} inputBuffer
    * @param {number} inputOffset
    * @param {number} inputLength
    * @returns {boolean}
    */
  def checkBufferParams(
    baseBlock: js.Any,
    inputBuffer: stdLib.ArrayBuffer,
    inputOffset: scala.Double,
    inputLength: scala.Double
  ): scala.Boolean = js.native
  /**
    * Decode string from BASE64 (or "base64url")
    * @param {string} input
    * @param {boolean} [useUrlTemplate=false] If "true" then output would be encoded using "base64url"
    * @param {boolean} [cutTailZeros=false] If "true" then cut tailing zeroz from function result
    * @returns {string}
    */
  def fromBase64(input: java.lang.String): java.lang.String = js.native
  def fromBase64(input: java.lang.String, useUrlTemplate: scala.Boolean): java.lang.String = js.native
  def fromBase64(input: java.lang.String, useUrlTemplate: scala.Boolean, cutTailZeros: scala.Boolean): java.lang.String = js.native
  /**
    * Get value for input parameters, or set a default value
    * @param {Object} parameters
    * @param {string} name
    * @param defaultValue
    */
  def getParametersValue[T](parameters: js.Any, name: java.lang.String): T = js.native
  def getParametersValue[T](parameters: js.Any, name: java.lang.String, defaultValue: T): T = js.native
  /**
    * Making UTC date from local date
    * @param {Date} date Date to convert from
    * @returns {Date}
    */
  def getUTCDate(date: stdLib.Date): stdLib.Date = js.native
  /**
    * Compare two array buffers
    * @param {!ArrayBuffer} inputBuffer1
    * @param {!ArrayBuffer} inputBuffer2
    * @returns {boolean}
    */
  def isEqualBuffer(inputBuffer1: stdLib.ArrayBuffer, inputBuffer2: stdLib.ArrayBuffer): scala.Boolean = js.native
  /**
    * Get nearest to input length power of 2
    * @param {number} length Current length of existing array
    * @returns {number}
    */
  def nearestPowerOf2(length: scala.Double): scala.Double = js.native
  /**
    * Pad input number with leade "0" if needed
    * @param {number} inputNumber
    * @param {number} fullLength
    * @returns {string}
    */
  def padNumber(inputNumber: scala.Double, fullLength: scala.Double): java.lang.String = js.native
  def stringToArrayBuffer(str: java.lang.String): stdLib.ArrayBuffer = js.native
  /**
    * Encode string into BASE64 (or "base64url")
    * @param {string} input
    * @param {boolean} [useUrlTemplate = false] useUrlTemplate If "true" then output would be encoded using "base64url"
    * @param {boolean} [skipPadding = false] skipPadding Skip BASE-64 padding or not
    * @returns {string}
    */
  def toBase64(input: java.lang.String): java.lang.String = js.native
  def toBase64(input: java.lang.String, useUrlTemplate: scala.Boolean): java.lang.String = js.native
  def toBase64(input: java.lang.String, useUrlTemplate: scala.Boolean, skipPadding: scala.Boolean): java.lang.String = js.native
  /**
    * Concatenate two ArrayBuffers
    * @param {...ArrayBuffer[]} buffers First ArrayBuffer (first part of concatenated array)
    * @returns {ArrayBuffer}
    */
  def utilConcatBuf(buf: stdLib.ArrayBuffer*): stdLib.ArrayBuffer = js.native
  /**
    * Decoding of "two complement" values
    * The function must be called in scope of instance of "hexBlock" class ("valueHex" and "warnings" properties must be present)
    * @returns {number}
    */
  def utilDecodeTC(): scala.Double = js.native
  /**
    * Encode integer value to "two complement" format
    * @param {number} value Value to encode
    * @returns {ArrayBuffer}
    */
  def utilEncodeTC(value: scala.Double): stdLib.ArrayBuffer = js.native
  /**
    * Convert number from 2^base to 2^10
    * @param {Uint8Array} inputBuffer
    * @param {number} inputBase
    * @returns {number}
    */
  def utilFromBase(inputBuffer: stdLib.Uint8Array, inputBase: scala.Double): scala.Double = js.native
  /**
    * Convert number from 2^10 to 2^base
    * @param {!number} value The number to convert
    * @param {!number} base The base for 2^base
    * @param {number} [reserved=0] Pre-defined number of bytes in output array (-1 = limited by function itself)
    * @returns {ArrayBuffer}
    */
  def utilToBase(value: scala.Double, base: scala.Double): stdLib.ArrayBuffer = js.native
  def utilToBase(value: scala.Double, base: scala.Double, reserved: scala.Double): stdLib.ArrayBuffer = js.native
}

