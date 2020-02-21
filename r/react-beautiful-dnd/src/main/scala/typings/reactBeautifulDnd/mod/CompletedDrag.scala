package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletedDrag extends js.Object {
  var afterCritical: LiftEffect
  var critical: Critical
  var impact: DragImpact
  var result: DropResult
}

object CompletedDrag {
  @scala.inline
  def apply(afterCritical: LiftEffect, critical: Critical, impact: DragImpact, result: DropResult): CompletedDrag = {
    val __obj = js.Dynamic.literal(afterCritical = afterCritical.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], impact = impact.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompletedDrag]
  }
}

