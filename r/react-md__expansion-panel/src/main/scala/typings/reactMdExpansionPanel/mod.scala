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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/expansion-panel", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val ExpansionList: ForwardRefExoticComponent[ExpansionListProps with RefAttributes[HTMLDivElement]] = js.native
  
  val ExpansionPanel: ForwardRefExoticComponent[ExpansionPanelProps with RefAttributes[HTMLDivElement]] = js.native
  
  val ExpansionPanelHeader: ForwardRefExoticComponent[ExpansionPanelHeaderProps with RefAttributes[HTMLButtonElement]] = js.native
  
  def usePanels(hasIdPrefixCountMultiplePreventAllClosedDefaultExpandedIndex: UsePanelsOptions): ReturnValue = js.native
}
