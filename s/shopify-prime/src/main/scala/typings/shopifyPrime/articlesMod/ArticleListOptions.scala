package typings.shopifyPrime.articlesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArticleListOptions extends js.Object {
  /**
    * Filter by article handle.
    */
  var handle: js.UndefOr[String] = js.native
}

object ArticleListOptions {
  @scala.inline
  def apply(): ArticleListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArticleListOptions]
  }
  @scala.inline
  implicit class ArticleListOptionsOps[Self <: ArticleListOptions] (val x: Self) extends AnyVal {
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
  }
  
}

