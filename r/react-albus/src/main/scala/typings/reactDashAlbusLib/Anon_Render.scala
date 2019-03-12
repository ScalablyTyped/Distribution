package typings
package reactDashAlbusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Render extends js.Object {
  var render: js.UndefOr[
    js.Function1[
      /* wizard */ reactDashAlbusLib.reactDashAlbusMod.WizardContext, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
}

object Anon_Render {
  @scala.inline
  def apply(
    render: /* wizard */ reactDashAlbusLib.reactDashAlbusMod.WizardContext => reactLib.reactMod.ReactNs.ReactNode = null
  ): Anon_Render = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[Anon_Render]
  }
}

