package typings.reactMdTable.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableConfig
  extends TableCellConfig
     with TableRowConfiguration

object TableConfig {
  @scala.inline
  def apply(): TableConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableConfig]
  }
}

