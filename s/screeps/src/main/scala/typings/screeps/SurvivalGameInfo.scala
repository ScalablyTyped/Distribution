package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object with survival game info
  */
@js.native
trait SurvivalGameInfo extends StObject {
  
  /**
    * Current score.
    */
  var score: Double = js.native
  
  /**
    * Time to the next wave of invaders.
    */
  var timeToWave: Double = js.native
  
  /**
    * The number of the next wave.
    */
  var wave: Double = js.native
}
object SurvivalGameInfo {
  
  @scala.inline
  def apply(score: Double, timeToWave: Double, wave: Double): SurvivalGameInfo = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], timeToWave = timeToWave.asInstanceOf[js.Any], wave = wave.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurvivalGameInfo]
  }
  
  @scala.inline
  implicit class SurvivalGameInfoMutableBuilder[Self <: SurvivalGameInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToWave(value: Double): Self = StObject.set(x, "timeToWave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWave(value: Double): Self = StObject.set(x, "wave", value.asInstanceOf[js.Any])
  }
}
