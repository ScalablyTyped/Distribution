package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A controller object that allows you to abort one or more DOM requests as and when desired. */
@js.native
trait AbortController extends StObject {
  
  /** Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted. */
  /* standard dom */
  def abort(): Unit = js.native
  def abort(reason: Any): Unit = js.native
  
  /** Returns the AbortSignal object associated with this object. */
  /* standard dom */
  val signal: AbortSignal = js.native
}
