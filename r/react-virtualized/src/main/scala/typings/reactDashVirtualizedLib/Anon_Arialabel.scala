package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arialabel extends js.Object {
  var `aria-label`: reactLib.reactMod.Requireable[java.lang.String]
  var cellCount: reactLib.reactMod.Validator[scala.Double]
  var cellGroupRenderer: reactLib.reactMod.Validator[reactDashVirtualizedLib.distEsCollectionMod.CollectionCellGroupRenderer]
  var cellRenderer: reactLib.reactMod.Validator[reactDashVirtualizedLib.distEsCollectionMod.CollectionCellRenderer]
  var cellSizeAndPositionGetter: reactLib.reactMod.Validator[reactDashVirtualizedLib.distEsCollectionMod.CollectionCellSizeAndPositionGetter]
  var sectionSize: reactLib.reactMod.Requireable[scala.Double]
}

object Anon_Arialabel {
  @scala.inline
  def apply(
    `aria-label`: reactLib.reactMod.Requireable[java.lang.String],
    cellCount: reactLib.reactMod.Validator[scala.Double],
    cellGroupRenderer: reactLib.reactMod.Validator[reactDashVirtualizedLib.distEsCollectionMod.CollectionCellGroupRenderer],
    cellRenderer: reactLib.reactMod.Validator[reactDashVirtualizedLib.distEsCollectionMod.CollectionCellRenderer],
    cellSizeAndPositionGetter: reactLib.reactMod.Validator[reactDashVirtualizedLib.distEsCollectionMod.CollectionCellSizeAndPositionGetter],
    sectionSize: reactLib.reactMod.Requireable[scala.Double]
  ): Anon_Arialabel = {
    val __obj = js.Dynamic.literal(cellCount = cellCount, cellGroupRenderer = cellGroupRenderer, cellRenderer = cellRenderer, cellSizeAndPositionGetter = cellSizeAndPositionGetter, sectionSize = sectionSize)
    __obj.updateDynamic("aria-label")(`aria-label`)
    __obj.asInstanceOf[Anon_Arialabel]
  }
}

