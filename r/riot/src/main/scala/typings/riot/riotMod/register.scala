package typings.riot.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", "register")
@js.native
object register extends js.Object {
  def apply[Props, State](componentName: String, shell: RiotComponentShell[Props, State]): RegisteredComponentsMap = js.native
}

