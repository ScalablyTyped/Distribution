package typings.reactMdTree

import typings.reactMdTree.typesTypesMod.BaseTreeItem
import typings.reactMdTree.typesTypesMod.TreeData
import typings.reactMdTree.typesTypesMod.TreeItemId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetChildItemsMod {
  
  @JSImport("@react-md/tree/types/getChildItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: Null, recursive: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: TreeItemId): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: js.Array[T], parentId: TreeItemId, recursive: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: Null, recursive: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: TreeItemId): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def getChildItems[T /* <: BaseTreeItem */](data: TreeData[T], parentId: TreeItemId, recursive: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildItems")(data.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
