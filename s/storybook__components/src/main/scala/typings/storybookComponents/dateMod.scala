package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.DateConfig
import typings.storybookComponents.controlsTypesMod.DateValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("@storybook/components/dist/controls/Date", "DateControl")
  @js.native
  val DateControl: FC[DateProps] = js.native
  
  type DateProps = ControlProps[DateValue] with DateConfig
}
