package typings
package reactDashToolboxLib.libTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/tooltip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[P](component: reactLib.reactMod.ReactNs.ReactType[_]): TooltippedComponentClass[P] = js.native
  def tooltipFactory[P](): tooltipHOC[P] = js.native
  def tooltipFactory[P](options: TooltipOptions): tooltipHOC[P] = js.native
}

