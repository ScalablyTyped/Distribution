package typings.semanticUiApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'encodeParameters'> */
@js.native
trait PickImplencodeParameters extends js.Object {
  var encodeParameters: Boolean = js.native
}

object PickImplencodeParameters {
  @scala.inline
  def apply(encodeParameters: Boolean): PickImplencodeParameters = {
    val __obj = js.Dynamic.literal(encodeParameters = encodeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplencodeParameters]
  }
  @scala.inline
  implicit class PickImplencodeParametersOps[Self <: PickImplencodeParameters] (val x: Self) extends AnyVal {
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
    def setEncodeParameters(value: Boolean): Self = this.set("encodeParameters", value.asInstanceOf[js.Any])
  }
  
}

