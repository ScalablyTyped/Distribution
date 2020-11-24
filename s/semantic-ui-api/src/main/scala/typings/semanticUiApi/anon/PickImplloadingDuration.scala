package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'loadingDuration'> */
@js.native
trait PickImplloadingDuration extends js.Object {
  
  var loadingDuration: Double = js.native
}
object PickImplloadingDuration {
  
  @scala.inline
  def apply(loadingDuration: Double): PickImplloadingDuration = {
    val __obj = js.Dynamic.literal(loadingDuration = loadingDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplloadingDuration]
  }
  
  @scala.inline
  implicit class PickImplloadingDurationOps[Self <: PickImplloadingDuration] (val x: Self) extends AnyVal {
    
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
    def setLoadingDuration(value: Double): Self = this.set("loadingDuration", value.asInstanceOf[js.Any])
  }
}
