package typings.screeps.anon

import typings.screeps.screepsDoubles.`0.5`
import typings.screeps.screepsDoubles.`0.6`
import typings.screeps.screepsDoubles.`0.7`
import typings.screeps.screepsDoubles.`0.8`
import typings.screeps.screepsDoubles.`0.9`
import typings.screeps.screepsInts.`50`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectLevel extends StObject {
  
  var className: operator
  
  var cooldown: typings.screeps.screepsInts.`0`
  
  var duration: typings.screeps.screepsInts.`5`
  
  var effect: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`]
  
  var level: js.Tuple5[
    typings.screeps.screepsInts.`0`, 
    typings.screeps.screepsInts.`2`, 
    typings.screeps.screepsInts.`7`, 
    typings.screeps.screepsInts.`14`, 
    typings.screeps.screepsInts.`22`
  ]
  
  var ops: typings.screeps.screepsInts.`10`
  
  var range: `50`
}
object EffectLevel {
  
  inline def apply(
    effect: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`],
    level: js.Tuple5[
      typings.screeps.screepsInts.`0`, 
      typings.screeps.screepsInts.`2`, 
      typings.screeps.screepsInts.`7`, 
      typings.screeps.screepsInts.`14`, 
      typings.screeps.screepsInts.`22`
    ]
  ): EffectLevel = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 0, duration = 5, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 10, range = 50)
    __obj.asInstanceOf[EffectLevel]
  }
  
  extension [Self <: EffectLevel](x: Self) {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: typings.screeps.screepsInts.`0`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: typings.screeps.screepsInts.`5`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEffect(value: js.Tuple5[`0.9`, `0.8`, `0.7`, `0.6`, `0.5`]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
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
    
    inline def setRange(value: `50`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
