package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object with survival game info
  */
@js.native
trait SurvivalGameInfo extends js.Object {
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
  implicit class SurvivalGameInfoOps[Self <: SurvivalGameInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeToWave(value: Double): Self = this.set("timeToWave", value.asInstanceOf[js.Any])
    @scala.inline
    def setWave(value: Double): Self = this.set("wave", value.asInstanceOf[js.Any])
  }
  
}

