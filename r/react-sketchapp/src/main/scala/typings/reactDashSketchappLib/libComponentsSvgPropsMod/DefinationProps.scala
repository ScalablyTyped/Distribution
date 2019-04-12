package typings
package reactDashSketchappLib.libComponentsSvgPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinationProps extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object DefinationProps {
  @scala.inline
  def apply(name: java.lang.String = null): DefinationProps = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DefinationProps]
  }
}

