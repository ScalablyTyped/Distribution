package typings.reactMdTree

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdTree.typesMod.TreeItemProps
import typings.reactMdTree.typesMod.TreeItemWithContentComponentProps
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/tree/types/TreeItem", JSImport.Namespace)
@js.native
object treeItemMod extends js.Object {
  /**
    * This component renders an item within a tree with optional child items. This
    * should almost always be used from the `itemRenderer` prop from the `Tree`
    * component as it provides a lot of the required a11y props for you.
    */
  val default: ForwardRefExoticComponent[
    (TreeItemProps with RefAttributes[HTMLLIElement]) | (TreeItemWithContentComponentProps with RefAttributes[HTMLLIElement])
  ] = js.native
}

