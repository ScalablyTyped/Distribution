package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamDefaultReader[R]
  extends StObject
     with ReadableStreamGenericReader
     with ReadableStreamReader[R] {
  
  /* standard dom */
  def read(): js.Promise[ReadableStreamReadResult[R]] = js.native
  
  /* standard dom */
  def releaseLock(): Unit = js.native
}
