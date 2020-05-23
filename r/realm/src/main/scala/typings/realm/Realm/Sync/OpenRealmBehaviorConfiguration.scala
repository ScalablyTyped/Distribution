package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenRealmBehaviorConfiguration extends js.Object {
  val timeOut: js.UndefOr[Double] = js.undefined
  val timeOutBehavior: js.UndefOr[OpenRealmTimeOutBehavior] = js.undefined
  val `type`: OpenRealmBehaviorType
}

object OpenRealmBehaviorConfiguration {
  @scala.inline
  def apply(
    `type`: OpenRealmBehaviorType,
    timeOut: js.UndefOr[Double] = js.undefined,
    timeOutBehavior: OpenRealmTimeOutBehavior = null
  ): OpenRealmBehaviorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(timeOut)) __obj.updateDynamic("timeOut")(timeOut.get.asInstanceOf[js.Any])
    if (timeOutBehavior != null) __obj.updateDynamic("timeOutBehavior")(timeOutBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenRealmBehaviorConfiguration]
  }
}

