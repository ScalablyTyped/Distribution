package typings.rcMenu

import typings.rcMenu.anon.Hover
import typings.rcMenu.anon.Open
import typings.react.mod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  type BuiltinPlacements = Record[String, js.Any]
  
  type DestroyEventHandler = js.Function1[/* key */ Key, Unit]
  
  type HoverEventHandler = js.Function1[/* info */ Hover, Unit]
  
  type LegacyFunctionRef = js.Function1[/* node */ ReactInstance, Unit]
  
  type MenuClickEventHandler = js.Function1[/* info */ MenuInfo, Unit]
  
  type MenuHoverEventHandler = js.Function1[/* info */ typings.rcMenu.anon.Key, Unit]
  
  @js.native
  trait MenuInfo extends StObject {
    
    var domEvent: MouseEvent[HTMLElement, NativeMouseEvent] = js.native
    
    var item: ReactInstance = js.native
    
    var key: Key = js.native
    
    var keyPath: js.Array[Key] = js.native
  }
  object MenuInfo {
    
    @scala.inline
    def apply(
      domEvent: MouseEvent[HTMLElement, NativeMouseEvent],
      item: ReactInstance,
      key: Key,
      keyPath: js.Array[Key]
    ): MenuInfo = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuInfo]
    }
    
    @scala.inline
    implicit class MenuInfoMutableBuilder[Self <: MenuInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomEvent(value: MouseEvent[HTMLElement, NativeMouseEvent]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: ReactInstance): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPath(value: js.Array[Key]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyPathVarargs(value: Key*): Self = StObject.set(x, "keyPath", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcMenu.rcMenuStrings.horizontal
    - typings.rcMenu.rcMenuStrings.vertical
    - typings.rcMenu.rcMenuStrings.`vertical-left`
    - typings.rcMenu.rcMenuStrings.`vertical-right`
    - typings.rcMenu.rcMenuStrings.`inline`
  */
  trait MenuMode extends StObject
  object MenuMode {
    
    @scala.inline
    def horizontal: typings.rcMenu.rcMenuStrings.horizontal = "horizontal".asInstanceOf[typings.rcMenu.rcMenuStrings.horizontal]
    
    @scala.inline
    def `inline`: typings.rcMenu.rcMenuStrings.`inline` = "inline".asInstanceOf[typings.rcMenu.rcMenuStrings.`inline`]
    
    @scala.inline
    def vertical: typings.rcMenu.rcMenuStrings.vertical = "vertical".asInstanceOf[typings.rcMenu.rcMenuStrings.vertical]
    
    @scala.inline
    def `vertical-left`: typings.rcMenu.rcMenuStrings.`vertical-left` = "vertical-left".asInstanceOf[typings.rcMenu.rcMenuStrings.`vertical-left`]
    
    @scala.inline
    def `vertical-right`: typings.rcMenu.rcMenuStrings.`vertical-right` = "vertical-right".asInstanceOf[typings.rcMenu.rcMenuStrings.`vertical-right`]
  }
  
  @js.native
  trait MiniStore extends StObject {
    
    def getState(): js.Any = js.native
    
    def setState(state: js.Any): Unit = js.native
    
    def subscribe(listener: js.Function0[Unit]): js.Function0[Unit] = js.native
  }
  object MiniStore {
    
    @scala.inline
    def apply(
      getState: () => js.Any,
      setState: js.Any => Unit,
      subscribe: js.Function0[Unit] => js.Function0[Unit]
    ): MiniStore = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState), subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[MiniStore]
    }
    
    @scala.inline
    implicit class MiniStoreMutableBuilder[Self <: MiniStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetState(value: () => js.Any): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetState(value: js.Any => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscribe(value: js.Function0[Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  type OpenAnimation = String | (Record[String, js.Any])
  
  type OpenEventHandler = js.Function1[/* keys */ js.Array[Key] | Open, Unit]
  
  type RenderIconType = ReactNode | (js.Function1[/* props */ js.Any, ReactNode])
  
  type SelectEventHandler = js.Function1[/* info */ SelectInfo, Unit]
  
  @js.native
  trait SelectInfo extends MenuInfo {
    
    var selectedKeys: js.UndefOr[js.Array[Key]] = js.native
  }
  object SelectInfo {
    
    @scala.inline
    def apply(
      domEvent: MouseEvent[HTMLElement, NativeMouseEvent],
      item: ReactInstance,
      key: Key,
      keyPath: js.Array[Key]
    ): SelectInfo = {
      val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectInfo]
    }
    
    @scala.inline
    implicit class SelectInfoMutableBuilder[Self <: SelectInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      @scala.inline
      def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcMenu.rcMenuStrings.click
    - typings.rcMenu.rcMenuStrings.hover
  */
  trait TriggerSubMenuAction extends StObject
  object TriggerSubMenuAction {
    
    @scala.inline
    def click: typings.rcMenu.rcMenuStrings.click = "click".asInstanceOf[typings.rcMenu.rcMenuStrings.click]
    
    @scala.inline
    def hover: typings.rcMenu.rcMenuStrings.hover = "hover".asInstanceOf[typings.rcMenu.rcMenuStrings.hover]
  }
}
