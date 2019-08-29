package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Push API interface provides a subcription's URL endpoint and allows unsubscription from a push service. */
trait PushSubscription extends js.Object {
  val endpoint: java.lang.String
  val expirationTime: Double | Null
  val options: PushSubscriptionOptions
  def getKey(name: PushEncryptionKeyName): ArrayBuffer | Null
  def toJSON(): PushSubscriptionJSON
  def unsubscribe(): js.Promise[scala.Boolean]
}

@JSGlobal("PushSubscription")
@js.native
class PushSubscriptionCls () extends PushSubscription {
  /* CompleteClass */
  override val endpoint: java.lang.String = js.native
  /* CompleteClass */
  override val expirationTime: Double | Null = js.native
  /* CompleteClass */
  override val options: PushSubscriptionOptions = js.native
  /* CompleteClass */
  override def getKey(name: PushEncryptionKeyName): ArrayBuffer | Null = js.native
  /* CompleteClass */
  override def toJSON(): PushSubscriptionJSON = js.native
  /* CompleteClass */
  override def unsubscribe(): js.Promise[scala.Boolean] = js.native
}

@JSGlobal("PushSubscription")
@js.native
object PushSubscription extends Instantiable0[PushSubscription]

