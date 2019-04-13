package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageProps extends js.Object {
  var children: js.UndefOr[js.Array[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object PageProps {
  @scala.inline
  def apply(
    children: js.Array[reactLib.reactMod.ReactNode] | reactLib.reactMod.ReactNode = null,
    name: java.lang.String = null
  ): PageProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[PageProps]
  }
}

