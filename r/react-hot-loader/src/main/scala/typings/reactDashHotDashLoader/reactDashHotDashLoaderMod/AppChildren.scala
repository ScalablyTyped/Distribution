package typings.reactDashHotDashLoader.reactDashHotDashLoaderMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppChildren extends js.Object {
  var children: js.UndefOr[ReactElement] = js.undefined
}

object AppChildren {
  @scala.inline
  def apply(children: ReactElement = null): AppChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppChildren]
  }
}

