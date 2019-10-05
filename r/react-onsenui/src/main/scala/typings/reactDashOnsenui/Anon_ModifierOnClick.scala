package typings.reactDashOnsenui

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ModifierOnClick extends js.Object {
  var modifier: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.undefined
}

object Anon_ModifierOnClick {
  @scala.inline
  def apply(modifier: String = null, onClick: MouseEvent[_, NativeMouseEvent] => Unit = null): Anon_ModifierOnClick = {
    val __obj = js.Dynamic.literal()
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[Anon_ModifierOnClick]
  }
}

