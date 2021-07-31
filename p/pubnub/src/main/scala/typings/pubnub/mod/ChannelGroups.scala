package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// channelGroups
@js.native
trait ChannelGroups extends StObject {
  
  def addChannels(params: AddChannelParameters): js.Promise[js.Object] = js.native
  def addChannels(params: AddChannelParameters, callback: StatusCallback): Unit = js.native
  
  def deleteGroup(params: DeleteGroupParameters): js.Promise[js.Object] = js.native
  def deleteGroup(params: DeleteGroupParameters, callback: StatusCallback): Unit = js.native
  
  def listChannels(params: ListChannelsParameters): js.Promise[ListChannelsResponse] = js.native
  def listChannels(params: ListChannelsParameters, callback: Callback[ListChannelsResponse]): Unit = js.native
  
  def listGroups(): js.Promise[ListAllGroupsResponse] = js.native
  def listGroups(callback: Callback[ListAllGroupsResponse]): Unit = js.native
  
  def removeChannels(params: RemoveChannelParameters): js.Promise[js.Object] = js.native
  def removeChannels(params: RemoveChannelParameters, callback: StatusCallback): Unit = js.native
}
