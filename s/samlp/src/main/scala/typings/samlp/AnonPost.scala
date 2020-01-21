package typings.samlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPost extends js.Object {
  var post: js.UndefOr[String] = js.undefined
  var redirect: js.UndefOr[String] = js.undefined
}

object AnonPost {
  @scala.inline
  def apply(post: String = null, redirect: String = null): AnonPost = {
    val __obj = js.Dynamic.literal()
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPost]
  }
}

