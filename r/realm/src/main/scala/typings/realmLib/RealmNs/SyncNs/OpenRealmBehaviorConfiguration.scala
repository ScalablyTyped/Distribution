package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenRealmBehaviorConfiguration extends js.Object {
  val timeOut: js.UndefOr[scala.Double] = js.undefined
  val timeOutBehavior: js.UndefOr[OpenRealmTimeOutBehavior] = js.undefined
  val `type`: OpenRealmBehaviorType
}

object OpenRealmBehaviorConfiguration {
  @scala.inline
  def apply(
    `type`: OpenRealmBehaviorType,
    timeOut: scala.Int | scala.Double = null,
    timeOutBehavior: OpenRealmTimeOutBehavior = null
  ): OpenRealmBehaviorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (timeOutBehavior != null) __obj.updateDynamic("timeOutBehavior")(timeOutBehavior)
    __obj.asInstanceOf[OpenRealmBehaviorConfiguration]
  }
}

