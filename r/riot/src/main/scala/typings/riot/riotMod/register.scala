package typings.riot.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", "register")
@js.native
object register extends js.Object {
  def apply[P, S](componentName: String, shell: RiotComponentShell[P, S]): RegisteredComponentsMap = js.native
}

