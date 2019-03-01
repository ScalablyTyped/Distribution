package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comment extends js.Object {
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Comment {
  @scala.inline
  def apply(name: java.lang.String, comment: java.lang.String = null, `type`: java.lang.String = null): Anon_Comment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Comment]
  }
}

