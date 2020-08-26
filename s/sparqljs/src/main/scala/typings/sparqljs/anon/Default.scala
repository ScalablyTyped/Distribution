package typings.sparqljs.anon

import typings.sparqljs.mod.IriTerm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Default extends js.Object {
  var default: js.Array[IriTerm] = js.native
  var named: js.Array[IriTerm] = js.native
}

object Default {
  @scala.inline
  def apply(default: js.Array[IriTerm], named: js.Array[IriTerm]): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  @scala.inline
  implicit class DefaultOps[Self <: Default] (val x: Self) extends AnyVal {
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
    def setDefaultVarargs(value: IriTerm*): Self = this.set("default", js.Array(value :_*))
    @scala.inline
    def setDefault(value: js.Array[IriTerm]): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamedVarargs(value: IriTerm*): Self = this.set("named", js.Array(value :_*))
    @scala.inline
    def setNamed(value: js.Array[IriTerm]): Self = this.set("named", value.asInstanceOf[js.Any])
  }
  
}

