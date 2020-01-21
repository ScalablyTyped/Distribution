package typings.reactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBundleId extends js.Object {
  var bundleId: js.UndefOr[String] = js.undefined
}

object AnonBundleId {
  @scala.inline
  def apply(bundleId: String = null): AnonBundleId = {
    val __obj = js.Dynamic.literal()
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBundleId]
  }
}

