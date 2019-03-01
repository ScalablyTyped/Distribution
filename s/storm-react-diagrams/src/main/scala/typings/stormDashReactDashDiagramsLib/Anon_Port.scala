package typings
package stormDashReactDashDiagramsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Port extends js.Object {
  var port: scala.Null | stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel
}

object Anon_Port {
  @scala.inline
  def apply(port: stormDashReactDashDiagramsLib.distSrcModelsPortModelMod.PortModel = null): Anon_Port = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port)
    __obj.asInstanceOf[Anon_Port]
  }
}

