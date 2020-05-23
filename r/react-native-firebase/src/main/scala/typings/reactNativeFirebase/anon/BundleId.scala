package typings.reactNativeFirebase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundleId extends js.Object {
  var bundleId: js.UndefOr[String] = js.undefined
}

object BundleId {
  @scala.inline
  def apply(bundleId: String = null): BundleId = {
    val __obj = js.Dynamic.literal()
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleId]
  }
}

