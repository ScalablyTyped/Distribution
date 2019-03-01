package typings
package reactDashBreadcrumbsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Title extends js.Object {
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object Anon_Title {
  @scala.inline
  def apply(title: reactLib.reactMod.ReactNs.ReactNode = null): Anon_Title = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Title]
  }
}

