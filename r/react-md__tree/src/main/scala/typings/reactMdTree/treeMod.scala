package typings.reactMdTree

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdList.listMod.ListElement
import typings.reactMdTree.typesMod.TreeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/tree/types/Tree", JSImport.Namespace)
@js.native
object treeMod extends js.Object {
  /**
    * Creates an accessible tree widget that allows you to show hierarchical data
    * in a list presentation view. This component requires the selection and
    * expansion state to be provided/controlled but you can use the
    * `useTreeItemSelection` and `useTreeItemExpansion` hooks for a great starting
    * point for this functionality.
    */
  val default: ForwardRefExoticComponent[TreeProps[_] with RefAttributes[ListElement]] = js.native
}

