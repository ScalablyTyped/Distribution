package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextDecoder")
@js.native
class TextDecoderCls () extends TextDecoder {
  def this(label: java.lang.String) = this()
  def this(label: java.lang.String, options: TextDecoderOptions) = this()
  /**
    * Returns encoding's name, lowercased.
    */
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  /**
    * Returns true if error mode is "fatal", and false otherwise.
    */
  /* CompleteClass */
  override val fatal: scala.Boolean = js.native
  /**
    * Returns true if ignore BOM flag is set, and false otherwise.
    */
  /* CompleteClass */
  override val ignoreBOM: scala.Boolean = js.native
}

