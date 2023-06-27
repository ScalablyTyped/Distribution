package typings.std.global

import typings.std.TextDecoderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("TextDecoder")
@js.native
/* standard dom */
open class TextDecoder ()
  extends StObject
     with typings.std.TextDecoder {
  def this(label: java.lang.String) = this()
  def this(label: java.lang.String, options: TextDecoderOptions) = this()
  def this(label: Unit, options: TextDecoderOptions) = this()
  
  /**
    * Returns encoding's name, lowercased.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/encoding)
    */
  /* standard dom */
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  
  /**
    * Returns true if error mode is "fatal", otherwise false.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/fatal)
    */
  /* standard dom */
  /* CompleteClass */
  override val fatal: scala.Boolean = js.native
  
  /**
    * Returns the value of ignore BOM.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/ignoreBOM)
    */
  /* standard dom */
  /* CompleteClass */
  override val ignoreBOM: scala.Boolean = js.native
}
