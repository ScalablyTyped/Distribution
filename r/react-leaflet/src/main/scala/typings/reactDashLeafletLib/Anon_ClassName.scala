package typings
package reactDashLeafletLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(className: java.lang.String = null, style: java.lang.String = null): Anon_ClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_ClassName]
  }
}

