package typings.roxBrowser.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RoxFlagFreezeLevel extends js.Object
@JSImport("rox-browser", "RoxFlagFreezeLevel")
@js.native
object RoxFlagFreezeLevel extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RoxFlagFreezeLevel with String] = js.native
  
  @js.native
  sealed trait None extends RoxFlagFreezeLevel
  /* "none" */ @js.native
  object None extends TopLevel[None with String]
  
  @js.native
  sealed trait UntilForeground extends RoxFlagFreezeLevel
  /* "untilForeground" */ @js.native
  object UntilForeground extends TopLevel[UntilForeground with String]
  
  @js.native
  sealed trait UntilLaunch extends RoxFlagFreezeLevel
  /* "untilLaunch" */ @js.native
  object UntilLaunch extends TopLevel[UntilLaunch with String]
}
