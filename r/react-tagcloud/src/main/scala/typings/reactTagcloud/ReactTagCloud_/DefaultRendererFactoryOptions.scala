package typings.reactTagcloud.ReactTagCloud_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultRendererFactoryOptions extends js.Object {
  var colorOptions: js.UndefOr[js.Any] = js.native
  var props: js.UndefOr[js.Any] = js.native
  var tagRenderer: js.UndefOr[js.Function] = js.native
}

object DefaultRendererFactoryOptions {
  @scala.inline
  def apply(): DefaultRendererFactoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRendererFactoryOptions]
  }
  @scala.inline
  implicit class DefaultRendererFactoryOptionsOps[Self <: DefaultRendererFactoryOptions] (val x: Self) extends AnyVal {
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
    def setColorOptions(value: js.Any): Self = this.set("colorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorOptions: Self = this.set("colorOptions", js.undefined)
    @scala.inline
    def setProps(value: js.Any): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    @scala.inline
    def setTagRenderer(value: js.Function): Self = this.set("tagRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagRenderer: Self = this.set("tagRenderer", js.undefined)
  }
  
}

