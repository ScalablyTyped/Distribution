package typings.react.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectHTMLAttributes[T] extends HTMLAttributes[T] {
  var classID: js.UndefOr[String] = js.native
  var data: js.UndefOr[String] = js.native
  var form: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var name: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var useMap: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var wmode: js.UndefOr[String] = js.native
}

object ObjectHTMLAttributes {
  @scala.inline
  def apply[T](): ObjectHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectHTMLAttributes[T]]
  }
  @scala.inline
  implicit class ObjectHTMLAttributesOps[Self <: ObjectHTMLAttributes[_], T] (val x: Self with ObjectHTMLAttributes[T]) extends AnyVal {
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
    def setClassID(value: String): Self = this.set("classID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassID: Self = this.set("classID", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setForm(value: String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUseMap(value: String): Self = this.set("useMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMap: Self = this.set("useMap", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWmode(value: String): Self = this.set("wmode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWmode: Self = this.set("wmode", js.undefined)
  }
  
}

