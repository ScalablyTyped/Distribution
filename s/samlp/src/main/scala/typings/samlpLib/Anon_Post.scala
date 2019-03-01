package typings
package samlpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Post extends js.Object {
  var post: js.UndefOr[java.lang.String] = js.undefined
  var redirect: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Post {
  @scala.inline
  def apply(post: java.lang.String = null, redirect: java.lang.String = null): Anon_Post = {
    val __obj = js.Dynamic.literal()
    if (post != null) __obj.updateDynamic("post")(post)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    __obj.asInstanceOf[Anon_Post]
  }
}

