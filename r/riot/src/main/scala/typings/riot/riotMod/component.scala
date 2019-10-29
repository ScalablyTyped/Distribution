package typings.riot.riotMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", "component")
@js.native
object component extends js.Object {
  def apply[P, S](shell: RiotComponentShell[P, S]): js.Function2[/* el */ HTMLElement, /* initialProps */ js.UndefOr[P], RiotComponent[P, S]] = js.native
}

