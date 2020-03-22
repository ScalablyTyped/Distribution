package typings.recharts

import typings.recharts.mod.RechartsFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataKey extends js.Object {
  var dataKey: String | Double | RechartsFunction
}

object AnonDataKey {
  @scala.inline
  def apply(dataKey: String | Double | RechartsFunction): AnonDataKey = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataKey]
  }
}

