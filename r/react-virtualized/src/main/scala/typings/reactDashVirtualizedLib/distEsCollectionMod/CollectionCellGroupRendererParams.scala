package typings
package reactDashVirtualizedLib.distEsCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionCellGroupRendererParams extends js.Object {
  @JSName("cellRenderer")
  var cellRenderer_Original: CollectionCellRenderer = js.native
  @JSName("cellSizeAndPositionGetter")
  var cellSizeAndPositionGetter_Original: CollectionCellSizeAndPositionGetter = js.native
  var indices: js.Array[scala.Double] = js.native
  def cellRenderer(params: CollectionCellRendererParams): reactLib.reactMod.ReactNode = js.native
  def cellSizeAndPositionGetter(params: reactDashVirtualizedLib.reactDashVirtualizedMod.Index): CollectionCellSizeAndPosition = js.native
}

