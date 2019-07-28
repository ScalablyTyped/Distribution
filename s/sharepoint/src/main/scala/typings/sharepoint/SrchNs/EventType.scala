package typings.sharepoint.SrchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSGlobal("Srch.EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait batchQueryIssuing extends EventType
  
  @js.native
  sealed trait batchResultReady extends EventType
  
  @js.native
  sealed trait load extends EventType
  
  @js.native
  sealed trait none extends EventType
  
  @js.native
  sealed trait postLoad extends EventType
  
  @js.native
  sealed trait preLoad extends EventType
  
  @js.native
  sealed trait queryIssuing extends EventType
  
  @js.native
  sealed trait queryReady extends EventType
  
  @js.native
  sealed trait queryStateChanged extends EventType
  
  @js.native
  sealed trait resultReady extends EventType
  
  @js.native
  sealed trait resultRendered extends EventType
  
  /* 3 */ val batchQueryIssuing: typings.sharepoint.SrchNs.EventType.batchQueryIssuing with Double = js.native
  /* 5 */ val batchResultReady: typings.sharepoint.SrchNs.EventType.batchResultReady with Double = js.native
  /* 9 */ val load: typings.sharepoint.SrchNs.EventType.load with Double = js.native
  /* 0 */ val none: typings.sharepoint.SrchNs.EventType.none with Double = js.native
  /* 10 */ val postLoad: typings.sharepoint.SrchNs.EventType.postLoad with Double = js.native
  /* 8 */ val preLoad: typings.sharepoint.SrchNs.EventType.preLoad with Double = js.native
  /* 2 */ val queryIssuing: typings.sharepoint.SrchNs.EventType.queryIssuing with Double = js.native
  /* 1 */ val queryReady: typings.sharepoint.SrchNs.EventType.queryReady with Double = js.native
  /* 6 */ val queryStateChanged: typings.sharepoint.SrchNs.EventType.queryStateChanged with Double = js.native
  /* 4 */ val resultReady: typings.sharepoint.SrchNs.EventType.resultReady with Double = js.native
  /* 7 */ val resultRendered: typings.sharepoint.SrchNs.EventType.resultRendered with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
}

