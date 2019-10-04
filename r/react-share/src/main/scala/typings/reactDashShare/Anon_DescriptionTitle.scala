package typings.reactDashShare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionTitle extends js.Object {
  /** Description of the shared page */
  var description: js.UndefOr[String] = js.undefined
  /** Title of the shared page */
  var title: js.UndefOr[String] = js.undefined
}

object Anon_DescriptionTitle {
  @scala.inline
  def apply(description: String = null, title: String = null): Anon_DescriptionTitle = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_DescriptionTitle]
  }
}

