package typings.reactAsync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusTypes extends StObject
@JSImport("react-async", "StatusTypes")
@js.native
object StatusTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StatusTypes with String] = js.native
  
  @js.native
  sealed trait fulfilled extends StatusTypes
  /* "fulfilled" */ val fulfilled: typings.reactAsync.mod.StatusTypes.fulfilled with String = js.native
  
  @js.native
  sealed trait initial extends StatusTypes
  /* "initial" */ val initial: typings.reactAsync.mod.StatusTypes.initial with String = js.native
  
  @js.native
  sealed trait pending extends StatusTypes
  /* "pending" */ val pending: typings.reactAsync.mod.StatusTypes.pending with String = js.native
  
  @js.native
  sealed trait rejected extends StatusTypes
  /* "rejected" */ val rejected: typings.reactAsync.mod.StatusTypes.rejected with String = js.native
}
