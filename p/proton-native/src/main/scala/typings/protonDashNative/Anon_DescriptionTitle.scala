package typings.protonDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionTitle extends js.Object {
  var description: String
  var title: js.UndefOr[String] = js.undefined
}

object Anon_DescriptionTitle {
  @scala.inline
  def apply(description: String, title: String = null): Anon_DescriptionTitle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescriptionTitle]
  }
}

