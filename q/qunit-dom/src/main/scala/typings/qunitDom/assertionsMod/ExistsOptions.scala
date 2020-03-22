package typings.qunitDom.assertionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistsOptions extends js.Object {
  var count: Double
}

object ExistsOptions {
  @scala.inline
  def apply(count: Double): ExistsOptions = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExistsOptions]
  }
}

