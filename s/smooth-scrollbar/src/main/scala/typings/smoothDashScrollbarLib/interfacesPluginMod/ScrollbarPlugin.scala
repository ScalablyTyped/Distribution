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

object ScrollbarPlugin {
  @scala.inline
  def apply(
    name: java.lang.String,
    onDestory: js.Function0[scala.Unit],
    onInit: js.Function0[scala.Unit],
    onRender: js.Function1[smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d, scala.Unit],
    onUpdate: js.Function0[scala.Unit],
    options: js.Any,
    scrollbar: smoothDashScrollbarLib.interfacesScrollbarMod.Scrollbar,
    transformDelta: js.Function2[
      smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d, 
      js.Any, 
      smoothDashScrollbarLib.interfacesDataDash2dMod.Data2d
    ]
  ): ScrollbarPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("onDestory")(onDestory)
    __obj.updateDynamic("onInit")(onInit)
    __obj.updateDynamic("onRender")(onRender)
    __obj.updateDynamic("onUpdate")(onUpdate)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("scrollbar")(scrollbar)
    __obj.updateDynamic("transformDelta")(transformDelta)
    __obj.asInstanceOf[ScrollbarPlugin]
  }
}

