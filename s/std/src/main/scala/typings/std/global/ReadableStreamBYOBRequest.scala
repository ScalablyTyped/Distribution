package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ReadableStreamBYOBRequest")
@js.native
/* standard dom */
open class ReadableStreamBYOBRequest ()
  extends StObject
     with typings.std.ReadableStreamBYOBRequest {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBRequest/respond) */
  /* standard dom */
  /* CompleteClass */
  override def respond(bytesWritten: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBRequest/respondWithNewView) */
  /* standard dom */
  /* CompleteClass */
  override def respondWithNewView(view: js.typedarray.ArrayBufferView): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBRequest/view) */
  /* standard dom */
  /* CompleteClass */
  override val view: js.typedarray.ArrayBufferView | Null = js.native
}
