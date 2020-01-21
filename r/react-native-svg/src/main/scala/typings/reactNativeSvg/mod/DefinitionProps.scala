package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionProps extends js.Object {
  var id: js.UndefOr[String] = js.undefined
}

object DefinitionProps {
  @scala.inline
  def apply(id: String = null): DefinitionProps = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionProps]
  }
}

