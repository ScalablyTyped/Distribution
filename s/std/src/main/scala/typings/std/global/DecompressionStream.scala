package typings.std.global

import typings.std.CompressionFormat
import typings.std.GenericTransformStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DecompressionStream")
@js.native
open class DecompressionStream protected ()
  extends StObject
     with GenericTransformStream {
  /* standard dom */
  def this(format: CompressionFormat) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompressionStream/readable) */
  /* standard dom */
  /* CompleteClass */
  override val readable: typings.std.ReadableStream[Any] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompressionStream/writable) */
  /* standard dom */
  /* CompleteClass */
  override val writable: typings.std.WritableStream[Any] = js.native
}
