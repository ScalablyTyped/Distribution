package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.ObjectConfig
import typings.storybookComponents.controlsTypesMod.ObjectValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  @JSImport("@storybook/components/dist/controls/Object", "ObjectControl")
  @js.native
  val ObjectControl: FC[ObjectProps] = js.native
  
  type ObjectProps = ControlProps[ObjectValue] with ObjectConfig
}
