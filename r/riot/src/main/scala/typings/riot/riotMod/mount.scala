package typings.riot.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", "mount")
@js.native
object mount extends js.Object {
  def apply[P, S](selector: String): js.Array[RiotComponent[P, S]] = js.native
  def apply[P, S](selector: String, initialProps: P): js.Array[RiotComponent[P, S]] = js.native
  def apply[P, S](selector: String, initialProps: P, componentName: String): js.Array[RiotComponent[P, S]] = js.native
}

