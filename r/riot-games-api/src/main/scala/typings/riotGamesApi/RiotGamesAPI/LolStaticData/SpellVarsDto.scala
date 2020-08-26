package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpellVarsDto extends js.Object {
  var coeff: js.Array[Double] = js.native
  var dyn: String = js.native
  var key: String = js.native
  var link: String = js.native
  var ranksWith: String = js.native
}

object SpellVarsDto {
  @scala.inline
  def apply(coeff: js.Array[Double], dyn: String, key: String, link: String, ranksWith: String): SpellVarsDto = {
    val __obj = js.Dynamic.literal(coeff = coeff.asInstanceOf[js.Any], dyn = dyn.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], ranksWith = ranksWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpellVarsDto]
  }
  @scala.inline
  implicit class SpellVarsDtoOps[Self <: SpellVarsDto] (val x: Self) extends AnyVal {
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
    def setCoeffVarargs(value: Double*): Self = this.set("coeff", js.Array(value :_*))
    @scala.inline
    def setCoeff(value: js.Array[Double]): Self = this.set("coeff", value.asInstanceOf[js.Any])
    @scala.inline
    def setDyn(value: String): Self = this.set("dyn", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setRanksWith(value: String): Self = this.set("ranksWith", value.asInstanceOf[js.Any])
  }
  
}

