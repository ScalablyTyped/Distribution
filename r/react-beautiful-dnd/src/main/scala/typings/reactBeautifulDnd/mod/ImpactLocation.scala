package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.COMBINE
import typings.reactBeautifulDnd.reactBeautifulDndStrings.REORDER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactBeautifulDnd.mod.ReorderImpact
  - typings.reactBeautifulDnd.mod.CombineImpact
*/
trait ImpactLocation extends js.Object

object ImpactLocation {
  @scala.inline
  def ReorderImpact(destination: DraggableLocation, `type`: REORDER): ImpactLocation = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImpactLocation]
  }
  @scala.inline
  def CombineImpact(combine: Combine, `type`: COMBINE, whenEntered: UserDirection): ImpactLocation = {
    val __obj = js.Dynamic.literal(combine = combine.asInstanceOf[js.Any], whenEntered = whenEntered.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImpactLocation]
  }
}

