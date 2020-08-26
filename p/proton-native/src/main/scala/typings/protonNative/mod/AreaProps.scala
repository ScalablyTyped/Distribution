package typings.protonNative.mod

import typings.protonNative.anon.Buttons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaProps extends AreaBaseProps {
  /**
    * Called when releasing a key. Return `true` to signal that this event got handled (always returning true will disable any menu accelerators).
    */
  var onKeyDown: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Boolean]] = js.native
  /**
    * Called when pressing a key. Return `true` to signal that this event got handled (always returning true will disable any menu accelerators).
    */
  var onKeyUp: js.UndefOr[js.Function1[/* event */ KeyboardEvent, Boolean]] = js.native
  /**
    * Whether the area can be seen.
    */
  var onMouseDown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /**
    * Called when the mouse enters the area.
    */
  var onMouseEnter: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when the mouse leaves the area.
    */
  var onMouseLeave: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when the mouse is moved over the area
    */
  var onMouseMove: js.UndefOr[js.Function1[/* event */ Buttons, Unit]] = js.native
  /**
    * **Not working at the moment.**
    *
    * Called when releasing a mouse button over the area.
    */
  var onMouseUp: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /**
    * Whether the area can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object AreaProps {
  @scala.inline
  def apply(): AreaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaProps]
  }
  @scala.inline
  implicit class AreaPropsOps[Self <: AreaProps] (val x: Self) extends AnyVal {
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
    def setOnKeyDown(value: /* event */ KeyboardEvent => Boolean): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setOnKeyUp(value: /* event */ KeyboardEvent => Boolean): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnMouseDown(value: /* event */ MouseEvent => Unit): Self = this.set("onMouseDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: () => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: () => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseMove(value: /* event */ Buttons => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseUp(value: /* event */ MouseEvent => Unit): Self = this.set("onMouseUp", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

