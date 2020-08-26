package typings.reactNativeSwipeout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeoutProperties extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var buttonWidth: js.UndefOr[Double] = js.native
  var close: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var left: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.native
  var onClose: js.UndefOr[
    js.Function3[/* sectionId */ Double, /* rowId */ Double, /* direction */ String, Unit]
  ] = js.native
  var onOpen: js.UndefOr[
    js.Function3[/* sectionId */ Double, /* rowId */ Double, /* direction */ String, Unit]
  ] = js.native
  var openLeft: js.UndefOr[Boolean] = js.native
  var openRight: js.UndefOr[Boolean] = js.native
  var right: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.native
  var rowId: js.UndefOr[Double] = js.native
  var scroll: js.UndefOr[js.Function1[/* scrollEnabled */ Boolean, Unit]] = js.native
  var sectionId: js.UndefOr[Double] = js.native
  var sensitivity: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Object] = js.native
}

object SwipeoutProperties {
  @scala.inline
  def apply(): SwipeoutProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeoutProperties]
  }
  @scala.inline
  implicit class SwipeoutPropertiesOps[Self <: SwipeoutProperties] (val x: Self) extends AnyVal {
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setButtonWidth(value: Double): Self = this.set("buttonWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonWidth: Self = this.set("buttonWidth", js.undefined)
    @scala.inline
    def setClose(value: Boolean): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setLeftVarargs(value: SwipeoutButtonProperties*): Self = this.set("left", js.Array(value :_*))
    @scala.inline
    def setLeft(value: js.Array[SwipeoutButtonProperties]): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setOnClose(value: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Unit): Self = this.set("onClose", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnOpen(value: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Unit): Self = this.set("onOpen", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnOpen: Self = this.set("onOpen", js.undefined)
    @scala.inline
    def setOpenLeft(value: Boolean): Self = this.set("openLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenLeft: Self = this.set("openLeft", js.undefined)
    @scala.inline
    def setOpenRight(value: Boolean): Self = this.set("openRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenRight: Self = this.set("openRight", js.undefined)
    @scala.inline
    def setRightVarargs(value: SwipeoutButtonProperties*): Self = this.set("right", js.Array(value :_*))
    @scala.inline
    def setRight(value: js.Array[SwipeoutButtonProperties]): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setRowId(value: Double): Self = this.set("rowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowId: Self = this.set("rowId", js.undefined)
    @scala.inline
    def setScroll(value: /* scrollEnabled */ Boolean => Unit): Self = this.set("scroll", js.Any.fromFunction1(value))
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setSectionId(value: Double): Self = this.set("sectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionId: Self = this.set("sectionId", js.undefined)
    @scala.inline
    def setSensitivity(value: Double): Self = this.set("sensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitivity: Self = this.set("sensitivity", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

