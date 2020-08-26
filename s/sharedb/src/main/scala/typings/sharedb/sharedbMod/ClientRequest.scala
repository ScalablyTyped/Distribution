package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientRequest
  extends // Users can use server middleware to add additional metadata to snapshots.
/* key */ StringDictionary[js.Any] {
  /** Short name of the request's action */
  var a: RequestAction = js.native
}

object ClientRequest {
  @scala.inline
  def apply(a: RequestAction): ClientRequest = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequest]
  }
  @scala.inline
  implicit class ClientRequestOps[Self <: ClientRequest] (val x: Self) extends AnyVal {
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
    def setA(value: RequestAction): Self = this.set("a", value.asInstanceOf[js.Any])
  }
  
}

