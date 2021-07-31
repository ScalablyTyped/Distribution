package typings.sharepoint.Srch

import typings.sharepoint.SP.Guid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefinementInfo extends StObject {
  
  var Culture: String
  
  var DisplayName: String
  
  var Entropy: Double
  
  var HitCount: Double
  
  var Max: Double
  
  var Mean: Double
  
  var Min: Double
  
  var Modifier: String
  
  var NonZeroCount: Double
  
  var PartitionId: Guid
  
  var Ratio: Double
  
  var RefinementCount: Double
  
  var RefinementName: String
  
  var RefinementToken: String
  
  var RefinementValue: String
  
  var RefinerName: String
  
  var RenderTemplateId: String
  
  var Score: Double
  
  var Sum: Double
  
  var Type: String
  
  var UniqueCount: Double
  
  var UrlZone: Double
}
object RefinementInfo {
  
  @scala.inline
  def apply(
    Culture: String,
    DisplayName: String,
    Entropy: Double,
    HitCount: Double,
    Max: Double,
    Mean: Double,
    Min: Double,
    Modifier: String,
    NonZeroCount: Double,
    PartitionId: Guid,
    Ratio: Double,
    RefinementCount: Double,
    RefinementName: String,
    RefinementToken: String,
    RefinementValue: String,
    RefinerName: String,
    RenderTemplateId: String,
    Score: Double,
    Sum: Double,
    Type: String,
    UniqueCount: Double,
    UrlZone: Double
  ): RefinementInfo = {
    val __obj = js.Dynamic.literal(Culture = Culture.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Entropy = Entropy.asInstanceOf[js.Any], HitCount = HitCount.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Mean = Mean.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], Modifier = Modifier.asInstanceOf[js.Any], NonZeroCount = NonZeroCount.asInstanceOf[js.Any], PartitionId = PartitionId.asInstanceOf[js.Any], Ratio = Ratio.asInstanceOf[js.Any], RefinementCount = RefinementCount.asInstanceOf[js.Any], RefinementName = RefinementName.asInstanceOf[js.Any], RefinementToken = RefinementToken.asInstanceOf[js.Any], RefinementValue = RefinementValue.asInstanceOf[js.Any], RefinerName = RefinerName.asInstanceOf[js.Any], RenderTemplateId = RenderTemplateId.asInstanceOf[js.Any], Score = Score.asInstanceOf[js.Any], Sum = Sum.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UniqueCount = UniqueCount.asInstanceOf[js.Any], UrlZone = UrlZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinementInfo]
  }
  
  @scala.inline
  implicit class RefinementInfoMutableBuilder[Self <: RefinementInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCulture(value: String): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntropy(value: Double): Self = StObject.set(x, "Entropy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitCount(value: Double): Self = StObject.set(x, "HitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMean(value: Double): Self = StObject.set(x, "Mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "Modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonZeroCount(value: Double): Self = StObject.set(x, "NonZeroCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionId(value: Guid): Self = StObject.set(x, "PartitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "Ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementCount(value: Double): Self = StObject.set(x, "RefinementCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementName(value: String): Self = StObject.set(x, "RefinementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementToken(value: String): Self = StObject.set(x, "RefinementToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementValue(value: String): Self = StObject.set(x, "RefinementValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinerName(value: String): Self = StObject.set(x, "RefinerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderTemplateId(value: String): Self = StObject.set(x, "RenderTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSum(value: Double): Self = StObject.set(x, "Sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueCount(value: Double): Self = StObject.set(x, "UniqueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlZone(value: Double): Self = StObject.set(x, "UrlZone", value.asInstanceOf[js.Any])
  }
}
