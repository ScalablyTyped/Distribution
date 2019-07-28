package typings.semanticDashUiDashReact.distCommonjsViewsCommentCommentAvatarMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentAvatarProps
  extends StrictCommentAvatarProps
     with /* key */ StringDictionary[js.Any]

object CommentAvatarProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    className: String = null,
    src: String = null
  ): CommentAvatarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[CommentAvatarProps]
  }
}

