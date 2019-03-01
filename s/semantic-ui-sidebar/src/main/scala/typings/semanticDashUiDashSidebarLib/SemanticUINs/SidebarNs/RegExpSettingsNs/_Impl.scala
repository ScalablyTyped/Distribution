package typings
package semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.RegExpSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default /(iPad|iPhone|iPod)/g
    */
  var ios: stdLib.RegExp
  /**
    * @default /Mobile|iP(hone|od|ad)|Android|BlackBerry|IEMobile|Kindle|NetFront|Silk-Accelerated|(hpw|web)OS|Fennec|Minimo|Opera M(obi|ini)|Blazer|Dolfin|Dolphin|Skyfire|Zune/g
    */
  var mobile: stdLib.RegExp
}

object _Impl {
  @scala.inline
  def apply(ios: stdLib.RegExp, mobile: stdLib.RegExp): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ios")(ios)
    __obj.updateDynamic("mobile")(mobile)
    __obj.asInstanceOf[_Impl]
  }
}

