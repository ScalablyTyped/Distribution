package typings
package semanticDashUiDashProgressLib.SemanticUINs.ProgressNs.MetadataSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'percent'
    */
  var percent: java.lang.String
  /**
    * @default 'total'
    */
  var total: java.lang.String
  /**
    * @default 'value'
    */
  var value: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(percent: java.lang.String, total: java.lang.String, value: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("percent")(percent)
    __obj.updateDynamic("total")(total)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[_Impl]
  }
}

