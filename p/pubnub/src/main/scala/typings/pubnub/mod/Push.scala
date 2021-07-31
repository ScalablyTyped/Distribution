package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Push extends StObject {
  
  def addChannels(params: PushChannelParameters): js.Promise[Unit] = js.native
  def addChannels(params: PushChannelParameters, callback: StatusCallback): Unit = js.native
  
  def deleteDevice(params: PushDeviceParameters): js.Promise[Unit] = js.native
  def deleteDevice(params: PushDeviceParameters, callback: StatusCallback): Unit = js.native
  
  def listChannels(params: PushDeviceParameters): js.Promise[PushListChannelsResponse] = js.native
  def listChannels(params: PushDeviceParameters, callback: Callback[PushListChannelsResponse]): Unit = js.native
  
  def removeChannels(params: PushChannelParameters): js.Promise[Unit] = js.native
  def removeChannels(params: PushChannelParameters, callback: StatusCallback): Unit = js.native
}
