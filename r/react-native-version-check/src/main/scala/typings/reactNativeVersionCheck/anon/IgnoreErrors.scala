package typings.reactNativeVersionCheck.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgnoreErrors extends js.Object {
  /**
    * @default true
    */
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * Package Name
    */
  var packageName: js.UndefOr[String] = js.undefined
}

object IgnoreErrors {
  @scala.inline
  def apply(ignoreErrors: js.UndefOr[Boolean] = js.undefined, packageName: String = null): IgnoreErrors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors.get.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreErrors]
  }
}

