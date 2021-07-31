package typings.screeps.anon

import typings.screeps.screepsNumbers.`0.2`
import typings.screeps.screepsNumbers.`0.4`
import typings.screeps.screepsNumbers.`0.6`
import typings.screeps.screepsNumbers.`0.8`
import typings.screeps.screepsNumbers.`1.0`
import typings.screeps.screepsNumbers.`50`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CooldownEffect extends StObject {
  
  var className: operator
  
  var cooldown: `50`
  
  var effect: js.Tuple5[`0.2`, `0.4`, `0.6`, `0.8`, `1.0`]
  
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ]
  
  var ops: typings.screeps.screepsNumbers.`2`
  
  var range: typings.screeps.screepsNumbers.`3`
}
object CooldownEffect {
  
  @scala.inline
  def apply(
    effect: js.Tuple5[`0.2`, `0.4`, `0.6`, `0.8`, `1.0`],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ]
  ): CooldownEffect = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 50, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 2, range = 3)
    __obj.asInstanceOf[CooldownEffect]
  }
  
  @scala.inline
  implicit class CooldownEffectMutableBuilder[Self <: CooldownEffect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: `50`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: js.Tuple5[`0.2`, `0.4`, `0.6`, `0.8`, `1.0`]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
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
    def setOps(value: typings.screeps.screepsNumbers.`2`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
