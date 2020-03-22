package typings.reactBulmaComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Panel extends ForwardRefExoticComponent[PropsWithoutRef[PanelProps] with RefAttributes[_]] {
  var Block: ForwardRefExoticComponent[PropsWithoutRef[PanelBlockProps] with RefAttributes[_]] = js.native
  var Header: ForwardRefExoticComponent[PropsWithoutRef[PanelHeaderProps] with RefAttributes[_]] = js.native
  var Icon: ForwardRefExoticComponent[PropsWithoutRef[PanelIconProps] with RefAttributes[_]] = js.native
  var Tabs: PanelTabs = js.native
}

@JSImport("react-bulma-components", "Panel")
@js.native
object Panel extends TopLevel[Panel]

