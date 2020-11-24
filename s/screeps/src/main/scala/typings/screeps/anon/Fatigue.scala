package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fatigue extends js.Object {
  
  var fatigue: typings.screeps.screepsNumbers.`2` = js.native
}
object Fatigue {
  
  @scala.inline
  def apply(fatigue: typings.screeps.screepsNumbers.`2`): Fatigue = {
    val __obj = js.Dynamic.literal(fatigue = fatigue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fatigue]
  }
  
  @scala.inline
  implicit class FatigueOps[Self <: Fatigue] (val x: Self) extends AnyVal {
    
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
    def setFatigue(value: typings.screeps.screepsNumbers.`2`): Self = this.set("fatigue", value.asInstanceOf[js.Any])
  }
}
