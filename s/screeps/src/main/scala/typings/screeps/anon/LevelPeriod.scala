package typings.screeps.anon

import typings.screeps.screepsNumbers.`100`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelPeriod extends StObject {
  
  var className: operator
  
  var cooldown: `100`
  
  var duration: `100`
  
  var effect: js.Tuple5[
    typings.screeps.screepsNumbers.`2`, 
    typings.screeps.screepsNumbers.`4`, 
    typings.screeps.screepsNumbers.`6`, 
    typings.screeps.screepsNumbers.`8`, 
    typings.screeps.screepsNumbers.`10`
  ]
  
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`10`, 
    typings.screeps.screepsNumbers.`11`, 
    typings.screeps.screepsNumbers.`12`, 
    typings.screeps.screepsNumbers.`14`, 
    typings.screeps.screepsNumbers.`22`
  ]
  
  var period: typings.screeps.screepsNumbers.`10`
  
  var range: typings.screeps.screepsNumbers.`3`
}
object LevelPeriod {
  
  @scala.inline
  def apply(
    effect: js.Tuple5[
      typings.screeps.screepsNumbers.`2`, 
      typings.screeps.screepsNumbers.`4`, 
      typings.screeps.screepsNumbers.`6`, 
      typings.screeps.screepsNumbers.`8`, 
      typings.screeps.screepsNumbers.`10`
    ],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`10`, 
      typings.screeps.screepsNumbers.`11`, 
      typings.screeps.screepsNumbers.`12`, 
      typings.screeps.screepsNumbers.`14`, 
      typings.screeps.screepsNumbers.`22`
    ]
  ): LevelPeriod = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 100, duration = 100, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], period = 10, range = 3)
    __obj.asInstanceOf[LevelPeriod]
  }
  
  @scala.inline
  implicit class LevelPeriodMutableBuilder[Self <: LevelPeriod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: `100`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: `100`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`2`, 
          typings.screeps.screepsNumbers.`4`, 
          typings.screeps.screepsNumbers.`6`, 
          typings.screeps.screepsNumbers.`8`, 
          typings.screeps.screepsNumbers.`10`
        ]
    ): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`10`, 
          typings.screeps.screepsNumbers.`11`, 
          typings.screeps.screepsNumbers.`12`, 
          typings.screeps.screepsNumbers.`14`, 
          typings.screeps.screepsNumbers.`22`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: typings.screeps.screepsNumbers.`10`): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
