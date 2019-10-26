package typings.reactDashSortableDashTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSortableDashTreeMod {
  import typings.react.reactMod.ComponentType

  type GetTreeItemChildrenFn = js.Function1[/* data */ GetTreeItemChildren, Unit]
  type NodeRenderer = ComponentType[NodeRendererProps]
  type PlaceholderRenderer = ComponentType[PlaceholderRendererProps]
  type TreeRenderer = ComponentType[TreeRendererProps]
}
