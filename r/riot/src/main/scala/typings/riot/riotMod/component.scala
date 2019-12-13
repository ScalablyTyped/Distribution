package typings.riot.riotMod

import typings.riot.Anon_Attributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", "component")
@js.native
object component extends js.Object {
  def apply[P, S](shell: RiotComponentShell[P, S]): js.Function3[
    /* el */ HTMLElement, 
    /* initialProps */ js.UndefOr[P], 
    /* meta */ js.UndefOr[Anon_Attributes], 
    RiotComponent[P, S]
  ] = js.native
}

