package typings
package semanticDashUiDashApiLib.SemanticUINs.ApiNs.RegExpSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default /\{\/\$*[A-z0-9]+\}/g
    */
  var optional: stdLib.RegExp
  /**
    * @default /\{\$*[A-z0-9]+\}/g
    */
  var required: stdLib.RegExp
}

object _Impl {
  @scala.inline
  def apply(optional: stdLib.RegExp, required: stdLib.RegExp): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("optional")(optional)
    __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[_Impl]
  }
}

