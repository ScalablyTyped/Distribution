package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamDefaultController[R]
  extends StObject
     with ReadableStreamController[R] {
  
  /* standard dom */
  def close(): Unit = js.native
  
  /* standard dom */
  val desiredSize: Double | Null = js.native
  
  /* standard dom */
  def enqueue(): Unit = js.native
  def enqueue(chunk: R): Unit = js.native
  
  /* standard dom */
  def error(): Unit = js.native
  def error(e: Any): Unit = js.native
}
