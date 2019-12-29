package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QuickLaunchOptions with Double] = js.native
  /* 2 */ @js.native
  object defaultValue extends TopLevel[defaultValue with Double]
  
  /* 0 */ @js.native
  object off extends TopLevel[off with Double]
  
  /* 1 */ @js.native
  object on extends TopLevel[on with Double]
  
}

