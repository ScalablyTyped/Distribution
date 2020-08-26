package typings.puppeteer.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshopOptions extends js.Object {
  /**
    * Prune uninteresting nodes from the tree.
    * @default true
    */
  var interestingOnly: js.UndefOr[Boolean] = js.native
  /**
    * The root DOM element for the snapshot.
    * @default document.body
    */
  var root: js.UndefOr[ElementHandle[Element]] = js.native
}

object SnapshopOptions {
  @scala.inline
  def apply(): SnapshopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshopOptions]
  }
  @scala.inline
  implicit class SnapshopOptionsOps[Self <: SnapshopOptions] (val x: Self) extends AnyVal {
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
    def setInterestingOnly(value: Boolean): Self = this.set("interestingOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterestingOnly: Self = this.set("interestingOnly", js.undefined)
    @scala.inline
    def setRoot(value: ElementHandle[Element]): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
  
}

