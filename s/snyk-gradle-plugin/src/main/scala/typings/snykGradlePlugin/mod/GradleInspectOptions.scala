package typings.snykGradlePlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradleInspectOptions extends js.Object {
  var `configuration-attributes`: js.UndefOr[String] = js.undefined
  var `configuration-matching`: js.UndefOr[String] = js.undefined
  var daemon: js.UndefOr[Boolean] = js.undefined
}

object GradleInspectOptions {
  @scala.inline
  def apply(
    `configuration-attributes`: String = null,
    `configuration-matching`: String = null,
    daemon: js.UndefOr[Boolean] = js.undefined
  ): GradleInspectOptions = {
    val __obj = js.Dynamic.literal()
    if (`configuration-attributes` != null) __obj.updateDynamic("configuration-attributes")(`configuration-attributes`.asInstanceOf[js.Any])
    if (`configuration-matching` != null) __obj.updateDynamic("configuration-matching")(`configuration-matching`.asInstanceOf[js.Any])
    if (!js.isUndefined(daemon)) __obj.updateDynamic("daemon")(daemon.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradleInspectOptions]
  }
}

