package typings.rollup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Define extends js.Object {
  var define: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
}

object Define {
  @scala.inline
  def apply(): Define = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Define]
  }
  @scala.inline
  implicit class DefineOps[Self <: Define] (val x: Self) extends AnyVal {
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
    def setDefine(value: String): Self = this.set("define", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefine: Self = this.set("define", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

