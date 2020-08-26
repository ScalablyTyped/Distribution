package typings.screeps.anon

import typings.screeps.screepsNumbers.`1.5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Build extends js.Object {
  var build: `1.5` = js.native
  var repair: `1.5` = js.native
}

object Build {
  @scala.inline
  def apply(build: `1.5`, repair: `1.5`): Build = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], repair = repair.asInstanceOf[js.Any])
    __obj.asInstanceOf[Build]
  }
  @scala.inline
  implicit class BuildOps[Self <: Build] (val x: Self) extends AnyVal {
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
    def setBuild(value: `1.5`): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepair(value: `1.5`): Self = this.set("repair", value.asInstanceOf[js.Any])
  }
  
}

