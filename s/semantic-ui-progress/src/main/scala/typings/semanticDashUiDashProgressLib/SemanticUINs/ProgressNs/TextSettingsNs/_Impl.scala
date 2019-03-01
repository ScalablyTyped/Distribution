package typings
package semanticDashUiDashProgressLib.SemanticUINs.ProgressNs.TextSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default false
    */
  var active: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibNumbers.`false` | java.lang.String
  /**
    * @default false
    */
  var error: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibNumbers.`false` | java.lang.String
  /**
    * @default '{percent}%'
    */
  var percent: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibNumbers.`false` | java.lang.String
  /**
    * @default '{value} of {total}'
    */
  var ratio: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibNumbers.`false` | java.lang.String
  /**
    * @default false
    */
  var success: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibNumbers.`false` | java.lang.String
  /**
    * @default false
    */
  var warning: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibNumbers.`false` | java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    active: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibNumbers.`false` | java.lang.String,
    error: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibNumbers.`false` | java.lang.String,
    percent: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibNumbers.`false` | java.lang.String,
    ratio: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibNumbers.`false` | java.lang.String,
    success: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibNumbers.`false` | java.lang.String,
    warning: semanticDashUiDashProgressLib.semanticDashUiDashProgressLibNumbers.`false` | java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Impl]
  }
}

