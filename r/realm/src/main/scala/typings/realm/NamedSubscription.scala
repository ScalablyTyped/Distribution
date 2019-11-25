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
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeToLive = timeToLive.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NamedSubscription]
  }
}

