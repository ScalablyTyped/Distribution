package typings.screeps.anon

import typings.screeps.screepsNumbers.`1000`
import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CooldownDurationLevel extends StObject {
  
  var className: operator
  
  var cooldown: `1000`
  
  var duration: `1000`
  
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
object CooldownDurationLevel {
  
  inline def apply(
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ]
  ): CooldownDurationLevel = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 1000, duration = 1000, level = level.asInstanceOf[js.Any], ops = 100, range = 3)
    __obj.asInstanceOf[CooldownDurationLevel]
  }
  
  extension [Self <: CooldownDurationLevel](x: Self) {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: `1000`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: `1000`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLevel(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`0`, 
          typings.screeps.screepsNumbers.`2`, 
          typings.screeps.screepsNumbers.`7`, 
          typings.screeps.screepsNumbers.`14`, 
          typings.screeps.screepsNumbers.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOps(value: `100`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
