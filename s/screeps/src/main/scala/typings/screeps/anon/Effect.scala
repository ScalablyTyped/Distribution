package typings.screeps.anon

import typings.screeps.screepsNumbers.`50`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Effect extends StObject {
  
  var className: operator
  
  var cooldown: `50`
  
  var effect: js.Tuple5[
    typings.screeps.screepsNumbers.`1`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`4`, 
    typings.screeps.screepsNumbers.`6`, 
    typings.screeps.screepsNumbers.`8`
  ]
  
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`0`, 
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`7`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ]
}
object Effect {
  
  @scala.inline
  def apply(
    effect: js.Tuple5[
      typings.screeps.screepsNumbers.`1`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`4`, 
      typings.screeps.screepsNumbers.`6`, 
      typings.screeps.screepsNumbers.`8`
    ],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`0`, 
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`7`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ]
  ): Effect = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 50, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effect]
  }
  
  @scala.inline
  implicit class EffectMutableBuilder[Self <: Effect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: `50`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`1`, 
          typings.screeps.screepsNumbers.`2`, 
          typings.screeps.screepsNumbers.`4`, 
          typings.screeps.screepsNumbers.`6`, 
          typings.screeps.screepsNumbers.`8`
        ]
    ): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
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
  }
}
