package typings.reactFoundation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clearfix extends js.Object {
  var clearfix: js.UndefOr[Boolean] = js.native
  var `float-center`: Boolean = js.native
  var `float-left`: Boolean = js.native
  var `float-right`: Boolean = js.native
  var hide: js.UndefOr[Boolean] = js.native
  var `hide-for-large`: Boolean = js.native
  var `hide-for-large-only`: Boolean = js.native
  var `hide-for-medium`: Boolean = js.native
  var `hide-for-medium-only`: Boolean = js.native
  var `hide-for-small-only`: Boolean = js.native
  var invisible: js.UndefOr[Boolean] = js.native
  var `show-for-landscape`: js.UndefOr[Boolean] = js.native
  var `show-for-large`: Boolean = js.native
  var `show-for-large-only`: Boolean = js.native
  var `show-for-medium`: Boolean = js.native
  var `show-for-medium-only`: Boolean = js.native
  var `show-for-portrait`: js.UndefOr[Boolean] = js.native
  var `show-for-small-only`: Boolean = js.native
  var `show-for-sr`: js.UndefOr[Boolean] = js.native
  var `show-on-focus`: js.UndefOr[Boolean] = js.native
}

object Clearfix {
  @scala.inline
  def apply(
    `float-center`: Boolean,
    `float-left`: Boolean,
    `float-right`: Boolean,
    `hide-for-large`: Boolean,
    `hide-for-large-only`: Boolean,
    `hide-for-medium`: Boolean,
    `hide-for-medium-only`: Boolean,
    `hide-for-small-only`: Boolean,
    `show-for-large`: Boolean,
    `show-for-large-only`: Boolean,
    `show-for-medium`: Boolean,
    `show-for-medium-only`: Boolean,
    `show-for-small-only`: Boolean
  ): Clearfix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("float-center")(`float-center`.asInstanceOf[js.Any])
    __obj.updateDynamic("float-left")(`float-left`.asInstanceOf[js.Any])
    __obj.updateDynamic("float-right")(`float-right`.asInstanceOf[js.Any])
    __obj.updateDynamic("hide-for-large")(`hide-for-large`.asInstanceOf[js.Any])
    __obj.updateDynamic("hide-for-large-only")(`hide-for-large-only`.asInstanceOf[js.Any])
    __obj.updateDynamic("hide-for-medium")(`hide-for-medium`.asInstanceOf[js.Any])
    __obj.updateDynamic("hide-for-medium-only")(`hide-for-medium-only`.asInstanceOf[js.Any])
    __obj.updateDynamic("hide-for-small-only")(`hide-for-small-only`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-for-large")(`show-for-large`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-for-large-only")(`show-for-large-only`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-for-medium")(`show-for-medium`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-for-medium-only")(`show-for-medium-only`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-for-small-only")(`show-for-small-only`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clearfix]
  }
  @scala.inline
  implicit class ClearfixOps[Self <: Clearfix] (val x: Self) extends AnyVal {
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
    def `setFloat-center`(value: Boolean): Self = this.set("float-center", value.asInstanceOf[js.Any])
    @scala.inline
    def `setFloat-left`(value: Boolean): Self = this.set("float-left", value.asInstanceOf[js.Any])
    @scala.inline
    def `setFloat-right`(value: Boolean): Self = this.set("float-right", value.asInstanceOf[js.Any])
    @scala.inline
    def `setHide-for-large`(value: Boolean): Self = this.set("hide-for-large", value.asInstanceOf[js.Any])
    @scala.inline
    def `setHide-for-large-only`(value: Boolean): Self = this.set("hide-for-large-only", value.asInstanceOf[js.Any])
    @scala.inline
    def `setHide-for-medium`(value: Boolean): Self = this.set("hide-for-medium", value.asInstanceOf[js.Any])
    @scala.inline
    def `setHide-for-medium-only`(value: Boolean): Self = this.set("hide-for-medium-only", value.asInstanceOf[js.Any])
    @scala.inline
    def `setHide-for-small-only`(value: Boolean): Self = this.set("hide-for-small-only", value.asInstanceOf[js.Any])
    @scala.inline
    def `setShow-for-large`(value: Boolean): Self = this.set("show-for-large", value.asInstanceOf[js.Any])
    @scala.inline
    def `setShow-for-large-only`(value: Boolean): Self = this.set("show-for-large-only", value.asInstanceOf[js.Any])
    @scala.inline
    def `setShow-for-medium`(value: Boolean): Self = this.set("show-for-medium", value.asInstanceOf[js.Any])
    @scala.inline
    def `setShow-for-medium-only`(value: Boolean): Self = this.set("show-for-medium-only", value.asInstanceOf[js.Any])
    @scala.inline
    def `setShow-for-small-only`(value: Boolean): Self = this.set("show-for-small-only", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearfix(value: Boolean): Self = this.set("clearfix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearfix: Self = this.set("clearfix", js.undefined)
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setInvisible(value: Boolean): Self = this.set("invisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvisible: Self = this.set("invisible", js.undefined)
    @scala.inline
    def `setShow-for-landscape`(value: Boolean): Self = this.set("show-for-landscape", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShow-for-landscape`: Self = this.set("show-for-landscape", js.undefined)
    @scala.inline
    def `setShow-for-portrait`(value: Boolean): Self = this.set("show-for-portrait", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShow-for-portrait`: Self = this.set("show-for-portrait", js.undefined)
    @scala.inline
    def `setShow-for-sr`(value: Boolean): Self = this.set("show-for-sr", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShow-for-sr`: Self = this.set("show-for-sr", js.undefined)
    @scala.inline
    def `setShow-on-focus`(value: Boolean): Self = this.set("show-on-focus", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShow-on-focus`: Self = this.set("show-on-focus", js.undefined)
  }
  
}

