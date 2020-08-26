package typings.snekfetch.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnekfetchOptions extends js.Object {
  var agent: js.UndefOr[Agent | Boolean] = js.native
  var data: js.UndefOr[js.Object | String | Buffer] = js.native
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
  var qs: js.UndefOr[js.Object] = js.native
  var query: js.UndefOr[js.Object | String] = js.native
  var redirect: js.UndefOr[Boolean] = js.native
}

object SnekfetchOptions {
  @scala.inline
  def apply(): SnekfetchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnekfetchOptions]
  }
  @scala.inline
  implicit class SnekfetchOptionsOps[Self <: SnekfetchOptions] (val x: Self) extends AnyVal {
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
    def setAgent(value: Agent | Boolean): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setData(value: js.Object | String | Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setHeaders(value: StringDictionary[js.Any]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setQs(value: js.Object): Self = this.set("qs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQs: Self = this.set("qs", js.undefined)
    @scala.inline
    def setQuery(value: js.Object | String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setRedirect(value: Boolean): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
  }
  
}

