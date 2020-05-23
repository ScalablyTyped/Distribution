package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.TextDecoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TextDecoder")
@js.native
class TextDecoder ()
  extends typings.std.TextDecoder {
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

@JSGlobal("TextDecoder")
@js.native
object TextDecoder
  extends Instantiable0[typings.std.TextDecoder]
     with Instantiable1[/* label */ java.lang.String, typings.std.TextDecoder]
     with Instantiable2[
      /* label */ java.lang.String, 
      /* options */ TextDecoderOptions, 
      typings.std.TextDecoder
    ]

