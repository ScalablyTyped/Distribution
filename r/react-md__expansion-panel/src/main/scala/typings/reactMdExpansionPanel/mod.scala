package typings.reactMdExpansionPanel

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdExpansionPanel.expansionListMod.ExpansionListProps
import typings.reactMdExpansionPanel.expansionPanelHeaderMod.ExpansionPanelHeaderProps
import typings.reactMdExpansionPanel.expansionPanelMod.ExpansionPanelProps
import typings.reactMdExpansionPanel.usePanelsMod.ReturnValue
import typings.reactMdExpansionPanel.usePanelsMod.UsePanelsOptions
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/expansion-panel", "ExpansionList")
  @js.native
  val ExpansionList: ForwardRefExoticComponent[ExpansionListProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/expansion-panel", "ExpansionPanel")
  @js.native
  val ExpansionPanel: ForwardRefExoticComponent[ExpansionPanelProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/expansion-panel", "ExpansionPanelHeader")
  @js.native
  val ExpansionPanelHeader: ForwardRefExoticComponent[ExpansionPanelHeaderProps with RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/expansion-panel", "usePanels")
  @js.native
  def usePanels(hasIdPrefixCountMultiplePreventAllClosedDefaultExpandedIndex: UsePanelsOptions): ReturnValue = js.native
}
