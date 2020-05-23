package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SubscriptionState extends js.Object

@JSGlobal("Realm.Sync.SubscriptionState")
@js.native
object SubscriptionState extends js.Object {
  @js.native
  sealed trait Complete extends SubscriptionState
  
  @js.native
  sealed trait Creating extends SubscriptionState
  
  @js.native
  sealed trait Error extends SubscriptionState
  
  @js.native
  sealed trait Invalidated extends SubscriptionState
  
  @js.native
  sealed trait Pending extends SubscriptionState
  
}

