package typings
package smoothDashScrollbarLib.interfacesPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScrollbarPlugin extends js.Object {
  val name: java.lang.String
  val options: js.Any
  val scrollbar: smoothDashScrollbarLib.interfacesScrollbarMod.Scrollbar
  def onDestory(): scala.Unit
  def onInit(): scala.Unit
  def onRender(remainMomentum: smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d): scala.Unit
  def onUpdate(): scala.Unit
  def transformDelta(delta: smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d, fromEvent: js.Any): smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d
}

