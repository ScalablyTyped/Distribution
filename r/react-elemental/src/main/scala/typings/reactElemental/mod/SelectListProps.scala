package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectListProps extends js.Object {
  val error: js.UndefOr[String] = js.native
  val height: js.UndefOr[Double] = js.native
  val onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  val options: js.UndefOr[js.Array[typings.reactElemental.anon.Label]] = js.native
  val placeholder: js.UndefOr[String] = js.native
  val style: js.UndefOr[CSSProperties] = js.native
  val width: js.UndefOr[Double | String] = js.native
}

object SelectListProps {
  @scala.inline
  def apply(): SelectListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectListProps]
  }
  @scala.inline
  implicit class SelectListPropsOps[Self <: SelectListProps] (val x: Self) extends AnyVal {
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: typings.reactElemental.anon.Label*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[typings.reactElemental.anon.Label]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

