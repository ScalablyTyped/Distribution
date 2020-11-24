package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.BooleanConfig
import typings.storybookComponents.controlsTypesMod.BooleanValue
import typings.storybookComponents.controlsTypesMod.ControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Boolean", JSImport.Namespace)
@js.native
object booleanMod extends js.Object {
  
  val BooleanControl: FC[BooleanProps] = js.native
  
  type BooleanProps = ControlProps[BooleanValue] with BooleanConfig
}
