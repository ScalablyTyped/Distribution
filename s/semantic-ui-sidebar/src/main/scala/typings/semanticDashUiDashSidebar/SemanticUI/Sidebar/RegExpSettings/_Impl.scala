package typings.semanticDashUiDashSidebar.SemanticUI.Sidebar.RegExpSettings

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default /(iPad|iPhone|iPod)/g
    */
  var ios: RegExp
  /**
    * @default /Mobile|iP(hone|od|ad)|Android|BlackBerry|IEMobile|Kindle|NetFront|Silk-Accelerated|(hpw|web)OS|Fennec|Minimo|Opera M(obi|ini)|Blazer|Dolfin|Dolphin|Skyfire|Zune/g
    */
  var mobile: RegExp
}

object _Impl {
  @scala.inline
  def apply(ios: RegExp, mobile: RegExp): _Impl = {
    val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

