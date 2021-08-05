package typings.screeps.anon

import typings.screeps.screepsNumbers.`1000`
import typings.screeps.screepsNumbers.`200`
import typings.screeps.screepsNumbers.`800`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CooldownDurationEffect extends StObject {
  
  var className: operator
  
  var cooldown: `800`
  
  var duration: `1000`
  
  var effect: js.Tuple5[
    typings.screeps.screepsNumbers.`1`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`3`, 
    typings.screeps.screepsNumbers.`4`, 
    typings.screeps.screepsNumbers.`5`
  ]
  
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`10`, 
    typings.screeps.screepsNumbers.`11`, 
    typings.screeps.screepsNumbers.`12`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ]
  
  var ops: `200`
  
  var range: typings.screeps.screepsNumbers.`3`
}
object CooldownDurationEffect {
  
  inline def apply(
    effect: js.Tuple5[
      typings.screeps.screepsNumbers.`1`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`3`, 
      typings.screeps.screepsNumbers.`4`, 
      typings.screeps.screepsNumbers.`5`
    ],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`10`, 
      typings.screeps.screepsNumbers.`11`, 
      typings.screeps.screepsNumbers.`12`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ]
  ): CooldownDurationEffect = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 800, duration = 1000, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 200, range = 3)
    __obj.asInstanceOf[CooldownDurationEffect]
  }
  
  extension [Self <: CooldownDurationEffect](x: Self) {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: `800`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: `1000`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEffect(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`1`, 
          typings.screeps.screepsNumbers.`2`, 
          typings.screeps.screepsNumbers.`3`, 
          typings.screeps.screepsNumbers.`4`, 
          typings.screeps.screepsNumbers.`5`
        ]
    ): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setLevel(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`10`, 
          typings.screeps.screepsNumbers.`11`, 
          typings.screeps.screepsNumbers.`12`, 
          typings.screeps.screepsNumbers.`14`, 
          typings.screeps.screepsNumbers.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOps(value: `200`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
