package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// channelGroups
@js.native
trait ChannelGroups extends js.Object {
  def addChannels(params: AddChannelParameters): js.Promise[js.Object] = js.native
  def addChannels(params: AddChannelParameters, callback: js.Function1[/* status */ ChannelGroupStatus, Unit]): Unit = js.native
  def deleteGroup(params: DeleteGroupParameters): js.Promise[js.Object] = js.native
  def deleteGroup(params: DeleteGroupParameters, callback: js.Function1[/* status */ ChannelGroupStatus, Unit]): Unit = js.native
  def listChannels(params: ListChannelsParameters): js.Promise[ListChannelsResponse] = js.native
  def listChannels(
    params: ListChannelsParameters,
    callback: js.Function2[/* status */ ChannelGroupStatus, /* response */ ListChannelsResponse, Unit]
  ): Unit = js.native
  def listGroups(): js.Promise[ListAllGroupsResponse] = js.native
  def listGroups(
    callback: js.Function2[/* status */ ChannelGroupStatus, /* response */ ListAllGroupsResponse, Unit]
  ): Unit = js.native
  def removeChannels(params: RemoveChannelParameters): js.Promise[js.Object] = js.native
  def removeChannels(params: RemoveChannelParameters, callback: js.Function1[/* status */ ChannelGroupStatus, Unit]): Unit = js.native
}

