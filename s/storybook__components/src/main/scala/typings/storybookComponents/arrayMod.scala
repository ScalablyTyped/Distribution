package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ArrayConfig
import typings.storybookComponents.controlsTypesMod.ArrayValue
import typings.storybookComponents.controlsTypesMod.ControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/controls/Array", JSImport.Namespace)
@js.native
object arrayMod extends js.Object {
  
  val ArrayControl: FC[ArrayProps] = js.native
  
  type ArrayProps = ControlProps[ArrayValue] with ArrayConfig
}
