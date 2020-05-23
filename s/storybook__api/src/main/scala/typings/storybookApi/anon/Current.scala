package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Current extends js.Object {
  var current: typings.storybookApi.versionsMod.Version | Version
  var latest: js.UndefOr[typings.storybookApi.versionsMod.Version] = js.undefined
  var next: js.UndefOr[typings.storybookApi.versionsMod.Version] = js.undefined
}

object Current {
  @scala.inline
  def apply(
    current: typings.storybookApi.versionsMod.Version | Version,
    latest: typings.storybookApi.versionsMod.Version = null,
    next: typings.storybookApi.versionsMod.Version = null
  ): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    if (latest != null) __obj.updateDynamic("latest")(latest.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
}

