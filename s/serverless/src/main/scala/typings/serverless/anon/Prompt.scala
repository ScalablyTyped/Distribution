package typings.serverless.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prompt extends js.Object {
  var prompt: js.UndefOr[String] = js.undefined
  var redirect: js.UndefOr[Boolean] = js.undefined
}

object Prompt {
  @scala.inline
  def apply(prompt: String = null, redirect: js.UndefOr[Boolean] = js.undefined): Prompt = {
    val __obj = js.Dynamic.literal()
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (!js.isUndefined(redirect)) __obj.updateDynamic("redirect")(redirect.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prompt]
  }
}

