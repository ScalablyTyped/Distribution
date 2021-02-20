package typings.sequelize.anon

import typings.sequelize.mod.Model
import typings.sequelize.mod.TransactionLockLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level extends StObject {
  
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
  implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: TransactionLockLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOf(value: Model[_, _, _]): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
  }
}
