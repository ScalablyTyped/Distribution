package typings
package rcDashSelectLib.rcDashSelectMod.RcSelectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptGroupProps extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String | reactLib.reactMod.ReactElement] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object OptGroupProps {
  @scala.inline
  def apply(
    key: java.lang.String = null,
    label: java.lang.String | reactLib.reactMod.ReactElement = null,
    value: java.lang.String = null
  ): OptGroupProps = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OptGroupProps]
  }
}

