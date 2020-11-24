package typings.semanticUiApi.anon

import typings.semanticUiApi.semanticUiApiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'errorDuration'> */
@js.native
trait PickImplerrorDuration extends js.Object {
  
  var errorDuration: `true` | Double = js.native
}
object PickImplerrorDuration {
  
  @scala.inline
  def apply(errorDuration: `true` | Double): PickImplerrorDuration = {
    val __obj = js.Dynamic.literal(errorDuration = errorDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplerrorDuration]
  }
  
  @scala.inline
  implicit class PickImplerrorDurationOps[Self <: PickImplerrorDuration] (val x: Self) extends AnyVal {
    
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
    def setErrorDuration(value: `true` | Double): Self = this.set("errorDuration", value.asInstanceOf[js.Any])
  }
}
