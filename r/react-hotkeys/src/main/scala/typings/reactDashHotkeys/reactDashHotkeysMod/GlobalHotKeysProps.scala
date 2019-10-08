package typings.reactDashHotkeys.reactDashHotkeysMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.HTMLAttributes
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalHotKeysProps extends HTMLAttributes[HotKeys] {
  /**
    * Whether the keyMap or handlers are permitted to change after the
    * component mounts. If false, changes to the keyMap and handlers
    * props will be ignored
    */
  var allowChanges: js.UndefOr[Boolean] = js.undefined
  /**
    * A map from action names to event handler functions
    */
  var handlers: js.UndefOr[StringDictionary[js.Function1[/* keyEvent */ js.UndefOr[KeyboardEvent], Unit]]] = js.undefined
  /**
    * A map from action names to Mousetrap or Browser key sequences
    */
  var keyMap: js.UndefOr[KeyMap] = js.undefined
}

object GlobalHotKeysProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HotKeys] = null,
    allowChanges: js.UndefOr[Boolean] = js.undefined,
    handlers: StringDictionary[js.Function1[/* keyEvent */ js.UndefOr[KeyboardEvent], Unit]] = null,
    keyMap: KeyMap = null
  ): GlobalHotKeysProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (!js.isUndefined(allowChanges)) __obj.updateDynamic("allowChanges")(allowChanges)
    if (handlers != null) __obj.updateDynamic("handlers")(handlers)
    if (keyMap != null) __obj.updateDynamic("keyMap")(keyMap)
    __obj.asInstanceOf[GlobalHotKeysProps]
  }
}

