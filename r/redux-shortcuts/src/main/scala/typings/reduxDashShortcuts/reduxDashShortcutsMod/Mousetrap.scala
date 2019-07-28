package typings.reduxDashShortcuts.reduxDashShortcutsMod

import typings.mousetrap.MousetrapInstance
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-shortcuts", "Mousetrap")
@js.native
class Mousetrap ()
  extends typings.mousetrap.mousetrapMod.^ {
  def this(el: Element) = this()
}

@JSImport("redux-shortcuts", "Mousetrap")
@js.native
class MousetrapCls () extends MousetrapInstance {
  def this(el: Element) = this()
}

