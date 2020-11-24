package typings.semanticUiProgress.SemanticUI.Progress.TextSettings

import typings.semanticUiProgress.semanticUiProgressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impl extends js.Object {
  
  /**
    * @default false
    */
  var active: `false` | String = js.native
  
  /**
    * @default false
    */
  var error: `false` | String = js.native
  
  /**
    * @default '{percent}%'
    */
  var percent: `false` | String = js.native
  
  /**
    * @default '{value} of {total}'
    */
  var ratio: `false` | String = js.native
  
  /**
    * @default false
    */
  var success: `false` | String = js.native
  
  /**
    * @default false
    */
  var warning: `false` | String = js.native
}
object Impl {
  
  @scala.inline
  def apply(
    active: `false` | String,
    error: `false` | String,
    percent: `false` | String,
    ratio: `false` | String,
    success: `false` | String,
    warning: `false` | String
  ): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActive(value: `false` | String): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: `false` | String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercent(value: `false` | String): Self = this.set("percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatio(value: `false` | String): Self = this.set("ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: `false` | String): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: `false` | String): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
}
