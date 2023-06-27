package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIOutput)
  */
@js.native
trait MIDIOutput
  extends StObject
     with MIDIPort {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIOutput/send) */
  /* standard dom */
  def send(data: js.Array[Double]): Unit = js.native
  def send(data: js.Array[Double], timestamp: DOMHighResTimeStamp): Unit = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIOutput/send) */
  /* standard dom.iterable */
  def send(data: js.Iterable[Double]): Unit = js.native
  def send(data: js.Iterable[Double], timestamp: DOMHighResTimeStamp): Unit = js.native
}
