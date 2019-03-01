package typings
package reactDashDatagridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledStyle extends js.Object {
  var disabledStyle: reactLib.reactMod.ReactNs.SVGAttributes[js.Object]
  var overStyle: reactLib.reactMod.ReactNs.SVGAttributes[js.Object]
  var style: reactLib.reactMod.ReactNs.SVGAttributes[js.Object]
}

object Anon_DisabledStyle {
  @scala.inline
  def apply(
    disabledStyle: reactLib.reactMod.ReactNs.SVGAttributes[js.Object],
    overStyle: reactLib.reactMod.ReactNs.SVGAttributes[js.Object],
    style: reactLib.reactMod.ReactNs.SVGAttributes[js.Object]
  ): Anon_DisabledStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disabledStyle")(disabledStyle)
    __obj.updateDynamic("overStyle")(overStyle)
    __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_DisabledStyle]
  }
}

