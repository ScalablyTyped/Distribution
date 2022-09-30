package typings.screeps.anon

import typings.screeps.screepsInts.`10000`
import typings.screeps.screepsInts.`100`
import typings.screeps.screepsInts.`15000`
import typings.screeps.screepsInts.`20000`
import typings.screeps.screepsInts.`25000`
import typings.screeps.screepsInts.`5000`
import typings.screeps.screepsInts.`50`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Energy extends StObject {
  
  var className: operator
  
  var cooldown: typings.screeps.screepsInts.`20`
  
  var duration: `50`
  
  var effect: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`]
  
  var energy: `100`
  
  var level: js.Tuple5[
    typings.screeps.screepsInts.`0`, 
    typings.screeps.screepsInts.`2`, 
    typings.screeps.screepsInts.`7`, 
    typings.screeps.screepsInts.`14`, 
    typings.screeps.screepsInts.`22`
  ]
}
object Energy {
  
  inline def apply(
    effect: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`],
    level: js.Tuple5[
      typings.screeps.screepsInts.`0`, 
      typings.screeps.screepsInts.`2`, 
      typings.screeps.screepsInts.`7`, 
      typings.screeps.screepsInts.`14`, 
      typings.screeps.screepsInts.`22`
    ]
  ): Energy = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 20, duration = 50, effect = effect.asInstanceOf[js.Any], energy = 100, level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Energy]
  }
  
  extension [Self <: Energy](x: Self) {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: typings.screeps.screepsInts.`20`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: `50`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEffect(value: js.Tuple5[`5000`, `10000`, `15000`, `20000`, `25000`]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEnergy(value: `100`): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
    
    inline def setLevel(
      value: js.Tuple5[
          typings.screeps.screepsInts.`0`, 
          typings.screeps.screepsInts.`2`, 
          typings.screeps.screepsInts.`7`, 
          typings.screeps.screepsInts.`14`, 
          typings.screeps.screepsInts.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
