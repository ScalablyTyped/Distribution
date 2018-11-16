package typings
package pubnubLib.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pubnub extends js.Object {
  def addListener(params: pubnubLib.pubnubMod.PubnubNs.ListenerParameters): scala.Unit = js.native
  def fire(params: pubnubLib.pubnubMod.PubnubNs.FireParameters): stdLib.Promise[pubnubLib.pubnubMod.PubnubNs.PublishResponse] = js.native
  def fire(
    params: pubnubLib.pubnubMod.PubnubNs.FireParameters,
    callback: js.Function2[
      /* status */ pubnubLib.pubnubMod.PubnubNs.PublishStatus, 
      /* response */ pubnubLib.pubnubMod.PubnubNs.PublishResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getFilterExpression(): java.lang.String = js.native
  def getState(params: pubnubLib.pubnubMod.PubnubNs.GetStateParameters): stdLib.Promise[pubnubLib.pubnubMod.PubnubNs.GetStateResponse] = js.native
  def getState(
    params: pubnubLib.pubnubMod.PubnubNs.GetStateParameters,
    callback: js.Function2[
      /* status */ pubnubLib.pubnubMod.PubnubNs.GetStateStatus, 
      /* state */ pubnubLib.pubnubMod.PubnubNs.GetStateResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getUUID(): java.lang.String = js.native
  def hereNow(params: pubnubLib.pubnubMod.PubnubNs.HereNowParameters): stdLib.Promise[pubnubLib.pubnubMod.PubnubNs.HereNowResponse] = js.native
  def hereNow(
    params: pubnubLib.pubnubMod.PubnubNs.HereNowParameters,
    callback: js.Function2[
      /* status */ pubnubLib.pubnubMod.PubnubNs.HereNowStatus, 
      /* response */ pubnubLib.pubnubMod.PubnubNs.HereNowResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def publish(params: pubnubLib.pubnubMod.PubnubNs.PublishParameters): stdLib.Promise[pubnubLib.pubnubMod.PubnubNs.PublishResponse] = js.native
  def publish(
    params: pubnubLib.pubnubMod.PubnubNs.PublishParameters,
    callback: js.Function2[
      /* status */ pubnubLib.pubnubMod.PubnubNs.PublishStatus, 
      /* response */ pubnubLib.pubnubMod.PubnubNs.PublishResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def removeListener(params: pubnubLib.pubnubMod.PubnubNs.ListenerParameters): scala.Unit = js.native
  def setAuthKey(authKey: java.lang.String): scala.Unit = js.native
  def setFilterExpression(filterExpression: java.lang.String): scala.Unit = js.native
  def setState(params: pubnubLib.pubnubMod.PubnubNs.SetStateParameters): stdLib.Promise[pubnubLib.pubnubMod.PubnubNs.SetStateResponse] = js.native
  def setState(
    params: pubnubLib.pubnubMod.PubnubNs.SetStateParameters,
    callback: js.Function2[
      /* status */ pubnubLib.pubnubMod.PubnubNs.SetStateStatus, 
      /* state */ pubnubLib.pubnubMod.PubnubNs.SetStateResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def setUUID(uuid: java.lang.String): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def subscribe(params: pubnubLib.pubnubMod.PubnubNs.SubscribeParameters): scala.Unit = js.native
  def unsubscribe(params: pubnubLib.pubnubMod.PubnubNs.UnsubscribeParameters): scala.Unit = js.native
  def unsubscribeAll(): scala.Unit = js.native
  def whereNow(params: pubnubLib.pubnubMod.PubnubNs.WhereNowParameters): stdLib.Promise[pubnubLib.pubnubMod.PubnubNs.WhereNowResponse] = js.native
  def whereNow(
    params: pubnubLib.pubnubMod.PubnubNs.WhereNowParameters,
    callback: js.Function2[
      /* status */ pubnubLib.pubnubMod.PubnubNs.WhereNowStatus, 
      /* response */ pubnubLib.pubnubMod.PubnubNs.WhereNowResponse, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

