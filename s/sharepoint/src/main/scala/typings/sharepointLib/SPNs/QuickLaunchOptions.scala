package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QuickLaunchOptions extends js.Object

@JSGlobal("SP.QuickLaunchOptions")
@js.native
object QuickLaunchOptions extends js.Object {
  @js.native
  sealed trait defaultValue
    extends sharepointLib.SPNs.QuickLaunchOptions
  
  @js.native
  sealed trait off
    extends sharepointLib.SPNs.QuickLaunchOptions
  
  @js.native
  sealed trait on
    extends sharepointLib.SPNs.QuickLaunchOptions
  
  /* 2 */ val defaultValue: defaultValue with scala.Double = js.native
  /* 0 */ val off: off with scala.Double = js.native
  /* 1 */ val on: on with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.QuickLaunchOptions with scala.Double] = js.native
}

