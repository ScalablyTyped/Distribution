package typings.samlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Post extends js.Object {
  var post: js.UndefOr[String] = js.undefined
  var redirect: js.UndefOr[String] = js.undefined
}

object Anon_Post {
  @scala.inline
  def apply(post: String = null, redirect: String = null): Anon_Post = {
    val __obj = js.Dynamic.literal()
    if (post != null) __obj.updateDynamic("post")(post)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    __obj.asInstanceOf[Anon_Post]
  }
}

