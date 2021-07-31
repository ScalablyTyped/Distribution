package typings.storybookUi

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.storybookApi.storiesMod.Group
import typings.storybookApi.storiesMod.Root
import typings.storybookApi.storiesMod.StoriesHash
import typings.storybookApi.storiesMod.Story
import typings.storybookUi.sidebarTypesMod.Dataset
import typings.storybookUi.sidebarTypesMod.Item
import typings.storybookUi.sidebarTypesMod.RefType
import typings.storybookUi.sidebarTypesMod.SearchItem
import typings.storybookUi.storybookUiStrings.auth
import typings.storybookUi.storybookUiStrings.empty
import typings.storybookUi.storybookUiStrings.error
import typings.storybookUi.storybookUiStrings.loading
import typings.storybookUi.storybookUiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createId(itemId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createId")(itemId.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def createId(itemId: String, refId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createId")(itemId.asInstanceOf[js.Any], refId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def cycle[T](array: js.Array[T], index: Double, delta: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cycle")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def get(id: String, dataset: Dataset): Root | Group | Story = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], dataset.asInstanceOf[js.Any])).asInstanceOf[Root | Group | Story]
  
  @scala.inline
  def getAncestorIds(data: StoriesHash, id: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAncestorIds")(data.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getDescendantIds(data: StoriesHash, id: String, skipLeafs: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDescendantIds")(data.asInstanceOf[js.Any], id.asInstanceOf[js.Any], skipLeafs.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getLink(itemId: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLink")(itemId.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getLink(itemId: String, refId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getLink")(itemId.asInstanceOf[js.Any], refId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getParent(id: String, dataset: Dataset): Root | Group | Story = (^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(id.asInstanceOf[js.Any], dataset.asInstanceOf[js.Any])).asInstanceOf[Root | Group | Story]
  
  @scala.inline
  def getParents(id: String, dataset: Dataset): js.Array[Item] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParents")(id.asInstanceOf[js.Any], dataset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Item]]
  
  @scala.inline
  def getPath(item: Item, ref: RefType): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(item.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getStateType(isLoading: Boolean, isAuthRequired: Boolean, isError: Boolean, isEmpty: Boolean): auth | error | loading | empty | ready = (^.asInstanceOf[js.Dynamic].applyDynamic("getStateType")(isLoading.asInstanceOf[js.Any], isAuthRequired.asInstanceOf[js.Any], isError.asInstanceOf[js.Any], isEmpty.asInstanceOf[js.Any])).asInstanceOf[auth | error | loading | empty | ready]
  
  @scala.inline
  def isAncestor(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAncestor")().asInstanceOf[Boolean]
  @scala.inline
  def isAncestor(element: Unit, maybeAncestor: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAncestor")(element.asInstanceOf[js.Any], maybeAncestor.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isAncestor(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAncestor")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isAncestor(element: Element, maybeAncestor: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAncestor")(element.asInstanceOf[js.Any], maybeAncestor.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def prevent(e: SyntheticEvent[Element, Event]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("prevent")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def scrollIntoView(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def scrollIntoView(element: Element, center: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollIntoView")(element.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def searchItem(item: Item, ref: RefType): SearchItem = (^.asInstanceOf[js.Dynamic].applyDynamic("searchItem")(item.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[SearchItem]
}
