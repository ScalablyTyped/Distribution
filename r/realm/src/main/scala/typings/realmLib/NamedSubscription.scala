package typings
package realmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedSubscription extends js.Object {
  val createdAt: stdLib.Date
  val error: java.lang.String
  val expiresAt: stdLib.Date
  val name: java.lang.String
  val objectType: java.lang.String
  var query: java.lang.String
  val state: realmLib.RealmNs.SyncNs.SubscriptionState
  var timeToLive: scala.Double
  val updatedAt: stdLib.Date
}

object NamedSubscription {
  @scala.inline
  def apply(
    createdAt: stdLib.Date,
    error: java.lang.String,
    expiresAt: stdLib.Date,
    name: java.lang.String,
    objectType: java.lang.String,
    query: java.lang.String,
    state: realmLib.RealmNs.SyncNs.SubscriptionState,
    timeToLive: scala.Double,
    updatedAt: stdLib.Date
  ): NamedSubscription = {
    val __obj = js.Dynamic.literal(createdAt = createdAt, error = error, expiresAt = expiresAt, name = name, objectType = objectType, query = query, state = state, timeToLive = timeToLive, updatedAt = updatedAt)
  
    __obj.asInstanceOf[NamedSubscription]
  }
}

