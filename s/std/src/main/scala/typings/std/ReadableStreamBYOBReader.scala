package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamBYOBReader
  extends StObject
     with ReadableStreamGenericReader
     with ReadableStreamReader[Any] {
  
  /* standard dom */
  def read[T /* <: js.typedarray.ArrayBufferView */](view: T): js.Promise[ReadableStreamReadResult[T]] = js.native
  
  /* standard dom */
  def releaseLock(): Unit = js.native
}
