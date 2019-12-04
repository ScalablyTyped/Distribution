package typings.atStorybookComponents.distBlocksPropsTablePropRowMod

import typings.atStorybookComponents.distBlocksPropsTablePropDefMod.PropDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropRowProps extends js.Object {
  var row: PropDef
}

object PropRowProps {
  @scala.inline
  def apply(row: PropDef): PropRowProps = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropRowProps]
  }
}

