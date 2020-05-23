package typings.recharts.anon

import typings.recharts.mod.RechartsFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataKey extends js.Object {
  var dataKey: String | Double | RechartsFunction
}

object DataKey {
  @scala.inline
  def apply(dataKey: String | Double | RechartsFunction): DataKey = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataKey]
  }
}

