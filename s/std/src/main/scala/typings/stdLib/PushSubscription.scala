package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the Push API provides a subcription's URL endpoint and allows unsubscription from a push service. */
trait PushSubscription extends js.Object {
  val endpoint: java.lang.String
  val expirationTime: scala.Double | scala.Null
  val options: PushSubscriptionOptions
  def getKey(name: PushEncryptionKeyName): ArrayBuffer | scala.Null
  def toJSON(): PushSubscriptionJSON
  def unsubscribe(): js.Promise[scala.Boolean]
}

@JSGlobal("PushSubscription")
@js.native
class PushSubscriptionCls () extends PushSubscription {
  /* CompleteClass */
  override val endpoint: java.lang.String = js.native
  /* CompleteClass */
  override val expirationTime: scala.Double | scala.Null = js.native
  /* CompleteClass */
  override val options: PushSubscriptionOptions = js.native
  /* CompleteClass */
  override def getKey(name: PushEncryptionKeyName): ArrayBuffer | scala.Null = js.native
  /* CompleteClass */
  override def toJSON(): PushSubscriptionJSON = js.native
  /* CompleteClass */
  override def unsubscribe(): js.Promise[scala.Boolean] = js.native
}

@JSGlobal("PushSubscription")
@js.native
object PushSubscription
  extends org.scalablytyped.runtime.Instantiable0[PushSubscription]

