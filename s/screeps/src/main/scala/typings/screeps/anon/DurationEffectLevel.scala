package typings.screeps.anon

import typings.screeps.screepsNumbers.`1000`
import typings.screeps.screepsNumbers.`200`
import typings.screeps.screepsNumbers.`40`
import typings.screeps.screepsNumbers.`50`
import typings.screeps.screepsNumbers.`800`
import typings.screeps.screepsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationEffectLevel extends StObject {
  
  var className: operator
  
  var cooldown: `800`
  
  var duration: `1000`
  
  var effect: js.Tuple5[
    typings.screeps.screepsNumbers.`10`, 
    typings.screeps.screepsNumbers.`20`, 
    typings.screeps.screepsNumbers.`30`, 
    `40`, 
    `50`
  ]
  
  var level: js.Tuple5[
    typings.screeps.screepsNumbers.`20`, 
    typings.screeps.screepsNumbers.`21`, 
    typings.screeps.screepsNumbers.`22`, 
    typings.screeps.screepsNumbers.`23`, 
    typings.screeps.screepsNumbers.`24`
  ]
  
  var ops: `200`
  
  var range: typings.screeps.screepsNumbers.`3`
}
object DurationEffectLevel {
  
  @scala.inline
  def apply(
    effect: js.Tuple5[
      typings.screeps.screepsNumbers.`10`, 
      typings.screeps.screepsNumbers.`20`, 
      typings.screeps.screepsNumbers.`30`, 
      `40`, 
      `50`
    ],
    level: js.Tuple5[
      typings.screeps.screepsNumbers.`20`, 
      typings.screeps.screepsNumbers.`21`, 
      typings.screeps.screepsNumbers.`22`, 
      typings.screeps.screepsNumbers.`23`, 
      typings.screeps.screepsNumbers.`24`
    ]
  ): DurationEffectLevel = {
    val __obj = js.Dynamic.literal(className = "operator", cooldown = 800, duration = 1000, effect = effect.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], ops = 200, range = 3)
    __obj.asInstanceOf[DurationEffectLevel]
  }
  
  @scala.inline
  implicit class DurationEffectLevelMutableBuilder[Self <: DurationEffectLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: operator): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldown(value: `800`): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: `1000`): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`10`, 
          typings.screeps.screepsNumbers.`20`, 
          typings.screeps.screepsNumbers.`30`, 
          `40`, 
          `50`
        ]
    ): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(
      value: js.Tuple5[
          typings.screeps.screepsNumbers.`20`, 
          typings.screeps.screepsNumbers.`21`, 
          typings.screeps.screepsNumbers.`22`, 
          typings.screeps.screepsNumbers.`23`, 
          typings.screeps.screepsNumbers.`24`
        ]
    ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOps(value: `200`): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: typings.screeps.screepsNumbers.`3`): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
