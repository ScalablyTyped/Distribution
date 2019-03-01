package typings
package atSapXsenvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var plan: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply(
    label: java.lang.String = null,
    name: java.lang.String = null,
    plan: java.lang.String = null,
    tag: java.lang.String = null
  ): Anon_Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (name != null) __obj.updateDynamic("name")(name)
    if (plan != null) __obj.updateDynamic("plan")(plan)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Anon_Label]
  }
}

