package typings
package ravenDashJsLib.ravenDashJsMod.RavenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breadcrumb extends js.Object {
  var category: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var level: js.UndefOr[LogLevel] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[BreadcrumbType] = js.undefined
}

object Breadcrumb {
  @scala.inline
  def apply(
    category: java.lang.String = null,
    data: js.Any = null,
    level: LogLevel = null,
    message: java.lang.String = null,
    `type`: BreadcrumbType = null
  ): Breadcrumb = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (data != null) __obj.updateDynamic("data")(data)
    if (level != null) __obj.updateDynamic("level")(level)
    if (message != null) __obj.updateDynamic("message")(message)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Breadcrumb]
  }
}

