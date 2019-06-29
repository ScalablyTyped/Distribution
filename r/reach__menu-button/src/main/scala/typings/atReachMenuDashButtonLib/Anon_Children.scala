package typings
package atReachMenuDashButtonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onKeyDown: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement], scala.Unit]
  ] = js.undefined
}

object Anon_Children {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    onClick: /* e */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onKeyDown: /* e */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null
  ): Anon_Children = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[Anon_Children]
  }
}

