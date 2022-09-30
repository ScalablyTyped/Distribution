package typings.screeps.anon

import typings.screeps.screepsInts.`1000`
import typings.screeps.screepsInts.`50`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNameCooldown extends StObject {
  
  var className: operator
  
  var cooldown: `50`
  
  var duration: `1000`
  
  var effect: js.Tuple5[
    typings.screeps.screepsInts.`2`, 
    typings.screeps.screepsInts.`4`, 
    typings.screeps.screepsInts.`6`, 
    typings.screeps.screepsInts.`8`, 
    typings.screeps.screepsInts.`10`
  ]
  
  var level: js.Tuple5[
    typings.screeps.screepsInts.`0`, 
    typings.screeps.screepsInts.`2`, 
    typings.screeps.screepsInts.`7`, 
    typings.screeps.screepsInts.`14`, 
    typings.screeps.screepsInts.`22`
  ]
  
  var ops: typings.screeps.screepsInts.`10`
  
  var range: typings.screeps.screepsInts.`3`
}
object ClassNameCooldown {
  
  inline def apply(
    effect: js.Tuple5[
      typings.screeps.screepsInts.`2`, 
      typings.screeps.screepsInts.`4`, 
      typings.screeps.screepsInts.`6`, 
      typings.screeps.screepsInts.`8`, 
      typings.screeps.screepsInts.`10`
    ],
    level: js.Tuple5[
      typings.screeps.screepsInts.`0`, 
      typings.screeps.screepsInts.`2`, 
      typings.screeps.screepsInts.`7`, 
      typings.screeps.screepsInts.`14`, 
      typings.screeps.screepsInts.`22`
    ]
  ): ClassNameCooldown = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 50, duration = 1000, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 10, range = 3)
    __obj.asInstanceOf[ClassNameCooldown]
  }
  
  extension [Self <: ClassNameCooldown](x: Self) {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: `50`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: `1000`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEffect(
      value: js.Tuple5[
          typings.screeps.screepsInts.`2`, 
          typings.screeps.screepsInts.`4`, 
          typings.screeps.screepsInts.`6`, 
          typings.screeps.screepsInts.`8`, 
          typings.screeps.screepsInts.`10`
        ]
    ): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setLevel(
      value: js.Tuple5[
          typings.screeps.screepsInts.`0`, 
          typings.screeps.screepsInts.`2`, 
          typings.screeps.screepsInts.`7`, 
          typings.screeps.screepsInts.`14`, 
          typings.screeps.screepsInts.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOps(value: typings.screeps.screepsInts.`10`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.screeps.screepsInts.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
