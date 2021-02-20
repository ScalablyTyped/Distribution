package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformStreamDefaultController[O] extends StObject {
  
  val desiredSize: Double | Null = js.native
  
  def enqueue(chunk: O): Unit = js.native
  
  def error(): Unit = js.native
  def error(reason: js.Any): Unit = js.native
  
  def terminate(): Unit = js.native
}
