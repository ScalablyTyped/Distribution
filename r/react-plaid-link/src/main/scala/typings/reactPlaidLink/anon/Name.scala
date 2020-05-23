package typings.reactPlaidLink.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var institution_id: String | Null
  var name: String | Null
}

object Name {
  @scala.inline
  def apply(institution_id: String = null, name: String = null): Name = {
    val __obj = js.Dynamic.literal(institution_id = institution_id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

