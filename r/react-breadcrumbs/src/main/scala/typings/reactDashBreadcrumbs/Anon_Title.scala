package typings.reactDashBreadcrumbs

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Title extends js.Object {
  var title: js.UndefOr[ReactNode] = js.undefined
}

object Anon_Title {
  @scala.inline
  def apply(title: ReactNode = null): Anon_Title = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Title]
  }
}

