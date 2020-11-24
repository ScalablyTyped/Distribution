package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.DateConfig
import typings.storybookComponents.controlsTypesMod.DateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Date", JSImport.Namespace)
@js.native
object dateMod extends js.Object {
  
  val DateControl: FC[DateProps] = js.native
  
  type DateProps = ControlProps[DateValue] with DateConfig
}
