package typings.reactDashSketchapp.libComponentsSvgPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinationProps extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object DefinationProps {
  @scala.inline
  def apply(name: String = null): DefinationProps = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinationProps]
  }
}

