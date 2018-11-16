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
  
  val defaultValue: defaultValue with java.lang.String = js.native
  val off: off with java.lang.String = js.native
  val on: on with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.QuickLaunchOptions with java.lang.String] = js.native
}

