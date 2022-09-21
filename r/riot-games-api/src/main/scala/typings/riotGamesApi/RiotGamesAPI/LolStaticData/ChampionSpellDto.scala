package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChampionSpellDto extends StObject {
  
  var altimages: js.Array[ImageDto]
  
  var cooldown: js.Array[Double]
  
  var cooldownBurn: String
  
  var cost: js.Array[Double]
  
  var costBurn: String
  
  var costType: String
  
  var description: String
  
  var effect: js.Array[js.Array[Double]]
  
  var effectBurn: js.Array[String]
  
  var image: ImageDto
  
  var key: String
  
  var leveltip: LevelTipDto
  
  var maxrank: Double
  
  var name: String
  
  var range: js.Array[Double] | String
  
  var rangeBurn: String
  
  var resource: String
  
  var sanitizedDescription: String
  
  var sanitizedTooltip: String
  
  var tooltip: String
  
  var vars: js.Array[SpellVarsDto]
}
object ChampionSpellDto {
  
  inline def apply(
    altimages: js.Array[ImageDto],
    cooldown: js.Array[Double],
    cooldownBurn: String,
    cost: js.Array[Double],
    costBurn: String,
    costType: String,
    description: String,
    effect: js.Array[js.Array[Double]],
    effectBurn: js.Array[String],
    image: ImageDto,
    key: String,
    leveltip: LevelTipDto,
    maxrank: Double,
    name: String,
    range: js.Array[Double] | String,
    rangeBurn: String,
    resource: String,
    sanitizedDescription: String,
    sanitizedTooltip: String,
    tooltip: String,
    vars: js.Array[SpellVarsDto]
  ): ChampionSpellDto = {
    val __obj = js.Dynamic.literal(altimages = altimages.asInstanceOf[js.Any], cooldown = cooldown.asInstanceOf[js.Any], cooldownBurn = cooldownBurn.asInstanceOf[js.Any], cost = cost.asInstanceOf[js.Any], costBurn = costBurn.asInstanceOf[js.Any], costType = costType.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], effectBurn = effectBurn.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], leveltip = leveltip.asInstanceOf[js.Any], maxrank = maxrank.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangeBurn = rangeBurn.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any], sanitizedTooltip = sanitizedTooltip.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChampionSpellDto]
  }
  
  extension [Self <: ChampionSpellDto](x: Self) {
    
    inline def setAltimages(value: js.Array[ImageDto]): Self = StObject.set(x, "altimages", value.asInstanceOf[js.Any])
    
    inline def setAltimagesVarargs(value: ImageDto*): Self = StObject.set(x, "altimages", js.Array(value*))
    
    inline def setCooldown(value: js.Array[Double]): Self = StObject.set(x, "cooldown", value.asInstanceOf[js.Any])
    
    inline def setCooldownBurn(value: String): Self = StObject.set(x, "cooldownBurn", value.asInstanceOf[js.Any])
    
    inline def setCooldownVarargs(value: Double*): Self = StObject.set(x, "cooldown", js.Array(value*))
    
    inline def setCost(value: js.Array[Double]): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostBurn(value: String): Self = StObject.set(x, "costBurn", value.asInstanceOf[js.Any])
    
    inline def setCostType(value: String): Self = StObject.set(x, "costType", value.asInstanceOf[js.Any])
    
    inline def setCostVarargs(value: Double*): Self = StObject.set(x, "cost", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEffect(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectBurn(value: js.Array[String]): Self = StObject.set(x, "effectBurn", value.asInstanceOf[js.Any])
    
    inline def setEffectBurnVarargs(value: String*): Self = StObject.set(x, "effectBurn", js.Array(value*))
    
    inline def setEffectVarargs(value: js.Array[Double]*): Self = StObject.set(x, "effect", js.Array(value*))
    
    inline def setImage(value: ImageDto): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLeveltip(value: LevelTipDto): Self = StObject.set(x, "leveltip", value.asInstanceOf[js.Any])
    
    inline def setMaxrank(value: Double): Self = StObject.set(x, "maxrank", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRange(value: js.Array[Double] | String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeBurn(value: String): Self = StObject.set(x, "rangeBurn", value.asInstanceOf[js.Any])
    
    inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setSanitizedDescription(value: String): Self = StObject.set(x, "sanitizedDescription", value.asInstanceOf[js.Any])
    
    inline def setSanitizedTooltip(value: String): Self = StObject.set(x, "sanitizedTooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setVars(value: js.Array[SpellVarsDto]): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    
    inline def setVarsVarargs(value: SpellVarsDto*): Self = StObject.set(x, "vars", js.Array(value*))
  }
}
