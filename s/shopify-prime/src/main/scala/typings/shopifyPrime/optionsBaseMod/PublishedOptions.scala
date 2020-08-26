package typings.shopifyPrime.optionsBaseMod

import typings.shopifyPrime.publishedStatusMod.PublishedStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishedOptions extends js.Object {
  /**
    * Filter results to those published before date (format: 2014-04-25T16:15:47-04:00)
    */
  var published_at_max: js.UndefOr[String] = js.native
  /**
    * Filter results to those published after date (format: 2014-04-25T16:15:47-04:00)
    */
  var published_at_min: js.UndefOr[String] = js.native
  /**
    * Filter results to those with the given publish status.
    */
  var published_status: js.UndefOr[PublishedStatus] = js.native
}

object PublishedOptions {
  @scala.inline
  def apply(): PublishedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishedOptions]
  }
  @scala.inline
  implicit class PublishedOptionsOps[Self <: PublishedOptions] (val x: Self) extends AnyVal {
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
    def setPublished_at_max(value: String): Self = this.set("published_at_max", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished_at_max: Self = this.set("published_at_max", js.undefined)
    @scala.inline
    def setPublished_at_min(value: String): Self = this.set("published_at_min", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished_at_min: Self = this.set("published_at_min", js.undefined)
    @scala.inline
    def setPublished_status(value: PublishedStatus): Self = this.set("published_status", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublished_status: Self = this.set("published_status", js.undefined)
  }
  
}

