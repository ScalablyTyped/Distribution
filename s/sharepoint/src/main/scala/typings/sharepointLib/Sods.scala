package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Sods extends js.Object

@JSGlobal("Sods")
@js.native
object Sods extends js.Object {
  @js.native
  sealed trait error
    extends sharepointLib.Sods
  
  @js.native
  sealed trait loaded
    extends sharepointLib.Sods
  
  @js.native
  sealed trait loading
    extends sharepointLib.Sods
  
  @js.native
  sealed trait missing
    extends sharepointLib.Sods
  
  @js.native
  sealed trait pending
    extends sharepointLib.Sods
  
  /* 5 */ val error: error with scala.Double = js.native
  /* 4 */ val loaded: loaded with scala.Double = js.native
  /* 2 */ val loading: loading with scala.Double = js.native
  /* 1 */ val missing: missing with scala.Double = js.native
  /* 3 */ val pending: pending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.Sods with scala.Double] = js.native
}

