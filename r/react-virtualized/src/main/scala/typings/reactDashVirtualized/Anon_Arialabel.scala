package typings.reactDashVirtualized

import typings.react.reactMod.Requireable
import typings.react.reactMod.Validator
import typings.reactDashVirtualized.distEsCollectionMod.CollectionCellGroupRenderer
import typings.reactDashVirtualized.distEsCollectionMod.CollectionCellRenderer
import typings.reactDashVirtualized.distEsCollectionMod.CollectionCellSizeAndPositionGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arialabel extends js.Object {
  var `aria-label`: Requireable[String]
  var cellCount: Validator[Double]
  var cellGroupRenderer: Validator[CollectionCellGroupRenderer]
  var cellRenderer: Validator[CollectionCellRenderer]
  var cellSizeAndPositionGetter: Validator[CollectionCellSizeAndPositionGetter]
  var sectionSize: Requireable[Double]
}

object Anon_Arialabel {
  @scala.inline
  def apply(
    `aria-label`: Requireable[String],
    cellCount: Validator[Double],
    cellGroupRenderer: Validator[CollectionCellGroupRenderer],
    cellRenderer: Validator[CollectionCellRenderer],
    cellSizeAndPositionGetter: Validator[CollectionCellSizeAndPositionGetter],
    sectionSize: Requireable[Double]
  ): Anon_Arialabel = {
    val __obj = js.Dynamic.literal(cellCount = cellCount, cellGroupRenderer = cellGroupRenderer, cellRenderer = cellRenderer, cellSizeAndPositionGetter = cellSizeAndPositionGetter, sectionSize = sectionSize)
    __obj.updateDynamic("aria-label")(`aria-label`)
    __obj.asInstanceOf[Anon_Arialabel]
  }
}

