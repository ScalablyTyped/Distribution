package typings
package rollupDashPluginutilsLib.rollupDashPluginutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachedScope extends js.Object {
  var declarations: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var isBlockScope: scala.Boolean
  var parent: js.UndefOr[AttachedScope] = js.undefined
  def addDeclaration(
    node: estreeDashWalkerLib.estreeDashWalkerMod.Node,
    isBlockDeclaration: scala.Boolean,
    isVar: scala.Boolean
  ): scala.Unit
  def contains(name: java.lang.String): scala.Boolean
}

object AttachedScope {
  @scala.inline
  def apply(
    addDeclaration: (estreeDashWalkerLib.estreeDashWalkerMod.Node, scala.Boolean, scala.Boolean) => scala.Unit,
    contains: java.lang.String => scala.Boolean,
    declarations: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    isBlockScope: scala.Boolean,
    parent: AttachedScope = null
  ): AttachedScope = {
    val __obj = js.Dynamic.literal(addDeclaration = js.Any.fromFunction3(addDeclaration), contains = js.Any.fromFunction1(contains), declarations = declarations, isBlockScope = isBlockScope)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[AttachedScope]
  }
}

