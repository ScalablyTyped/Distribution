package typings.std.global

import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ReadableStreamBYOBRequest")
@js.native
class ReadableStreamBYOBRequest ()
  extends StObject
     with typings.std.ReadableStreamBYOBRequest {
  
  /* CompleteClass */
  override def respond(bytesWritten: Double): Unit = js.native
  
  /* CompleteClass */
  override def respondWithNewView(view: ArrayBufferView): Unit = js.native
  
  /* CompleteClass */
  override val view: ArrayBufferView = js.native
}
