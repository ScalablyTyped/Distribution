package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface provides a standard abstraction for writing streaming data to a destination, known as a sink. This object comes with built-in backpressure and queuing. */
@js.native
trait WritableStream[W] extends StObject {
  
  /* standard dom */
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: Any): js.Promise[Unit] = js.native
  
  /* standard dom */
  def close(): js.Promise[Unit] = js.native
  
  /* standard dom */
  def getWriter(): WritableStreamDefaultWriter[W] = js.native
  
  /* standard dom */
  val locked: scala.Boolean = js.native
}
