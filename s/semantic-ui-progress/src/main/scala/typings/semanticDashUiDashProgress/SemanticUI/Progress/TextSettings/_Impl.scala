package typings.semanticDashUiDashProgress.SemanticUI.Progress.TextSettings

import typings.semanticDashUiDashProgress.semanticDashUiDashProgressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default false
    */
  var active: `false` | String
  /**
    * @default false
    */
  var error: `false` | String
  /**
    * @default '{percent}%'
    */
  var percent: `false` | String
  /**
    * @default '{value} of {total}'
    */
  var ratio: `false` | String
  /**
    * @default false
    */
  var success: `false` | String
  /**
    * @default false
    */
  var warning: `false` | String
}

object _Impl {
  @scala.inline
  def apply(
    active: `false` | String,
    error: `false` | String,
    percent: `false` | String,
    ratio: `false` | String,
    success: `false` | String,
    warning: `false` | String
  ): _Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Impl]
  }
}

