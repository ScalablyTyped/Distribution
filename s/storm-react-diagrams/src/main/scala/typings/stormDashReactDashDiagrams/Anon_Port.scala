package typings.stormDashReactDashDiagrams

import typings.stormDashReactDashDiagrams.distSrcModelsPortModelMod.PortModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Port extends js.Object {
  var port: Null | PortModel
}

object Anon_Port {
  @scala.inline
  def apply(port: PortModel = null): Anon_Port = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[Anon_Port]
  }
}

