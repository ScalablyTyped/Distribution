package typings
package semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.DefaultTransitionSettingsNs.MobileSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'overlay'
    */
  var bottom: java.lang.String
  /**
    * @default 'uncover'
    */
  var left: java.lang.String
  /**
    * @default 'uncover'
    */
  var right: java.lang.String
  /**
    * @default 'overlay'
    */
  var top: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(bottom: java.lang.String, left: java.lang.String, right: java.lang.String, top: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[_Impl]
  }
}

