package typings.riot.riotMod

import typings.riot.Anon_AttributesSlots
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", "component")
@js.native
object component extends js.Object {
  def apply[Props, State](shell: RiotComponentShell[Props, State]): js.Function3[
    /* el */ HTMLElement, 
    /* initialProps */ js.UndefOr[Props], 
    /* meta */ js.UndefOr[Anon_AttributesSlots], 
    RiotComponent[Props, State]
  ] = js.native
}

