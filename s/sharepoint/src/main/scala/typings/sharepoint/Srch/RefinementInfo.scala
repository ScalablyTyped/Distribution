package typings.sharepoint.Srch

import typings.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefinementInfo extends js.Object {
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
}

