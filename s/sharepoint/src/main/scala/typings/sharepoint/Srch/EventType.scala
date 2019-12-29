package typings.sharepoint.Srch

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
  /* 3 */ @js.native
  object batchQueryIssuing extends TopLevel[batchQueryIssuing with Double]
  
  /* 5 */ @js.native
  object batchResultReady extends TopLevel[batchResultReady with Double]
  
  /* 9 */ @js.native
  object load extends TopLevel[load with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 10 */ @js.native
  object postLoad extends TopLevel[postLoad with Double]
  
  /* 8 */ @js.native
  object preLoad extends TopLevel[preLoad with Double]
  
  /* 2 */ @js.native
  object queryIssuing extends TopLevel[queryIssuing with Double]
  
  /* 1 */ @js.native
  object queryReady extends TopLevel[queryReady with Double]
  
  /* 6 */ @js.native
  object queryStateChanged extends TopLevel[queryStateChanged with Double]
  
  /* 4 */ @js.native
  object resultReady extends TopLevel[resultReady with Double]
  
  /* 7 */ @js.native
  object resultRendered extends TopLevel[resultRendered with Double]
  
}

