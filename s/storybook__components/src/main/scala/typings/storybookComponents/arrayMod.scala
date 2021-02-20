package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ArrayConfig
import typings.storybookComponents.controlsTypesMod.ArrayValue
import typings.storybookComponents.controlsTypesMod.ControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayMod {
  
  @JSImport("@storybook/components/dist/controls/Array", "ArrayControl")
  @js.native
  val ArrayControl: FC[ArrayProps] = js.native
  
  type ArrayProps = ControlProps[ArrayValue] with ArrayConfig
}
