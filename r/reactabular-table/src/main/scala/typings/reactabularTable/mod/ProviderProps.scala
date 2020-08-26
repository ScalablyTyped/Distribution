package typings.reactabularTable.mod

import typings.reactabularTable.anon.PartialCSSStyleDeclaratio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var columns: js.Array[Column] = js.native
  var renderers: js.UndefOr[Renderers] = js.native
  var style: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
}

object ProviderProps {
  @scala.inline
  def apply(columns: js.Array[Column]): ProviderProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps]
  }
  @scala.inline
  implicit class ProviderPropsOps[Self <: ProviderProps] (val x: Self) extends AnyVal {
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
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setRenderers(value: Renderers): Self = this.set("renderers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderers: Self = this.set("renderers", js.undefined)
    @scala.inline
    def setStyle(value: PartialCSSStyleDeclaratio): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

