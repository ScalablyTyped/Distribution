package typings.screeps.anon

import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsNumbers.`200`
import typings.screeps.screepsNumbers.`300`
import typings.screeps.screepsNumbers.`400`
import typings.screeps.screepsNumbers.`500`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelOps extends StObject {
  
  var className: operator
  
  var cooldown: `100`
  
  var duration: js.Tuple5[`100`, `200`, `300`, `400`, `500`]
  
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ]
  
  var ops: `100`
  
  var range: typings.screeps.screepsNumbers.`3`
}
object LevelOps {
  
  @scala.inline
  def apply(
    duration: js.Tuple5[`100`, `200`, `300`, `400`, `500`],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ]
  ): LevelOps = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 100, duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 100, range = 3)
    __obj.asInstanceOf[LevelOps]
  }
  
  @scala.inline
  implicit class LevelOpsMutableBuilder[Self <: LevelOps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: `100`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: js.Tuple5[`100`, `200`, `300`, `400`, `500`]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`0`, 
          typings.screeps.screepsNumbers.`2`, 
          typings.screeps.screepsNumbers.`7`, 
          typings.screeps.screepsNumbers.`14`, 
          typings.screeps.screepsNumbers.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOps(value: `100`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
