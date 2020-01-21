package typings.sauronjs.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sauronjs/src/core/service", JSImport.Namespace)
@js.native
class ^ protected () extends Service {
  def this(pubs: js.Array[String], subs: js.Array[String]) = this()
  /* CompleteClass */
  override var broadcastSubject: js.Any = js.native
  /* CompleteClass */
  override def broadcast(event: String, data: js.Any): Unit = js.native
}

