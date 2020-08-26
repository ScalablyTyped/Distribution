package typings.rdflib.anon

import typings.rdflib.fetcherMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fetcher extends js.Object {
  var fetcher: default = js.native
}

object Fetcher {
  @scala.inline
  def apply(fetcher: default): Fetcher = {
    val __obj = js.Dynamic.literal(fetcher = fetcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fetcher]
  }
  @scala.inline
  implicit class FetcherOps[Self <: Fetcher] (val x: Self) extends AnyVal {
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
    def setFetcher(value: default): Self = this.set("fetcher", value.asInstanceOf[js.Any])
  }
  
}

