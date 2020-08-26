package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILabel extends IComponent {
  /** [Config Option] (String) */
  @JSName("html")
  var html_ILabel: js.UndefOr[java.lang.String] = js.native
}

object ILabel {
  @scala.inline
  def apply(): ILabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILabel]
  }
  @scala.inline
  implicit class ILabelOps[Self <: ILabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHtml(value: java.lang.String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
  }
  
}

