package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QuickLaunchOptions extends js.Object

@JSGlobal("SP.QuickLaunchOptions")
@js.native
object QuickLaunchOptions extends js.Object {
  @js.native
  sealed trait defaultValue extends QuickLaunchOptions
  
  @js.native
  sealed trait off extends QuickLaunchOptions
  
  @js.native
  sealed trait on extends QuickLaunchOptions
  
  /* 2 */ val defaultValue: typings.sharepoint.SP.QuickLaunchOptions.defaultValue with Double = js.native
  /* 0 */ val off: typings.sharepoint.SP.QuickLaunchOptions.off with Double = js.native
  /* 1 */ val on: typings.sharepoint.SP.QuickLaunchOptions.on with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QuickLaunchOptions with Double] = js.native
}

