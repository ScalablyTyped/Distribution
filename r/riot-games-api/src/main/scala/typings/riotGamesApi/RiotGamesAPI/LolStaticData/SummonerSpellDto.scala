package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummonerSpellDto extends js.Object {
  var cooldown: js.Array[Double] = js.native
  var cooldownBurn: String = js.native
  var cost: js.Array[Double] = js.native
  var costBurn: String = js.native
  var costType: String = js.native
  var description: String = js.native
  var effect: js.Array[js.Array[Double]] = js.native
  var effectBurn: js.Array[String] = js.native
  var id: Double = js.native
  var image: ImageDto = js.native
  var key: String = js.native
  var leveltip: LevelTipDto = js.native
  var maxrank: Double = js.native
  var modes: js.Array[String] = js.native
  var name: String = js.native
  var range: js.Array[Double] | String = js.native
  var rangeBurn: String = js.native
  var resource: String = js.native
  var sanitizedDescription: String = js.native
  var sanitizedTooltip: String = js.native
  var summonerLevel: Double = js.native
  var tooltip: String = js.native
  var vars: js.Array[SpellVarsDto] = js.native
}

object SummonerSpellDto {
  @scala.inline
  def apply(
    cooldown: js.Array[Double],
    cooldownBurn: String,
    cost: js.Array[Double],
    costBurn: String,
    costType: String,
    description: String,
    effect: js.Array[js.Array[Double]],
    effectBurn: js.Array[String],
    id: Double,
    image: ImageDto,
    key: String,
    leveltip: LevelTipDto,
    maxrank: Double,
    modes: js.Array[String],
    name: String,
    range: js.Array[Double] | String,
    rangeBurn: String,
    resource: String,
    sanitizedDescription: String,
    sanitizedTooltip: String,
    summonerLevel: Double,
    tooltip: String,
    vars: js.Array[SpellVarsDto]
  ): SummonerSpellDto = {
    val __obj = js.Dynamic.literal(cooldown = cooldown.asInstanceOf[js.Any], cooldownBurn = cooldownBurn.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], costBurn = costBurn.asInstanceOf[js.Any], costType = costType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], effectBurn = effectBurn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], leveltip = leveltip.asInstanceOf[js.Any], maxrank = maxrank.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangeBurn = rangeBurn.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any], sanitizedTooltip = sanitizedTooltip.asInstanceOf[js.Any], summonerLevel = summonerLevel.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummonerSpellDto]
  }
  @scala.inline
  implicit class SummonerSpellDtoOps[Self <: SummonerSpellDto] (val x: Self) extends AnyVal {
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
    def setCooldownVarargs(value: Double*): Self = this.set("cooldown", js.Array(value :_*))
    @scala.inline
    def setCooldown(value: js.Array[Double]): Self = this.set("cooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def setCooldownBurn(value: String): Self = this.set("cooldownBurn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCostVarargs(value: Double*): Self = this.set("cost", js.Array(value :_*))
    @scala.inline
    def setCost(value: js.Array[Double]): Self = this.set("cost", value.asInstanceOf[js.Any])
    @scala.inline
    def setCostBurn(value: String): Self = this.set("costBurn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCostType(value: String): Self = this.set("costType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectVarargs(value: js.Array[Double]*): Self = this.set("effect", js.Array(value :_*))
    @scala.inline
    def setEffect(value: js.Array[js.Array[Double]]): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffectBurnVarargs(value: String*): Self = this.set("effectBurn", js.Array(value :_*))
    @scala.inline
    def setEffectBurn(value: js.Array[String]): Self = this.set("effectBurn", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: ImageDto): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeveltip(value: LevelTipDto): Self = this.set("leveltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxrank(value: Double): Self = this.set("maxrank", value.asInstanceOf[js.Any])
    @scala.inline
    def setModesVarargs(value: String*): Self = this.set("modes", js.Array(value :_*))
    @scala.inline
    def setModes(value: js.Array[String]): Self = this.set("modes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangeVarargs(value: Double*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: js.Array[Double] | String): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangeBurn(value: String): Self = this.set("rangeBurn", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setSanitizedDescription(value: String): Self = this.set("sanitizedDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setSanitizedTooltip(value: String): Self = this.set("sanitizedTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummonerLevel(value: Double): Self = this.set("summonerLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setVarsVarargs(value: SpellVarsDto*): Self = this.set("vars", js.Array(value :_*))
    @scala.inline
    def setVars(value: js.Array[SpellVarsDto]): Self = this.set("vars", value.asInstanceOf[js.Any])
  }
  
}

