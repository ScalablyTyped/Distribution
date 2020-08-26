package typings.reactHelmet.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelmetDatum extends js.Object {
  def toComponent(): Component[_, js.Object, _] = js.native
}

object HelmetDatum {
  @scala.inline
  def apply(toComponent: () => Component[_, js.Object, _]): HelmetDatum = {
    val __obj = js.Dynamic.literal(toComponent = js.Any.fromFunction0(toComponent))
    __obj.asInstanceOf[HelmetDatum]
  }
  @scala.inline
  implicit class HelmetDatumOps[Self <: HelmetDatum] (val x: Self) extends AnyVal {
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
    def setToComponent(value: () => Component[_, js.Object, _]): Self = this.set("toComponent", js.Any.fromFunction0(value))
  }
  
}

