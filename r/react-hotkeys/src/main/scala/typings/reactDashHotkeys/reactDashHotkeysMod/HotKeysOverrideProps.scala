package typings.reactDashHotkeys.reactDashHotkeysMod

import typings.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotKeysOverrideProps extends HTMLAttributes[HotKeys] {
  /**
    * The blacklist of keys that keyevents should be not ignored. i.e. if you place
    * a key in this list, all events related to it will be still be observed by react
    * hotkeys
    */
  var except: ListOfKeys
  /**
    * The whitelist of keys that keyevents should be ignored. i.e. if you place
    * a key in this list, all events related to it will be ignored by react hotkeys
    */
  var only: ListOfKeys
}

object HotKeysOverrideProps {
  @scala.inline
  def apply(except: ListOfKeys, only: ListOfKeys, HTMLAttributes: HTMLAttributes[HotKeys] = null): HotKeysOverrideProps = {
    val __obj = js.Dynamic.literal(except = except.asInstanceOf[js.Any], only = only.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    __obj.asInstanceOf[HotKeysOverrideProps]
  }
}

