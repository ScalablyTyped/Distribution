package typings.reactEmailEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tools extends js.Object {
  val tools: js.UndefOr[Dock] = js.native
}

object Tools {
  @scala.inline
  def apply(): Tools = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tools]
  }
  @scala.inline
  implicit class ToolsOps[Self <: Tools] (val x: Self) extends AnyVal {
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
    def setTools(value: Dock): Self = this.set("tools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
  }
  
}

