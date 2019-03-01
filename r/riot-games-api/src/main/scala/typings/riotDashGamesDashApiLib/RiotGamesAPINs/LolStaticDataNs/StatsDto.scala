package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LolStaticDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsDto extends js.Object {
  var armor: scala.Double
  var armorperlevel: scala.Double
  var attackdamage: scala.Double
  var attackdamageperlevel: scala.Double
  var attackrange: scala.Double
  var attackspeedoffset: scala.Double
  var attackspeedperlevel: scala.Double
  var crit: scala.Double
  var critperlevel: scala.Double
  var hp: scala.Double
  var hpperlevel: scala.Double
  var hpregen: scala.Double
  var hpregenperlevel: scala.Double
  var movespeed: scala.Double
  var mp: scala.Double
  var mpperlevel: scala.Double
  var mpregen: scala.Double
  var mpregenperlevel: scala.Double
  var spellblock: scala.Double
  var spellblockperlevel: scala.Double
}

object StatsDto {
  @scala.inline
  def apply(
    armor: scala.Double,
    armorperlevel: scala.Double,
    attackdamage: scala.Double,
    attackdamageperlevel: scala.Double,
    attackrange: scala.Double,
    attackspeedoffset: scala.Double,
    attackspeedperlevel: scala.Double,
    crit: scala.Double,
    critperlevel: scala.Double,
    hp: scala.Double,
    hpperlevel: scala.Double,
    hpregen: scala.Double,
    hpregenperlevel: scala.Double,
    movespeed: scala.Double,
    mp: scala.Double,
    mpperlevel: scala.Double,
    mpregen: scala.Double,
    mpregenperlevel: scala.Double,
    spellblock: scala.Double,
    spellblockperlevel: scala.Double
  ): StatsDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("armor")(armor)
    __obj.updateDynamic("armorperlevel")(armorperlevel)
    __obj.updateDynamic("attackdamage")(attackdamage)
    __obj.updateDynamic("attackdamageperlevel")(attackdamageperlevel)
    __obj.updateDynamic("attackrange")(attackrange)
    __obj.updateDynamic("attackspeedoffset")(attackspeedoffset)
    __obj.updateDynamic("attackspeedperlevel")(attackspeedperlevel)
    __obj.updateDynamic("crit")(crit)
    __obj.updateDynamic("critperlevel")(critperlevel)
    __obj.updateDynamic("hp")(hp)
    __obj.updateDynamic("hpperlevel")(hpperlevel)
    __obj.updateDynamic("hpregen")(hpregen)
    __obj.updateDynamic("hpregenperlevel")(hpregenperlevel)
    __obj.updateDynamic("movespeed")(movespeed)
    __obj.updateDynamic("mp")(mp)
    __obj.updateDynamic("mpperlevel")(mpperlevel)
    __obj.updateDynamic("mpregen")(mpregen)
    __obj.updateDynamic("mpregenperlevel")(mpregenperlevel)
    __obj.updateDynamic("spellblock")(spellblock)
    __obj.updateDynamic("spellblockperlevel")(spellblockperlevel)
    __obj.asInstanceOf[StatsDto]
  }
}

