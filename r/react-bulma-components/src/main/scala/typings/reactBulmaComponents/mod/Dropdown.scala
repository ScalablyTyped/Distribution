package typings.reactBulmaComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.reactBulmaComponentsStrings.hr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dropdown extends ForwardRefExoticComponent[PropsWithoutRef[DropdownProps] with RefAttributes[div]] {
  var Divider: ForwardRefExoticComponent[PropsWithoutRef[DropdownDividerProps] with RefAttributes[hr]] = js.native
  var Item: ForwardRefExoticComponent[PropsWithoutRef[DropdownItemProps] with RefAttributes[div]] = js.native
}

@JSImport("react-bulma-components", "Dropdown")
@js.native
object Dropdown extends TopLevel[Dropdown]

