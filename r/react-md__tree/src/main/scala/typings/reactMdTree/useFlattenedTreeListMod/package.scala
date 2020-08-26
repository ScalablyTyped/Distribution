package typings.reactMdTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useFlattenedTreeListMod {
  type MetadataRecord = typings.std.Record[
    typings.reactMdTree.typesMod.TreeItemId, 
    typings.reactMdTree.useFlattenedTreeListMod.ItemMetadata
  ]
  type ReturnValue = js.Tuple3[
    js.Array[typings.reactMdTree.useFlattenedTreeListMod.SearchableTreeItem], 
    typings.reactMdTree.useFlattenedTreeListMod.MetadataRecord, 
    js.Array[typings.reactMdTree.useFlattenedTreeListMod.SearchableTreeItem]
  ]
  type TreeItemRef = typings.react.mod.MutableRefObject[typings.std.HTMLLIElement | scala.Null]
}
