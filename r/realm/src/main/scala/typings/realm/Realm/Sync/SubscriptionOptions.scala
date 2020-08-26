package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionOptions extends js.Object {
  var includeLinkingObjects: js.UndefOr[js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var timeToLive: js.UndefOr[Double] = js.native
  var update: js.UndefOr[Boolean] = js.native
}

object SubscriptionOptions {
  @scala.inline
  def apply(): SubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionOptions]
  }
  @scala.inline
  implicit class SubscriptionOptionsOps[Self <: SubscriptionOptions] (val x: Self) extends AnyVal {
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
    def setIncludeLinkingObjectsVarargs(value: String*): Self = this.set("includeLinkingObjects", js.Array(value :_*))
    @scala.inline
    def setIncludeLinkingObjects(value: js.Array[String]): Self = this.set("includeLinkingObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeLinkingObjects: Self = this.set("includeLinkingObjects", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTimeToLive(value: Double): Self = this.set("timeToLive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeToLive: Self = this.set("timeToLive", js.undefined)
    @scala.inline
    def setUpdate(value: Boolean): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

