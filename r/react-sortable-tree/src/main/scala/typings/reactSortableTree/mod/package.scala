package typings.reactSortableTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GetTreeItemChildrenFn = js.Function1[/* data */ typings.reactSortableTree.mod.GetTreeItemChildren, scala.Unit]
  
  type NodeRenderer = typings.react.mod.ComponentType[typings.reactSortableTree.mod.NodeRendererProps]
  
  type NumberOrStringArray = js.Array[java.lang.String | scala.Double]
  
  type PlaceholderRenderer = typings.react.mod.ComponentType[typings.reactSortableTree.mod.PlaceholderRendererProps]
  
  type TreeRenderer = typings.react.mod.ComponentType[typings.reactSortableTree.mod.TreeRendererProps]
}
