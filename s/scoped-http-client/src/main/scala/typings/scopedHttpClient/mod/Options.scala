package typings.scopedHttpClient.mod

import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequestArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends ClientRequestArgs {
  var encoding: js.UndefOr[String] = js.native
  var hash: js.UndefOr[String] = js.native
  var httpAgent: js.UndefOr[Agent | Boolean] = js.native
  var httpsAgent: js.UndefOr[Agent | Boolean] = js.native
  var pathname: js.UndefOr[String] = js.native
  var query: js.UndefOr[js.Any] = js.native
  var slashes: js.UndefOr[js.Any] = js.native
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
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    @scala.inline
    def setHttpAgent(value: Agent | Boolean): Self = this.set("httpAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpAgent: Self = this.set("httpAgent", js.undefined)
    @scala.inline
    def setHttpsAgent(value: Agent | Boolean): Self = this.set("httpsAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpsAgent: Self = this.set("httpsAgent", js.undefined)
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathname: Self = this.set("pathname", js.undefined)
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setSlashes(value: js.Any): Self = this.set("slashes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlashes: Self = this.set("slashes", js.undefined)
  }
  
}

