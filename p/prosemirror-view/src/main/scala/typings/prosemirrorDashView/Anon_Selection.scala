package typings.prosemirrorDashView

import typings.prosemirrorDashView.prosemirrorDashViewStrings.selection
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Selection extends js.Object {
  var target: Element
  var `type`: selection
}

object Anon_Selection {
  @scala.inline
  def apply(target: Element, `type`: selection): Anon_Selection = {
    val __obj = js.Dynamic.literal(target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Selection]
  }
}

