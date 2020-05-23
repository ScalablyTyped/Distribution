package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.SemanticUI.Dimmer.DurationSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'duration'> */
trait PickImplduration extends js.Object {
  var duration: Double | DurationSettings
}

object PickImplduration {
  @scala.inline
  def apply(duration: Double | DurationSettings): PickImplduration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplduration]
  }
}

