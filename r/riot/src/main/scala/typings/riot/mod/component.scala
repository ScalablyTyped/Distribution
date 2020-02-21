package typings.riot.mod

import typings.riot.AnonAttributesParentScope
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
    /* meta */ js.UndefOr[AnonAttributesParentScope], 
    RiotComponent[Props, State]
  ] = js.native
}

