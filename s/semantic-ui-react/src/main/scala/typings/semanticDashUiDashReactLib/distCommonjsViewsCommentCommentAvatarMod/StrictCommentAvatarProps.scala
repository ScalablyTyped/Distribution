package typings
package semanticDashUiDashReactLib.distCommonjsViewsCommentCommentAvatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictCommentAvatarProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the URL of the image. */
  var src: js.UndefOr[java.lang.String] = js.undefined
}

object StrictCommentAvatarProps {
  @scala.inline
  def apply(as: js.Any = null, className: java.lang.String = null, src: java.lang.String = null): StrictCommentAvatarProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[StrictCommentAvatarProps]
  }
}

