package typings.reactDashMailchimpDashSubscribe.reactDashMailchimpDashSubscribeMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[FormFields] extends js.Object {
  var render: js.UndefOr[js.Function1[/* hooks */ FormHooks[FormFields], ReactNode]] = js.undefined
  var url: String
}

object Props {
  @scala.inline
  def apply[FormFields](url: String, render: /* hooks */ FormHooks[FormFields] => ReactNode = null): Props[FormFields] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[Props[FormFields]]
  }
}

