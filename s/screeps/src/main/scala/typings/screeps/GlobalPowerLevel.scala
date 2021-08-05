package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalPowerLevel extends StObject {
  
  /**
    * The current level.
    */
  var level: Double
  
  /**
    * The current progress to the next level.
    */
  var progress: Double
  
  /**
    * The progress required to reach the next level.
    */
  var progressTotal: Double
}
object GlobalPowerLevel {
  
  inline def apply(level: Double, progress: Double, progressTotal: Double): GlobalPowerLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], progressTotal = progressTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalPowerLevel]
  }
  
  extension [Self <: GlobalPowerLevel](x: Self) {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressTotal(value: Double): Self = StObject.set(x, "progressTotal", value.asInstanceOf[js.Any])
  }
}
