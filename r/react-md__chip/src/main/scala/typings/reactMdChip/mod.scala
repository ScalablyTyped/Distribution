package typings.reactMdChip

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdChip.chipMod.ChipProps
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/chip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * A chip is a simplified and condensed button component that be used to create
    * compact radio groups, checkboxes, and trigger actions. The chip only has a
    * `"solid"` and `"outline"` theme but can be raisable once clicked or
    * selectable with an inline icon. A chip also supports rendering icons, avatars,
    * or circular progress bars to the left and right of the children.
    */
  val Chip: ForwardRefExoticComponent[ChipProps with RefAttributes[HTMLButtonElement]] = js.native
}

