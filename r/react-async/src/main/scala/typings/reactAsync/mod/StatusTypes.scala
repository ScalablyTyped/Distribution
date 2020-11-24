package typings.reactAsync.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusTypes extends js.Object
@JSImport("react-async", "StatusTypes")
@js.native
object StatusTypes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StatusTypes with String] = js.native
  
  @js.native
  sealed trait fulfilled extends StatusTypes
  /* "fulfilled" */ @js.native
  object fulfilled extends TopLevel[fulfilled with String]
  
  @js.native
  sealed trait initial extends StatusTypes
  /* "initial" */ @js.native
  object initial extends TopLevel[initial with String]
  
  @js.native
  sealed trait pending extends StatusTypes
  /* "pending" */ @js.native
  object pending extends TopLevel[pending with String]
  
  @js.native
  sealed trait rejected extends StatusTypes
  /* "rejected" */ @js.native
  object rejected extends TopLevel[rejected with String]
}
