package typings.realm

import typings.realm.Realm.Sync.SubscriptionState
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedSubscription extends js.Object {
  val createdAt: Date
  val error: String
  val expiresAt: Date
  val name: String
  val objectType: String
  var query: String
  val state: SubscriptionState
  var timeToLive: Double
  val updatedAt: Date
}

object NamedSubscription {
  @scala.inline
  def apply(
    createdAt: Date,
    error: String,
    expiresAt: Date,
    name: String,
    objectType: String,
    query: String,
    state: SubscriptionState,
    timeToLive: Double,
    updatedAt: Date
  ): NamedSubscription = {
    val __obj = js.Dynamic.literal(createdAt = createdAt, error = error, expiresAt = expiresAt, name = name, objectType = objectType, query = query, state = state, timeToLive = timeToLive, updatedAt = updatedAt)
  
    __obj.asInstanceOf[NamedSubscription]
  }
}

