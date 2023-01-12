package typings.screeps.anon

import typings.screeps.screepsDoubles.`0.2`
import typings.screeps.screepsDoubles.`0.35`
import typings.screeps.screepsDoubles.`0.5`
import typings.screeps.screepsDoubles.`0.7`
import typings.screeps.screepsDoubles.`0.9`
import typings.screeps.screepsInts.`1000`
import typings.screeps.screepsInts.`100`
import typings.screeps.screepsInts.`300`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var className: operator
  
  var cooldown: `300`
  
  var duration: `1000`
  
  var effect: js.Tuple5[`0.9`, `0.7`, `0.5`, `0.35`, `0.2`]
  
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
object Duration {
  
  inline def apply(
    effect: js.Tuple5[`0.9`, `0.7`, `0.5`, `0.35`, `0.2`],
    level: js.Tuple5[
      typings.screeps.screepsInts.`0`, 
      typings.screeps.screepsInts.`2`, 
      typings.screeps.screepsInts.`7`, 
      typings.screeps.screepsInts.`14`, 
      typings.screeps.screepsInts.`22`
    ]
  ): Duration = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 300, duration = 1000, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 100, range = 3)
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: `300`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: `1000`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEffect(value: js.Tuple5[`0.9`, `0.7`, `0.5`, `0.35`, `0.2`]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
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
