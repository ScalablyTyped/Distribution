package typings.reactMdExpansionPanel.expansionPanelHeaderMod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The header for a panel that controls the expansion state. This is really just
  * a simple button that displays the children before an expander icon.
  *
  * Reminder: Since this is a `<button>`, only `inline` elements should be
  * rendered within (so use `<span>` instead of `<div>` for children).
  */
@JSImport("@react-md/expansion-panel/types/ExpansionPanelHeader", JSImport.Default)
@js.native
object default extends TopLevel[
      ForwardRefExoticComponent[ExpansionPanelHeaderProps with RefAttributes[HTMLButtonElement]]
    ]

