package typings.reactVirtualized

import typings.react.mod.Requireable
import typings.react.mod.Validator
import typings.reactVirtualized.esCollectionMod.CollectionCellGroupRenderer
import typings.reactVirtualized.esCollectionMod.CollectionCellRenderer
import typings.reactVirtualized.esCollectionMod.CollectionCellSizeAndPositionGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArialabel extends js.Object {
  var `aria-label`: Requireable[String]
  var cellCount: Validator[Double]
  var cellGroupRenderer: Validator[CollectionCellGroupRenderer]
  var cellRenderer: Validator[CollectionCellRenderer]
  var cellSizeAndPositionGetter: Validator[CollectionCellSizeAndPositionGetter]
  var sectionSize: Requireable[Double]
}

object AnonArialabel {
  @scala.inline
  def apply(
    `aria-label`: Requireable[String],
    cellCount: Validator[Double],
    cellGroupRenderer: Validator[CollectionCellGroupRenderer],
    cellRenderer: Validator[CollectionCellRenderer],
    cellSizeAndPositionGetter: Validator[CollectionCellSizeAndPositionGetter],
    sectionSize: Requireable[Double]
  ): AnonArialabel = {
    val __obj = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], cellGroupRenderer = cellGroupRenderer.asInstanceOf[js.Any], cellRenderer = cellRenderer.asInstanceOf[js.Any], cellSizeAndPositionGetter = cellSizeAndPositionGetter.asInstanceOf[js.Any], sectionSize = sectionSize.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArialabel]
  }
}

