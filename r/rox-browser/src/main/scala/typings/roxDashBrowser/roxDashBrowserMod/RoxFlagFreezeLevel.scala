package typings.roxDashBrowser.roxDashBrowserMod

import org.scalablytyped.runtime.TopLevel
import typings.roxDashBrowser.roxDashBrowserMod.RoxFlagFreezeLevel.None
import typings.roxDashBrowser.roxDashBrowserMod.RoxFlagFreezeLevel.UntilForeground
import typings.roxDashBrowser.roxDashBrowserMod.RoxFlagFreezeLevel.UntilLaunch
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoxFlagFreezeLevel with String] = js.native
  /* "none" */ @js.native
  object None extends TopLevel[None with String]
  
  /* "untilForeground" */ @js.native
  object UntilForeground extends TopLevel[UntilForeground with String]
  
  /* "untilLaunch" */ @js.native
  object UntilLaunch extends TopLevel[UntilLaunch with String]
  
}

