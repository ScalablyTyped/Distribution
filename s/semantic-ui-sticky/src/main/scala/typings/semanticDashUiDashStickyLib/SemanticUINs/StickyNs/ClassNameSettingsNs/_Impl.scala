package typings
package semanticDashUiDashStickyLib.SemanticUINs.StickyNs.ClassNameSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'bottom'
    */
  var bottom: java.lang.String
  /**
    * @default 'bound'
    */
  var bound: java.lang.String
  /**
    * @default 'fixed'
    */
  var fixed: java.lang.String
  /**
    * @default 'native'
    */
  var supported: java.lang.String
  /**
    * @default 'top'
    */
  var top: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    bottom: java.lang.String,
    bound: java.lang.String,
    fixed: java.lang.String,
    supported: java.lang.String,
    top: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("bound")(bound)
    __obj.updateDynamic("fixed")(fixed)
    __obj.updateDynamic("supported")(supported)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[_Impl]
  }
}

