package typings.reactDashNativeDashVersionDashCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreErrors extends js.Object {
  /**
    * @default true
    */
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * Package Name
    */
  var packageName: js.UndefOr[String] = js.undefined
}

object Anon_IgnoreErrors {
  @scala.inline
  def apply(ignoreErrors: js.UndefOr[Boolean] = js.undefined, packageName: String = null): Anon_IgnoreErrors = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreErrors)) __obj.updateDynamic("ignoreErrors")(ignoreErrors)
    if (packageName != null) __obj.updateDynamic("packageName")(packageName)
    __obj.asInstanceOf[Anon_IgnoreErrors]
  }
}

