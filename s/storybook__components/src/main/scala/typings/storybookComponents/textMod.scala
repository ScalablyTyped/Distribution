package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.TextConfig
import typings.storybookComponents.controlsTypesMod.TextValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  
  val TextControl: FC[TextProps] = js.native
  
  type TextProps = ControlProps[js.UndefOr[TextValue]] with TextConfig
}
