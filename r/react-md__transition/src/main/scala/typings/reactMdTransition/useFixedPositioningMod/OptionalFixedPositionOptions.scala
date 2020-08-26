package typings.reactMdTransition.useFixedPositioningMod

import typings.reactMdUtils.anon.PartialPositionAnchor
import typings.reactMdUtils.typesMod.PositionWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@react-md/utils.@react-md/utils.FixedPositionOptions, 'container' | 'element'> */
@js.native
trait OptionalFixedPositionOptions extends js.Object {
  var anchor: js.UndefOr[PartialPositionAnchor] = js.native
  var disableSwapping: js.UndefOr[Boolean] = js.native
  var disableVHBounds: js.UndefOr[Boolean] = js.native
  var initialX: js.UndefOr[Double] = js.native
  var initialY: js.UndefOr[Double] = js.native
  var preventOverlap: js.UndefOr[Boolean] = js.native
  var transformOrigin: js.UndefOr[Boolean] = js.native
  var vhMargin: js.UndefOr[Double] = js.native
  var vwMargin: js.UndefOr[Double] = js.native
  var width: js.UndefOr[PositionWidth] = js.native
  var xMargin: js.UndefOr[Double] = js.native
  var yMargin: js.UndefOr[Double] = js.native
}

object OptionalFixedPositionOptions {
  @scala.inline
  def apply(): OptionalFixedPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalFixedPositionOptions]
  }
  @scala.inline
  implicit class OptionalFixedPositionOptionsOps[Self <: OptionalFixedPositionOptions] (val x: Self) extends AnyVal {
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
    def setAnchor(value: PartialPositionAnchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setDisableSwapping(value: Boolean): Self = this.set("disableSwapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSwapping: Self = this.set("disableSwapping", js.undefined)
    @scala.inline
    def setDisableVHBounds(value: Boolean): Self = this.set("disableVHBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableVHBounds: Self = this.set("disableVHBounds", js.undefined)
    @scala.inline
    def setInitialX(value: Double): Self = this.set("initialX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialX: Self = this.set("initialX", js.undefined)
    @scala.inline
    def setInitialY(value: Double): Self = this.set("initialY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialY: Self = this.set("initialY", js.undefined)
    @scala.inline
    def setPreventOverlap(value: Boolean): Self = this.set("preventOverlap", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventOverlap: Self = this.set("preventOverlap", js.undefined)
    @scala.inline
    def setTransformOrigin(value: Boolean): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
    @scala.inline
    def setVhMargin(value: Double): Self = this.set("vhMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVhMargin: Self = this.set("vhMargin", js.undefined)
    @scala.inline
    def setVwMargin(value: Double): Self = this.set("vwMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVwMargin: Self = this.set("vwMargin", js.undefined)
    @scala.inline
    def setWidth(value: PositionWidth): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setXMargin(value: Double): Self = this.set("xMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXMargin: Self = this.set("xMargin", js.undefined)
    @scala.inline
    def setYMargin(value: Double): Self = this.set("yMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYMargin: Self = this.set("yMargin", js.undefined)
  }
  
}

