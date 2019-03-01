package typings
package semanticDashUiDashProgressLib.SemanticUINs.ProgressNs.RegExpSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default /\{\$*[A-z0-9]+\}/g
    */
  var variable: stdLib.RegExp
}

object _Impl {
  @scala.inline
  def apply(variable: stdLib.RegExp): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("variable")(variable)
    __obj.asInstanceOf[_Impl]
  }
}

