package typings.riotDashGamesDashApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsDto extends js.Object {
  var armor: Double
  var armorperlevel: Double
  var attackdamage: Double
  var attackdamageperlevel: Double
  var attackrange: Double
  var attackspeedoffset: Double
  var attackspeedperlevel: Double
  var crit: Double
  var critperlevel: Double
  var hp: Double
  var hpperlevel: Double
  var hpregen: Double
  var hpregenperlevel: Double
  var movespeed: Double
  var mp: Double
  var mpperlevel: Double
  var mpregen: Double
  var mpregenperlevel: Double
  var spellblock: Double
  var spellblockperlevel: Double
}

object StatsDto {
  @scala.inline
  def apply(
    armor: Double,
    armorperlevel: Double,
    attackdamage: Double,
    attackdamageperlevel: Double,
    attackrange: Double,
    attackspeedoffset: Double,
    attackspeedperlevel: Double,
    crit: Double,
    critperlevel: Double,
    hp: Double,
    hpperlevel: Double,
    hpregen: Double,
    hpregenperlevel: Double,
    movespeed: Double,
    mp: Double,
    mpperlevel: Double,
    mpregen: Double,
    mpregenperlevel: Double,
    spellblock: Double,
    spellblockperlevel: Double
  ): StatsDto = {
    val __obj = js.Dynamic.literal(armor = armor, armorperlevel = armorperlevel, attackdamage = attackdamage, attackdamageperlevel = attackdamageperlevel, attackrange = attackrange, attackspeedoffset = attackspeedoffset, attackspeedperlevel = attackspeedperlevel, crit = crit, critperlevel = critperlevel, hp = hp, hpperlevel = hpperlevel, hpregen = hpregen, hpregenperlevel = hpregenperlevel, movespeed = movespeed, mp = mp, mpperlevel = mpperlevel, mpregen = mpregen, mpregenperlevel = mpregenperlevel, spellblock = spellblock, spellblockperlevel = spellblockperlevel)
  
    __obj.asInstanceOf[StatsDto]
  }
}

