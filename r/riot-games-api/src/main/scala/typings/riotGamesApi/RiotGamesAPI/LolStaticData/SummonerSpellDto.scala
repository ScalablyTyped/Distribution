package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummonerSpellDto extends StObject {
  
  var cooldown: js.Array[Double]
  
  var cooldownBurn: String
  
  var cost: js.Array[Double]
  
  var costBurn: String
  
  var costType: String
  
  var description: String
  
  var effect: js.Array[js.Array[Double]]
  
  var effectBurn: js.Array[String]
  
  var id: Double
  
  var image: ImageDto
  
  var key: String
  
  var leveltip: LevelTipDto
  
  var maxrank: Double
  
  var modes: js.Array[String]
  
  var name: String
  
  var range: js.Array[Double] | String
  
  var rangeBurn: String
  
  var resource: String
  
  var sanitizedDescription: String
  
  var sanitizedTooltip: String
  
  var summonerLevel: Double
  
  var tooltip: String
  
  var vars: js.Array[SpellVarsDto]
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
  implicit class SummonerSpellDtoMutableBuilder[Self <: SummonerSpellDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCooldown(value: js.Array[Double]): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldownBurn(value: String): Self = StObject.set(x, "cooldownBurn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooldownVarargs(value: Double*): Self = StObject.set(x, "cooldown", js.Array(value :_*))
    
    @scala.inline
    def setCost(value: js.Array[Double]): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostBurn(value: String): Self = StObject.set(x, "costBurn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostType(value: String): Self = StObject.set(x, "costType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCostVarargs(value: Double*): Self = StObject.set(x, "cost", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffect(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectBurn(value: js.Array[String]): Self = StObject.set(x, "effectBurn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectBurnVarargs(value: String*): Self = StObject.set(x, "effectBurn", js.Array(value :_*))
    
    @scala.inline
    def setEffectVarargs(value: js.Array[Double]*): Self = StObject.set(x, "effect", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: ImageDto): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeveltip(value: LevelTipDto): Self = StObject.set(x, "leveltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxrank(value: Double): Self = StObject.set(x, "maxrank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModes(value: js.Array[String]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModesVarargs(value: String*): Self = StObject.set(x, "modes", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: js.Array[Double] | String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeBurn(value: String): Self = StObject.set(x, "rangeBurn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSanitizedDescription(value: String): Self = StObject.set(x, "sanitizedDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSanitizedTooltip(value: String): Self = StObject.set(x, "sanitizedTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummonerLevel(value: Double): Self = StObject.set(x, "summonerLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVars(value: js.Array[SpellVarsDto]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarsVarargs(value: SpellVarsDto*): Self = StObject.set(x, "vars", js.Array(value :_*))
  }
}
