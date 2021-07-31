package typings.screeps.anon

import typings.screeps.screepsNumbers.`1000`
import typings.screeps.screepsNumbers.`200`
import typings.screeps.screepsNumbers.`400`
import typings.screeps.screepsNumbers.`600`
import typings.screeps.screepsNumbers.`800`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CooldownDuration extends StObject {
  
  var className: operator
  
  var cooldown: `400`
  
  var duration: js.Tuple5[`200`, `400`, `600`, `800`, `1000`]
  
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ]
  
  var ops: typings.screeps.screepsNumbers.`10`
  
  var range: typings.screeps.screepsNumbers.`3`
}
object CooldownDuration {
  
  @scala.inline
  def apply(
    duration: js.Tuple5[`200`, `400`, `600`, `800`, `1000`],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ]
  ): CooldownDuration = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 400, duration = duration.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 10, range = 3)
    __obj.asInstanceOf[CooldownDuration]
  }
  
  @scala.inline
  implicit class CooldownDurationMutableBuilder[Self <: CooldownDuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: `400`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: js.Tuple5[`200`, `400`, `600`, `800`, `1000`]): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`0`, 
          typings.screeps.screepsNumbers.`2`, 
          typings.screeps.screepsNumbers.`7`, 
          typings.screeps.screepsNumbers.`14`, 
          typings.screeps.screepsNumbers.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOps(value: typings.screeps.screepsNumbers.`10`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
