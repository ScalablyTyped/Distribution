package typings.atStorybookApi.distModulesVersionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Versions extends js.Object {
  var current: js.UndefOr[Version] = js.undefined
  var latest: js.UndefOr[Version] = js.undefined
  var next: js.UndefOr[Version] = js.undefined
}

object Versions {
  @scala.inline
  def apply(current: Version = null, latest: Version = null, next: Version = null): Versions = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current)
    if (latest != null) __obj.updateDynamic("latest")(latest)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Versions]
  }
}

