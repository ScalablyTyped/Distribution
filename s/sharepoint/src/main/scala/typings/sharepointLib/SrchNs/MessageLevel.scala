package typings
package sharepointLib.SrchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageLevel extends js.Object

@JSGlobal("Srch.MessageLevel")
@js.native
object MessageLevel extends js.Object {
  @js.native
  sealed trait error
    extends sharepointLib.SrchNs.MessageLevel
  
  @js.native
  sealed trait information
    extends sharepointLib.SrchNs.MessageLevel
  
  @js.native
  sealed trait warning
    extends sharepointLib.SrchNs.MessageLevel
  
  /* 2 */ val error: error with scala.Double = js.native
  /* 0 */ val information: information with scala.Double = js.native
  /* 1 */ val warning: warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SrchNs.MessageLevel with scala.Double] = js.native
}

