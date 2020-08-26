package typings.reactNativeFlipCard.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlipCardProps extends js.Object {
  var alignHeight: js.UndefOr[Boolean] = js.native
  var alignWidth: js.UndefOr[Boolean] = js.native
  var clickable: js.UndefOr[Boolean] = js.native
  var flip: js.UndefOr[Boolean] = js.native
  var flipHorizontal: js.UndefOr[Boolean] = js.native
  var flipVertical: js.UndefOr[Boolean] = js.native
  var friction: js.UndefOr[Double] = js.native
  var onFlipEnd: js.UndefOr[js.Function0[Unit]] = js.native
  var onFlipStart: js.UndefOr[js.Function0[Unit]] = js.native
  var perspective: js.UndefOr[Double] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var useNativeDriver: js.UndefOr[Boolean] = js.native
}

object FlipCardProps {
  @scala.inline
  def apply(): FlipCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlipCardProps]
  }
  @scala.inline
  implicit class FlipCardPropsOps[Self <: FlipCardProps] (val x: Self) extends AnyVal {
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
    def setAlignHeight(value: Boolean): Self = this.set("alignHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignHeight: Self = this.set("alignHeight", js.undefined)
    @scala.inline
    def setAlignWidth(value: Boolean): Self = this.set("alignWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignWidth: Self = this.set("alignWidth", js.undefined)
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    @scala.inline
    def setFlipHorizontal(value: Boolean): Self = this.set("flipHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipHorizontal: Self = this.set("flipHorizontal", js.undefined)
    @scala.inline
    def setFlipVertical(value: Boolean): Self = this.set("flipVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipVertical: Self = this.set("flipVertical", js.undefined)
    @scala.inline
    def setFriction(value: Double): Self = this.set("friction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriction: Self = this.set("friction", js.undefined)
    @scala.inline
    def setOnFlipEnd(value: () => Unit): Self = this.set("onFlipEnd", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFlipEnd: Self = this.set("onFlipEnd", js.undefined)
    @scala.inline
    def setOnFlipStart(value: () => Unit): Self = this.set("onFlipStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFlipStart: Self = this.set("onFlipStart", js.undefined)
    @scala.inline
    def setPerspective(value: Double): Self = this.set("perspective", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerspective: Self = this.set("perspective", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = this.set("useNativeDriver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNativeDriver: Self = this.set("useNativeDriver", js.undefined)
  }
  
}

