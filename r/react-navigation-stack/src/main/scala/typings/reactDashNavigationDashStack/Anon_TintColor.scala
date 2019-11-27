package typings.reactDashNavigationDashStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TintColor extends js.Object {
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String | Null] = js.undefined
}

object Anon_TintColor {
  @scala.inline
  def apply(tintColor: String = null, title: String = null): Anon_TintColor = {
    val __obj = js.Dynamic.literal()
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TintColor]
  }
}

