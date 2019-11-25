package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends js.Object {
  var NSFileProtectionKey: js.UndefOr[String] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(NSFileProtectionKey: String = null): FileOptions = {
    val __obj = js.Dynamic.literal()
    if (NSFileProtectionKey != null) __obj.updateDynamic("NSFileProtectionKey")(NSFileProtectionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
}

