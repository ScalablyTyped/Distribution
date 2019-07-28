package typings.reactDashShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(description: String = null, title: String = null): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Description]
  }
}

