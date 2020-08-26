package typings.proxyVerifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllResults extends js.Object {
  var anonymityLevel: js.UndefOr[AnonymityLevel] = js.native
  var protocols: js.UndefOr[ProtocolResult] = js.native
  var tunnel: js.UndefOr[Result] = js.native
}

object AllResults {
  @scala.inline
  def apply(): AllResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllResults]
  }
  @scala.inline
  implicit class AllResultsOps[Self <: AllResults] (val x: Self) extends AnyVal {
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
    def setAnonymityLevel(value: AnonymityLevel): Self = this.set("anonymityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnonymityLevel: Self = this.set("anonymityLevel", js.undefined)
    @scala.inline
    def setProtocols(value: ProtocolResult): Self = this.set("protocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    @scala.inline
    def setTunnel(value: Result): Self = this.set("tunnel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel: Self = this.set("tunnel", js.undefined)
  }
  
}

