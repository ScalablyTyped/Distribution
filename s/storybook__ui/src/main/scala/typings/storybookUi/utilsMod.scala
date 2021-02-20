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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "createId")
  @js.native
  def createId(itemId: String): String = js.native
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "createId")
  @js.native
  def createId(itemId: String, refId: String): String = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "cycle")
  @js.native
  def cycle[T](array: js.Array[T], index: Double, delta: Double): Double = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "get")
  @js.native
  def get(id: String, dataset: Dataset): Root | Group | Story = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getAncestorIds")
  @js.native
  def getAncestorIds(data: StoriesHash, id: String): js.Array[String] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getDescendantIds")
  @js.native
  def getDescendantIds(data: StoriesHash, id: String, skipLeafs: Boolean): js.Array[String] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getLink")
  @js.native
  def getLink(itemId: String): String = js.native
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getLink")
  @js.native
  def getLink(itemId: String, refId: String): String = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getParent")
  @js.native
  def getParent(id: String, dataset: Dataset): Root | Group | Story = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getParents")
  @js.native
  def getParents(id: String, dataset: Dataset): js.Array[Item] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getPath")
  @js.native
  def getPath(item: Item, ref: RefType): js.Array[String] = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "getStateType")
  @js.native
  def getStateType(isLoading: Boolean, isAuthRequired: Boolean, isError: Boolean, isEmpty: Boolean): auth | error | loading | empty | ready = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "isAncestor")
  @js.native
  def isAncestor(): Boolean = js.native
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "isAncestor")
  @js.native
  def isAncestor(element: js.UndefOr[scala.Nothing], maybeAncestor: Element): Boolean = js.native
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "isAncestor")
  @js.native
  def isAncestor(element: Element): Boolean = js.native
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "isAncestor")
  @js.native
  def isAncestor(element: Element, maybeAncestor: Element): Boolean = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "prevent")
  @js.native
  def prevent(e: SyntheticEvent[Element, Event]): Boolean = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "scrollIntoView")
  @js.native
  def scrollIntoView(element: Element): Unit = js.native
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "scrollIntoView")
  @js.native
  def scrollIntoView(element: Element, center: Boolean): Unit = js.native
  
  @JSImport("@storybook/ui/dist/components/sidebar/utils", "searchItem")
  @js.native
  def searchItem(item: Item, ref: RefType): SearchItem = js.native
}
