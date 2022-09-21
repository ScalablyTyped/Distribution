package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("TextEncoderStream")
@js.native
/* standard dom */
open class TextEncoderStream ()
  extends StObject
     with typings.std.TextEncoderStream {
  
  /** Returns "utf-8". */
  /* standard dom */
  /* CompleteClass */
  override val encoding: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val readable: typings.std.ReadableStream[Any] = js.native
  /* standard dom */
  /* CompleteClass */
  @JSName("readable")
  override val readable_TextEncoderStream: typings.std.ReadableStream[js.typedarray.Uint8Array] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val writable: typings.std.WritableStream[Any] = js.native
  /* standard dom */
  /* CompleteClass */
  @JSName("writable")
  override val writable_TextEncoderStream: typings.std.WritableStream[java.lang.String] = js.native
}
