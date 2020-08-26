package typings.riotGamesApi.RiotGamesAPI.ChampionMastery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChampionMasteryDto extends js.Object {
  var championId: Double = js.native
  var championLevel: Double = js.native
  var championPoints: Double = js.native
  var championPointsSinceLastLevel: Double = js.native
  var championPointsUntilNextLevel: Double = js.native
  var chestGranted: Boolean = js.native
  var highestGrade: String = js.native
  var lastPlayTime: Double = js.native
  var playerId: Double = js.native
}

object ChampionMasteryDto {
  @scala.inline
  def apply(
    championId: Double,
    championLevel: Double,
    championPoints: Double,
    championPointsSinceLastLevel: Double,
    championPointsUntilNextLevel: Double,
    chestGranted: Boolean,
    highestGrade: String,
    lastPlayTime: Double,
    playerId: Double
  ): ChampionMasteryDto = {
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], championLevel = championLevel.asInstanceOf[js.Any], championPoints = championPoints.asInstanceOf[js.Any], championPointsSinceLastLevel = championPointsSinceLastLevel.asInstanceOf[js.Any], championPointsUntilNextLevel = championPointsUntilNextLevel.asInstanceOf[js.Any], chestGranted = chestGranted.asInstanceOf[js.Any], highestGrade = highestGrade.asInstanceOf[js.Any], lastPlayTime = lastPlayTime.asInstanceOf[js.Any], playerId = playerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChampionMasteryDto]
  }
  @scala.inline
  implicit class ChampionMasteryDtoOps[Self <: ChampionMasteryDto] (val x: Self) extends AnyVal {
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
    def setChampionId(value: Double): Self = this.set("championId", value.asInstanceOf[js.Any])
    @scala.inline
    def setChampionLevel(value: Double): Self = this.set("championLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setChampionPoints(value: Double): Self = this.set("championPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setChampionPointsSinceLastLevel(value: Double): Self = this.set("championPointsSinceLastLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setChampionPointsUntilNextLevel(value: Double): Self = this.set("championPointsUntilNextLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setChestGranted(value: Boolean): Self = this.set("chestGranted", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighestGrade(value: String): Self = this.set("highestGrade", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastPlayTime(value: Double): Self = this.set("lastPlayTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayerId(value: Double): Self = this.set("playerId", value.asInstanceOf[js.Any])
  }
  
}

