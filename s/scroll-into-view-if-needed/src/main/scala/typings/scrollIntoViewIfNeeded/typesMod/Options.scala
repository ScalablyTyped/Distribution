package typings.scrollIntoViewIfNeeded.typesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var block: js.UndefOr[ScrollLogicalPosition] = js.native
  var boundary: js.UndefOr[CustomScrollBoundary] = js.native
  var `inline`: js.UndefOr[ScrollLogicalPosition] = js.native
  var scrollMode: js.UndefOr[ScrollMode] = js.native
  var skipOverflowHiddenElements: js.UndefOr[SkipOverflowHiddenElements] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBlock(value: ScrollLogicalPosition): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    @scala.inline
    def setBoundaryFunction1(value: /* parent */ Element => Boolean): Self = this.set("boundary", js.Any.fromFunction1(value))
    @scala.inline
    def setBoundary(value: CustomScrollBoundary): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    @scala.inline
    def setBoundaryNull: Self = this.set("boundary", null)
    @scala.inline
    def setInline(value: ScrollLogicalPosition): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setScrollMode(value: ScrollMode): Self = this.set("scrollMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollMode: Self = this.set("scrollMode", js.undefined)
    @scala.inline
    def setSkipOverflowHiddenElements(value: SkipOverflowHiddenElements): Self = this.set("skipOverflowHiddenElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipOverflowHiddenElements: Self = this.set("skipOverflowHiddenElements", js.undefined)
  }
  
}

