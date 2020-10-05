package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushSubscriptionJSON extends js.Object {
  var endpoint: js.UndefOr[java.lang.String] = js.native
  var expirationTime: js.UndefOr[Double | Null] = js.native
  var keys: js.UndefOr[Record[java.lang.String, java.lang.String]] = js.native
}

object PushSubscriptionJSON {
  @scala.inline
  def apply(): PushSubscriptionJSON = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushSubscriptionJSON]
  }
  @scala.inline
  implicit class PushSubscriptionJSONOps[Self <: PushSubscriptionJSON] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndpoint(value: java.lang.String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setExpirationTime(value: Double): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationTime: Self = this.set("expirationTime", js.undefined)
    @scala.inline
    def setExpirationTimeNull: Self = this.set("expirationTime", null)
    @scala.inline
    def setKeys(value: Record[java.lang.String, java.lang.String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
  }
  
}

