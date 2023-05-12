package typings.storybookTheming.distCreateC2b2ce6dMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type FunctionInterpolation = (props : Props): @storybook/theming.@storybook/theming/dist/create-c2b2ce6d.Interpolation<Props>
}}}
to avoid circular code involving: 
- @storybook/theming.@storybook/theming/dist/create-c2b2ce6d.ArrayInterpolation
- @storybook/theming.@storybook/theming/dist/create-c2b2ce6d.FunctionInterpolation
- @storybook/theming.@storybook/theming/dist/create-c2b2ce6d.Interpolation
*/
@js.native
trait FunctionInterpolation[Props]
  extends StObject
     with _Interpolation[Props] {
  
  def apply(props: Props): Interpolation[Props] = js.native
}
