package typings.storybookTheming.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type StylisPluginCallback = (element : @storybook/theming.@storybook/theming.StylisElement, index : number, children : std.Array<@storybook/theming.@storybook/theming.StylisElement>, callback : @storybook/theming.@storybook/theming.StylisPluginCallback): string | void
}}}
to avoid circular code involving: 
- @storybook/theming.@storybook/theming.StylisPluginCallback
*/
@js.native
trait StylisPluginCallback extends StObject {
  
  def apply(
    element: StylisElement,
    index: Double,
    children: js.Array[StylisElement],
    callback: StylisPluginCallback
  ): String | Unit = js.native
}
