package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MkdirOptions extends js.Object {
  // iOS only
  var NSURLIsExcludedFromBackupKey: js.UndefOr[Boolean] = js.undefined
}

object MkdirOptions {
  @scala.inline
  def apply(NSURLIsExcludedFromBackupKey: js.UndefOr[Boolean] = js.undefined): MkdirOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NSURLIsExcludedFromBackupKey)) __obj.updateDynamic("NSURLIsExcludedFromBackupKey")(NSURLIsExcludedFromBackupKey)
    __obj.asInstanceOf[MkdirOptions]
  }
}

