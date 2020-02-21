package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragImpact extends js.Object {
  var at: js.UndefOr[ImpactLocation] = js.undefined
  var displaced: DisplacementGroups
  var displacedBy: DisplacedBy
}

object DragImpact {
  @scala.inline
  def apply(displaced: DisplacementGroups, displacedBy: DisplacedBy, at: ImpactLocation = null): DragImpact = {
    val __obj = js.Dynamic.literal(displaced = displaced.asInstanceOf[js.Any], displacedBy = displacedBy.asInstanceOf[js.Any])
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragImpact]
  }
}

