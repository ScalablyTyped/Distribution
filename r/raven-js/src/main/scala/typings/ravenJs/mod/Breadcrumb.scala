package typings.ravenJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breadcrumb extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var level: js.UndefOr[LogLevel] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[BreadcrumbType] = js.undefined
}

object Breadcrumb {
  @scala.inline
  def apply(
    category: String = null,
    data: js.Any = null,
    level: LogLevel = null,
    message: String = null,
    `type`: BreadcrumbType = null
  ): Breadcrumb = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breadcrumb]
  }
}

