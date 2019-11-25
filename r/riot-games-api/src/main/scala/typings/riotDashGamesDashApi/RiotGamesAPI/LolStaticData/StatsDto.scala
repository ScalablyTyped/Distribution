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
    val __obj = js.Dynamic.literal(armor = armor.asInstanceOf[js.Any], armorperlevel = armorperlevel.asInstanceOf[js.Any], attackdamage = attackdamage.asInstanceOf[js.Any], attackdamageperlevel = attackdamageperlevel.asInstanceOf[js.Any], attackrange = attackrange.asInstanceOf[js.Any], attackspeedoffset = attackspeedoffset.asInstanceOf[js.Any], attackspeedperlevel = attackspeedperlevel.asInstanceOf[js.Any], crit = crit.asInstanceOf[js.Any], critperlevel = critperlevel.asInstanceOf[js.Any], hp = hp.asInstanceOf[js.Any], hpperlevel = hpperlevel.asInstanceOf[js.Any], hpregen = hpregen.asInstanceOf[js.Any], hpregenperlevel = hpregenperlevel.asInstanceOf[js.Any], movespeed = movespeed.asInstanceOf[js.Any], mp = mp.asInstanceOf[js.Any], mpperlevel = mpperlevel.asInstanceOf[js.Any], mpregen = mpregen.asInstanceOf[js.Any], mpregenperlevel = mpregenperlevel.asInstanceOf[js.Any], spellblock = spellblock.asInstanceOf[js.Any], spellblockperlevel = spellblockperlevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatsDto]
  }
}

