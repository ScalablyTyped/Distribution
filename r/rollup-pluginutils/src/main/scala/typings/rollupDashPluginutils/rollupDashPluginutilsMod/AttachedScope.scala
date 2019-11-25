package typings.rollupDashPluginutils.rollupDashPluginutilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.estreeDashWalker.estreeDashWalkerMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachedScope extends js.Object {
  var declarations: StringDictionary[Boolean]
  var isBlockScope: Boolean
  var parent: js.UndefOr[AttachedScope] = js.undefined
  def addDeclaration(node: Node, isBlockDeclaration: Boolean, isVar: Boolean): Unit
  def contains(name: String): Boolean
}

object AttachedScope {
  @scala.inline
  def apply(
    addDeclaration: (Node, Boolean, Boolean) => Unit,
    contains: String => Boolean,
    declarations: StringDictionary[Boolean],
    isBlockScope: Boolean,
    parent: AttachedScope = null
  ): AttachedScope = {
    val __obj = js.Dynamic.literal(addDeclaration = js.Any.fromFunction3(addDeclaration), contains = js.Any.fromFunction1(contains), declarations = declarations.asInstanceOf[js.Any], isBlockScope = isBlockScope.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachedScope]
  }
}

