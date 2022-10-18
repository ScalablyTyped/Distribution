package typings.rcDialog

import org.scalablytyped.runtime.Shortcut
import typings.rcDialog.esDialogContentPanelMod.ContentRef
import typings.rcDialog.esDialogContentPanelMod.PanelProps
import typings.rcDialog.esIdialogproptypesMod.IDialogPropTypes
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-dialog", JSImport.Default)
  @js.native
  val default: FC[IDialogPropTypes] = js.native
  
  @JSImport("rc-dialog", "Panel")
  @js.native
  val Panel: ForwardRefExoticComponent[PanelProps & RefAttributes[ContentRef]] = js.native
  
  type _To = FC[IDialogPropTypes]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[IDialogPropTypes] = default
}
