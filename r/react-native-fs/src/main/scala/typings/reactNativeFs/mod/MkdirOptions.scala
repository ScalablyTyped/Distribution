package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MkdirOptions extends js.Object {
  // iOS only
  var NSFileProtectionKey: js.UndefOr[String] = js.undefined
  var NSURLIsExcludedFromBackupKey: js.UndefOr[Boolean] = js.undefined
}

object MkdirOptions {
  @scala.inline
  def apply(
    NSFileProtectionKey: String = null,
    NSURLIsExcludedFromBackupKey: js.UndefOr[Boolean] = js.undefined
  ): MkdirOptions = {
    val __obj = js.Dynamic.literal()
    if (NSFileProtectionKey != null) __obj.updateDynamic("NSFileProtectionKey")(NSFileProtectionKey.asInstanceOf[js.Any])
    if (!js.isUndefined(NSURLIsExcludedFromBackupKey)) __obj.updateDynamic("NSURLIsExcludedFromBackupKey")(NSURLIsExcludedFromBackupKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MkdirOptions]
  }
}

