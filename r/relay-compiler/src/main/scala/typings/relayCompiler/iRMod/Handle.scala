package typings.relayCompiler.iRMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handle extends js.Object {
  var dynamicKey: Variable | Null = js.native
  var filters: js.UndefOr[js.Array[String]] = js.native
  var key: String = js.native
  var name: String = js.native
}

object Handle {
  @scala.inline
  def apply(key: String, name: String): Handle = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handle]
  }
  @scala.inline
  implicit class HandleOps[Self <: Handle] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamicKey(value: Variable): Self = this.set("dynamicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamicKeyNull: Self = this.set("dynamicKey", null)
    @scala.inline
    def setFiltersVarargs(value: String*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[String]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
  
}

