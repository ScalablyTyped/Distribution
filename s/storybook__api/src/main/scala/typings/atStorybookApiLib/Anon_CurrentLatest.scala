package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentLatest extends js.Object {
  var current: Anon_Info
  var latest: js.UndefOr[atStorybookApiLib.distModulesVersionsMod.Version] = js.undefined
  var next: js.UndefOr[atStorybookApiLib.distModulesVersionsMod.Version] = js.undefined
}

object Anon_CurrentLatest {
  @scala.inline
  def apply(
    current: Anon_Info,
    latest: atStorybookApiLib.distModulesVersionsMod.Version = null,
    next: atStorybookApiLib.distModulesVersionsMod.Version = null
  ): Anon_CurrentLatest = {
    val __obj = js.Dynamic.literal(current = current)
    if (latest != null) __obj.updateDynamic("latest")(latest)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Anon_CurrentLatest]
  }
}

