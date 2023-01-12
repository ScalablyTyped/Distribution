package typings.screeps.anon

import typings.screeps.screepsDoubles.`0.2`
import typings.screeps.screepsDoubles.`0.4`
import typings.screeps.screepsDoubles.`0.6`
import typings.screeps.screepsDoubles.`0.8`
import typings.screeps.screepsDoubles.`1.0`
import typings.screeps.screepsInts.`50`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CooldownEffect extends StObject {
  
  var className: operator
  
  var cooldown: `50`
  
  var effect: js.Tuple5[`0.2`, `0.4`, `0.6`, `0.8`, `1.0`]
  
  var level: js.Tuple5[
    typings.screeps.screepsInts.`0`, 
    typings.screeps.screepsInts.`2`, 
    typings.screeps.screepsInts.`7`, 
    typings.screeps.screepsInts.`14`, 
    typings.screeps.screepsInts.`22`
  ]
  
  var ops: typings.screeps.screepsInts.`2`
  
  var range: typings.screeps.screepsInts.`3`
}
object CooldownEffect {
  
  inline def apply(
    effect: js.Tuple5[`0.2`, `0.4`, `0.6`, `0.8`, `1.0`],
    level: js.Tuple5[
      typings.screeps.screepsInts.`0`, 
      typings.screeps.screepsInts.`2`, 
      typings.screeps.screepsInts.`7`, 
      typings.screeps.screepsInts.`14`, 
      typings.screeps.screepsInts.`22`
    ]
  ): CooldownEffect = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 50, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 2, range = 3)
    __obj.asInstanceOf[CooldownEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CooldownEffect] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: `50`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setEffect(value: js.Tuple5[`0.2`, `0.4`, `0.6`, `0.8`, `1.0`]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setLevel(
      value: js.Tuple5[
          typings.screeps.screepsInts.`0`, 
          typings.screeps.screepsInts.`2`, 
          typings.screeps.screepsInts.`7`, 
          typings.screeps.screepsInts.`14`, 
          typings.screeps.screepsInts.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOps(value: typings.screeps.screepsInts.`2`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.screeps.screepsInts.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
