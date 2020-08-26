package typings.qtip2.QTip2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Style property
  */
@js.native
trait Style extends js.Object {
  var classes: js.UndefOr[String | Boolean] = js.native
  var `def`: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[String | Double | Boolean] = js.native
  var tip: js.UndefOr[String | Boolean | Tip] = js.native
  var widget: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[String | Double | Boolean] = js.native
}

object Style {
  @scala.inline
  def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
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
    def setClasses(value: String | Boolean): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setDef(value: Boolean): Self = this.set("def", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDef: Self = this.set("def", js.undefined)
    @scala.inline
    def setHeight(value: String | Double | Boolean): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setTip(value: String | Boolean | Tip): Self = this.set("tip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTip: Self = this.set("tip", js.undefined)
    @scala.inline
    def setWidget(value: Boolean): Self = this.set("widget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidget: Self = this.set("widget", js.undefined)
    @scala.inline
    def setWidth(value: String | Double | Boolean): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

