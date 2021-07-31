package typings.screeps.anon

import typings.screeps.screepsNumbers.`1.1`
import typings.screeps.screepsNumbers.`1.2`
import typings.screeps.screepsNumbers.`1.3`
import typings.screeps.screepsNumbers.`1.4`
import typings.screeps.screepsNumbers.`1.5`
import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Level extends StObject {
  
  var className: operator
  
  var cooldown: typings.screeps.screepsNumbers.`10`
  
  var duration: `100`
  
  var effect: js.Tuple5[`1.1`, `1.2`, `1.3`, `1.4`, `1.5`]
  
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ]
  
  var ops: typings.screeps.screepsNumbers.`10`
  
  var range: typings.screeps.screepsNumbers.`3`
}
object Level {
  
  @scala.inline
  def apply(
    effect: js.Tuple5[`1.1`, `1.2`, `1.3`, `1.4`, `1.5`],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ]
  ): Level = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 10, duration = 100, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 10, range = 3)
    __obj.asInstanceOf[Level]
  }
  
  @scala.inline
  implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: typings.screeps.screepsNumbers.`10`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: `100`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: js.Tuple5[`1.1`, `1.2`, `1.3`, `1.4`, `1.5`]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
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
    def setOps(value: typings.screeps.screepsNumbers.`10`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
