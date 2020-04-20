package typings.storybookComponents.propRowMod

import typings.storybookComponents.propDefMod.PropDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropRowProps extends js.Object {
  var row: PropDef = js.native
}

object PropRowProps {
  @scala.inline
  def apply(row: PropDef): PropRowProps = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropRowProps]
  }
}

