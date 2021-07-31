package typings.std.global

import typings.std.ReadableStreamReadResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ReadableStreamReader")
@js.native
class ReadableStreamReader ()
  extends StObject
     with typings.std.ReadableStreamReader[js.Any] {
  
  /* CompleteClass */
  override def cancel(): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  override def read(): js.Promise[ReadableStreamReadResult[js.Any]] = js.native
  
  /* CompleteClass */
  override def releaseLock(): Unit = js.native
}
