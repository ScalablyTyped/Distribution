package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildRepair extends js.Object {
  
  var build: typings.screeps.screepsNumbers.`2` = js.native
  
  var repair: typings.screeps.screepsNumbers.`2` = js.native
}
object BuildRepair {
  
  @scala.inline
  def apply(build: typings.screeps.screepsNumbers.`2`, repair: typings.screeps.screepsNumbers.`2`): BuildRepair = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], repair = repair.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildRepair]
  }
  
  @scala.inline
  implicit class BuildRepairOps[Self <: BuildRepair] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: typings.screeps.screepsNumbers.`2`): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepair(value: typings.screeps.screepsNumbers.`2`): Self = this.set("repair", value.asInstanceOf[js.Any])
  }
}
