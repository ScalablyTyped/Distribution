package typings.atReachTooltip.atReachTooltipMod

import typings.react.reactMod.FC
import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/tooltip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val TooltipContent: FC[BaseTooltipProps] = js.native
  val TooltipPopup: FC[TooltipPopupProps] = js.native
  val default: FC[TooltipProps] = js.native
  def useTooltip(): js.Tuple3[TriggerParams, TooltipParams, Boolean] = js.native
  def useTooltip(attrs: HTMLProps[_]): js.Tuple3[TriggerParams, TooltipParams, Boolean] = js.native
}

