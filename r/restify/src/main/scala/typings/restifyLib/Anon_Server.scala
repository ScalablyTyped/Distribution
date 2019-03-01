package typings
package restifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Server extends js.Object {
  var server: restifyLib.restifyMod.Server
}

object Anon_Server {
  @scala.inline
  def apply(server: restifyLib.restifyMod.Server): Anon_Server = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[Anon_Server]
  }
}

