package typings
package semanticDashUiDashReactLib.distCommonjsViewsCommentCommentAvatarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentAvatarProps
  extends StrictCommentAvatarProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object CommentAvatarProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    className: java.lang.String = null,
    src: java.lang.String = null
  ): CommentAvatarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[CommentAvatarProps]
  }
}

