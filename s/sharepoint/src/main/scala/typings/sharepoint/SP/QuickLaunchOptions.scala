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
  
}

