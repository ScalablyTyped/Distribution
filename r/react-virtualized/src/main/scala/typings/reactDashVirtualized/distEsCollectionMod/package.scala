package typings.reactDashVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsCollectionMod {
  import typings.react.reactMod.ReactNode
  import typings.reactDashVirtualized.reactDashVirtualizedMod.Index

  type CollectionCellGroupRenderer = js.Function1[/* params */ CollectionCellGroupRendererParams, js.Array[ReactNode]]
  type CollectionCellRenderer = js.Function1[/* params */ CollectionCellRendererParams, ReactNode]
  type CollectionCellSizeAndPositionGetter = js.Function1[/* params */ Index, CollectionCellSizeAndPosition]
}
