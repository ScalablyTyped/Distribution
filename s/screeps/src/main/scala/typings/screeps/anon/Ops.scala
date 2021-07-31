package typings.screeps.anon

import typings.screeps.screepsNumbers.`1000000`
import typings.screeps.screepsNumbers.`1000`
import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsNumbers.`2000000`
import typings.screeps.screepsNumbers.`4000000`
import typings.screeps.screepsNumbers.`500000`
import typings.screeps.screepsNumbers.`7000000`
import typings.screeps.screepsNumbers.`800`
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
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ]
  
  var ops: `100`
  
  var range: typings.screeps.screepsNumbers.`3`
}
object Ops {
  
  @scala.inline
  def apply(
    effect: js.Tuple5[`500000`, `1000000`, `2000000`, `4000000`, `7000000`],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ]
  ): Ops = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 800, duration = 1000, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 100, range = 3)
    __obj.asInstanceOf[Ops]
  }
  
  @scala.inline
  implicit class OpsMutableBuilder[Self <: Ops] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: `800`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: `1000`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: js.Tuple5[`500000`, `1000000`, `2000000`, `4000000`, `7000000`]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
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
    def setOps(value: `100`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
