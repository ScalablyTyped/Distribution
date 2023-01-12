package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object with survival game info
  */
trait SurvivalGameInfo extends StObject {
  
  /**
    * Current score.
    */
  var score: Double
  
  /**
    * Time to the next wave of invaders.
    */
  var timeToWave: Double
  
  /**
    * The number of the next wave.
    */
  var wave: Double
}
object SurvivalGameInfo {
  
  inline def apply(score: Double, timeToWave: Double, wave: Double): SurvivalGameInfo = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], timeToWave = timeToWave.asInstanceOf[js.Any], wave = wave.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurvivalGameInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SurvivalGameInfo] (val x: Self) extends AnyVal {
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setTimeToWave(value: Double): Self = StObject.set(x, "timeToWave", value.asInstanceOf[js.Any])
    
    inline def setWave(value: Double): Self = StObject.set(x, "wave", value.asInstanceOf[js.Any])
  }
}
