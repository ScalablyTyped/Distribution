package typings.reactRange.typesMod

import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.RefObject
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IThumbProps extends js.Object {
  var `aria-valuemax`: Double = js.native
  var `aria-valuemin`: Double = js.native
  var `aria-valuenow`: Double = js.native
  var draggable: Boolean = js.native
  var key: Double = js.native
  var ref: RefObject[_] = js.native
  var role: String = js.native
  var style: CSSProperties = js.native
  var tabIndex: js.UndefOr[Double] = js.native
  def onKeyDown(e: KeyboardEvent[Element]): Unit = js.native
  def onKeyUp(e: KeyboardEvent[Element]): Unit = js.native
}

object IThumbProps {
  @scala.inline
  def apply(
    `aria-valuemax`: Double,
    `aria-valuemin`: Double,
    `aria-valuenow`: Double,
    draggable: Boolean,
    key: Double,
    onKeyDown: KeyboardEvent[Element] => Unit,
    onKeyUp: KeyboardEvent[Element] => Unit,
    ref: RefObject[_],
    role: String,
    style: CSSProperties
  ): IThumbProps = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), ref = ref.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThumbProps]
  }
  @scala.inline
  implicit class IThumbPropsOps[Self <: IThumbProps] (val x: Self) extends AnyVal {
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
    def `setAria-valuemax`(value: Double): Self = this.set("aria-valuemax", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAria-valuemin`(value: Double): Self = this.set("aria-valuemin", value.asInstanceOf[js.Any])
    @scala.inline
    def `setAria-valuenow`(value: Double): Self = this.set("aria-valuenow", value.asInstanceOf[js.Any])
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[Element] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnKeyUp(value: KeyboardEvent[Element] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: RefObject[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
  }
  
}

