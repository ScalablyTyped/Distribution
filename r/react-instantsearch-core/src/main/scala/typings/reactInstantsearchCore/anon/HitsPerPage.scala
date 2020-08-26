package typings.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HitsPerPage extends js.Object {
  var hitsPerPage: Double = js.native
}

object HitsPerPage {
  @scala.inline
  def apply(hitsPerPage: Double): HitsPerPage = {
    val __obj = js.Dynamic.literal(hitsPerPage = hitsPerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitsPerPage]
  }
  @scala.inline
  implicit class HitsPerPageOps[Self <: HitsPerPage] (val x: Self) extends AnyVal {
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
    def setHitsPerPage(value: Double): Self = this.set("hitsPerPage", value.asInstanceOf[js.Any])
  }
  
}

