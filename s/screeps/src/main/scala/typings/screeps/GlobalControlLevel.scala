package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalControlLevel extends StObject {
  
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
object GlobalControlLevel {
  
  @scala.inline
  def apply(level: Double, progress: Double, progressTotal: Double): GlobalControlLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], progressTotal = progressTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalControlLevel]
  }
  
  @scala.inline
  implicit class GlobalControlLevelMutableBuilder[Self <: GlobalControlLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressTotal(value: Double): Self = StObject.set(x, "progressTotal", value.asInstanceOf[js.Any])
  }
}
