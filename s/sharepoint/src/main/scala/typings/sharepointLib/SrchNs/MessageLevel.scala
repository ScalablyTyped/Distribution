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
  
  val error: error with java.lang.String = js.native
  val information: information with java.lang.String = js.native
  val warning: warning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SrchNs.MessageLevel with java.lang.String] = js.native
}

