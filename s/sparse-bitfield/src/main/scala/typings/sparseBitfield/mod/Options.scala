package typings.sparseBitfield.mod

import typings.memoryPager.mod.PagerInstance
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * An existing bitfield.
    */
  var buffer: js.UndefOr[Buffer] = js.native
  /**
    * @default 0
    */
  var pageOffset: js.UndefOr[Double] = js.native
  /**
    * How big should the partial buffers be.
    * @default 1024
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A pre-configured Pager instance.
    */
  var pages: js.UndefOr[PagerInstance] = js.native
  /**
    * Track when pages are being updated in the pager.
    * @default false
    */
  var trackUpdates: js.UndefOr[Boolean] = js.native
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
    def setBuffer(value: Buffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setPageOffset(value: Double): Self = this.set("pageOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageOffset: Self = this.set("pageOffset", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPages(value: PagerInstance): Self = this.set("pages", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePages: Self = this.set("pages", js.undefined)
    @scala.inline
    def setTrackUpdates(value: Boolean): Self = this.set("trackUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackUpdates: Self = this.set("trackUpdates", js.undefined)
  }
  
}

