package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentName extends js.Object {
  var comment: js.UndefOr[Input[String]] = js.undefined
  var name: Input[String]
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object Anon_CommentName {
  @scala.inline
  def apply(name: Input[String], comment: Input[String] = null, `type`: Input[String] = null): Anon_CommentName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentName]
  }
}

