package typings.sequelize.anon

import typings.sequelize.mod.Model
import typings.sequelize.mod.TransactionLockLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level extends js.Object {
  
  var level: TransactionLockLevel = js.native
  
  var of: Model[_, _, _] = js.native
}
object Level {
  
  @scala.inline
  def apply(level: TransactionLockLevel, of: Model[_, _, _]): Level = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any])
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: TransactionLockLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOf(value: Model[_, _, _]): Self = this.set("of", value.asInstanceOf[js.Any])
  }
}
