package typings.reactElemental.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelProps extends js.Object {
  val label: js.UndefOr[String] = js.undefined
  val sublabel: js.UndefOr[String] = js.undefined
}

object LabelProps {
  @scala.inline
  def apply(label: String = null, sublabel: String = null): LabelProps = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (sublabel != null) __obj.updateDynamic("sublabel")(sublabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelProps]
  }
}

