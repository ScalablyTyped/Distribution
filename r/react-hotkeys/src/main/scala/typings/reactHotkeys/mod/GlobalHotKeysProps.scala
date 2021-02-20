package typings.reactHotkeys.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
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
  implicit class GlobalHotKeysPropsMutableBuilder[Self <: GlobalHotKeysProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowChanges(value: Boolean): Self = StObject.set(x, "allowChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowChangesUndefined: Self = StObject.set(x, "allowChanges", js.undefined)
    
    @scala.inline
    def setHandlers(value: StringDictionary[js.Function1[/* keyEvent */ js.UndefOr[KeyboardEvent], Unit]]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    @scala.inline
    def setKeyMap(value: KeyMap): Self = StObject.set(x, "keyMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyMapUndefined: Self = StObject.set(x, "keyMap", js.undefined)
  }
}
