package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface is the object returned by WritableStream.getWriter() and once created locks the < writer to the WritableStream ensuring that no other streams can write to the underlying sink. */
@js.native
trait WritableStreamDefaultWriter[W] extends StObject {
  
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: js.Any): js.Promise[Unit] = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  val closed: js.Promise[Unit] = js.native
  
  val desiredSize: Double | Null = js.native
  
  val ready: js.Promise[Unit] = js.native
  
  def releaseLock(): Unit = js.native
  
  def write(chunk: W): js.Promise[Unit] = js.native
}
