package typings.shopifyPrime.blogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlogListOptions extends js.Object {
  /**
    * Filter by blog handle.
    */
  var handle: js.UndefOr[String] = js.native
  /**
    * Filter results to after the specified ID,
    */
  var since_id: js.UndefOr[Double] = js.native
}

object BlogListOptions {
  @scala.inline
  def apply(): BlogListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlogListOptions]
  }
  @scala.inline
  implicit class BlogListOptionsOps[Self <: BlogListOptions] (val x: Self) extends AnyVal {
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
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setSince_id(value: Double): Self = this.set("since_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince_id: Self = this.set("since_id", js.undefined)
  }
  
}

