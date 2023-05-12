package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
@js.native
trait MIDIOutput
  extends StObject
     with MIDIPort {
  
  /* standard dom */
  def send(data: js.Array[Double]): Unit = js.native
  def send(data: js.Array[Double], timestamp: DOMHighResTimeStamp): Unit = js.native
  /* standard dom.iterable */
  def send(data: js.Iterable[Double]): Unit = js.native
  def send(data: js.Iterable[Double], timestamp: DOMHighResTimeStamp): Unit = js.native
}
