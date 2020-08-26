package typings.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default /(iPad|iPhone|iPod)/g
    */
  var ios: RegExp = js.native
  /**
    * @default /Mobile|iP(hone|od|ad)|Android|BlackBerry|IEMobile|Kindle|NetFront|Silk-Accelerated|(hpw|web)OS|Fennec|Minimo|Opera M(obi|ini)|Blazer|Dolfin|Dolphin|Skyfire|Zune/g
    */
  var mobile: RegExp = js.native
}

object Impl {
  @scala.inline
  def apply(ios: RegExp, mobile: RegExp): Impl = {
    val __obj = js.Dynamic.literal(ios = ios.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIos(value: RegExp): Self = this.set("ios", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobile(value: RegExp): Self = this.set("mobile", value.asInstanceOf[js.Any])
  }
  
}

