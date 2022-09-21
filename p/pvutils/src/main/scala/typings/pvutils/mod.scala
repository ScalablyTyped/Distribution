package typings.pvutils

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pvutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayBufferToString(buffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferToString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Converts "ArrayBuffer" into a hexadecimal string
    * @param inputBuffer
    * @param inputOffset
    * @param inputLength
    * @param insertSpace
    */
  inline def bufferToHexCodes(inputBuffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHexCodes")(inputBuffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def bufferToHexCodes(inputBuffer: js.typedarray.ArrayBuffer, inputOffset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHexCodes")(inputBuffer.asInstanceOf[js.Any], inputOffset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def bufferToHexCodes(inputBuffer: js.typedarray.ArrayBuffer, inputOffset: Double, inputLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHexCodes")(inputBuffer.asInstanceOf[js.Any], inputOffset.asInstanceOf[js.Any], inputLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def bufferToHexCodes(
    inputBuffer: js.typedarray.ArrayBuffer,
    inputOffset: Double,
    inputLength: Double,
    insertSpace: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHexCodes")(inputBuffer.asInstanceOf[js.Any], inputOffset.asInstanceOf[js.Any], inputLength.asInstanceOf[js.Any], insertSpace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def bufferToHexCodes(
    inputBuffer: js.typedarray.ArrayBuffer,
    inputOffset: Double,
    inputLength: Unit,
    insertSpace: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHexCodes")(inputBuffer.asInstanceOf[js.Any], inputOffset.asInstanceOf[js.Any], inputLength.asInstanceOf[js.Any], insertSpace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def bufferToHexCodes(inputBuffer: js.typedarray.ArrayBuffer, inputOffset: Unit, inputLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHexCodes")(inputBuffer.asInstanceOf[js.Any], inputOffset.asInstanceOf[js.Any], inputLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def bufferToHexCodes(
    inputBuffer: js.typedarray.ArrayBuffer,
    inputOffset: Unit,
    inputLength: Double,
    insertSpace: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHexCodes")(inputBuffer.asInstanceOf[js.Any], inputOffset.asInstanceOf[js.Any], inputLength.asInstanceOf[js.Any], insertSpace.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def bufferToHexCodes(inputBuffer: js.typedarray.ArrayBuffer, inputOffset: Unit, inputLength: Unit, insertSpace: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bufferToHexCodes")(inputBuffer.asInstanceOf[js.Any], inputOffset.asInstanceOf[js.Any], inputLength.asInstanceOf[js.Any], insertSpace.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Check input "ArrayBuffer" for common functions
    * @param {LocalBaseBlock} baseBlock
    * @param {ArrayBuffer} inputBuffer
    * @param {number} inputOffset
    * @param {number} inputLength
    * @returns {boolean}
    */
  inline def checkBufferParams(
    baseBlock: LocalBaseBlock,
    inputBuffer: js.typedarray.ArrayBuffer,
    inputOffset: Double,
    inputLength: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkBufferParams")(baseBlock.asInstanceOf[js.Any], inputBuffer.asInstanceOf[js.Any], inputOffset.asInstanceOf[js.Any], inputLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Delete properties by name from specified object
    * @param object Object to delete properties from
    * @param propsArray Array of properties names
    */
  inline def clearProps(`object`: Record[String, Any], propsArray: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("clearProps")(`object`.asInstanceOf[js.Any], propsArray.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Decode string from BASE64 (or "base64url")
    * @param input
    * @param useUrlTemplate If "true" then output would be encoded using "base64url"
    * @param cutTailZeros If "true" then cut tailing zeros from function result
    */
  inline def fromBase64(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fromBase64(input: String, useUrlTemplate: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def fromBase64(input: String, useUrlTemplate: Boolean, cutTailZeros: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any], cutTailZeros.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def fromBase64(input: String, useUrlTemplate: Unit, cutTailZeros: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any], cutTailZeros.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Get value for input parameters, or set a default value
    * @param parameters
    * @param name
    * @param defaultValue
    */
  inline def getParametersValue[T](parameters: Record[String, Any], name: String, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getParametersValue")(parameters.asInstanceOf[js.Any], name.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def getUTCDate(date: js.Date): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getUTCDate")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  /**
    * Compare two array buffers
    * @param inputBuffer1
    * @param inputBuffer2
    */
  inline def isEqualBuffer(inputBuffer1: js.typedarray.ArrayBuffer, inputBuffer2: js.typedarray.ArrayBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqualBuffer")(inputBuffer1.asInstanceOf[js.Any], inputBuffer2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Get nearest to input length power of 2
    * @param length Current length of existing array
    */
  inline def nearestPowerOf2(length: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nearestPowerOf2")(length.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Pad input number with leaded "0" if needed
    * @param inputNumber
    * @param fullLength
    */
  inline def padNumber(inputNumber: Double, fullLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padNumber")(inputNumber.asInstanceOf[js.Any], fullLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stringToArrayBuffer(str: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToArrayBuffer")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /**
    * Encode string into BASE64 (or "base64url")
    * @param input
    * @param useUrlTemplate If "true" then output would be encoded using "base64url"
    * @param skipPadding Skip BASE-64 padding or not
    * @param skipLeadingZeros Skip leading zeros in input data or not
    */
  inline def toBase64(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toBase64(input: String, useUrlTemplate: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toBase64(input: String, useUrlTemplate: Boolean, skipPadding: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any], skipPadding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toBase64(input: String, useUrlTemplate: Boolean, skipPadding: Boolean, skipLeadingZeros: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any], skipPadding.asInstanceOf[js.Any], skipLeadingZeros.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toBase64(input: String, useUrlTemplate: Boolean, skipPadding: Unit, skipLeadingZeros: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any], skipPadding.asInstanceOf[js.Any], skipLeadingZeros.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toBase64(input: String, useUrlTemplate: Unit, skipPadding: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any], skipPadding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toBase64(input: String, useUrlTemplate: Unit, skipPadding: Boolean, skipLeadingZeros: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any], skipPadding.asInstanceOf[js.Any], skipLeadingZeros.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toBase64(input: String, useUrlTemplate: Unit, skipPadding: Unit, skipLeadingZeros: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toBase64")(input.asInstanceOf[js.Any], useUrlTemplate.asInstanceOf[js.Any], skipPadding.asInstanceOf[js.Any], skipLeadingZeros.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Concatenate two ArrayBuffers
    * @param buffers Set of ArrayBuffer
    */
  inline def utilConcatBuf(buffers: js.typedarray.ArrayBuffer*): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("utilConcatBuf")(buffers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /**
    * Concatenate two Uint8Array
    * @param  views Set of Uint8Array
    */
  inline def utilConcatView(views: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("utilConcatView")(views.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
  
  /**
    * Decoding of "two complement" values
    * The function must be called in scope of instance of "hexBlock" class ("valueHex" and "warnings" properties must be present)
    */
  inline def utilDecodeTC(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("utilDecodeTC")().asInstanceOf[Double]
  
  /**
    * Encode integer value to "two complement" format
    * @param value Value to encode
    */
  inline def utilEncodeTC(value: Double): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("utilEncodeTC")(value.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /**
    * Convert number from 2^base to 2^10
    * @param inputBuffer
    * @param inputBase
    */
  inline def utilFromBase(inputBuffer: js.typedarray.Uint8Array, inputBase: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("utilFromBase")(inputBuffer.asInstanceOf[js.Any], inputBase.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Convert number from 2^10 to 2^base
    * @param value The number to convert
    * @param base The base for 2^base
    * @param reserved Pre-defined number of bytes in output array (-1 = limited by function itself)
    */
  inline def utilToBase(value: Double, base: Double): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("utilToBase")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def utilToBase(value: Double, base: Double, reserved: Double): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("utilToBase")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any], reserved.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  
  trait HexBlock extends StObject {
    
    var valueHex: js.typedarray.ArrayBuffer
    
    var warnings: js.Array[String]
  }
  object HexBlock {
    
    inline def apply(valueHex: js.typedarray.ArrayBuffer, warnings: js.Array[String]): HexBlock = {
      val __obj = js.Dynamic.literal(valueHex = valueHex.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[HexBlock]
    }
    
    extension [Self <: HexBlock](x: Self) {
      
      inline def setValueHex(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait LocalBaseBlock extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
  }
  object LocalBaseBlock {
    
    inline def apply(): LocalBaseBlock = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalBaseBlock]
    }
    
    extension [Self <: LocalBaseBlock](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
}
