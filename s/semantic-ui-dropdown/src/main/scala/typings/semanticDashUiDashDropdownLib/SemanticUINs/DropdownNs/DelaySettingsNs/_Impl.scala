package typings
package semanticDashUiDashDropdownLib.SemanticUINs.DropdownNs.DelaySettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 300
    */
  var hide: scala.Double
  /**
    * @default 50
    */
  var search: scala.Double
  /**
    * @default 200
    */
  var show: scala.Double
  /**
    * @default 50
    */
  var touch: scala.Double
}

object _Impl {
  @scala.inline
  def apply(hide: scala.Double, search: scala.Double, show: scala.Double, touch: scala.Double): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("search")(search)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("touch")(touch)
    __obj.asInstanceOf[_Impl]
  }
}

