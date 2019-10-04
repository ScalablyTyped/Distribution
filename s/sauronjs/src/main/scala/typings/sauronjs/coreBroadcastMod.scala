package typings.sauronjs

import typings.sauronjs.coreServiceMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sauronjs/core/broadcast", JSImport.Namespace)
@js.native
object coreBroadcastMod extends js.Object {
  def attachSubject(`object`: ^): js.Any = js.native
  def next(channels: js.Array[String], event: String, data: js.Any, id: String): Unit = js.native
}

