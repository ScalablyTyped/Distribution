package typings.storybookAddonA11y.colorBlindnessMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  var active: Boolean
  var id: String
  var right: js.UndefOr[ReactNode] = js.undefined
  var title: ReactNode
  def onClick(): Unit
}

object Link {
  @scala.inline
  def apply(active: Boolean, id: String, onClick: () => Unit, right: ReactNode = null, title: ReactNode = null): Link = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick))
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

