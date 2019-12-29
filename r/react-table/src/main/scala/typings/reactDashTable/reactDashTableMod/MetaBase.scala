package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaBase[D /* <: js.Object */] extends js.Object {
  var instance: TableInstance[D]
  var userProps: js.Any
}

object MetaBase {
  @scala.inline
  def apply[D /* <: js.Object */](instance: TableInstance[D], userProps: js.Any): MetaBase[D] = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], userProps = userProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MetaBase[D]]
  }
}

