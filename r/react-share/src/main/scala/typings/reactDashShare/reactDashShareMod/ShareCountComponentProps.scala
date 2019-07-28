package typings.reactDashShare.reactDashShareMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareCountComponentProps extends js.Object {
  /** Supply a function as the child to render anything but the count */
  var children: js.UndefOr[js.Function1[/* shareCount */ Double, ReactNode]] = js.undefined
  /** Classes to apply (if any) */
  var className: js.UndefOr[String] = js.undefined
  /** The URL you are sharing */
  var url: String
}

object ShareCountComponentProps {
  @scala.inline
  def apply(url: String, children: /* shareCount */ Double => ReactNode = null, className: String = null): ShareCountComponentProps = {
    val __obj = js.Dynamic.literal(url = url)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[ShareCountComponentProps]
  }
}

