package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comment extends js.Object {
  var comment: js.UndefOr[String] = js.undefined
  var name: String
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_Comment {
  @scala.inline
  def apply(name: String, comment: String = null, `type`: String = null): Anon_Comment = {
    val __obj = js.Dynamic.literal(name = name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Comment]
  }
}

