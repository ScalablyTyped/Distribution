package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Streams API interface represents a controller allowing control of a WritableStream's state. When constructing a WritableStream, the underlying sink is given a corresponding WritableStreamDefaultController instance to manipulate. */
@js.native
trait WritableStreamDefaultController extends StObject {
  
  /* standard dom */
  def error(): Unit = js.native
  def error(e: Any): Unit = js.native
  
  /* standard dom */
  val signal: AbortSignal = js.native
}
