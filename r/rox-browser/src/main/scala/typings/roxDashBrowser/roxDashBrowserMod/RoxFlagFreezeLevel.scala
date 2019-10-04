package typings.roxDashBrowser.roxDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoxFlagFreezeLevel extends js.Object

@JSImport("rox-browser", "RoxFlagFreezeLevel")
@js.native
object RoxFlagFreezeLevel extends js.Object {
  @js.native
  sealed trait None extends RoxFlagFreezeLevel
  
  @js.native
  sealed trait UntilForeground extends RoxFlagFreezeLevel
  
  @js.native
  sealed trait UntilLaunch extends RoxFlagFreezeLevel
  
  /* "none" */ val None: typings.roxDashBrowser.roxDashBrowserMod.RoxFlagFreezeLevel.None with String = js.native
  /* "untilForeground" */ val UntilForeground: typings.roxDashBrowser.roxDashBrowserMod.RoxFlagFreezeLevel.UntilForeground with String = js.native
  /* "untilLaunch" */ val UntilLaunch: typings.roxDashBrowser.roxDashBrowserMod.RoxFlagFreezeLevel.UntilLaunch with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoxFlagFreezeLevel with String] = js.native
}

