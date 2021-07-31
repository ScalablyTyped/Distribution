package typings.std

import typings.std.stdStrings.error
import typings.std.stdStrings.localcandidate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceGatherer
  extends StObject
     with RTCStatsProvider {
  
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_localcandidate(
    `type`: localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, js.Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_localcandidate(
    `type`: localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_localcandidate(
    `type`: localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, js.Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  val component: RTCIceComponent = js.native
  
  def createAssociatedGatherer(): RTCIceGatherer = js.native
  
  def getLocalCandidates(): js.Array[RTCIceCandidateDictionary] = js.native
  
  def getLocalParameters(): RTCIceParameters = js.native
  
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]) | Null = js.native
  
  var onlocalcandidate: (js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, js.Any]) | Null = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_localcandidate(
    `type`: localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, js.Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_localcandidate(
    `type`: localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, js.Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_localcandidate(
    `type`: localcandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCIceGathererEvent, js.Any],
    options: EventListenerOptions
  ): Unit = js.native
}
