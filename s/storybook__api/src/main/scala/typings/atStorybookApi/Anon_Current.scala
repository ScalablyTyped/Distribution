package typings.atStorybookApi

import typings.atStorybookApi.distModulesVersionsMod.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current extends js.Object {
  var current: Anon_Info
  var latest: js.UndefOr[Version] = js.undefined
  var next: js.UndefOr[Version] = js.undefined
}

object Anon_Current {
  @scala.inline
  def apply(current: Anon_Info, latest: Version = null, next: Version = null): Anon_Current = {
    val __obj = js.Dynamic.literal(current = current)
    if (latest != null) __obj.updateDynamic("latest")(latest)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Anon_Current]
  }
}

