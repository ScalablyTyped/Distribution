package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsDto extends js.Object {
  var armor: Double = js.native
  var armorperlevel: Double = js.native
  var attackdamage: Double = js.native
  var attackdamageperlevel: Double = js.native
  var attackrange: Double = js.native
  var attackspeedoffset: Double = js.native
  var attackspeedperlevel: Double = js.native
  var crit: Double = js.native
  var critperlevel: Double = js.native
  var hp: Double = js.native
  var hpperlevel: Double = js.native
  var hpregen: Double = js.native
  var hpregenperlevel: Double = js.native
  var movespeed: Double = js.native
  var mp: Double = js.native
  var mpperlevel: Double = js.native
  var mpregen: Double = js.native
  var mpregenperlevel: Double = js.native
  var spellblock: Double = js.native
  var spellblockperlevel: Double = js.native
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
  @scala.inline
  implicit class StatsDtoOps[Self <: StatsDto] (val x: Self) extends AnyVal {
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
    def setArmor(value: Double): Self = this.set("armor", value.asInstanceOf[js.Any])
    @scala.inline
    def setArmorperlevel(value: Double): Self = this.set("armorperlevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttackdamage(value: Double): Self = this.set("attackdamage", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttackdamageperlevel(value: Double): Self = this.set("attackdamageperlevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttackrange(value: Double): Self = this.set("attackrange", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttackspeedoffset(value: Double): Self = this.set("attackspeedoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttackspeedperlevel(value: Double): Self = this.set("attackspeedperlevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrit(value: Double): Self = this.set("crit", value.asInstanceOf[js.Any])
    @scala.inline
    def setCritperlevel(value: Double): Self = this.set("critperlevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setHp(value: Double): Self = this.set("hp", value.asInstanceOf[js.Any])
    @scala.inline
    def setHpperlevel(value: Double): Self = this.set("hpperlevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setHpregen(value: Double): Self = this.set("hpregen", value.asInstanceOf[js.Any])
    @scala.inline
    def setHpregenperlevel(value: Double): Self = this.set("hpregenperlevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMovespeed(value: Double): Self = this.set("movespeed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMp(value: Double): Self = this.set("mp", value.asInstanceOf[js.Any])
    @scala.inline
    def setMpperlevel(value: Double): Self = this.set("mpperlevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMpregen(value: Double): Self = this.set("mpregen", value.asInstanceOf[js.Any])
    @scala.inline
    def setMpregenperlevel(value: Double): Self = this.set("mpregenperlevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpellblock(value: Double): Self = this.set("spellblock", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpellblockperlevel(value: Double): Self = this.set("spellblockperlevel", value.asInstanceOf[js.Any])
  }
  
}

