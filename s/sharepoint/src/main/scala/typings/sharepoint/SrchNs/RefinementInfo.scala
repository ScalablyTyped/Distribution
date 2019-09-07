package typings.sharepoint.SrchNs

import typings.sharepoint.SPNs.Guid
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
    val __obj = js.Dynamic.literal(Culture = Culture, DisplayName = DisplayName, Entropy = Entropy, HitCount = HitCount, Max = Max, Mean = Mean, Min = Min, Modifier = Modifier, NonZeroCount = NonZeroCount, PartitionId = PartitionId, Ratio = Ratio, RefinementCount = RefinementCount, RefinementName = RefinementName, RefinementToken = RefinementToken, RefinementValue = RefinementValue, RefinerName = RefinerName, RenderTemplateId = RenderTemplateId, Score = Score, Sum = Sum, Type = Type, UniqueCount = UniqueCount, UrlZone = UrlZone)
  
    __obj.asInstanceOf[RefinementInfo]
  }
}

