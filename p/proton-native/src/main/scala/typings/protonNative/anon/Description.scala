package typings.protonNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var title: String
}

object Description {
  @scala.inline
  def apply(title: String, description: String = null): Description = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

