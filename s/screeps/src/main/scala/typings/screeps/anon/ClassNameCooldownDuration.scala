package typings.screeps.anon

import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNameCooldownDuration extends StObject {
  
  var className: operator
  
  var cooldown: typings.screeps.screepsNumbers.`5`
  
  var duration: js.Tuple5[
    typings.screeps.screepsNumbers.`1`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`3`, 
    typings.screeps.screepsNumbers.`4`, 
    typings.screeps.screepsNumbers.`5`
  ]
  
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ]
  
  var ops: typings.screeps.screepsNumbers.`5`
  
  var range: typings.screeps.screepsNumbers.`3`
}
object ClassNameCooldownDuration {
  
  inline def apply(
    duration: js.Tuple5[
      typings.screeps.screepsNumbers.`1`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`3`, 
      typings.screeps.screepsNumbers.`4`, 
      typings.screeps.screepsNumbers.`5`
    ],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ]
  ): ClassNameCooldownDuration = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 5, duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 5, range = 3)
    __obj.asInstanceOf[ClassNameCooldownDuration]
  }
  
  extension [Self <: ClassNameCooldownDuration](x: Self) {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: typings.screeps.screepsNumbers.`5`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`1`, 
          typings.screeps.screepsNumbers.`2`, 
          typings.screeps.screepsNumbers.`3`, 
          typings.screeps.screepsNumbers.`4`, 
          typings.screeps.screepsNumbers.`5`
        ]
    ): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLevel(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`0`, 
          typings.screeps.screepsNumbers.`2`, 
          typings.screeps.screepsNumbers.`7`, 
          typings.screeps.screepsNumbers.`14`, 
          typings.screeps.screepsNumbers.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOps(value: typings.screeps.screepsNumbers.`5`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
