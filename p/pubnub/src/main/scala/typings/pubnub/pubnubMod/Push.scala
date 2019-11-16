package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Push extends js.Object {
  def addChannels(params: PushChannelParameters): js.Promise[js.Object] = js.native
  def addChannels(params: PushChannelParameters, callback: js.Function1[/* status */ PubnubStatus, Unit]): Unit = js.native
  def deleteDevice(params: PushDeviceParameters): js.Promise[js.Object] = js.native
  def deleteDevice(params: PushDeviceParameters, callback: js.Function1[/* status */ PubnubStatus, Unit]): Unit = js.native
  def listChannels(params: PushDeviceParameters): js.Promise[PushListChannelsResponse] = js.native
  def listChannels(
    params: PushDeviceParameters,
    callback: js.Function2[/* status */ PubnubStatus, /* response */ PushListChannelsResponse, Unit]
  ): Unit = js.native
  def removeChannels(params: PushChannelParameters): js.Promise[js.Object] = js.native
  def removeChannels(params: PushChannelParameters, callback: js.Function1[/* status */ PubnubStatus, Unit]): Unit = js.native
}

