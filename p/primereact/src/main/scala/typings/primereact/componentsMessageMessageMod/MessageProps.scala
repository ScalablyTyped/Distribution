package typings.primereact.componentsMessageMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var severity: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object MessageProps {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    severity: String = null,
    style: js.Object = null,
    text: String = null
  ): MessageProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (id != null) __obj.updateDynamic("id")(id)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MessageProps]
  }
}

