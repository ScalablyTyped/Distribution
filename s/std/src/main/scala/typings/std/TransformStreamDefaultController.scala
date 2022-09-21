package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformStreamDefaultController[O] extends StObject {
  
  /* standard dom */
  val desiredSize: Double | Null = js.native
  
  /* standard dom */
  def enqueue(): Unit = js.native
  def enqueue(chunk: O): Unit = js.native
  
  /* standard dom */
  def error(): Unit = js.native
  def error(reason: Any): Unit = js.native
  
  /* standard dom */
  def terminate(): Unit = js.native
}
