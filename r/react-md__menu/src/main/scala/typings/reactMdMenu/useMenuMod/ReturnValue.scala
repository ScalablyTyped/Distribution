package typings.reactMdMenu.useMenuMod

import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.MutableRefObject
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react.react.HTMLAttributes<std.HTMLDivElement>, 'onClick' | 'onKeyDown'> */
@js.native
trait ReturnValue extends js.Object {
  
  var menuRef: MutableRefObject[HTMLDivElement | Null] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  
  def ref(): Unit = js.native
  def ref(instance: HTMLDivElement): Unit = js.native
}
