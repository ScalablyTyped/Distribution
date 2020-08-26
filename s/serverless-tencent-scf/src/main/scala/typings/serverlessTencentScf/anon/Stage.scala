package typings.serverlessTencentScf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stage extends js.Object {
  var stage: String = js.native
}

object Stage {
  @scala.inline
  def apply(stage: String): Stage = {
    val __obj = js.Dynamic.literal(stage = stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stage]
  }
  @scala.inline
  implicit class StageOps[Self <: Stage] (val x: Self) extends AnyVal {
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
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
  }
  
}

