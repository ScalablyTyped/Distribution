package typings.semanticDashUiDashDropdown.SemanticUI.Dropdown.DelaySettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 300
    */
  var hide: Double
  /**
    * @default 50
    */
  var search: Double
  /**
    * @default 200
    */
  var show: Double
  /**
    * @default 50
    */
  var touch: Double
}

object _Impl {
  @scala.inline
  def apply(hide: Double, search: Double, show: Double, touch: Double): _Impl = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

