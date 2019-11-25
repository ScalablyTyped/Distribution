package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prompt extends js.Object {
  var echo: js.UndefOr[Boolean] = js.undefined
  var prompt: String
}

object Prompt {
  @scala.inline
  def apply(prompt: String, echo: js.UndefOr[Boolean] = js.undefined): Prompt = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
    if (!js.isUndefined(echo)) __obj.updateDynamic("echo")(echo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prompt]
  }
}

