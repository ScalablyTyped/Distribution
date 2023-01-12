package typings.screeps.anon

import typings.screeps.screepsInts.`1000`
import typings.screeps.screepsInts.`200`
import typings.screeps.screepsInts.`400`
import typings.screeps.screepsInts.`600`
import typings.screeps.screepsInts.`800`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CooldownDuration extends StObject {
  
  var className: operator
  
  var cooldown: `400`
  
  var duration: js.Tuple5[`200`, `400`, `600`, `800`, `1000`]
  
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
object CooldownDuration {
  
  inline def apply(
    duration: js.Tuple5[`200`, `400`, `600`, `800`, `1000`],
    level: js.Tuple5[
      typings.screeps.screepsInts.`0`, 
      typings.screeps.screepsInts.`2`, 
      typings.screeps.screepsInts.`7`, 
      typings.screeps.screepsInts.`14`, 
      typings.screeps.screepsInts.`22`
    ]
  ): CooldownDuration = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 400, duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 10, range = 3)
    __obj.asInstanceOf[CooldownDuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CooldownDuration] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCooldown(value: `400`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: js.Tuple5[`200`, `400`, `600`, `800`, `1000`]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
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
