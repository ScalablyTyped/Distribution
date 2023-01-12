package typings.screeps.anon

import typings.screeps.screepsInts.`1000000`
import typings.screeps.screepsInts.`1000`
import typings.screeps.screepsInts.`100`
import typings.screeps.screepsInts.`2000000`
import typings.screeps.screepsInts.`4000000`
import typings.screeps.screepsInts.`500000`
import typings.screeps.screepsInts.`7000000`
import typings.screeps.screepsInts.`800`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ops extends StObject {
  
  var className: operator
  
  var cooldown: `800`
  
  var duration: `1000`
  
  var effect: js.Tuple5[`500000`, `1000000`, `2000000`, `4000000`, `7000000`]
  
  var level: js.Tuple5[
    typings.screeps.screepsInts.`0`, 
    typings.screeps.screepsInts.`2`, 
    typings.screeps.screepsInts.`7`, 
    typings.screeps.screepsInts.`14`, 
    typings.screeps.screepsInts.`22`
  ]
  
  var ops: `100`
  
  var range: typings.screeps.screepsInts.`3`
}
object Ops {
  
  inline def apply(
    effect: js.Tuple5[`500000`, `1000000`, `2000000`, `4000000`, `7000000`],
    level: js.Tuple5[
      typings.screeps.screepsInts.`0`, 
      typings.screeps.screepsInts.`2`, 
      typings.screeps.screepsInts.`7`, 
      typings.screeps.screepsInts.`14`, 
      typings.screeps.screepsInts.`22`
    ]
  ): Ops = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 800, duration = 1000, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 100, range = 3)
    __obj.asInstanceOf[Ops]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ops] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: `800`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: `1000`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEffect(value: js.Tuple5[`500000`, `1000000`, `2000000`, `4000000`, `7000000`]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setLevel(
      value: js.Tuple5[
          typings.screeps.screepsInts.`0`, 
          typings.screeps.screepsInts.`2`, 
          typings.screeps.screepsInts.`7`, 
          typings.screeps.screepsInts.`14`, 
          typings.screeps.screepsInts.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setOps(value: `100`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.screeps.screepsInts.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
