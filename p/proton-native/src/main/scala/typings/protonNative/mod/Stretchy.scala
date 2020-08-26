package typings.protonNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stretchy extends js.Object {
  /**
    * Whether the component should stretch to fill the available space. Defaults to true.
    *
    * Excluded on:
    * - Tabs
    * - Grid children
    * - Combobox/RadioButton Items
    * - MenuBar
    */
  var stretchy: js.UndefOr[Boolean] = js.native
}

object Stretchy {
  @scala.inline
  def apply(): Stretchy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stretchy]
  }
  @scala.inline
  implicit class StretchyOps[Self <: Stretchy] (val x: Self) extends AnyVal {
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
    def setStretchy(value: Boolean): Self = this.set("stretchy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStretchy: Self = this.set("stretchy", js.undefined)
  }
  
}

