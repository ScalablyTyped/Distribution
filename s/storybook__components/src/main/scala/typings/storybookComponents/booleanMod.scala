package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.BooleanConfig
import typings.storybookComponents.controlsTypesMod.BooleanValue
import typings.storybookComponents.controlsTypesMod.ControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object booleanMod {
  
  @JSImport("@storybook/components/dist/controls/Boolean", "BooleanControl")
  @js.native
  val BooleanControl: FC[BooleanProps] = js.native
  
  type BooleanProps = ControlProps[BooleanValue] with BooleanConfig
}
