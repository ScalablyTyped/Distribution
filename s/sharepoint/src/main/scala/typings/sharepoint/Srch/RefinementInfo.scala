package typings.sharepoint.Srch

import typings.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefinementInfo extends js.Object {
  
  var Culture: String = js.native
  
  var DisplayName: String = js.native
  
  var Entropy: Double = js.native
  
  var HitCount: Double = js.native
  
  var Max: Double = js.native
  
  var Mean: Double = js.native
  
  var Min: Double = js.native
  
  var Modifier: String = js.native
  
  var NonZeroCount: Double = js.native
  
  var PartitionId: Guid = js.native
  
  var Ratio: Double = js.native
  
  var RefinementCount: Double = js.native
  
  var RefinementName: String = js.native
  
  var RefinementToken: String = js.native
  
  var RefinementValue: String = js.native
  
  var RefinerName: String = js.native
  
  var RenderTemplateId: String = js.native
  
  var Score: Double = js.native
  
  var Sum: Double = js.native
  
  var Type: String = js.native
  
  var UniqueCount: Double = js.native
  
  var UrlZone: Double = js.native
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
  implicit class RefinementInfoOps[Self <: RefinementInfo] (val x: Self) extends AnyVal {
    
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
    def setCulture(value: String): Self = this.set("Culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntropy(value: Double): Self = this.set("Entropy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitCount(value: Double): Self = this.set("HitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = this.set("Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMean(value: Double): Self = this.set("Mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("Min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifier(value: String): Self = this.set("Modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonZeroCount(value: Double): Self = this.set("NonZeroCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionId(value: Guid): Self = this.set("PartitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatio(value: Double): Self = this.set("Ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementCount(value: Double): Self = this.set("RefinementCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementName(value: String): Self = this.set("RefinementName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementToken(value: String): Self = this.set("RefinementToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinementValue(value: String): Self = this.set("RefinementValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefinerName(value: String): Self = this.set("RefinerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderTemplateId(value: String): Self = this.set("RenderTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Double): Self = this.set("Score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSum(value: Double): Self = this.set("Sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueCount(value: Double): Self = this.set("UniqueCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlZone(value: Double): Self = this.set("UrlZone", value.asInstanceOf[js.Any])
  }
}
