package typings.reactDashNativeDashKeepDashAwake

import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[Element] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(children: Element = null): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[Anon_Children]
  }
}

