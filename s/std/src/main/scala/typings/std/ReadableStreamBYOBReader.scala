package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamBYOBReader
  extends StObject
     with ReadableStreamGenericReader {
  
  /* standard dom */
  def read(view: js.typedarray.ArrayBufferView): js.Promise[ReadableStreamReadResult[js.typedarray.ArrayBufferView]] = js.native
  
  /* standard dom */
  def releaseLock(): Unit = js.native
}
