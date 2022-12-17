package typings.reactAsync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusTypes extends StObject
@JSImport("react-async", "StatusTypes")
@js.native
object StatusTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StatusTypes & String] = js.native
  
  @js.native
  sealed trait fulfilled
    extends StObject
       with StatusTypes
  /* "fulfilled" */ val fulfilled: typings.reactAsync.mod.StatusTypes.fulfilled & String = js.native
  
  @js.native
  sealed trait initial
    extends StObject
       with StatusTypes
  /* "initial" */ val initial: typings.reactAsync.mod.StatusTypes.initial & String = js.native
  
  @js.native
  sealed trait pending
    extends StObject
       with StatusTypes
  /* "pending" */ val pending: typings.reactAsync.mod.StatusTypes.pending & String = js.native
  
  @js.native
  sealed trait rejected
    extends StObject
       with StatusTypes
  /* "rejected" */ val rejected: typings.reactAsync.mod.StatusTypes.rejected & String = js.native
}
