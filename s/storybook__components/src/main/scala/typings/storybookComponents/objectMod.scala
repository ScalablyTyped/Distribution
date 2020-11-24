package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.ObjectConfig
import typings.storybookComponents.controlsTypesMod.ObjectValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Object", JSImport.Namespace)
@js.native
object objectMod extends js.Object {
  
  val ObjectControl: FC[ObjectProps] = js.native
  
  type ObjectProps = ControlProps[ObjectValue] with ObjectConfig
}
