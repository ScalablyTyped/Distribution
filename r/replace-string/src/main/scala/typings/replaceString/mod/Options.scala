package typings.replaceString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		Whether or not substring matching should be case-insensitive.
  		@default false
  		*/
  val caseInsensitive: js.UndefOr[Boolean] = js.native
  /**
  		Index at which to start replacing.
  		@default 0
  		*/
  val fromIndex: js.UndefOr[Double] = js.native
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
    def setCaseInsensitive(value: Boolean): Self = this.set("caseInsensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseInsensitive: Self = this.set("caseInsensitive", js.undefined)
    @scala.inline
    def setFromIndex(value: Double): Self = this.set("fromIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromIndex: Self = this.set("fromIndex", js.undefined)
  }
  
}

