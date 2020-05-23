package typings.reactBreadcrumbs.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  var title: js.UndefOr[ReactNode] = js.undefined
}

object Title {
  @scala.inline
  def apply(title: ReactNode = null): Title = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

