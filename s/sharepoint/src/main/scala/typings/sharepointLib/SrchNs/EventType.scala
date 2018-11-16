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
  
  val batchQueryIssuing: batchQueryIssuing with java.lang.String = js.native
  val batchResultReady: batchResultReady with java.lang.String = js.native
  val load: load with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val postLoad: postLoad with java.lang.String = js.native
  val preLoad: preLoad with java.lang.String = js.native
  val queryIssuing: queryIssuing with java.lang.String = js.native
  val queryReady: queryReady with java.lang.String = js.native
  val queryStateChanged: queryStateChanged with java.lang.String = js.native
  val resultReady: resultReady with java.lang.String = js.native
  val resultRendered: resultRendered with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SrchNs.EventType with java.lang.String] = js.native
}

