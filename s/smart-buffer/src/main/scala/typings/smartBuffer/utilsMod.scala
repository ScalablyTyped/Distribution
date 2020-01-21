package typings.smartBuffer

import typings.node.BufferEncoding
import typings.smartBuffer.mod.SmartBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smart-buffer/typings/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
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

