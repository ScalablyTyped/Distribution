package typings
package sharepointLib.SrchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSGlobal("Srch.EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait batchQueryIssuing
    extends sharepointLib.SrchNs.EventType
  
  @js.native
  sealed trait batchResultReady
    extends sharepointLib.SrchNs.EventType
  
  @js.native
  sealed trait load
    extends sharepointLib.SrchNs.EventType
  
  @js.native
  sealed trait none
    extends sharepointLib.SrchNs.EventType
  
  @js.native
  sealed trait postLoad
    extends sharepointLib.SrchNs.EventType
  
  @js.native
  sealed trait preLoad
    extends sharepointLib.SrchNs.EventType
  
  @js.native
  sealed trait queryIssuing
    extends sharepointLib.SrchNs.EventType
  
  @js.native
  sealed trait queryReady
    extends sharepointLib.SrchNs.EventType
  
  @js.native
  sealed trait queryStateChanged
    extends sharepointLib.SrchNs.EventType
  
  @js.native
  sealed trait resultReady
    extends sharepointLib.SrchNs.EventType
  
  @js.native
  sealed trait resultRendered
    extends sharepointLib.SrchNs.EventType
  
  /* 3 */ val batchQueryIssuing: batchQueryIssuing with scala.Double = js.native
  /* 5 */ val batchResultReady: batchResultReady with scala.Double = js.native
  /* 9 */ val load: load with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 10 */ val postLoad: postLoad with scala.Double = js.native
  /* 8 */ val preLoad: preLoad with scala.Double = js.native
  /* 2 */ val queryIssuing: queryIssuing with scala.Double = js.native
  /* 1 */ val queryReady: queryReady with scala.Double = js.native
  /* 6 */ val queryStateChanged: queryStateChanged with scala.Double = js.native
  /* 4 */ val resultReady: resultReady with scala.Double = js.native
  /* 7 */ val resultRendered: resultRendered with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SrchNs.EventType with scala.Double] = js.native
}

