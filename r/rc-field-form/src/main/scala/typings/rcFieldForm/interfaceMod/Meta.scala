package typings.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meta extends js.Object {
  var errors: js.Array[String] = js.native
  var name: InternalNamePath = js.native
  var touched: Boolean = js.native
  var validating: Boolean = js.native
}

object Meta {
  @scala.inline
  def apply(errors: js.Array[String], name: InternalNamePath, touched: Boolean, validating: Boolean): Meta = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameVarargs(value: (String | Double)*): Self = this.set("name", js.Array(value :_*))
    @scala.inline
    def setName(value: InternalNamePath): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouched(value: Boolean): Self = this.set("touched", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidating(value: Boolean): Self = this.set("validating", value.asInstanceOf[js.Any])
  }
  
}

