package typings.samlp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Post extends js.Object {
  var post: js.UndefOr[String] = js.undefined
  var redirect: js.UndefOr[String] = js.undefined
}

object Post {
  @scala.inline
  def apply(post: String = null, redirect: String = null): Post = {
    val __obj = js.Dynamic.literal()
    if (post != null) __obj.updateDynamic("post")(post.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Post]
  }
}

