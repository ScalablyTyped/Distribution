package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableByteStreamController
  extends StObject
     with ReadableStreamController[Any] {
  
  /* standard dom */
  val byobRequest: ReadableStreamBYOBRequest | Null = js.native
  
  /* standard dom */
  def close(): Unit = js.native
  
  /* standard dom */
  val desiredSize: Double | Null = js.native
  
  /* standard dom */
  def enqueue(chunk: js.typedarray.ArrayBufferView): Unit = js.native
  
  /* standard dom */
  def error(): Unit = js.native
  def error(e: Any): Unit = js.native
}
