package typings.select2.anon

import typings.select2.mod.IdTextPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: IdTextPair
}

object Data {
  @scala.inline
  def apply(data: IdTextPair): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

