package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface provides a standard abstraction for writing streaming data to a destination, known as a sink. This object comes with built-in backpressure and queuing. */
@js.native
trait WritableStream[W] extends StObject {
  
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: js.Any): js.Promise[Unit] = js.native
  
  def getWriter(): WritableStreamDefaultWriter[W] = js.native
  
  val locked: scala.Boolean = js.native
}
