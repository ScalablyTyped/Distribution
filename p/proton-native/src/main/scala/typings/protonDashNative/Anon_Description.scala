package typings.protonDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var title: String
}

object Anon_Description {
  @scala.inline
  def apply(title: String, description: String = null): Anon_Description = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Description]
  }
}

