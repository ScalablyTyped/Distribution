package typings.reactMdMenu.useContextMenuMod

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Required<std.Pick<@react-md/menu.@react-md/menu/types/Menu.MenuProps, @react-md/menu.@react-md/menu/types/useContextMenu.ProvidedPropNames>> */
@js.native
trait ProvidedContextMenuProps extends js.Object {
  
  var anchor: js.Any = js.native
  
  var classNames: js.Any = js.native
  
  var disableControlClickOkay: js.Any = js.native
  
  var id: js.Any = js.native
  
  var onRequestClose: js.Any = js.native
  
  var positionOptions: js.Any = js.native
  
  /**
    * A ref that must be provided to the `Menu` component that is acting as a
    * context menu if you want to allow the native context menus within this
    * custom context menu.
    *
    * If this is never provided to the `Menu` component, right clicking (to
    * inspect an element for example) will close this context menu.
    */
  def ref(): Unit = js.native
  def ref(instance: HTMLDivElement): Unit = js.native
  
  var visible: js.Any = js.native
}
