package typings.reactMdMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useContextMenuMod {
  
  type ReturnValue[CE /* <: typings.std.HTMLElement */] = js.Tuple3[
    typings.reactMdMenu.useContextMenuMod.ProvidedContextMenuProps, 
    typings.react.mod.MouseEventHandler[CE], 
    typings.reactMdMenu.useContextMenuMod.VisibilityDispatcher
  ]
  
  type VisibilityDispatcher = typings.react.mod.Dispatch[typings.react.mod.SetStateAction[scala.Boolean]]
}
