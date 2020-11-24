package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.Api.ErrorSettings._Impl, 'legacyParameters'> */
@js.native
trait PickImpllegacyParameters extends js.Object {
  
  var legacyParameters: String = js.native
}
object PickImpllegacyParameters {
  
  @scala.inline
  def apply(legacyParameters: String): PickImpllegacyParameters = {
    val __obj = js.Dynamic.literal(legacyParameters = legacyParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpllegacyParameters]
  }
  
  @scala.inline
  implicit class PickImpllegacyParametersOps[Self <: PickImpllegacyParameters] (val x: Self) extends AnyVal {
    
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
    def setLegacyParameters(value: String): Self = this.set("legacyParameters", value.asInstanceOf[js.Any])
  }
}
