package typings
package reactDashShareLib.reactDashShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareCountComponentProps extends js.Object {
  /** Supply a function as the child to render anything but the count */
  var children: js.UndefOr[js.Function1[/* shareCount */ scala.Double, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  /** Classes to apply (if any) */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** The URL you are sharing */
  var url: java.lang.String
}

object ShareCountComponentProps {
  @scala.inline
  def apply(
    url: java.lang.String,
    children: js.Function1[/* shareCount */ scala.Double, reactLib.reactMod.ReactNs.ReactNode] = null,
    className: java.lang.String = null
  ): ShareCountComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[ShareCountComponentProps]
  }
}

