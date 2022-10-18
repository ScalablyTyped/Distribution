package typings.reactMdExpansionPanel

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdExpansionPanel.typesExpansionListMod.ExpansionListProps
import typings.reactMdExpansionPanel.typesExpansionPanelHeaderMod.ExpansionPanelHeaderProps
import typings.reactMdExpansionPanel.typesExpansionPanelMod.ExpansionPanelProps
import typings.reactMdExpansionPanel.typesUsePanelsMod.ReturnValue
import typings.reactMdExpansionPanel.typesUsePanelsMod.UsePanelsOptions
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/expansion-panel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/expansion-panel", "ExpansionList")
  @js.native
  val ExpansionList: ForwardRefExoticComponent[ExpansionListProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/expansion-panel", "ExpansionPanel")
  @js.native
  val ExpansionPanel: ForwardRefExoticComponent[ExpansionPanelProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/expansion-panel", "ExpansionPanelHeader")
  @js.native
  val ExpansionPanelHeader: ForwardRefExoticComponent[ExpansionPanelHeaderProps & RefAttributes[HTMLButtonElement]] = js.native
  
  inline def usePanels(hasIdPrefixCountMultiplePreventAllClosedDefaultExpandedIndex: UsePanelsOptions): ReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("usePanels")(hasIdPrefixCountMultiplePreventAllClosedDefaultExpandedIndex.asInstanceOf[js.Any]).asInstanceOf[ReturnValue]
}
