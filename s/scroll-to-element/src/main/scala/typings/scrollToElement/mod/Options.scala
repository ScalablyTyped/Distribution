package typings.scrollToElement.mod

import typings.scrollToElement.scrollToElementStrings.bottom
import typings.scrollToElement.scrollToElementStrings.middle
import typings.scrollToElement.scrollToElementStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var align: js.UndefOr[top | middle | bottom] = js.native
  var duration: js.UndefOr[Double] = js.native
  var ease: js.UndefOr[String] = js.native
  var offset: Double = js.native
}

object Options {
  @scala.inline
  def apply(offset: Double): Options = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlign(value: top | middle | bottom): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEase(value: String): Self = this.set("ease", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
  }
  
}

