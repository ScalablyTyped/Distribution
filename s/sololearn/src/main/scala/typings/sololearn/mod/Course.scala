package typings.sololearn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Course extends js.Object {
  
  /** The level the user is on for that course */
  var level: Double = js.native
  
  /** The status of the user for that course */
  var status: Status = js.native
  
  /** The amount of XP the user has in that course */
  var xp: Double = js.native
}
object Course {
  
  @scala.inline
  def apply(level: Double, xp: Double): Course = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Course]
  }
  
  @scala.inline
  implicit class CourseOps[Self <: Course] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXp(value: Double): Self = this.set("xp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
