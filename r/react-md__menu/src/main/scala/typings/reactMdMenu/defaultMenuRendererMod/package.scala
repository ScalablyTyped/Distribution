package typings.reactMdMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object defaultMenuRendererMod {
  
  type InjectedMenuProps = typings.reactMdUtils.typesTypesMod.LabelRequiredForA11y[typings.reactMdMenu.defaultMenuRendererMod.AllInjectedMenuProps]
  
  type MenuRenderer = js.Function2[
    /* props */ typings.reactMdMenu.defaultMenuRendererMod.InjectedMenuProps, 
    /* items */ js.Array[typings.reactMdMenu.defaultMenuItemRendererMod.ValidMenuItem], 
    typings.react.mod.ReactNode
  ]
}
