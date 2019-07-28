package typings.reactDashToolbox.libTooltipMod

import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/tooltip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[P](component: ReactType[_]): TooltippedComponentClass[P] = js.native
  def tooltipFactory[P](): tooltipHOC[P] = js.native
  def tooltipFactory[P](options: TooltipOptions): tooltipHOC[P] = js.native
}

