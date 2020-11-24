package typings.reactHotkeys.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalHotKeysProps extends HTMLAttributes[HotKeys] {
  
  /**
    * Whether the keyMap or handlers are permitted to change after the
    * component mounts. If false, changes to the keyMap and handlers
    * props will be ignored
    */
  var allowChanges: js.UndefOr[Boolean] = js.native
  
  /**
    * A map from action names to event handler functions
    */
  var handlers: js.UndefOr[StringDictionary[js.Function1[/* keyEvent */ js.UndefOr[KeyboardEvent], Unit]]] = js.native
  
  /**
    * A map from action names to Mousetrap or Browser key sequences
    */
  var keyMap: js.UndefOr[KeyMap] = js.native
}
object GlobalHotKeysProps {
  
  @scala.inline
  def apply(): GlobalHotKeysProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalHotKeysProps]
  }
  
  @scala.inline
  implicit class GlobalHotKeysPropsOps[Self <: GlobalHotKeysProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowChanges(value: Boolean): Self = this.set("allowChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowChanges: Self = this.set("allowChanges", js.undefined)
    
    @scala.inline
    def setHandlers(value: StringDictionary[js.Function1[/* keyEvent */ js.UndefOr[KeyboardEvent], Unit]]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    
    @scala.inline
    def setKeyMap(value: KeyMap): Self = this.set("keyMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyMap: Self = this.set("keyMap", js.undefined)
  }
}
