package typings.sharepoint.SP.WorkflowServices

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkflowStatus extends js.Object

@JSGlobal("SP.WorkflowServices.WorkflowStatus")
@js.native
object WorkflowStatus extends js.Object {
  @js.native
  sealed trait canceled extends WorkflowStatus
  
  @js.native
  sealed trait canceling extends WorkflowStatus
  
  @js.native
  sealed trait completed extends WorkflowStatus
  
  @js.native
  sealed trait invalid extends WorkflowStatus
  
  @js.native
  sealed trait notSpecified extends WorkflowStatus
  
  @js.native
  sealed trait notStarted extends WorkflowStatus
  
  @js.native
  sealed trait started extends WorkflowStatus
  
  @js.native
  sealed trait suspended extends WorkflowStatus
  
  @js.native
  sealed trait terminated extends WorkflowStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkflowStatus with Double] = js.native
  /* 4 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 3 */ @js.native
  object canceling extends TopLevel[canceling with Double]
  
  /* 6 */ @js.native
  object completed extends TopLevel[completed with Double]
  
  /* 8 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 7 */ @js.native
  object notSpecified extends TopLevel[notSpecified with Double]
  
  /* 0 */ @js.native
  object notStarted extends TopLevel[notStarted with Double]
  
  /* 1 */ @js.native
  object started extends TopLevel[started with Double]
  
  /* 2 */ @js.native
  object suspended extends TopLevel[suspended with Double]
  
  /* 5 */ @js.native
  object terminated extends TopLevel[terminated with Double]
  
}

