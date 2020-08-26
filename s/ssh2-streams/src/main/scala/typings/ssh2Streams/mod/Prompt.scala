package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prompt extends js.Object {
  var echo: js.UndefOr[Boolean] = js.native
  var prompt: String = js.native
}

object Prompt {
  @scala.inline
  def apply(prompt: String): Prompt = {
    val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prompt]
  }
  @scala.inline
  implicit class PromptOps[Self <: Prompt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def setEcho(value: Boolean): Self = this.set("echo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcho: Self = this.set("echo", js.undefined)
  }
  
}

