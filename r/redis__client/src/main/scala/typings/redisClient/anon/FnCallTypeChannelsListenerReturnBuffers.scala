package typings.redisClient.anon

import typings.redisClient.distLibClientPubSubMod.PubSubListener
import typings.redisClient.distLibClientPubSubMod.PubSubType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallTypeChannelsListenerReturnBuffers extends StObject {
  
  def apply[T /* <: Boolean */](`type`: PubSubType): js.UndefOr[ChannelsCounter] = js.native
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: String): js.UndefOr[ChannelsCounter] = js.native
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: Unit, returnBuffers: T): js.UndefOr[ChannelsCounter] = js.native
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: PubSubListener[T]): js.UndefOr[ChannelsCounter] = js.native
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: String, listener: PubSubListener[T], returnBuffers: T): js.UndefOr[ChannelsCounter] = js.native
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String]): js.UndefOr[ChannelsCounter] = js.native
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: Unit, returnBuffers: T): js.UndefOr[ChannelsCounter] = js.native
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: PubSubListener[T]): js.UndefOr[ChannelsCounter] = js.native
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: js.Array[String], listener: PubSubListener[T], returnBuffers: T): js.UndefOr[ChannelsCounter] = js.native
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: Unit, listener: Unit, returnBuffers: T): js.UndefOr[ChannelsCounter] = js.native
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: Unit, listener: PubSubListener[T]): js.UndefOr[ChannelsCounter] = js.native
  def apply[T /* <: Boolean */](`type`: PubSubType, channels: Unit, listener: PubSubListener[T], returnBuffers: T): js.UndefOr[ChannelsCounter] = js.native
}
