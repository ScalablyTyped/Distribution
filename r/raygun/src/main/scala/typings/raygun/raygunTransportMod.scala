package typings.raygun

import typings.raygun.typesMod.SendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raygun/build/raygun.transport", JSImport.Namespace)
@js.native
object raygunTransportMod extends js.Object {
  def send(options: SendOptions): Unit = js.native
}

