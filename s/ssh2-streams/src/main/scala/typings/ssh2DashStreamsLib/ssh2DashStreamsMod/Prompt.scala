package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prompt extends js.Object {
  var echo: js.UndefOr[scala.Boolean] = js.undefined
  var prompt: java.lang.String
}

object Prompt {
  @scala.inline
  def apply(prompt: java.lang.String, echo: js.UndefOr[scala.Boolean] = js.undefined): Prompt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("prompt")(prompt)
    if (!js.isUndefined(echo)) __obj.updateDynamic("echo")(echo)
    __obj.asInstanceOf[Prompt]
  }
}

