package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelProps extends js.Object {
  val label: js.UndefOr[java.lang.String] = js.undefined
  val sublabel: js.UndefOr[java.lang.String] = js.undefined
}

object LabelProps {
  @scala.inline
  def apply(label: java.lang.String = null, sublabel: java.lang.String = null): LabelProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (sublabel != null) __obj.updateDynamic("sublabel")(sublabel)
    __obj.asInstanceOf[LabelProps]
  }
}

