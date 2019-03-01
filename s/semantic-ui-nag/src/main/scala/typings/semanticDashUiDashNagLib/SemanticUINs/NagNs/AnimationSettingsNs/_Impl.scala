package typings
package semanticDashUiDashNagLib.SemanticUINs.NagNs.AnimationSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'slide'
    */
  var hide: java.lang.String
  /**
    * @default 'slide'
    */
  var show: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(hide: java.lang.String, show: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[_Impl]
  }
}

