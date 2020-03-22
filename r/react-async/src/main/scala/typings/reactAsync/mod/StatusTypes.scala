package typings.reactAsync.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StatusTypes extends js.Object

@JSImport("react-async", "StatusTypes")
@js.native
object StatusTypes extends js.Object {
  @js.native
  sealed trait fulfilled extends StatusTypes
  
  @js.native
  sealed trait initial extends StatusTypes
  
  @js.native
  sealed trait pending extends StatusTypes
  
  @js.native
  sealed trait rejected extends StatusTypes
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StatusTypes with String] = js.native
  /* "fulfilled" */ @js.native
  object fulfilled extends TopLevel[fulfilled with String]
  
  /* "initial" */ @js.native
  object initial extends TopLevel[initial with String]
  
  /* "pending" */ @js.native
  object pending extends TopLevel[pending with String]
  
  /* "rejected" */ @js.native
  object rejected extends TopLevel[rejected with String]
  
}

