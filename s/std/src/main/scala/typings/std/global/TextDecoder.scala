package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.TextDecoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TextDecoder")
@js.native
class TextDecoder ()
  extends typings.std.TextDecoder {
  def this(label: java.lang.String) = this()
  def this(label: js.UndefOr[scala.Nothing], options: TextDecoderOptions) = this()
  def this(label: java.lang.String, options: TextDecoderOptions) = this()
}
@JSGlobal("TextDecoder")
@js.native
object TextDecoder
  extends Instantiable0[typings.std.TextDecoder]
     with Instantiable1[/* label */ java.lang.String, typings.std.TextDecoder]
     with Instantiable2[
      js.UndefOr[/* label */ java.lang.String], 
      /* options */ TextDecoderOptions, 
      typings.std.TextDecoder
    ]
