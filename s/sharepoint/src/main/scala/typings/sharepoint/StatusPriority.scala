package typings.sharepoint

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StatusPriority extends js.Object

@JSGlobal("StatusPriority")
@js.native
object StatusPriority extends js.Object {
  @js.native
  sealed trait blue extends StatusPriority
  
  @js.native
  sealed trait green extends StatusPriority
  
  @js.native
  sealed trait red extends StatusPriority
  
  @js.native
  sealed trait yellow extends StatusPriority
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StatusPriority with Double] = js.native
  /* 3 */ @js.native
  object blue extends TopLevel[blue with Double]
  
  /* 2 */ @js.native
  object green extends TopLevel[green with Double]
  
  /* 0 */ @js.native
  object red extends TopLevel[red with Double]
  
  /* 1 */ @js.native
  object yellow extends TopLevel[yellow with Double]
  
}

