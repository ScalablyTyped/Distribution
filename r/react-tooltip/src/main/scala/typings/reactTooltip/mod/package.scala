package typings.reactTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GetContent = typings.reactTooltip.mod.GetContentFunc | (js.Tuple2[typings.reactTooltip.mod.GetContentFunc, scala.Double])
  
  type GetContentFunc = js.Function1[/* toolTipStr */ java.lang.String, typings.react.mod.ReactNode]
  
  type ReactTooltip = typings.react.mod.Component[typings.reactTooltip.mod.TooltipProps, js.Object, js.Any]
  
  type VoidFunc = js.Function1[/* repeated */ js.Any, scala.Unit]
}
