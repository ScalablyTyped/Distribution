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
import scala.scalajs.js.annotation._

@JSImport("@react-md/expansion-panel", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * This component is honestly not very helpful since it does not apply any
    * styles. It is a simple wrapper for a `<div>` that updates the props to
    * require the `children` and `onKeyDown` props.
    */
  val ExpansionList: ForwardRefExoticComponent[ExpansionListProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * The expansion panel renders a header element (that is just a button) and
    * dynamically shows content once expanded.
    */
  val ExpansionPanel: ForwardRefExoticComponent[ExpansionPanelProps with RefAttributes[HTMLDivElement]] = js.native
  /**
    * The header for a panel that controls the expansion state. This is really just
    * a simple button that displays the children before an expander icon.
    *
    * Reminder: Since this is a `<button>`, only `inline` elements should be
    * rendered within (so use `<span>` instead of `<div>` for children).
    */
  val ExpansionPanelHeader: ForwardRefExoticComponent[ExpansionPanelHeaderProps with RefAttributes[HTMLButtonElement]] = js.native
  def usePanels(hasIdPrefixCountMultiplePreventAllClosedDefaultExpandedIndex: UsePanelsOptions): ReturnValue = js.native
}

